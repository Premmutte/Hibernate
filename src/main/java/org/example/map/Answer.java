package org.example.map;

import jakarta.persistence.*;
import org.hibernate.annotations.Generated;

@Entity
public class Answer {
    @Id
    @Column(name = "answer_Id")
    private int answerId;
    private String answer;

    @OneToOne(mappedBy = "answer")
    private Quesion quesion;

    public Quesion getQuesion() {
        return quesion;
    }

    public void setQuesion(Quesion quesion) {
        this.quesion = quesion;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Answer() {
    }

    public Answer(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }
}
