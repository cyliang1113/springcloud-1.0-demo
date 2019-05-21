package cn.leo.springcloud.demo.helloservice.biz.facade.impl;

import cn.leo.springcloud.demo.helloservice.api.facade.HelloServiceFacade;
import cn.leo.springcloud.demo.helloservice.api.po.HelloTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloServiceFacadeImpl implements HelloServiceFacade {
    Logger log = LoggerFactory.getLogger(HelloServiceFacadeImpl.class);

    @Override
    public String sayHello() {
        return "say hello !!!";
    }

    @Override
    public String helloTime(Date time1, Date time2) {
        log.info(time1.toString());
        log.info(time2.toString());
        return time1.toString();
    }

    @Override
    public HelloTime helloTime(@RequestBody HelloTime req) {
        log.info(req.getTime().toString());
        HelloTime helloTime = new HelloTime();
        helloTime.setTime(new Date());
        log.info(helloTime.getTime().toString());
        return helloTime;
    }
}
