package com.mycen.service.client;

import com.mycen.service.configuration.FeignLogConfiguration;
import com.mycen.service.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-provider",fallback = UserClientFallback.class,configuration = FeignLogConfiguration.class)
public interface UserClient {

    @GetMapping("/user/select")
    User selectById( String id);


}
