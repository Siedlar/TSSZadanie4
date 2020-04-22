package com.siedlar.dao;

import com.siedlar.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao {

    private DataSource dataSource;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        System.out.println("Ustaw datasource");
        this.dataSource = dataSource;
        System.out.println(dataSource.toString());
    }
    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public void saveOrUpdate(Car car) {

    }

    @Override
    public void delete(int carId) {

    }

    @Override
    public Car get(int carId) throws SQLException {
      Car car=new Car();
        Connection conn=dataSource.getConnection();
        Statement statement=conn.createStatement();
        ResultSet resultSet=statement.executeQuery("Select * from cars where idcars = 1 ");
        while(resultSet.next()){
            car.setId(resultSet.getInt(1));
            car.setNazwa(resultSet.getString(2));
            car.setMarka(resultSet.getString(3));
            car.setKonieMechaniczne(resultSet.getInt(4));
            car.setPojemnosc(resultSet.getDouble(5));
            car.setCena(resultSet.getInt(6));
            car.setRokProdukcji(resultSet.getInt(7));
        }
      return car;
    }

    @Override
    public List<Car> list() {
        return null;
    }
}
