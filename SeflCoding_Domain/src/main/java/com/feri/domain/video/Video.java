package com.feri.domain.video;

import com.feri.domain.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
/**
 * <p>
 * 
 * </p>
 *
 * @author Feri
 * @since 2019-01-21
 */
@TableName("video")
public class Video extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer vcid;

    private String name;

    private String videourl;

    private Integer vpid;

    private LocalDateTime createtime;

    private LocalDateTime endtime;
    private String videoimgurl;
    private String info;

    public String getVideoimgurl() {
        return videoimgurl;
    }

    public void setVideoimgurl(String videoimgurl) {
        this.videoimgurl = videoimgurl;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public int getVcount() {
        return vcount;
    }

    public void setVcount(int vcount) {
        this.vcount = vcount;
    }

    private int vcount;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getVcid() {
        return vcid;
    }

    public void setVcid(Integer vcid) {
        this.vcid = vcid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }
    public Integer getVpid() {
        return vpid;
    }

    public void setVpid(Integer vpid) {
        this.vpid = vpid;
    }
    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }
    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }

}
