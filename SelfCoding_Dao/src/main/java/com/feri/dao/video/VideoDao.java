package com.feri.dao.video;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.feri.domain.video.Video;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/1/21 10:04
 */
public interface VideoDao extends BaseMapper<Video> {

    @Select("select v.*,vc.vcount from video v INNER join (select count(vid) vcount,vid from userplay group by vid order by vcount desc limit 12) vc on v.id=vc.vid")
    @ResultType(Video.class)
    List<Video> queryPlay();
}
