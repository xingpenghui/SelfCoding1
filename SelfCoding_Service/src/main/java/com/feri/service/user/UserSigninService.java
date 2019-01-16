package com.feri.service.user;

import com.feri.common.vo.ResultVO;
import com.feri.domain.user.Usersignin;

/**
 *@Author feri
 *@Date Created in 2019/1/16 14:43
 */
public interface UserSigninService {
    //签到
    ResultVO signin(String token);
    //校验是否可以签到
    ResultVO checkSign(String token);
    //查询签到记录
    ResultVO queryList(String token,int count);



}
