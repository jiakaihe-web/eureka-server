package com.bw.client02.api;

import com.bw.client02.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@FeignClient(name="eureka-client01")
public interface Test01Api {

    @RequestMapping("/test01")
    public String test01();

    @RequestMapping("/selectAll")
    List<User> selectAll();


}
