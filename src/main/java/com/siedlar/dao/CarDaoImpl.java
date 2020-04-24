package com.siedlar.dao;

import com.siedlar.dao.CarDao;
import com.siedlar.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.Query;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao {
    private SessionFactory currentSession;
    private Transaction transaction;

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
        Session session = currentSession.openSession();
        List<Car> carList = (List<Car>) session.createQuery("from Car").getResultList();
        return carList;
    }

    @Override
    public void dodaj(Car car) {
        Session session = currentSession.openSession();
        transaction = session.beginTransaction();
        try {
            session.save(car);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
    }

    @Override
    public void usun(Integer integer) {
        try {
            Session session = currentSession.openSession();
            Query query = session.createQuery("delete from Car where id=:idcar");
            query.setParameter("idcar", integer);
            transaction = session.beginTransaction();
            query.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();

        }
    }
}


