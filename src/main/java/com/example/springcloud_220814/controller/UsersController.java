package com.example.springcloud_220814.controller;


import com.example.springcloud_220814.model.RequestUser;
import com.example.springcloud_220814.model.UserDto;
import com.example.springcloud_220814.service.UserService;
import com.example.springcloud_220814.vo.Greeting;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

//사용자 요청을 직접처리해주는 Controller
//데이터가 내부적으로 처리 - UserController, UserService, UserRepository
@RestController
@RequestMapping("/")
public class UsersController {

    //    properties에 있는 객체를 사용하려면 environment 사용
    private Environment env;
    private UserService userService;

    @Autowired
    private Greeting greeting;

    @Autowired //빈 자동주입
    public UsersController(Environment env, UserService userService) {
        this.env = env;
        this.userService = userService;

    }




    @GetMapping("/health_check")
    public String status(){
        return "it's working in user service";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return greeting.getMessage();
    }

    @PostMapping("/users")
    public String createUser(@RequestBody RequestUser user){
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDto userDto = mapper.map(user, UserDto.class);
        userService.createUser(userDto);


        return "Create user method is called";
    }
}
//eureka discovery server 에서 해당 앱 클릭
//후 /health_check



