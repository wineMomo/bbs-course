package com.zufe.bbscourse.service.impl;

import com.zufe.bbscourse.dao.CourseMapper;
import com.zufe.bbscourse.model.Course;
import com.zufe.bbscourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public boolean save(Course course) {
        return false;
    }

    @Override
    public Course findById(Integer courseId) {
        if (null == courseId) {
            return null;
        }
        Course course = this.courseMapper.findById(courseId);
        return course;
    }

    @Override
    public Course findByCourseName(String courseName) {
        return null;
    }

    @Override
    public List<Course> findAll() {
        return courseMapper.findAll();
    }

    @Override
    public List<String> getCourseCollege() {
        return courseMapper.getCourseCollege();
    }

    @Override
    public List<Course> findByOffSet(int offSet , int pageSize) {
        HashMap map = new HashMap();
        map.put("offSet",offSet);
        map.put("pageSize",pageSize);
        return  courseMapper.findByOffset(map) ;
    }


    @Override
    public int deleteCourseAndCommentsById(Long courseId) {
        if (null == courseId) {
            return 0;
        }
        // delete comment related to post
        int commentDeletedRows = this.courseMapper.deleteCourseAndCommentsById(courseId);
        // delete post by id
        int postDeletedRows = this.courseMapper.delete(courseId);
        return postDeletedRows + commentDeletedRows;
    }
}
