package cn.leo.springcloud.demo.helloservice.api.facade;

import cn.leo.springcloud.demo.helloservice.api.po.HelloTime;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@FeignClient("hello-service")
@RequestMapping("/helloServiceFacade")
public interface HelloServiceFacade {

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    String sayHello();

    @RequestMapping(value = "/helloTime", method = RequestMethod.GET)
    String helloTime(
            @RequestParam(value = "time1", required = false)Date time1,
            @RequestParam(value = "time2", required = false)Date time2
    );

    @RequestMapping(value = "/helloTime", method = RequestMethod.POST)
    HelloTime helloTime(
            @RequestBody HelloTime req
    );

    @RequestMapping(value = "/returnError", method = RequestMethod.GET)
    String returnError();
}
