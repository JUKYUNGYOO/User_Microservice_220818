package com.example.springcloud_220814.model;


import lombok.Data;

import javax.persistence.*;

//데이터 베이스와 연동되는 객체
@Data
@Entity
@Table(name="users")
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;
    
//    DB에 자리잡게 될 컬럼

    @Column(nullable = false, length= 50, unique = true)
    private String email;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, unique = true)
    private String userId;
    @Column(nullable = false, unique = true)
    private String encryptedPwd;
}
