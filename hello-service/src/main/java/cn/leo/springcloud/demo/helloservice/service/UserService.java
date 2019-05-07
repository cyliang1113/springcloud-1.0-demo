package cn.leo.springcloud.demo.helloservice.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/userService")
public interface UserService {

    @RequestMapping(value = "/getUserName", method = RequestMethod.GET)
    String getUserName();
}
