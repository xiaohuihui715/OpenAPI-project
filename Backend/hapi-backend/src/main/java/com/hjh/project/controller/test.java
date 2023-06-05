package com.hjh.project.controller;

import com.hjh.hhapiclientsdk.client.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/test")
public class test {

    @Resource
    private Client hjhClient;

    @GetMapping("/test1")
    public void test(){

        //调用可用接口
        String result = hjhClient.getKnow();


    }


}
