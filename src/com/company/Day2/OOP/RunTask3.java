package com.company.Day2.OOP;

public class RunTask3 {
    public static void main(String[] args) {

        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Default");
        System.out.println("height: \t"+ defaultRectangle.getHeight());
        System.out.println("width: \t" + defaultRectangle.getWidth());
        System.out.println("Default rectangle area equals " + defaultRectangle.getArea());

        Rectangle customRectangle = new Rectangle(6,12);
        System.out.println("\nCustom");
        System.out.println("height: \t"+ customRectangle.getHeight());
        System.out.println("width: \t" + customRectangle.getWidth());
        System.out.println("Custom rectangle area equals " + customRectangle.getArea());

        Rectangle errorHeight = new Rectangle(-1, 5);
        System.out.println("\nHeight -1");
        System.out.println("height: \t"+ errorHeight.getHeight());
        System.out.println("width: \t" + errorHeight.getWidth());
        System.out.println("Rectangle with error height area equals " + errorHeight.getPerimeter());




    }
}
