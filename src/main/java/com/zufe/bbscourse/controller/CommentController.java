package com.zufe.bbscourse.controller;

import com.zufe.bbscourse.model.Comment;
import com.zufe.bbscourse.model.Event;
import com.zufe.bbscourse.service.CommentService;
import com.zufe.bbscourse.service.EventService;
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
import java.util.stream.Collectors;

@Controller
public class CommentController {
    @Autowired
    CommentService commentService;

    @Autowired
    EventService eventService;

    @RequestMapping(value = "course/comment/{commentId}", method = RequestMethod.GET)
    public String getCourseDetail(Model model, @PathVariable Integer commentId) {
        Map<String, Object> attributes = new HashMap<>();
        Comment comment = this.commentService.findByCommentId(commentId);
        List<Comment> comment_childs = this.commentService.findListByCommentId(commentId);
        HashMap map = new HashMap();
        map.put("objId", commentId);
        map.put("objType", Integer.parseInt("2"));
        List<Event> events = this.eventService.findByObjIdAndObjType(map);
        List<Integer> type = events.stream().map(Event::getType).collect(Collectors.toList());
        attributes.put("comment_childs", comment_childs);
        attributes.put("comment", comment);
        attributes.put("type",type);
        model.addAllAttributes(attributes);
        return "course/comment";
    }


    @RequestMapping(value = "course/comment-add", method = RequestMethod.GET)
    public String courseAdd(Model model) {
       /* List<Course> courses = this.courseService.findAll();
        List<String> colleges = this.courseService.getCourseCollege();
        Map<String,List<Course>> maps = new HashMap<>();
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("colleages", maps);
        model.addAllAttributes(attributes);*/
        return "/course/comment-add";
    }

    @RequestMapping(value = "course/comment/addComment", method = RequestMethod.POST)
    public ResponseEntity<?> addComment(Integer courseId, String editorValue) {
        if (null == courseId || null == editorValue) {
            //throw new BadRequestException("Path variable postId cound not be null.");
        }
        int rowAffected = this.commentService.save(commentService.createNewComment(courseId, editorValue));
        //logger.info("Deleted postId = " + postId + " ; rowAffected = " + rowAffected);
        if (0 == rowAffected) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }

  /*  @ResponseBody
    @RequestMapping(value = "course/comment/last", method = RequestMethod.GET)
    public String getCommentLast() {
        List<Comment> comments = this.commentService.findAll();
        JSONArray jsonarray = JSONArray.fromObject(comments);
        return jsonarray.toString();
    }
*/

}
