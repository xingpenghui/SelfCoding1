package com.feri.domain.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.feri.domain.base.BaseEntity;

/**
 *@Author feri
 *@Date Created in 2019/1/15 09:35
 */
public class User extends BaseEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private String phone;
    private String password;
    private int flag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
