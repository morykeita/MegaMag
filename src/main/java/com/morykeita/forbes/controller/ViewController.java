package com.morykeita.forbes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class ViewController {

    private String appMode;
    private String appName;

    @Autowired
    public ViewController(Environment environment){
        appName = environment.getProperty("app-name");
    }

//    @RequestMapping("/")
//    public String index(Model model){
//        return "index";
//    }




    @RequestMapping("/")
    String home(ModelMap modal) {
        modal.addAttribute("title","MegaMag");
        return "index";
    }

    @RequestMapping("/partials/{page}")
    String partialHandler(@PathVariable("page") final String page) {
        return page;
    }

    @RequestMapping("/partials/{page}/{id}")
    String partialHandlerId(@PathVariable("page") final String page,@PathVariable("id") final long id) {
        return page;
    }

//
//    @RequestMapping("/error")
//    public String handleError() {
//        return "error";
//    }
}

