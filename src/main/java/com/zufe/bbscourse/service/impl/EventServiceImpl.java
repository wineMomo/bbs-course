package com.zufe.bbscourse.service.impl;

import com.zufe.bbscourse.dao.EventMapper;
import com.zufe.bbscourse.model.Event;
import com.zufe.bbscourse.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service("eventService")
public class EventServiceImpl implements EventService {

    @Autowired
    private EventMapper eventMapper;

    @Override
    public boolean save(Event event) {
        return this.eventMapper.save(event);
    }

    @Override
    public Event findById(int id) {
        return null;
    }

    @Override
    public List<Event> findByCourseId(int courseId) {
        return null;
    }

    @Override
    public List<Event> findAll() {
        return null;
    }

    @Override
    public List<Event> findByObjIdAndObjType(HashMap map) {
        return this.eventMapper.findByObjIdAndObjType(map);
    }

    @Override
    public int deleteEventById(Long postId) {
        return 0;
    }
}
