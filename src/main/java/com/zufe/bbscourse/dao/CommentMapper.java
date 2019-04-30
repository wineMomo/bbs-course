package com.zufe.bbscourse.dao;

import com.zufe.bbscourse.model.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface CommentMapper {

    int save(Comment comment);

    int update(Comment comment);

    //List<Comment> findAll();

    List<Comment> findListByCourseId(Integer courseId);

    List<Comment> findListByCommentId(Integer commentId);

    Comment findByCommentId(Integer commentId);

    List<Comment> findAll();

    List<Comment> findLastCommentList(HashMap map);

    int delete(Long id);

    int addCommentByCourseId(Long id);

}
