package com.identity.lang;

import java.util.Random;

/**
 * Created by ajkumar on 4/28/17.
 */
public class ArraysPractice {


    public void printArrays(){
        Random rand = new Random(47);
        int[] nums = new int[10];


        for(int i = 0; i < 10; i++){
            nums[i] = rand.nextInt(20);
        }

        for(int i : nums){
            System.out.println(i);
        }
    }
}
