package com.zufe.bbscourse.service.impl;

import com.zufe.bbscourse.dao.CommentMapper;
import com.zufe.bbscourse.model.Comment;
import com.zufe.bbscourse.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service("commentService")
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int save(Comment comment) {
        return this.commentMapper.save(comment);
    }

    @Override
    public List<Comment> findListByCourseId(int courseId) {
        return this.commentMapper.findListByCourseId(courseId);
    }

    @Override
    public List<Comment> findListByCommentId(int commentId) {
        return this.commentMapper.findListByCommentId(commentId);
    }

    @Override
    public Comment findByCommentId(int commentId) {
        return this.commentMapper.findByCommentId(commentId);
    }


    @Override
    public List<Comment> findAll() {
        return commentMapper.findAll();
    }

    @Override
    public List<Comment> findLastCommentList(HashMap map) {
        return commentMapper.findLastCommentList(map);
    }


    @Override
    public Comment createNewComment(int courseId, String editoValue) {
        Comment comment = new Comment();
        comment.setParentId(courseId);
        comment.setCommentContenet(editoValue);
        comment.setUserId(Long.parseLong("150320403020"));
        return comment;
    }
}
