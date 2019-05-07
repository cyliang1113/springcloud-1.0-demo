package cn.leo.springcloud.demo.helloservice.service.impl;

import cn.leo.springcloud.demo.helloservice.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName(){
        return "Tom Li";
    }
}
