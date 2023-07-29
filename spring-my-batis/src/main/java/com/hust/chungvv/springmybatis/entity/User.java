package com.hust.chungvv.springmybatis.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class User {
    private Integer userId;
    private String username;
    private Date createdDate;
    private Integer status;
    private String email;

}
