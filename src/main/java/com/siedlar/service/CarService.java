package com.siedlar.service;

import com.siedlar.dao.CarDao;
import com.siedlar.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
    public List<Car> pobierzListe(){
        return carDao.getCars();
    }
    public void dodaj(Car car){
carDao.dodaj(car);
    }
    @Transactional
    public void usun(Integer integer){
        carDao.usun(integer);
    }
}
