package com.ecom.cakefactory.apis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@RestController
public class CakeFactoryApi {
    @GetMapping("/")
    public ModelAndView homePage() {
        return new ModelAndView("index");
    }
}
