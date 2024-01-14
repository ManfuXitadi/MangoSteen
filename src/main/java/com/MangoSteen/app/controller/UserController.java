package com.MangoSteen.app.controller;


import com.MangoSteen.app.mapper.UserInfoMapper;
import com.MangoSteen.app.model.UserInfo;
import com.MangoSteen.app.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    // 构造器注入

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    public UserController(UserInfoMapper userInfoMapper) {
        this.userInfoService = userInfoService;
    }


    @GetMapping("v1.0/users/{id}")
    UserInfo getUserInfoById(@PathVariable("id") Long id){
        return userInfoService.getUserInfoByUserId(id);
    }


}
