package com.feri.domain.user;

import com.feri.domain.base.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author Feri
 * @since 2019-01-16
 */
public class Userwallet extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer totalshell;

    private Integer consumeshell;

    private Integer expireshell;

    private Integer moneyshell;

    private Integer flag;

    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Integer getTotalshell() {
        return totalshell;
    }
    public void setTotalshell(Integer totalshell) {
        this.totalshell = totalshell;
    }
    public Integer getConsumeshell() {
        return consumeshell;
    }
    public void setConsumeshell(Integer consumeshell) {
        this.consumeshell = consumeshell;
    }
    public Integer getExpireshell() {
        return expireshell;
    }
    public void setExpireshell(Integer expireshell) {
        this.expireshell = expireshell;
    }
    public Integer getMoneyshell() {
        return moneyshell;
    }
    public void setMoneyshell(Integer moneyshell) {
        this.moneyshell = moneyshell;
    }
    public Integer getFlag() {
        return flag;
    }
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}