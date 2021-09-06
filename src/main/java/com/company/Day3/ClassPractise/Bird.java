package com.company.Day3.ClassPractise;

public class Bird extends Animal{
    private int wings;

    public Bird(String name, int wings) {
        super(name);
        this.wings = wings;
    }

    private void swallow(){
        System.out.println("Method swallow has called");
    }

    @Override
    public void eat() {
        super.eat();
        swallow();

    }
}
