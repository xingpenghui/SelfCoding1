package com.feri.common.constant;

/**
 *@Author feri
 *@Date Created in 2019/1/16 10:01
 */
public class SystemConst {
    //Token的秘钥
    public static final String TOKENKEY="vK/hWl2uAu5SRFMr3dwYFA==";

    //Redis存储Token的集合名称
    public static final String TOKENMAP="usertokens";
    //Redis存储签到的连续天数
    public static final String SIGNINMAP="usersignindays";

    //学贝的默认失效时间  6个月
    public static final int SHELLMONTHS=6;

    //学贝的类型
    public static final int SHELLTYPE1=1;//签到
    public static final int SHELLTYPE2=2;//推荐新用户
    public static final int SHELLTYPE3=3;//活动赠送
    public static final int SHELLTYPE4=4;//充值  没有失效期


}
