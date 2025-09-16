package org.example.OneToMay;

import org.example.map.Answer;
import org.example.map.Quesion;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.QuerySettings;

import java.util.ArrayList;
import java.util.List;

public class MainOTMMTO {
    public static void main(String[] args) {
        Configuration configuration= new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();



        //creating Quesions
        Quesions quesions = new Quesions();
        quesions.setQuesionsId(1212);
        quesions.setQuesions("what is java?");

        //creating Answer
        Answers answers = new Answers();
       answers.setAnswersId(346);
        answers.setAnswers("java is Oop language");
        answers.setQuesions(quesions);

        Answers answers1 = new Answers();
       answers1.setAnswersId(34);
        answers1.setAnswers("With the help of java we can create software");
        answers1.setQuesions(quesions);

        Answers answers2 = new Answers();
      answers2.setAnswersId(387);
        answers2.setAnswers("Java has different type of frameworks");
        answers2.setQuesions(quesions);


       List<Answers> list =new ArrayList<>();
       list.add(answers);
       list.add(answers1);
       list.add(answers2);

       quesions.setAnswers(list);




        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        //Save

//        session.persist(answers);
//        session.persist(answers1);
//        session.persist(answers2);
        session.persist(quesions);

        //fech

        Quesions  q = (Quesions)session.get(Quesions.class,1212);
        System.out.println(q.getQuesions());

        for(Answers a:q.getAnswers()){
            System.out.println(a.getAnswers());
        }


        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
