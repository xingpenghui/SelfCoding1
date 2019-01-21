package com.feri.domain.user;

import com.feri.domain.base.BaseEntity;
import java.time.LocalDate;
/**
 * @author Feri
 * @since 2019-01-16
 */
public class Userdetial extends BaseEntity{

    private static final long serialVersionUID = 1L;


    private Integer uid;

    private String nickname;

    private Integer sex;

    private LocalDate birthday;

    private String headimg;

    private String sign;

    private String email;

    private String recode;

    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public Integer getSex() {
        return sex;
    }
    public void setSex(Integer sex) {
        this.sex = sex;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public String getHeadimg() {
        return headimg;
    }
    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }
    public String getSign() {
        return sign;
    }
    public void setSign(String sign) {
        this.sign = sign;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRecode() {
        return recode;
    }
    public void setRecode(String recode) {
        this.recode = recode;
    }
}