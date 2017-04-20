package com.registeration.services.impl;

import com.registeration.pojo.RegisterUser;
import com.registeration.repository.UserRepository;
import com.registeration.services.RegistrationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegistrationUserServiceImpl implements RegistrationUserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public RegisterUser save(RegisterUser registerUser) {
        userRepository.save(registerUser);
        return registerUser;
    }

    @Override
    public Iterable<RegisterUser> listAllUsers() {
        return null;
    }

    @Override
    public RegisterUser getUserById(Integer id) {
        return null;
    }
}
