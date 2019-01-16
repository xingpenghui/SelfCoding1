package com.feri.common.test;

import com.feri.common.util.Base64Util;
import com.feri.common.util.EncryptUtil;

/**
 *@Author feri
 *@Date Created in 2019/1/16 10:00
 */
public class Pass_Test {
    public static void main(String[] args) {
        System.out.println("AES秘钥："+Base64Util.base64Enc(EncryptUtil.createAESKey()));
    }
}
