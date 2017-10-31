package com.huarui.sb001.action;

import com.huarui.sb001.entity.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/10/27.
 */
@RestController
public class TestAction {

    @Value("${const.filepath}")
    private String filepath;
    @Autowired
    private Auth auth;

    @RequestMapping("/hello/{uname}")
    public String sayhello(@PathVariable("uname") String uname){
       // Auth auth = new Auth();
        return uname + ": hello1111222" + filepath + auth.getName();
    }
}
