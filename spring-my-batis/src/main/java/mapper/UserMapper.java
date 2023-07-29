package mapper;

import com.hust.chungvv.springmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM User")
    List<User> getAllUser();

    void createUser(User user);
}
