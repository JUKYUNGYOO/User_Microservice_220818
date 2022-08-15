package com.example.springcloud_220814.model;


import lombok.Data;

import java.util.Date;

@Data
public class UserDto {
    private String email;
    private String pwd;
    private String name;

//    UserServiceImple 에서 자동으로 userId 생성성
    private String userId;
    private Date createdAt;

    private String encryptedPwd;


}
