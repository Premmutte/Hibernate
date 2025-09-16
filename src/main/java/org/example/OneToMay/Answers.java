package org.example.OneToMay;

import jakarta.persistence.*;

@Entity
@Table(name = "Many_To_One")
public class Answers {
    @Id
    @Column(name = "answers_Id")

    private int answersId;
    private String answers;

    @ManyToOne
    private Quesions quesions;

    public Answers() {
    }

    public Answers(int answersId, String answers, Quesions quesions) {
        this.answersId = answersId;
        this.answers = answers;
        this.quesions = quesions;
    }

    public int getAnswersId() {
        return answersId;
    }

    public void setAnswersId(int answersId) {
        this.answersId = answersId;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public Quesions getQuesions() {
        return quesions;
    }

    public void setQuesions(Quesions quesions) {
        this.quesions = quesions;
    }
}
