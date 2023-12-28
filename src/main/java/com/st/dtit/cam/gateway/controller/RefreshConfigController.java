package com.st.dtit.cam.gateway.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/refresh-config")
@RefreshScope
public class RefreshConfigController {

         @GetMapping
         public String refreshConfiguration(){
        return "Configuration Successfully Updated....";
    }

}
