package org.example.learn;

import java.util.*;
public class StartCode {


        public static void main(String[] args) {
            System.out.println("Hello, World!");

//            There are two ways to creating of an collection

//            1st is = Type Safe (same type of elements (objects ) can be added to collection)
//            2nd is = Un type Safe (different types of elements (objects) can be added to collection can be added )

//           1) type safe
//             ArrayList = Order Preserved,Duplicates Allowed
            ArrayList<String> names = new ArrayList<>();

            names.add("vishal");
            names.add("pawar");
            names.add("raj");

            System.out.println(names);

            System.out.println(names.get(0));
            System.out.println(names.get(1));

//            2) unType Safe

            LinkedList list = new LinkedList();

            list.add("vishal");
            list.add(123);
            list.add("pawar");

            System.out.println("Linkedlist with unsafe type");
            System.out.println(list);
            System.out.println(list.get(0));
            System.out.println(list.get(1));

//            set will remove value of current index and replace with it.
            names.set(0,"pawar");
            System.out.println(names);

//            add will add the value on that index and old value will be pushed onto next index
            names.add(0,"vishal");
            System.out.println(names);


//            HashSet
            //            it cannot have duplicate values check below  num.add(1.55); num.add(1.55);

//            it's order is not fix
            HashSet<Double> num = new HashSet<>();
            num.add(11.2);
            num.add(166.55);
            num.add(15.2);

            num.add(1.55);
            num.add(1.55);
            num.add(666.65);
            System.out.println("HashSet     "+num);


            //TreeSet
            //it cannot have duplicate values ;
            //it is sorted
            TreeSet<Double> numb = new TreeSet<>();

            numb.addAll(num);

            System.out.println("Tree Set" + numb);
            numb.add(66.45);
            numb.add(10.10);
            System.out.println("Tree Set" + numb);
        }
}
