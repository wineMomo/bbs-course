package com.zufe.bbscourse.service.impl;

import com.zufe.bbscourse.dao.UserMapper;
import com.zufe.bbscourse.model.User;
import com.zufe.bbscourse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int save(User user) {
        return 0;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return this.userMapper.findByUsername(username);
    }

    @Override
    public User findByEmail(String email) {
        return null;
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
}
