package com.identity.lang;

import com.spring.practice.Configurations.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by ajkumar on 4/28/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class PrintArrayTest {

    @Test
    public void printArraysTest(){
        ArraysPractice ap = new ArraysPractice();
        ap.printArrays();
    }

    @Test
    public void stringParsingTest(){
        StringParsing sp = new StringParsing();
        sp.printCharArrays();

    }

    @Test
    public void genericsTest(){
        GenericPractice gc = new GenericPractice();
        gc.printList();
    }

    @Test
    public void convertArrayToListTest(){
        GenericPractice gc = new GenericPractice();
        String[] arr = {"X","Y","z","W"};
        System.out.println(gc.convertArrayToList(arr));
    }

    @Test
//    https://www.javacodegeeks.com/2013/03/difference-between-comparator-and-comparable-in-java.html
    public void comparatorTest(){

        Country cnt1 = new Country(1, "INDIA");
        Country cnt2 = new Country(2, "USA");
        Country cnt3 = new Country(3, "CAD");
        Country cnt4 = new Country(4, "BRIT");

        List<Country> countries = new ArrayList<Country>();
        countries.add(cnt1);
        countries.add(cnt2);
        countries.add(cnt3);
        countries.add(cnt4);

        Object obj;

        Collections.sort(countries);
        System.out.println(countries.toString());

    }

}
