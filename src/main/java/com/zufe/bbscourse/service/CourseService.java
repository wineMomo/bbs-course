package com.zufe.bbscourse.service;

import com.zufe.bbscourse.model.Course;

import java.util.List;

public interface CourseService {


    boolean save(Course course);

    Course findById(Integer courseId);

    Course findByCourseName(String courseName);

    List<Course> findAll();

    List<String> getCourseCollege();

    List<Course> findByOffSet(int offSet , int pageSize);

    int deleteCourseAndCommentsById(Long postId);
}
