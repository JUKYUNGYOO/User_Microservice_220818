package com.example.springcloud_220814.service;

import com.example.springcloud_220814.model.UserDto;
import com.example.springcloud_220814.model.UserEntity;
import com.example.springcloud_220814.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto userDto){
        userDto.setUserId(UUID.randomUUID().toString());

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserEntity userEntity = mapper.map(userDto, UserEntity.class);
//DTO 객체를 UserEntiry객체로 바꿔주는 것이 map
        userEntity.setEncryptedPwd("encrypted_password");
        userRepository.save(userEntity);

        return null;
    }
}
