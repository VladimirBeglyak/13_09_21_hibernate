package by.hibernate.util;

import by.hibernate.dao.CircleDao;
import by.hibernate.dao.Dao;
import by.hibernate.entity.Circle;
import by.hibernate.entity.Status;

public class Appl {
    public static void main(String[] args) {
        Circle first = new Circle("First 1", 10);
        first.setStatus(Status.CREATED);
        Circle second = new Circle("Second 2", 5);
        second.setStatus(Status.NEW);
//        Circle third = new Circle("Third", 15);
//        Circle fourth = new Circle("Fourth", 16);
//        Circle fifth = new Circle("Fifth", 25);

        Dao<Circle> circleDao=new CircleDao();
        circleDao.save(first);
        circleDao.save(second);
//        circleDao.save(third);
//        circleDao.save(fourth);
//        circleDao.save(fifth);

        circleDao.findAll().forEach(data-> System.out.println(data.getSquare()));
    }
}
