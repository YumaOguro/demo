package com.example.demo.controller;

import com.example.demo.form.FridayRegisterForm;
import com.example.demo.service.FridayRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/friday/register")
public class FridayRegisterController {

    private FridayRegisterService service;

    @Autowired
    public FridayRegisterController(FridayRegisterService fridayRegisterService) {
        this.service = fridayRegisterService;
    }

    @RequestMapping(value = "/init")
    public String fridayParty(@ModelAttribute FridayRegisterForm fridayRegisterForm) {
        return "fridayRegisterForm";
    }
}
