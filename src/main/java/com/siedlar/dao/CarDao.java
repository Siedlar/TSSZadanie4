package com.siedlar.dao;

import com.siedlar.entity.Car;

import java.sql.SQLException;
import java.util.List;

public interface CarDao {
        public void saveOrUpdate(Car car) throws SQLException;

        public void delete(int carId) throws SQLException;

        public Car get(int carId) throws SQLException;

        public List<Car> list() throws SQLException;

}
