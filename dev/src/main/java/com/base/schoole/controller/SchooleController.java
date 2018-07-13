package com.base.schoole.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("school")
public class SchooleController {


    @RequestMapping("list")
    public String list(){
        return "school list";
    }
}
