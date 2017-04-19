package com.registeration.services;
import com.registeration.pojo.User;

public interface RegistrationUserService {
    User save(User apiRequest);
    Iterable<User> listAllUsers();
    User getUserById(Integer id);
}
