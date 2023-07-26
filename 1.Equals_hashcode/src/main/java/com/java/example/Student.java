package com.java.example;

import java.util.Objects;

public class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student student = (Student) obj;
        return this.age == student.age && Objects.equals(this.age, student.age) && Objects.equals(this.name, student.name);

    }


    @Override
    public int hashCode() {
        return Objects.hash(this.age, this.name);
    }

}
