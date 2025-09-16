package org.example.map;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapMain {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();


        //creating Quesion
        Quesion quesion = new Quesion();
        quesion.setQuesionId(1212);
        quesion.setQuesion("what is java?");

        //creating Answer
        Answer answer = new Answer();
        answer.setAnswerId(343);
        answer.setAnswer("java is Oop language");

        answer.setQuesion(quesion);
        quesion.setAnswer(answer);

        //creating Quesion
        Quesion quesion2 = new Quesion();
        quesion2.setQuesionId(242);
        quesion2.setQuesion("what is CollectionFrameWork?");

        //creating Answer
        Answer answer2 = new Answer();
        answer2.setAnswerId(344);
        answer2.setAnswer("API to work with object in java");

        answer2.setQuesion(quesion2);
        quesion2.setAnswer(answer2);

        //session

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //Save Answer
        session.persist(answer);
        session.persist(answer2);

        //save Quesion
        session.persist(quesion);
        session.persist(quesion2);



        transaction.commit();
        sessionFactory.close();
    }
}
