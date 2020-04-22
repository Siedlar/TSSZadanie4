package com.siedlar.Controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("/")
class HomeController {
    @RequestMapping("/")
    public String callpage(Model themodel){
        LocalDate localDate=LocalDate.now();
        themodel.addAttribute("czas",localDate);
        return "hello";
    }
    @RequestMapping("/dodajAuto")
    public String dodajAuto(){
        return "dodaj-auto";
    }
    @RequestMapping("/usunAuto")
    public String UsunAuto(){
        return "usun-auto";
    }
    @RequestMapping("/wyswietlAuta")
    public String dodajUzytkowika(){
        return "wyswietl-auta";
    }
}
