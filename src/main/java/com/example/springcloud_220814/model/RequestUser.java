package com.example.springcloud_220814.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//json format으로 값을 전달하기 위해서
//클래스 생성
//사용자가 입력한 Json데이터를 받음
@Data
public class RequestUser {

    @NotNull(message = "Email cannot be null")
    @Size(min=2, message="Email not be less than two characters")
    @Email
    private String email;


    @NotNull(message = "Password cannot be null")
    @Size(min =0, message = "Password must be equal or grater than 8 characters and less than 16 characters")
    private String pwd;

    @NotNull(message = "Name cannot be null")
    @Size(min=2, message ="Name not be less than two characters")
    private String name;


}
