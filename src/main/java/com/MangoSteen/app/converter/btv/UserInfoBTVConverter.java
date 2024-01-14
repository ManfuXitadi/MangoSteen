package com.MangoSteen.app.converter.btv;

import com.MangoSteen.app.model.bo.UserInfo;
import com.google.common.base.Converter;

public class UserInfoBTVConverter extends Converter<UserInfo, com.MangoSteen.app.model.vo.UserInfo> {
    @Override
    protected com.MangoSteen.app.model.vo.UserInfo doForward(UserInfo userInfo) {
        return com.MangoSteen.app.model.vo.UserInfo.builder()
                .id(userInfo.getId())
                .username(userInfo.getUsername())
                .build();
    }

    @Override
    protected UserInfo doBackward(com.MangoSteen.app.model.vo.UserInfo userInfo) {
        return UserInfo.builder()
                .id(userInfo.getId())
                .username(userInfo.getUsername())
                .build();
    }
}
