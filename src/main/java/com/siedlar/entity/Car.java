package com.siedlar.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("AUTO")
public class Car {
    private String nazwa;
    private String marka;
    public Car() {
        System.out.println("konstruktor auta");
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }


    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Car(String nazwa, String marka) {
        this.nazwa = nazwa;
        this.marka = marka;
    }

}
