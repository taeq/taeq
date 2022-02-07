package com.qtae.businfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinfoController {
    @GetMapping("/test")
    public String test(){
        return "test!!";
    }
}
