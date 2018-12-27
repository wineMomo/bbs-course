package com.zufe.bbscourse.service;

import com.zufe.bbscourse.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface UserService {
    int save(User user);

    User findById(Long id);

    User findByUsername(String username);

    User findByEmail(String email);

    User findAuthenticatedUser();

    Map<String, Object> getUserProfileAndPostsByUserIdByTabType(Long userId, String tabType);

   // Map<String, Object> updateUserProfile(UserSettingsDto newUserSettingsForm);

    Map<String, Object> getUserSettingPage();

 //   Map<String, Object> registerUserAccount(UserRegistrationDto userDto, HttpServletRequest request);

    Map<String, Object> confirmUserRegistrationWithToken(String token);

}
