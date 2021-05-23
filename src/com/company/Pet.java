package com.company;

public class Pet {
//    Initialized all variables
    private String name = "Sophie";
    private int age = 6;
    private String location = "Home";
    private String type = "Dog";

//    Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

//    Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    Constructor with variables
    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

//        Empty constructor
        public Pet(){

    }
}
