package org.example.Basics;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {

    @Id
    private int Id;

    private String name;

    private String city;

    private Certificate certi;

    public Student(int id, String name, String city) {
        Id = id;
        this.name = name;
        this.city = city;
    }

    public Student() {
        super();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Certificate getCerti() {
        return certi;
    }

    public void setCerti(Certificate certi) {
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "Student{" + "Id=" + Id + ", name='" + name + '\'' + ", city='" + city + '\'' + '}';
    }
}
