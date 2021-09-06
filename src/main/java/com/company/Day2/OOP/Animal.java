package com.company.Day2.OOP;

public class Animal {
    /*
    1.
 create class "Animal" with properties "type", "name" and "age"
    * create constructor with three parameters "type", "name" and "age" for setting the properties
    * create three objects each with different names and ages (two objects of type "cat" and one "dog")
    * create a method "makeSound" which prints "wuff!" if the animal type is "dog" or "meow!" if
      the animal type is "cat"

    Hint: Create class ObjectsExercise1 with main method. Here you can create instances of class Animal,
          call methods, etc.

     */
    private String type;
    private String name;
    private int age;

    public Animal(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


public String sound(){
    String says;
    //switch is better option for this one, 'cos it can be added quickly
       switch(type){
           case "cat": says = "'meow'";
           break;
           case "dog": says = "'woof'";
           break;
           default: says = "*mute*";
       }
        return says;
}


}
