package org.example.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainDemo {
    public static void main(String[] args) {
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory= configuration.buildSessionFactory();


        Emp emp1 =new Emp();
        Emp emp2 = new Emp();

        emp1.setEid(34);
        emp1.setName("Kiran");

        emp2.setEid(35);
        emp2.setName("Karan");

        Project project1 = new Project();
        Project project2 = new Project();

        project1.setPid(123);
        project1.setProjectName("Library Management System");

        project2.setPid(128);
        project2.setProjectName("Chat-Bot");

        List<Emp> list1 =new ArrayList<Emp>();
        List<Project> list2 = new ArrayList<Project>();

        list1.add(emp1);
        list1.add(emp2);

        list2.add(project1);
        list2.add(project2);


        emp1.setProjects(list2);
        project2.setEmps(list1);


        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        session.persist(emp1);
        session.persist(emp2);

        session.persist(project1);
        session.persist(project2);


        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
