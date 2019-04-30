package com.zufe.bbscourse.controller;

import com.zufe.bbscourse.dao.CourseMapper;
import com.zufe.bbscourse.model.Course;
import com.zufe.bbscourse.model.User;
import com.zufe.bbscourse.service.CourseService;
import com.zufe.bbscourse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/admin/")
public class AdminController {

    @Autowired
    private CourseService courseService;


    @Autowired
    private UserService userService;

    @Autowired
    private CourseMapper courseMapper;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String admin(Model model) {
       /* List<Course> courses = this.courseService.findAll();
        List<String> colleges = this.courseService.getCourseCollege();
        Map<String,List<Course>> maps = new HashMap<>();
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("colleages", maps);
        model.addAllAttributes(attributes);*/
        return "/admin/admin-index";
    }

    @RequestMapping(value = "course-list", method = RequestMethod.GET)
    public String getCourseList(Model model) {
        List<Course> courses = this.courseService.findAll();
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("courses", courses);
        model.addAllAttributes(attributes);
        return "admin/course-list";
    }

    @RequestMapping(value = "admin-list", method = RequestMethod.GET)
    public String getAdminList(Model model) {
        List<User> admins = this.userService.findAllAdmin();
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("admins", admins);
        model.addAllAttributes(attributes);
        return "admin/admin-list";
    }


    @RequestMapping(value = "welcome", method = RequestMethod.GET)
    public String welcome(Model model) {
       /* List<Course> courses = this.courseService.findAll();
        List<String> colleges = this.courseService.getCourseCollege();
        Map<String,List<Course>> maps = new HashMap<>();
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("colleages", maps);
        model.addAllAttributes(attributes);*/
        return "/admin/welcome";
    }

    @RequestMapping(value = "course-add", method = RequestMethod.GET)
    public String courseAdd(Model model) {
       /* List<Course> courses = this.courseService.findAll();
        List<String> colleges = this.courseService.getCourseCollege();
        Map<String,List<Course>> maps = new HashMap<>();
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("colleages", maps);
        model.addAllAttributes(attributes);*/
        return "/admin/course-add";
    }


    @RequestMapping(value = "admin-add", method = RequestMethod.GET)
    public String adminAdd(Model model) {
       /* List<Course> courses = this.courseService.findAll();
        List<String> colleges = this.courseService.getCourseCollege();
        Map<String,List<Course>> maps = new HashMap<>();
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("colleages", maps);
        model.addAllAttributes(attributes);*/
        return "/admin/admin-add";
    }

    //@PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "addAdmin", method = RequestMethod.POST)
    public ResponseEntity<?> addAdmin( Long  adminId  ,String adminRole) {
        if (null == adminId ) {
            //throw new BadRequestException("Path variable postId cound not be null.");
        }
        int rowAffected = this.userService.addAdmin(adminId);
        //logger.info("Deleted postId = " + postId + " ; rowAffected = " + rowAffected);
        if (0 == rowAffected) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }


    //@PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public ResponseEntity<?> delete(@PathVariable String  id  ,String adminRole) {
        if (null == id ) {
            //throw new BadRequestException("Path variable postId cound not be null.");
        }
        int rowAffected = this.userService.addAdmin(Long.parseLong(id));
        //logger.info("Deleted postId = " + postId + " ; rowAffected = " + rowAffected);
        if (0 == rowAffected) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }


}
