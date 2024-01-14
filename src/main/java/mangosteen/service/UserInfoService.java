package mangosteen.service;

import jakarta.annotation.Resource;
import mangosteen.mapper.UserInfoMapper;
import mangosteen.model.UserInfo;
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
