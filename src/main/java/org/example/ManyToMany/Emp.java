package org.example.ManyToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Emp {

    @Id
    private  int Eid;

    private  String name;
    @ManyToMany
    @JoinTable(name = "emp_projects")
    private List<Project> projects;

    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        Eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Emp(int eid, String name, List<Project> projects) {
        Eid = eid;
        this.name = name;
        this.projects = projects;
    }

    public Emp() {
    }
}
