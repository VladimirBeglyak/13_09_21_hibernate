package by.hibernate.util;

import by.hibernate.entity.Circle;
import by.hibernate.entity.Rectangle;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

    private static SessionFactory sessionFactory;

    private SessionFactoryUtil() {
    }

    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                configuration.addAnnotatedClass(Rectangle.class);
                configuration.addAnnotatedClass(Circle.class);
                sessionFactory = configuration
                        .buildSessionFactory(new StandardServiceRegistryBuilder().build());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return sessionFactory;
    }
}
