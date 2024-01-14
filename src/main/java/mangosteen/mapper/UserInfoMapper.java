package mangosteen.mapper;

import mangosteen.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserInfoMapper {
   //select * from mangosteen_test.ms_userinfo where id = {id};


    @Select("select id, username, password, create_time, update_time from ms_userinfo where id = #{id}")
    public UserInfo getUserInfoByUserId(Long id);

}


