package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> test1=new ArrayList<Integer>();
        ArrayList<Integer> test2=new ArrayList<Integer>();

        test1.add(1);
        test1.add(2);
        test1.add(3);
        test1.add(4);
        test1.add(5);
        test1.add(6);

        test2.add(1);
        test2.add(2);
        test2.add(3);
        test2.add(4);
        test2.add(5);
        test2.add(6);

        Collections.shuffle(test1);
        Collections.shuffle(test2);
//        int[] test1=new int[]{1,2,3,4,5};
//        int[] test2=new int[]{1,2,4,5,3};



        System.out.println(test1);
        System.out.println(test2);




       // System.out.println(equalsArrayList(test1,test2));
        System.out.println(test1.containsAll(test2) && test2.containsAll(test1));

        System.out.println(test1);
        System.out.println(test2);
    }
    public static boolean equalsArrayList( ArrayList<Integer> test1,ArrayList<Integer> test2 )
    {

       return (test1.containsAll(test2) && test2.containsAll(test1));
      //return Arrays.equals(test1,test2);
      // return test1 == test2.intern();
      // return test1.hashCode() == test2.hashCode();
    }
}
