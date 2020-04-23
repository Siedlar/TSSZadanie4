package com.siedlar.dao;

import com.siedlar.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao {

    private DataSource dataSource;

    public CarDaoImpl() {
        System.out.println("tworzenie cardaoimpl");
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        System.out.println("Ustaw datasource");
        this.dataSource = dataSource;
    }
    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public void saveOrUpdate(Car car) throws SQLException {
        Connection conn=dataSource.getConnection();
        PreparedStatement statement=conn.prepareStatement("Insert into cars values(?,?,?,?,?,?,?)");
        statement.setInt(1,car.getIdCars());
        statement.setString(2,car.getNazwa());
        statement.setString(3,car.getMarka());
        statement.setInt(4,car.getKonieMechaniczne());
        statement.setDouble(5,car.getPojemnosc());
        statement.setInt(6,car.getCena());
        statement.setInt(7,car.getRokProdukcji());
        statement.execute();
    }

    @Override
    public void delete(int carId) throws SQLException {
        Connection conn=dataSource.getConnection();
        PreparedStatement statement=conn.prepareStatement("Delete from cars where idcars=(?)");
        statement.setInt(1,carId);
        statement.execute();
        System.out.println("Usunieto");
    }

    @Override
    public Car get(int carId) throws SQLException {
      Car car=new Car();
        Connection conn=dataSource.getConnection();
        Statement statement=conn.createStatement();
        ResultSet resultSet=statement.executeQuery("Select * from cars where idcars = 1 ");
        while(resultSet.next()){
            car.setIdCars(resultSet.getInt(1));
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
    public List<Car> list() throws SQLException {
        List<Car> list=new ArrayList<>();
        Car car=null;
        Connection conn=dataSource.getConnection();
        Statement statement=conn.createStatement();
        ResultSet resultSet=statement.executeQuery("Select * from cars ");
        while(resultSet.next()){
           car=new Car();
            car.setIdCars(resultSet.getInt(1));
            car.setNazwa(resultSet.getString(2));
            car.setMarka(resultSet.getString(3));
            car.setKonieMechaniczne(resultSet.getInt(4));
            car.setPojemnosc(resultSet.getDouble(5));
            car.setCena(resultSet.getInt(6));
            car.setRokProdukcji(resultSet.getInt(7));
            list.add(car);
        }
        return list;
    }
}
