package com.william.controller;

import com.william.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testException")
    public String testException() throws SysException {
        System.out.println("testException()执行了。。");

        try {
            int i = 10/0 ;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("流程执行到XXX报错");
        }
        return "success";
    }
}
