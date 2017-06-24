package com.identity.lang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ajkumar on 4/29/17.
 */
public class GenericPractice {

    List<String> names = new ArrayList(10);
    Iterator<String> it = names.iterator();

    public void printList(){
        names.add("ABC");
        names.add("ABd");
        names.add("ABe");
        names.add("ABf");

//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        System.out.println("=================");
        for(String aString : names){
            System.out.println(aString);
        }
    }

    public <T> List<T> convertArrayToList(T[] arr){
        List<T> list = new ArrayList<T>();

        for(T t : arr){
            list.add(t);
        }
        return list;
    }

}
