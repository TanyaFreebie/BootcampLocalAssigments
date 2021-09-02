package com.company.September1st.ClassPractise;

public class Dog extends Animal{
    private int tale;

    public Dog(String name, int tale) {
        super(name);
        this.tale = tale;
    }

    public int getTale() {
        return tale;
    }
    private void chew(){
        System.out.println("method dog.chew is called");

    }

    @Override
    public void eat() {
        super.eat();
        chew();
    }

}
