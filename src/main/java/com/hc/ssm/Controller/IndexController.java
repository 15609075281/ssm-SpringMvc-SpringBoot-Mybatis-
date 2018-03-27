package com.hc.ssm.Controller;

import com.alibaba.fastjson.JSON;
import com.hc.ssm.Entity.LoginEntity;
import com.hc.ssm.JPA.LoginJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by Administrator on 2018/3/27.
 */
@RestController
@RequestMapping(value = "/test")
public class IndexController {


    @Autowired
    private LoginJPA loginJPA;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {

        return "index";

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JSON login() {
        System.out.print(loginJPA.findAll());
        return (JSON) loginJPA.findAll();
    }

}
