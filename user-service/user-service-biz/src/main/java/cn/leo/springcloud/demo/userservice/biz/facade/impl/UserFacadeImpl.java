package cn.leo.springcloud.demo.userservice.biz.facade.impl;

import cn.leo.springcloud.demo.helloservice.api.facade.HelloServiceFacade;
import cn.leo.springcloud.demo.helloservice.api.po.HelloTime;
import cn.leo.springcloud.demo.userservice.api.facade.UserFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserFacadeImpl implements UserFacade {
    private static Logger log = LoggerFactory.getLogger(UserFacade.class);

    @Autowired
    private HelloServiceFacade helloServiceFacade;

    public String getUsername(){
//        String s = helloServiceFacade.sayHello();
//        log.info("sayHello(): " + s);
//        String s1 = helloServiceFacade.helloTime(new Date(), new Date());
//        log.info("helloTime(): " + s1);
        HelloTime helloTimeReq = new HelloTime();
        helloTimeReq.setTime(new Date());
        log.info(helloTimeReq.getTime().toString());
        HelloTime helloTime = helloServiceFacade.helloTime(helloTimeReq);
        log.info(helloTime.getTime().toString());
        return "Tom";
    }
}
