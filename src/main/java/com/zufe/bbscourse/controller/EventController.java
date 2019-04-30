package com.zufe.bbscourse.controller;

import com.zufe.bbscourse.model.Event;
import com.zufe.bbscourse.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

    @Autowired
    private EventService eventService;


    @RequestMapping(value = "/event", method = RequestMethod.POST)
    public ResponseEntity<?> followComment(Integer id, int type, int deleted) {
        if (null == id) {
            //throw new BadRequestException("Path variable postId cound not be null.");
        }
        Event event = new Event();
        event.setUserId(Long.parseLong("150320403020"));
        event.setObjId(id);
        event.setObjType(Integer.parseInt("2"));
        event.setType(type);
        event.setDeleted(deleted);
        return this.eventService.save(event) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    @RequestMapping(value = "/comment/unfollow/{commentId}", method = RequestMethod.POST)
    public ResponseEntity<?> unfollowComment(@PathVariable Long commentId) {
        if (null == commentId) {
            //throw new BadRequestException("Path variable postId cound not be null.");
        }
       /* int rowAffected = this.courseService.deleteCourseAndCommentsById(postId);
        //logger.info("Deleted postId = " + postId + " ; rowAffected = " + rowAffected);
        if (0 == rowAffected) {
            return ResponseEntity.badRequest().build();
        }*/
        return ResponseEntity.ok().build();
    }
}
