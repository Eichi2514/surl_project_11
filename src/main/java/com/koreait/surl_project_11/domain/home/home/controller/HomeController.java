package com.koreait.surl_project_11.domain.home.home.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Value("${custom.site.name}")
    private String customSiteName;
    @Value("${custom.secret.key}")
    private String secretKey;

    @GetMapping("/")
    @ResponseBody
    public String ShowMain() {
        return "Main6 on " + customSiteName;
    }

    @GetMapping("/secretKey")
    @ResponseBody
    public String ShowSecretKey() {
        return "Main on " + secretKey;
    }

}