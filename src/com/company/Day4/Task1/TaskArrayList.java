package com.company.Day4.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskArrayList {
    //TODO 1
// 1. declare and initialize String array with 7 arbitrary colors.
// 2. Create new list "colors" (ArrayList) of type String
// 3. Copy/add all elements from String array to colors list
// 4. Remove 3rd element from colors list
// 5. Add new color at the end of the colors list
// 6. Add new color at the beginning of the colors list
// 7. Loop trough colors list and output all values (use for each loop)
// 8. Create new list (colorsSublist) which will be sublist of the colors list (will contain elements from
// index 2 to index 5)
//    (hint: take a look at List interface and find a method which you can use to achieve this)
// 9. Use for loop to output each element of colorsSublist list
public static void colors(){
    String[] color ={"violet","blue", "red", "orange", "yellow", "green", "grey"};


    List<String> colors = new ArrayList<>(Arrays.asList(color));
    //just checking printing out
    for(String colr : colors) {
        System.out.print(colr +" \t");
    }
    colors.remove(2);

    colors.add("red");
   colors.add(0,"black");
    System.out.println("\n+++++");
    for(String colr : colors) {
        System.out.print(colr +" \t");
    }

    List<String> subColors = colors.subList(2, 5);
    System.out.println("\n++++++");
    for(String colr : subColors) {
        System.out.print(colr +" \t");
    }



    //6 list.add(0, yourObject);
}



}
