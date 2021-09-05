package com.company.Day3.Task1;

public class Run {
    public static void main(String[] args) {
Truck truck = new Truck(8, false, "MAZ", "orange", 100500);
 truck.engineStarts(true);
        System.out.println(truck.increaseSpeed(50));
        System.out.println(truck.decreaseSpeed(3));
        System.out.println(truck.increaseSpeed(216));


    }
}
