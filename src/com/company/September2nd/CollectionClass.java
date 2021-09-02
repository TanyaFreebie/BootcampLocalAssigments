package com.company.September2nd;

import java.util.*;

public class CollectionClass {

    public static void map(){

        Map<String, Integer> products = new LinkedHashMap<>();

        products.put("P1", 10);
        products.put("P2", 5);
        products.put("P3", 3);
        products.put("P3", 7);

        System.out.println("product.size() " + products.size());

        if(products.containsKey("P2")){
            System.out.println("P2 is: " + products.get("P2"));
        }

        products.put("P4", 11);
    }

    public static void compartmentExample() {
        System.out.println("B".compareTo("B"));
        System.out.println("B".compareTo("C"));
        System.out.println("B".compareTo("A"));

        System.out.println("Integer.compare(5, 5) "+ Integer.compare(5,5));
        System.out.println("Integer.compare(5, 5) "+ Integer.compare(5,12));
        System.out.println("Integer.compare(5, 5) "+ Integer.compare(5,3));

    }
    public static void sortingExample(){
        SortedObject o1 = new SortedObject(-1, "Z");
        SortedObject o2 = new SortedObject(3, "A");

        System.out.println(o1.compareTo(o2));
        System.out.println(o2.compareTo(o1));

        List<SortedObject> list = new ArrayList<>();
        list.add(new SortedObject(2, "A"));
        list.add(new SortedObject(3, "B"));
        list.add(new SortedObject(1, "B"));
        list.add(new SortedObject(2, "A"));
        list.add(new SortedObject(-1, "Z"));

        for(SortedObject item : list){
            System.out.println(item);
        }

        Collections.sort(list);

        System.out.println("++++++++++");
        for(SortedObject item : list){
            System.out.println(item);
        }

        System.out.println(" +++CompareByNumberReverseCompare");

        list.sort(new CompareByNumberReverseCompare());
        for(SortedObject item : list){
            System.out.println(item);
        }

    }
}
