package com.company.Day3.Task1;

public class Car extends Vehiche{
    // Create a base class of a Vehicle,
// then create a Car class which inherits from Vehicle class.
// Also, create another class, a specific type of Car that inherits from the Car class.
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.

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
