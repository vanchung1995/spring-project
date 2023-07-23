package com.hust.chungvv.restspringwithsecurity.controller;

import com.hust.chungvv.restspringwithsecurity.dto.SimpleRequest;
import com.hust.chungvv.restspringwithsecurity.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class AuthenController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService jwtDetailService;
    @PostMapping("/custom-login")
    public Map<String, Object> login(@RequestBody SimpleRequest body) throws Exception {
//        {
//            "username": "techgeeknext",
//                "password": "password"
//        }
        Map<String, Object> map = new HashMap<>();
        authenticate(body.getUsername(), body.getPassword());

        final UserDetails userDetails = jwtDetailService
                .loadUserByUsername(body.getUsername());

        final String token = jwtTokenUtil.generateToken(userDetails);

        map.put("token", token);
        return map;
    }

    private void authenticate(String username, String password) throws Exception {
        Objects.requireNonNull(username);
        Objects.requireNonNull(password);
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}
