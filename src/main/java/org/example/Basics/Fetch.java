package org.example.Basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
    public static void main(String[] args) {
        //Get and Load
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        //get--
        Student student = (Student) session.get(Student.class, 1);
        System.out.println(student);


        session.close();
        sessionFactory.close();
    }
}
