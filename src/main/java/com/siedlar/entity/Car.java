package com.siedlar.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="marka")
    private String nazwa;
    @Column(name="model")
    private String marka;
    @Column(name="konie_mechaniczne")
    private int konieMechaniczne;
    @Column(name="pojemnosc")
    private double pojemnosc;
    @Column(name="cena")
    private int cena;
    @Column(name="rokprodukcji")
    private int rokProdukcji;

    public Car(String nazwa, String marka, int konieMechaniczne, double pojemnosc, int cena, int rokProdukcji) {
        this.nazwa = nazwa;
        this.marka = marka;
        this.konieMechaniczne = konieMechaniczne;
        this.pojemnosc = pojemnosc;
        this.cena = cena;
        this.rokProdukcji = rokProdukcji;
    }

    public Car(int idCars, String nazwa, String marka, int konieMechaniczne, double pojemnosc, int cena, int rokProdukcji) {
        this.id = idCars;
        this.nazwa = nazwa;
        this.marka = marka;
        this.konieMechaniczne = konieMechaniczne;
        this.pojemnosc = pojemnosc;
        this.cena = cena;
        this.rokProdukcji = rokProdukcji;
    }

    public int getIdCars() {
        return id;
    }

    public void setIdCars(int idCars) {
        this.id = idCars;
    }
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

    @Override
    public String toString() {
        return id+nazwa+marka;
    }

}
