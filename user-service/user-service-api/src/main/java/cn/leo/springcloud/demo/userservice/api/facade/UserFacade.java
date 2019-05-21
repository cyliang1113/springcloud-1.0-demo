package cn.leo.springcloud.demo.userservice.api.facade;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user-service")
@RequestMapping("/userFacade")
public interface UserFacade {

    @RequestMapping(value = "/getUsername", method = RequestMethod.GET)
    String getUsername();
}
