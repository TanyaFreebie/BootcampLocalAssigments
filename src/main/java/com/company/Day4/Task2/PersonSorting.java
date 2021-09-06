package com.company.Day4.Task2;

import java.util.Comparator;

public  class PersonSorting implements Comparator<Person> {

    public int compare(Person p1, Person p2){

        int sortName = CharSequence.compare(p1.getName(), p2.getName());
        if(sortName == 0){
            int sortSurname = CharSequence.compare(p1.getSurname(), p2.getSurname());
            if(sortSurname ==0){
                int sortAge = Integer.compare(p1.getAge(), p2.getAge());
                return sortAge;
            }
            return sortSurname;
        }
        return sortName;
    }


    public Comparator<Person> reversed() {
        return Comparator.super.reversed();
    }


}
