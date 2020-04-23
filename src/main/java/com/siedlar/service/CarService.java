package com.siedlar.service;

import com.siedlar.dao.CarDao;
import com.siedlar.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service("serwis")
public class CarService {
    private CarDao carDao;

    public CarService() {
        System.out.println("W srodku carservice");
    }

    @Autowired
    public CarService(CarDao carDao) {
        System.out.println("injecting cardao"+carDao.getClass().toString());
        this.carDao = carDao;
    }

    public CarDao getCarDao() {
        return carDao;
    }

    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    public List wyswietl() throws SQLException {
       return carDao.list();
    }
    public void dodaj(Car car) throws SQLException {
    carDao.saveOrUpdate(car);
    }

    public void usun(Integer integer) throws SQLException {
        carDao.delete(integer);
    }
}
