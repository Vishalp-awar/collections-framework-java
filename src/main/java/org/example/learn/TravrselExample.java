package org.example.learn;

import java.util.*;

public class TravrselExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("vishal");
        names.add("pawar");
        names.add("raj");
        names.add("idli");
        names.add("vada");
        names.add("samber");

//        using For Loop
        for (String str : names){
            System.out.print(
                    str + "\t" + str.length()

            );
            StringBuffer br =new StringBuffer(str);
            System.out.println(br.reverse());
        }

        System.out.println("____________________End Of For______________________");

//        Traversing using Iterator
//        it is present in collection so we can access by hashmap,treemap bcz all are its child
//        here names is instance of ArrayList
//        Iterator only intrate in forward direction
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("____________________End Of Itertor______________________");

//        ListIterator
        ListIterator<String> listIterator = names.listIterator(names.size());
        while (listIterator.hasPrevious()){

            String previous = listIterator.previous();
            System.out.println(previous);

        }
        System.out.println("____________________End Of ListIterator_______________");

//        Enumeration

        Enumeration<String> enumeration = Collections.enumeration(names);


        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());

        }


//        for each method

        System.out.println("__________________ForEach Method____________");
        names.forEach( e -> {
            System.out.println(e);
        });


//        learn comparable = it is used to compare with single entity

//        and comparator = it is use to compare mutliple objects





    }
}
