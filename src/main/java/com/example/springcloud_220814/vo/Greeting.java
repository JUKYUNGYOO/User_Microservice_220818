package com.example.springcloud_220814.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component //용도가 정해지지 않았을 땐, component로 빈등록
@Data
@NoArgsConstructor //arguments없음 default생성자
public class Greeting {
    @Value("${greeting.message}")
    private String message;

}
