package icu.cgcnblog.springbootdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userID;
    private String userName;
    private String email;
    private String password;
    private String phone;
    private Date createDate;
    private Date updateDate;
}
