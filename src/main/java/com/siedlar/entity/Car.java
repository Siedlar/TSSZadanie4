package com.siedlar.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Car {
    private int idcars;

    public int getId() {
        return idcars;
    }

    public void setId(int id) {
        this.idcars = id;
    }

    public Car(int id, String nazwa, String marka, int konieMechaniczne, double pojemnosc, int cena, int rokProdukcji) {
        this.idcars = id;
        this.nazwa = nazwa;
        this.marka = marka;
        this.konieMechaniczne = konieMechaniczne;
        this.pojemnosc = pojemnosc;
        this.cena = cena;
        this.rokProdukcji = rokProdukcji;
    }

    private String nazwa;
    private String marka;
    private int konieMechaniczne;
    private double pojemnosc;
    private int cena;
    private int rokProdukcji;
    public String getMarka() {
        return marka;
    }

    public int getKonieMechaniczne() {
        return konieMechaniczne;
    }

    public void setKonieMechaniczne(int konieMechaniczne) {
        this.konieMechaniczne = konieMechaniczne;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

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
