package com.registeration.controller;

import com.registeration.services.RegistrationUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.registeration.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by nara1016 on 10-04-2017.
 */

@Controller
public class RegistrationController {


    private RegistrationUserService registrationUserService ;

    @Autowired
    public void setRegistrationUserService(RegistrationUserService registrationUserService) {
        this.registrationUserService = registrationUserService;
    }

    private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerUser(Model model) {
        model.addAttribute("user", new User());
        System.out.print("Call to User 1  ");
        return "registrationForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String UserSubmit(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        System.out.print("User Call 2  ");

        try {
            
            System.out.print("getUserId  " + user.getUserId() +
                    " getName  " + user.getName() +
                    " getEmail  " + user.getEmail() +
                    " getPassword  " + user.getPassword());

            user.setEmail(user.getEmail());
            user.setName(user.getName());
            user.setPassword(user.getPassword());
            final User save = registrationUserService.save(user);
            System.out.print(" save  " + save);
            System.out.print(" User SAVED :) ");

        } catch (Exception e) {
            logger.error(" Error occurred while trying to process api request", e);

        }

        return "welcomeUser";
    }
}