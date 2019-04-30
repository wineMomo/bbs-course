package com.zufe.bbscourse.controller;

import com.zufe.bbscourse.dao.CourseMapper;
import com.zufe.bbscourse.model.Comment;
import com.zufe.bbscourse.model.Course;
import com.zufe.bbscourse.service.CommentService;
import com.zufe.bbscourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private CommentService commentService;

    @Autowired
    private CourseMapper courseMapper;

/*
    @RequestMapping(value = "/course/hot", method = RequestMethod.GET)
    public String getHotCourse(Model model) {
        List<Course> courses = this.courseService.findAll();
        Map<String, Object> attributes = new HashMap<>();
        if (null == attributes) {
            throw new RuntimeException("attributes not found.");
        }
        attributes.put("courses", courses);
        model.addAllAttributes(attributes);
        return "index";
    }
    */


    @RequestMapping(value = "/course/all", method = RequestMethod.GET)
    public String getHotCourse(Model model) {
        List<Course> courses = this.courseService.findAll();
        List<String> colleges = this.courseService.getCourseCollege();
        Map<String, List<Course>> maps = new HashMap<>();
        for (String college : colleges) {
            for (Course course : courses) {
                if (college.equals(course.getCourseCollege())) {
                    if (maps.containsKey(college)) {
                        List<Course> _course = maps.get(college);
                        _course.add(course);
                        maps.put(college, _course);
                    } else {
                        List<Course> _course = new ArrayList<>();
                        _course.add(course);
                        maps.put(college, _course);
                    }
                }
            }
        }
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("colleages", maps);
        model.addAllAttributes(attributes);
        return "/course/all";
    }


    //@PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/course/delete/{postId}", method = RequestMethod.POST)
    public ResponseEntity<?> deletePost(@PathVariable Long postId) {
        if (null == postId) {
            //throw new BadRequestException("Path variable postId cound not be null.");
        }
        int rowAffected = this.courseService.deleteCourseAndCommentsById(postId);
        //logger.info("Deleted postId = " + postId + " ; rowAffected = " + rowAffected);
        if (0 == rowAffected) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }


    @RequestMapping(value = "/course/{courseId}", method = RequestMethod.GET)
    public String getCourseDetail(Model model, @PathVariable Integer courseId) {
        if (null == courseId) {
            //throw new BadRequestException("Path variable postId cound not be null.");
        }
        Course course = this.courseService.findById(courseId);
        //List<Event> events = this.eventService.findByCourseId(courseId);
        List<Comment> comments = this.commentService.findListByCourseId(courseId);
        Map<String, Object> attributes = new HashMap<>();

        attributes.put("comments", comments);
        attributes.put("course", course);
        if (null == attributes) {
            throw new RuntimeException("attributes not found.");
        }
        model.addAllAttributes(attributes);
        return "/course/course";
    }


    @RequestMapping(value = "/course/hot", method = RequestMethod.GET)
    public String getHotsCourse(Model model) {
        Integer courseId = 1;
        if (null == courseId) {
            //throw new BadRequestException("Path variable postId cound not be null.");
        }
        List<Course> course = this.courseService.findAll();
        //List<Event> events = this.eventService.findByCourseId(courseId);
        //  List<Comment> comments = this.commentService.findByCourseId(courseId);
        Map<String, Object> attributes = new HashMap<>();

        //   attributes.put("comments", comments);
        attributes.put("courses", course);
        if (null == attributes) {
            throw new RuntimeException("attributes not found.");
        }
        model.addAllAttributes(attributes);
        return "/course/release";
    }


}
