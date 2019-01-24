package com.feri.service.pay;

import com.feri.common.qo.QueryParam;
import com.feri.common.vo.PageVo;
import com.feri.common.vo.ResultVO;
import com.feri.domain.pay.Paycode;
import com.feri.domain.pay.Userorder;
import com.feri.domain.pay.Userpaylog;
import com.feri.domain.user.Usershell;
import com.feri.domain.video.Videocourse;

/**
 *@Author feri
 *@Date Created in 2019/1/21 10:24
 */
public interface PayService {
    //下单---订购视频课程
    ResultVO saveOrder(Userorder userorder);
    //充值--
    ResultVO payPre(QueryParam param);
    //查询我的订单
    ResultVO myorders(String token);
    //查询订单支付状态
    ResultVO paystatus(String oid);


    //保存支付二维码---涉及到支付
    ResultVO savePayCode(Paycode paycode);
    //充值回调---更细支付结果
    ResultVO updatePay(int oid,int flag);
    //我的充值记录
    ResultVO queryPayLog(String token);
    //我的课程
    ResultVO queryCourse(String token);
    //我的消费清单
    ResultVO queryShell(String token);
    //我的钱包
    ResultVO querywallet(String token);




}
