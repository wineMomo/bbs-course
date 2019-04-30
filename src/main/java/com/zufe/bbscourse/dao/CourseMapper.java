package com.zufe.bbscourse.dao;

import com.zufe.bbscourse.model.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface CourseMapper {
    int save(Course course);

    int update(Course course);

    List<Course> findAll();

    Course findById(Integer courseId);

    Course findByCourseName(String courseName);

    List<String> getCourseCollege();

    int delete(Long id);

    List<Course> findByOffset(HashMap map);

    int deleteCourseAndCommentsById(Long Id);
}
