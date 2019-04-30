package com.zufe.bbscourse.service.impl;

import com.zufe.bbscourse.dao.UserMapper;
import com.zufe.bbscourse.model.User;
import com.zufe.bbscourse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean save(User user) {

        return true;
    }

    @Override
    public List<User> findAllAdmin() {
        return this.userMapper.findAllAdmin();
    }

    @Override
    public User findById(int id) {
        return this.userMapper.findById(id);
    }

    @Override
    public User findByUsername(String username) {
        return this.userMapper.findByUsername(username);
    }

    @Override
    public User findByUserId(long userId) {
        return this.userMapper.findByUserId(userId);
    }

    @Override
    public User findAuthenticatedUser() {
        return null;
    }

    @Override
    public Map<String, Object> getUserProfileAndPostsByUserIdByTabType(Long userId, String tabType) {
        return null;
    }

    @Override
    public Map<String, Object> getUserSettingPage() {
        return null;
    }

    @Override
    public Map<String, Object> confirmUserRegistrationWithToken(String token) {
        return null;
    }

    @Override
    public int addAdmin(Long userId) {
        return this.userMapper.addAdmin(userId);
    }

    @Override
    public int delete(Long userId) {
        return this.userMapper.delete(userId);
    }
}
