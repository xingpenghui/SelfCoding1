package com.feri.dao.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.feri.domain.user.Usersignin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Date;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/1/16 14:33
 */
public interface UsersigninDao extends BaseMapper<Usersignin> {
    //适合于数据量不大
    @Select("select count(*) from usersignin where uid=#{uid} and date(signintime)=date(now())")
    @ResultType(int.class)
    int checkSignin(int uid);

    @Select("select signintime from usersignin where uid=#{uid} order by signintime desc limit 1")
    @ResultType(Date.class)
    Date selectSign(int uid);
    //查询签到
    @Select("select * from usersignin where uid=#{uid} order by signintime desc limit #{count}")
    @ResultType(Usersignin.class)
    List<Usersignin> selectSignList(@Param("uid") int uid,@Param("count") int count);


}
