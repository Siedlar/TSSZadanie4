package com.siedlar.dao;

import com.siedlar.dao.CarDao;
import com.siedlar.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private SessionFactory currentSession;

    @Autowired
    public void setCurrentSession(SessionFactory currentSession) {
        this.currentSession = currentSession;
    }

    public SessionFactory getCurrentSession() {
        return currentSession;
    }

    public CarDaoImpl() {
        System.out.println("tworzenie cardaoimpl");
    }

    @Override
    public List<Car> getCars() {
       Session session= currentSession.openSession();
       List<Car> carList = (List<Car>) session.createQuery("from Car").getResultList();
        return carList;
    }
@Transactional
    @Override
    public void dodaj(Car car) {
        Session session= currentSession.openSession();
        session.save(car);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional
    @Transactional
    public void usun(Integer integer) {
        Session session= currentSession.openSession();
        Query  query=session.createQuery("delete from Car where id=:idcar");
        query.setParameter("idcar",integer);
query.executeUpdate();

    }
}


