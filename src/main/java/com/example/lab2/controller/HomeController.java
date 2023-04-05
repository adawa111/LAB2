package com.example.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value="/", method = RequestMethod.GET)
    @ResponseBody
    public  String paginaPrincipal(){
        return  "HOla mundo23";
    }

    @RequestMapping(value="hola", method = RequestMethod.GET)
    public String jijija(){
        return "hola";
    }
}
