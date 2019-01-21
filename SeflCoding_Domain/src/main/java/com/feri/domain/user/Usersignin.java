package com.feri.domain.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.feri.domain.base.BaseEntity;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Feri
 * @since 2019-01-16
 */
public class Usersignin extends BaseEntity {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer uid;

    private LocalDateTime signintime;

    private Integer shell;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public LocalDateTime getSignintime() {
        return signintime;
    }
    public void setSignintime(LocalDateTime signintime) {
        this.signintime = signintime;
    }
    public Integer getShell() {
        return shell;
    }
    public void setShell(Integer shell) {
        this.shell = shell;
    }
}