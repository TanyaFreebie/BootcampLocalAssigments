package com.company.September1st.ClassPractise;

public class Animal implements IAnimal{
    private String name;
    private int size;
    private int weight;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("Method animal.eat() is called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
