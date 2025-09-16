package org.example.OneToMay;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "One_To_Many")
public class Quesions {
    @Id
    @Column(name = "quesions_Id")

    private int quesionsId;
    private String quesions;

    @OneToMany(mappedBy = "quesions" ,cascade = CascadeType.ALL)    //cascade will automatically take all the answer for the questions
    private List<Answers> answers;

    public Quesions() {
    }

    public int getQuesionsId() {
        return quesionsId;
    }

    public void setQuesionsId(int quesionsId) {
        this.quesionsId = quesionsId;
    }

    public String getQuesions() {
        return quesions;
    }

    public void setQuesions(String quesions) {
        this.quesions = quesions;
    }

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }

    public Quesions(int quesionsId, String quesions, List<Answers> answers) {
        this.quesionsId = quesionsId;
        this.quesions = quesions;
        this.answers = answers;
    }
}
