/**
 * File Name: HelloController.java
 * Project Name: HelloSpringMVC
 * Author: faye31
 * Create Date: 2018年11月7日 下午9:03:04
 * Copyright (c) 2018, All Rights Reserved. 
**/

package com.springmvc.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Studentclass;
import com.springmvc.service.StudentclassService;

@Controller
public class HelloController {

    @Autowired
    private StudentclassService studentclassService;
    
    @RequestMapping("/hello")
    public ModelAndView view(@RequestParam(value="name", required=false, defaultValue="Andy") String name, @RequestParam(value="year") String year){
    	
        String path = "hellospring";
        System.out.println("path="+path);
        
        ModelAndView mav = new ModelAndView();
        mav.setViewName(path); // 指定视图
        mav.addObject("name", name);
        mav.addObject("year", year);
        
        System.out.println("name="+name);
        System.out.println("year="+year);
        
        //------
        
        Random random = new Random();
        int classid = random.nextInt(10000);
        
        Studentclass studentclass = new Studentclass();
        studentclass.setClassid(classid);
        studentclass.setClassname("Class_"+classid);
        System.out.println("classid="+studentclass.getClassid());
        System.out.println("classname="+studentclass.getClassname());
        studentclassService.insert(studentclass);
        
        System.out.println("classid="+classid);
        studentclass = studentclassService.selectByPrimaryKey(classid);
        mav.addObject("studentclass", studentclass);
        System.out.println("------------------------");
        
        return mav;
    }
}
