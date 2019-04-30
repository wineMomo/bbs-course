package com.zufe.bbscourse.service;

import com.zufe.bbscourse.model.Event;

import java.util.HashMap;
import java.util.List;

public interface EventService {


    boolean save(Event event);

    Event findById(int id);

    List<Event> findByCourseId(int courseId);

    List<Event> findAll();

    List<Event> findByObjIdAndObjType(HashMap map);

    int deleteEventById(Long postId);
}
