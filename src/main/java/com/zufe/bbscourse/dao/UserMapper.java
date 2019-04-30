package com.zufe.bbscourse.dao;

import com.zufe.bbscourse.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int save(User user);

    int update(User user);

    List<User> findAll();

    User findById(int id);

    List<User> findAllAdmin();

    User findByUsername(String username);

    User findByUserId(long userId);


    int addAdmin(Long id );
    int delete(Long Id);
}
