package com.registeration.services;

import com.registeration.pojo.RegisterUser;

public interface RegistrationUserService {
    RegisterUser save(RegisterUser apiRequest);
    Iterable<RegisterUser> listAllUsers();
    RegisterUser getUserById(Integer id);
}
