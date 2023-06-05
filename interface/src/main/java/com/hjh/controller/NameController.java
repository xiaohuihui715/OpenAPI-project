package com.hjh.controller;


import cn.hutool.core.util.CharsetUtil;
import cn.hutool.http.HttpUtil;
import com.hjh.hhapiclientsdk.model.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/name")
@RestController
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name, HttpServletRequest request) {


        return "get name:" + name;
    }

    @PostMapping("/op")
    public String getNameByPost(@RequestParam String name) {

        System.out.println(name);
        return "post name:" + name;
    }


    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request) {

        String accessKey = request.getHeader("accessKey");
        String sign = request.getHeader("sign");

        String nonce = request.getHeader("nonce");


        String timesTamp = request.getHeader("timesTamp");

//        if (!accessKey.equals("qweqw") ){
//
//
//            throw new RuntimeException("无权限!");
//        }

        System.out.println(user);
        return "post 用户名字" + user.getName();
    }


    @GetMapping("/downgrade")
    public String downgrade(HttpServletRequest request) {

        return "请求错误！请稍后再重试！";
    }


    @GetMapping("/three/sentences/interface")
    public String threeSentences(HttpServletRequest request) {

        String result = HttpUtil.get("https://api.apiopen.top/api/sentences"
                , CharsetUtil.CHARSET_UTF_8);
        if (StringUtils.isBlank(result)) {
            return "此接口发生了意外55！！";
        }
        return result;
    }
}
