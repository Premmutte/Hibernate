package org.example.ManyToMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Project {
    @Id
    private int Pid;
    @Column(name = "Project_Name")
    private String ProjectName;

    @ManyToMany(mappedBy = "projects")
    private List<Emp> emps;

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public Project(int pid, String projectName, List<Emp> emps) {
        Pid = pid;
        ProjectName = projectName;
        this.emps = emps;
    }

    public Project() {
    }
}
