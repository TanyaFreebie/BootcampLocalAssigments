package com.company.Day3.Task1;

public class Vehiche {
    private int numOfTires;
    private boolean isItManual;

    public Vehiche(int numOfTires, boolean isItManual) {
        this.numOfTires = numOfTires;
        this.isItManual = isItManual;
    }

    public boolean isItManual() {
        return isItManual;
    }

    public void setItManual(boolean itManual) {
        isItManual = itManual;
    }

    public int getNumOfTires() {
        return numOfTires;
    }

    public void setNumOfTires(int numOfTires) {
        numOfTires = numOfTires;
    }

    public void sound(){
        System.out.println("no sound");
    }
}
