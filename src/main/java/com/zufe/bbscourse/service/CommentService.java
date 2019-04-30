package com.zufe.bbscourse.service;

import com.zufe.bbscourse.model.Comment;

import java.util.HashMap;
import java.util.List;

public interface CommentService {
    int save(Comment comment);

    List<Comment> findListByCourseId(int courseId);

    List<Comment> findListByCommentId(int commentId);

    Comment findByCommentId(int commentId);

    List<Comment> findAll();

    List<Comment> findLastCommentList(HashMap map);

    Comment createNewComment(int courseId, String editoValue);

}

