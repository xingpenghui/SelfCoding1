package com.feri.service.user;

import com.feri.common.vo.ResultVO;
import com.feri.domain.user.User;
import com.feri.domain.user.Userappraise;

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
    //查询主页内容
   ResultVO queryHome(String token);


   //用户评价
    ResultVO saveAppraise(Userappraise userappraise);

    //生成推荐的专属海报
    ResultVO createRec(String token);


}
