package com.siedlar.service;

import com.siedlar.dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serwis")
public class CarService {
    private CarDao carDao;

    public CarService() {
        System.out.println("W srodku carservice");
    }

    @Autowired
    public CarService(CarDao carDao) {
        System.out.println("injecting car"+carDao.getClass().toString());
        this.carDao = carDao;
    }

    public CarDao getCarDao() {
        return carDao;
    }

    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }



}
