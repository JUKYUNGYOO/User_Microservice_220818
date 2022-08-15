package com.example.springcloud_220814.service;

import com.example.springcloud_220814.model.UserDto;
import com.example.springcloud_220814.model.UserEntity;
import com.example.springcloud_220814.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.util.UUID;

//사용하고자 하는 비즈니스 메소드가 선언
public interface UserService {

    UserDto createUser(UserDto userDto);

}

