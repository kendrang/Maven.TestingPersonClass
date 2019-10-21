package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String eyeColor;
    private int height;
    private boolean isInSchool;

    public Person(String name , int age, String eyeColor, int height, boolean isInSchool) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.height = height;
        this.isInSchool = isInSchool;
    }

    public Person (){
        name = "";
        age = Integer.MAX_VALUE;
        eyeColor = "";
        height = 5;
        isInSchool = true;
    }

    public Person(int age) {
        setAge(age);

    }

    public Person(String name) {
        setName(name);

    }

    public Person(String name, int age) {
        setAge(age);
        setName(name);
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getName() { return name;
    }

    public Integer getAge() { return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isInSchool() {
        return isInSchool;
    }

    public void setInSchool(boolean inSchool) {
        isInSchool = inSchool;
    }
}
