package com.feri.domain.user;

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
public class Userrec extends BaseEntity{

    private Integer id;

    private Integer touid;

    private Integer beuid;

    private Integer shell;

    private LocalDateTime createtime;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getTouid() {
        return touid;
    }
    public void setTouid(Integer touid) {
        this.touid = touid;
    }
    public Integer getBeuid() {
        return beuid;
    }
    public void setBeuid(Integer beuid) {
        this.beuid = beuid;
    }
    public Integer getShell() {
        return shell;
    }
    public void setShell(Integer shell) {
        this.shell = shell;
    }
    public LocalDateTime getCreatetime() {
        return createtime;
    }
    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }
}