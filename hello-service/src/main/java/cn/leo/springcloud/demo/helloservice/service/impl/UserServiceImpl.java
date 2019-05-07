package cn.leo.springcloud.demo.helloservice.service.impl;

import cn.leo.springcloud.demo.helloservice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public String getUserName(){
        logger.info("getUserName");
        return "Tom Li";
    }
}
