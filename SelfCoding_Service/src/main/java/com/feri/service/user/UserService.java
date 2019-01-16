package com.feri.service.user;

import com.feri.common.vo.ResultVO;
import com.feri.domain.user.User;

/**
 *@Author feri
 *@Date Created in 2019/1/14 15:18
 */
public interface UserService {
   //注册
    ResultVO save(User user);
    //校验手机
    ResultVO checkPhone(String phone);

    //登录-前后端分离
    ResultVO login(String phone,String password);
    //退出
   ResultVO loginout(String token);

}
