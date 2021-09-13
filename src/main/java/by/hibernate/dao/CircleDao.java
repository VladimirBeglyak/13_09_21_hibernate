package by.hibernate.dao;

import by.hibernate.entity.Circle;
import by.hibernate.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class CircleDao implements Dao<Circle>{

    @Override
    public Circle findById(int id) {
        return SessionFactoryUtil.getSessionFactory().openSession().get(Circle.class,id);
    }

    @Override
    public void save(Circle circle) {
        Session session=SessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.save(circle);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Circle circle) {
        Session session=SessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.update(circle);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Circle circle) {
        Session session=SessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.delete(circle);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Circle> findAll() {
        Session session=SessionFactoryUtil.getSessionFactory().openSession();
        List<Circle> circles = session.createQuery("select c from Circle c", Circle.class).getResultList();
        session.close();
        return circles;
    }
}
