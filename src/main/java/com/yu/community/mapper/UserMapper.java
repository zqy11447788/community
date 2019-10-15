package com.yu.community.mapper;

import com.yu.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yu
 * @Description
 * @create 2019-10-15-12:50
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    public void insert(User user);

    @Select("select * from user where token=#{token}")
    User findByToken(@Param("token") String token);
}
