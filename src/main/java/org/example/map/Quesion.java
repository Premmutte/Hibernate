package org.example.map;

import jakarta.persistence.*;

@Entity
public class Quesion {
    @Id
    @Column(name = "quesion_Id")
    private int quesionId;
    private String quesion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "a_Id")
    private Answer answer;

    public int getQuesionId() {
        return quesionId;
    }

    public void setQuesionId(int quesionId) {
        this.quesionId = quesionId;
    }

    public String getQuesion() {
        return quesion;
    }

    public void setQuesion(String quesion) {
        this.quesion = quesion;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Quesion() {
    }

    public Quesion(int quesionId, String quesion, Answer answer) {
        this.quesion = quesion;
        this.quesionId = quesionId;
        this.answer = answer;
    }
}
