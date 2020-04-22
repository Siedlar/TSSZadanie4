package com.siedlar.Controller;

import com.siedlar.dao.CarDao;
import com.siedlar.dao.CarDaoImpl;
import com.siedlar.entity.Car;
import com.siedlar.service.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.*;
import java.time.LocalDate;

@Controller
@RequestMapping("/")
class HelloController {
    @RequestMapping("/")
    public String callpage(Model themodel) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        LocalDate localDate=LocalDate.now();
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:spring-mvc-demo-servlet.xml");
      CarService carService=ctx.getBean("serwis", CarService.class);
      Car car=carService.getCarDao().get(1);
        themodel.addAttribute("autko",car);
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
