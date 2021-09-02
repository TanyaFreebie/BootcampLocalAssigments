package com.company.September1st.Task1;

public class Car extends Vehiche{
    private String brand;
    private String color;

    public Car(int numOfTires, boolean isItManual, String brand, String color) {
        super(numOfTires, isItManual);
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }
private void engineSound(){
    System.out.println("Whroom");
}
    @Override
    public void sound() {
        super.sound();
        engineSound();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
