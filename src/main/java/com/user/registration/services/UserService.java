package com.user.registration.services;

import com.user.registration.dtos.UserDto;

import java.util.List;

public interface UserService {
    UserDto create(UserDto userDto);
    void deleteUserByEmail(String email);
    boolean isValidUser(String email, String password);
    List<UserDto> getAllUsers();

}
