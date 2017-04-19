package com.registeration.services.impl;

import com.registeration.pojo.User;
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
    public User save(User User) {
        userRepository.save(User);
        return User;
    }

    @Override
    public Iterable<User> listAllUsers() {
        return null;
    }

    @Override
    public User getUserById(Integer id) {
        return null;
    }
}
