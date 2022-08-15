package com.example.springcloud_220814.repository;

import com.example.springcloud_220814.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//CRUD 연산 수행
//jpa에서 자동화된 ORM생성
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
