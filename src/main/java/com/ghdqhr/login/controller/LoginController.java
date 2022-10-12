package com.ghdqhr.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = {"/login"})
public class LoginController {

    @RequestMapping(value = {"", "/"})
    public ModelAndView login(HttpServletRequest request) {
        return new ModelAndView("/login");
    }

}
