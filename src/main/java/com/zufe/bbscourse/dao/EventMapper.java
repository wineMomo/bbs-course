package com.zufe.bbscourse.dao;

import com.zufe.bbscourse.model.Course;
import com.zufe.bbscourse.model.Event;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface EventMapper {

    boolean save(Event event);

    int update(Course course);

    List<Course> findAll();

    Course findById(int id);

    Course findByCourseName(String courseName);

    List<String> getCourseCollege();

    List<Event> findByObjIdAndObjType(HashMap map);

    int delete(Long id);

    int deleteCourseAndCommentsById(Long Id);
}
