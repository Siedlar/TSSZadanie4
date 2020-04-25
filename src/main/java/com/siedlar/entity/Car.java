package com.siedlar.entity;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import static org.springframework.util.StringUtils.capitalize;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Wartość na początku nie moze być spacja")
    @Size(min=1,message = "Nie moze byc pusta")
    @Column(name="marka")
    @Pattern(regexp ="^[a-zA-z]+" ,message = "Bez cyfr ")
    private String nazwa;
    @NotBlank(message = "Wartość na początku nie moze być spacja")
    @Size(min=1,message = "Nie moze byc pusta")
    @Column(name="model")
    private String marka;
    @Range(min = 1,max = 5001,message = "Konie mechaniczne  auta muszą byc z przedzialu 1 do 5001")
    @Column(name="konie_mechaniczne")
    private int konieMechaniczne;
    @Range(min = 0 ,max = 1000,message = "Pojemnosc silnika auta musi byc z przedzialu 1 do 1000")
    @Column(name="pojemnosc")
    private double pojemnosc;
    @Range(min = 1 ,max = 20000000,message = "Cena auta od 1 do 200 000 000 mln")
    @Column(name="cena")
    private int cena;
    @Range(min = 1930,max = 2020,message = "Rok produkcji auta musi byc z przedzialu 1930 do 2020")
    @Column(name="rokprodukcji")
    private int rokProdukcji;

    public Car(String nazwa, String marka, int konieMechaniczne, double pojemnosc, int cena, int rokProdukcji) {
        this.nazwa = capitalize(nazwa) ;
        this.marka = capitalize(marka);
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
        this.nazwa = capitalize(nazwa);
    }


    public void setMarka(String marka) {
        this.marka = capitalize(marka);
    }

    @Override
    public String toString() {
        return id+nazwa+marka;
    }

}
