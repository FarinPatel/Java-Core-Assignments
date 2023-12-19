package neo.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoClass {

    //1. Write a Java program to create an array list,
    // add some colors (strings) and print out the collection.
    public static void main(String [] args){
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("white");
        //Printed using forEach loop
        for(String str : colors){
            System.out.println("forEach loop ::"+str);
        }

        Iterator itr = colors.listIterator();
        while (itr.hasNext()){
            System.out.println("using Iterator ::"+itr.next());
        }

        //print using stream
        colors.stream().forEach(e->System.out.println("Using Stream ::"+e));
    }
    //
    public static void main1(String [] args){

    }
}
