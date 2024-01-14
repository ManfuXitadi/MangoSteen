package mangosteen.controller;


import mangosteen.mapper.UserInfoMapper;
import mangosteen.model.UserInfo;
import mangosteen.service.UserInfoService;
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
