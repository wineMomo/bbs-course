package com.zufe.bbscourse.controller;

import com.zufe.bbscourse.dao.CourseMapper;
import com.zufe.bbscourse.model.Comment;
import com.zufe.bbscourse.model.Course;
import com.zufe.bbscourse.service.CommentService;
import com.zufe.bbscourse.service.CourseService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    private CourseService courseService;
    @Autowired
    private CommentService commentService;

    @Autowired
    private CourseMapper courseMapper;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getHome(Model model) {
        List<Course> courses = this.courseService.findAll();
        Map<String, Object> attributes = new HashMap<>();
        if (null == attributes) {
            throw new RuntimeException("attributes not found.");
        }
        attributes.put("courses", courses);
        model.addAllAttributes(attributes);
        return "index";
    }


    @ResponseBody
    @RequestMapping(value = "/course/recommend", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String getRecommend(Long userId, int offset, int pageSize) {
        if (null == userId) {
            //throw new BadRequestException("Path variable postId cound not be null.");
        }
        List<Course> courseList = this.courseService.findByOffSet(offset * pageSize, pageSize);

        JSONArray jsonarray = JSONArray.fromObject(courseList);

        return jsonarray.toString();
    }

    @ResponseBody
    @RequestMapping(value = "/comment/last", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String getLastComment(Long userId, int offset, int pageSize) {
        if (null == userId) {
            //throw new BadRequestException("Path variable postId cound not be null.");
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("offset", offset * pageSize);
        map.put("pageSize", pageSize);
        List<Comment> courseList = this.commentService.findLastCommentList(map);
        JSONArray jsonarray = JSONArray.fromObject(courseList);
        return jsonarray.toString();
    }


}
