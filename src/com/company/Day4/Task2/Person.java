package com.company.Day4.Task2;

public class Person {
    //TODO 2
//1. Create a class Person with properties name, surname and age.
//          // Also implement / override toString method so it would output property names and values
//     2. Implement Comparable interface for class Person so it would be sorted by name,
//     surname and age in ascending order. (when implementing compareTo method you can assume that none of
//     the properties will ever be null)
//     3. Create ArrayList persons and add 5 person objects to list in the following order with following name, surname
//     and age:
//         John Doe 20
//         John Doe 21
//         John Doa 20
//         Alex Jane 70
//         Alax Foo 70
//     4. Sort the list
//     5. Output the elements of the persons list and see if they have been sorted correctly.
//     6. Create class PersonDescComparator which implements Comparator interface. This comparator has to
//        sort Person objects by the same fields (name, surname and age), but in descending order.
//     7. Sort the persons list using PersonDescComparator
//     8. Output the values of persons list and check if they were sorted properly
private String name;
private String surname;
private int age;


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
