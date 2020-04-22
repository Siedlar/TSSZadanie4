package com.siedlar.Controller;

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
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url="jdbc:mysql://localhost:3306/cars?serverTimezone=UTC";
                String haslo ="soad666";
                        String user="root";
        String marka="";
        int id;
                        Connection conn= DriverManager.getConnection(url,user,haslo);
                        Statement statement=conn.createStatement();
                        ResultSet resultSet=statement.executeQuery("Select * from cars");
                        while(resultSet.next()){
                           id=resultSet.getInt(1);
                             marka=resultSet.getString(2);
                        }
        System.out.println(marka);
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
