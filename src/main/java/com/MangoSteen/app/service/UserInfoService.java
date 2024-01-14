package com.MangoSteen.app.service;

import com.MangoSteen.app.mapper.UserInfoMapper;
import com.MangoSteen.app.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public  UserInfo getUserInfoByUserId(Long id){
        return userInfoMapper.getUserInfoByUserId(id);
    }
}
