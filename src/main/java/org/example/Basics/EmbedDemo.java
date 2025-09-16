package org.example.Basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmbedDemo {
    public static void main(String[] args) {
        System.out.println("Start Program...");
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("kiran");
        student1.setCity("Bengaluru");
        Certificate certificate = new Certificate();
        certificate.setCourse("java");
        certificate.setDuration("6 month");

        student1.setCerti(certificate);


        Student student2 = new Student();
        student2.setName("Prem");
        student2.setCity("Basavakalyan");
        student2.setId(2);
        Certificate certificate1 = new Certificate();
        certificate1.setCourse("java-Fullstack");
        certificate1.setDuration("10 month");

        student1.setCerti(certificate1);


        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        //objects save;
        session.persist(student1);
        session.persist(student2);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
