package org.example.Basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Start Program...");
        // SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();


        //System.out.println(sessionFactory);
        // System.out.println(sessionFactory.isClosed());
        //sessionFactory.getCurrentSession();

        //Creating student
        Student student = new Student();
        student.setId(1);
        student.setName("Prem");
        student.setCity("Basavakyan");
        System.out.println(student);


        //Creating object of address class
        Address address = new Address();
        address.setStreet("Street1");
        address.setCity("Karnataka");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setX(23.765);

        //Reading image
        FileInputStream fileInputStream = new FileInputStream("com.jspider/src/main/resources/avatar-1.png");
        byte[] data = new byte[fileInputStream.available()];
        address.setImage(data);


        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        session.persist(address);
        //session.getTransaction().commit();
        transaction.commit();
        session.close();

        System.out.println();
        System.out.println("Program Finish...");

    }
}