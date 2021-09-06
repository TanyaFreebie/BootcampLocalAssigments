package com.company.Day4.Task2;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
       persons.add(new Person("John", "Doe", 20));
        persons.add(new Person("Alex", "Jane", 70));
        persons.add(new Person("John", "Doa", 20));
         persons.add(new Person("John", "Doe", 21));
        persons.add(new Person("Alax", "Foo", 70));

        System.out.println("Unsorted objects");
        for(Person person: persons){
            System.out.println(person.toString());
        }

        System.out.println("\n******\n Sorted\n");
persons.sort(new PersonSorting());
        for(Person person: persons){
            System.out.println(person.toString());
        }
        System.out.println("\n******\n Reversed\n");
        persons.sort(new PersonSorting().reversed());
        for(Person person: persons){
            System.out.println(person.toString());
        }



    }
}
