package com.sxd.eduservice.entity.subject;

import lombok.Data;

/**
 * Administrator
 * 2021-8-2
 */
@Data
public class CoursePublishVo {
    private String id;
    private String title;
    private String cover;
    private Integer lessonNum;
    private String subjectLevelOne;
    private String subjectLevelTwo;
    private String teacherName;
    private String price;//只用于显示
}