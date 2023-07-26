package com.java.example;

import java.util.HashSet;

public class EqualsAndHashcode {
    public static void main(String[] args) {
        Student student1=new Student(23,"李四");
        Student student2=new Student(23,"李四");
        System.out.println(student1==student2);
        System.out.println(student1.equals(student2));


        HashSet<Student> set=new HashSet<>();

        set.add(student1);
        set.add(student2);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());


        System.out.println(set.size());

    }
}
