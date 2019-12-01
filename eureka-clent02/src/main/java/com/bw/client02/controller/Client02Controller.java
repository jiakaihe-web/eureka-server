package com.bw.client02.controller;

import com.bw.client02.api.Test01Api;
import com.bw.client02.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class Client02Controller {

    @Autowired
    private Test01Api test01Api;

    @RequestMapping("/test02")
    public String testClient02(){
        System.out.println("++++++++++++++++++++++++++++");
        return test01Api.test01();
    }

    @RequestMapping("/selects")
    public List<User> selectAll(){
        return test01Api.selectAll();
    }

}
