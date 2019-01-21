package com.feri.service.user;

import com.feri.common.vo.ResultVO;
import com.feri.domain.user.Userdetial;

/**
 *@Author feri
 *@Date Created in 2019/1/17 15:09
 */
public interface UserdetailService {
    //个人资料
    ResultVO update(String token,Userdetial userdetial);
    //查询个人详情
    ResultVO queryById(String token);

}
