package com.tynan.codefellows.songr.songr;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "hello";
    }

}
