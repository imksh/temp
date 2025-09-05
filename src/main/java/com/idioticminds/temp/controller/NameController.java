package com.idioticminds.temp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController
{
    @GetMapping("/shubh")
    public String shubh()
    {
        return "Shubh Gadha Hai";
    }
}
