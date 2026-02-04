package com.example;

public class Person {
    private String name;
    private int age;
    private int id;
    private boolean isStudent;
    
    public Person(String name, int age,int id, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.isStudent = isStudent;
    }

    public Person() {
        this("", 0, 0, false);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public boolean gateIsStudent() {
        return isStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudent(boolean isStudent) {
        this.isStudent = isStudent;
    }

    @Override
    public String toString() {
        return "Person: name " +  name + " ,age " + age + ", id" + id + ",isStudent " + isStudent;
    }
    
}
