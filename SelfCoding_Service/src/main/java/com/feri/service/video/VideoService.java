package com.feri.service.video;

import com.feri.common.qo.QueryParam;
import com.feri.common.vo.PageVo;
import com.feri.common.vo.ResultVO;
import com.feri.domain.video.Video;
import com.feri.domain.video.Videocourse;
/**
 *@Author feri
 *@Date Created in 2019/1/21 10:11
 */
public interface VideoService {
    //查询视频语言
    ResultVO queryType();
    //查询语言对应的知识点
    ResultVO queryPoint(int tid);
    //新增视频课程
    ResultVO saveCourse(Videocourse videocourse);
    //查询视频专题 根据语言查询 分页
    PageVo<Videocourse> queryByPage(QueryParam queryParam);
    //新增视频
    ResultVO saveVideo(Video video);
    //查询课程下的所有视频
    ResultVO queryByCourse(int vcid);

    //查询主页显示的内容  最新更新 大家喜欢（播放量） 热销榜单（购买量）
    ResultVO queryIndex();



}
