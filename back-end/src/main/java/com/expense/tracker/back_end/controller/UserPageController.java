package com.expense.tracker.back_end.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserPageController {
    @GetMapping("/user")
    public String userPage(){
        return "You have landed on User Page of Application Developed By Akshay Gadhave!";
    }
}
