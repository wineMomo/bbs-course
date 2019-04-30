package com.zufe.bbscourse.service;

import com.zufe.bbscourse.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    boolean save(User user);

    List<User> findAllAdmin();

    User findById(int id);

    User findByUsername(String username);

    User findByUserId(long userId);

    User findAuthenticatedUser();

    Map<String, Object> getUserProfileAndPostsByUserIdByTabType(Long userId, String tabType);

    // Map<String, Object> updateUserProfile(UserSettingsDto newUserSettingsForm);

    Map<String, Object> getUserSettingPage();

    //   Map<String, Object> registerUserAccount(UserRegistrationDto userDto, HttpServletRequest request);

    Map<String, Object> confirmUserRegistrationWithToken(String token);
    int addAdmin(Long userId);
    int delete (Long userId);

}
