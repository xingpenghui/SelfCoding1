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
public class Userlog extends BaseEntity{
    private Long id;

    private Integer type;

    private String content;

    private LocalDateTime createtime;

    private int uid;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public LocalDateTime getCreatetime() {
        return createtime;
    }
    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}