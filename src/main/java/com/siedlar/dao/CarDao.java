package com.siedlar.dao;

import com.siedlar.entity.Car;

import java.sql.SQLException;
import java.util.List;

public interface CarDao {
       List<Car> getCars();
       void dodaj(Car car);
       void usun(Integer integer);
       void usunWszystko();
       void update(Car car);
       Car getCar(Integer integer);
}
