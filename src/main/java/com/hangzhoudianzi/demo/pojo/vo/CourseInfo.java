package com.hangzhoudianzi.demo.pojo.vo;

import lombok.Data;

import java.util.Date;

@Data
public class CourseInfo {
    private String semester;
    private String id;
    private String courseName;
    // 关联教师
    private String teacherId;
    private double credit;     //学分
    private int beginWeek;
    private int endWeek;
    private int consecutiveSections;
    private String classroomType;
    private String classroom;
    private String building;
    private String date;
    private String compositionClasses;
    private String classesId;
    private String classesName;
    private String creditHourType;
    private String priority;
    private String classSize;
    private String courseNature;
    private String externallyHire;
    private String department;

    //老师姓名
    private String teacherName;

}