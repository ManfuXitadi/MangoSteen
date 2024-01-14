package com.MangoSteen.app.controller;


import com.MangoSteen.app.mapper.UserInfoMapper;
import com.MangoSteen.app.model.UserInfo;
import com.MangoSteen.app.service.UserInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.val;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "User APIS", description = "Related APIS for user management")
public class UserController {
    // 构造器注入

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    public UserController(UserInfoMapper userInfoMapper) {
        this.userInfoService = userInfoService;
    }


    @GetMapping("v1.0/users/{id}")
    @Operation(summary = "Get user information", description = "Return the specific user information",
    responses = {
            @ApiResponse(responseCode = "200", description = "user information found"),
            @ApiResponse(responseCode = "404", description = "user information not found")
    })
    UserInfo getUserInfoById(@PathVariable("id") Long id){

        val userInfo = com.MangoSteen.app.model.dao.UserInfo.builder().username("xxx").build();
        System.out.println(userInfo);
        return userInfoService.getUserInfoByUserId(id);
    }


}
