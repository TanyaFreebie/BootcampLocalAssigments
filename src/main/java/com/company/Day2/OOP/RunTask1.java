package com.company.Day2.OOP;

public class RunTask1 {
    public static void main(String[] args) {

        Animal cat1 = new Animal("cat", "Kitty", 3);
        Animal cat2 = new Animal("cat", "Tom", 5);
        Animal dog = new Animal("dog", "Rocky", 7);

        System.out.println(cat1.getName() + " says " + cat1.sound());
        System.out.println(cat2.getName()+ " says " + cat2.sound());
        System.out.println(dog.getName() + " says " + dog.sound());

    }
}
