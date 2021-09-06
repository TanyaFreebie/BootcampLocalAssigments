package com.company.Day2.OOP;

public class Rectangle {
  /*  3. create class "Rectangle" with properties "width" and "height" (whole numbers).
            * create default constructor which sets "height" to 5 and "width" to 10
            * create a constructor with parameters "width" and "height" which sets the corresponding property values
   * create methods "getHeight" and "getWidth" which return the corresponding properties
    * create a method "getPerimeter" (sum all sides) which calculates and returns the perimeter of the rectangle
    * create a method "getArea" (multiply with with height) which calculates and returns the area of rectangle
    * create a method "incrementHeight" with no parameters, which increments height by one
    * create a method "incrementWidth" with no parameters, which increments width by one
    * add validation in constructors which doesn't allow to create Rectangle with negative or zero
    width or height. If height or width is not positive, set it to 5 and 10
    */
private int height;
private int width;

    public Rectangle() {
        height =5;
        width =10;
    }

    public Rectangle(int height, int width) {
       if(height <= 0){
           this.height = 5;
           this.width = width;
       } else if(width <=0){
           this.height = height;
           this.width = 10;
       } else {
           this.height = height;
           this.width = width;
       }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getPerimeter(){
        int answer = 2*(height + width);
        return answer;
    }

    public int getArea(){
        int answer = height*width;
        return  answer;
    }

    public int increaseHeight(){
        height++;
        return height;
    }
    public int increaseWidght(){
        width++;
        return width;
    }
}
