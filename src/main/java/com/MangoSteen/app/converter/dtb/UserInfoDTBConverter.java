package com.MangoSteen.app.converter.dtb;

import com.MangoSteen.app.model.dao.UserInfo;
import com.google.common.base.Converter;

public class UserInfoDTBConverter extends Converter<UserInfo, com.MangoSteen.app.model.bo.UserInfo> {
    @Override
    protected com.MangoSteen.app.model.bo.UserInfo doForward(UserInfo userInfo) {
        return com.MangoSteen.app.model.bo.UserInfo.builder()
                .id(userInfo.getId())
                .username(userInfo.getUsername())
                .password(userInfo.getPassword())
                .build();
    }

    @Override
    protected UserInfo doBackward(com.MangoSteen.app.model.bo.UserInfo userInfo) {
        return UserInfo.builder()
                .id(userInfo.getId())
                .username(userInfo.getUsername())
                .password(userInfo.getPassword())
                .build();
    }
}
