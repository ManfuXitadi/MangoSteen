package mangosteen.mapper;

import mangosteen.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ORM: data model --> Table ms_userinfo
 */
@Mapper
public interface UserInfoMapper {

    //SELECT * from mangosteen_test.ms_userinfo where id = {id};
    //id, username, create_time, update_time
    @Select("select * from ms_userinfo where id = #{id}")
    UserInfo getUserInfoByUserId(Long id);
}
