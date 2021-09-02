package com.company.September1st.Task1;

public class Truck extends Car{
    private int miliage;

    public Truck(int numOfTires, boolean isItManual, String brand, String color, int miliage) {
        super(numOfTires, isItManual, brand, color);
        this.miliage = miliage;
    }

    public int getMiliage() {
        return miliage;
    }

    public void setMiliage(int miliage) {
        this.miliage = miliage;
    }

   private void engineSound(){
       System.out.println("Trum-rum-rum");
   }

    @Override
    public void sound() {
        super.sound();
        engineSound();
    }
}
