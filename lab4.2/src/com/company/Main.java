package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Shape> test=new ArrayList<Shape>();

        System.out.print( "Создание Shape\n");
        System.out.print("Введите цвет: ");
        test.add( new Shape(in.next()));
        System.out.println(test.get(test.size()-1).toString());


        System.out.print( "Создание Circle\n");
        System.out.println("Введите цвет и радиус через пробел: ");
        test.add(new Circle(in.next(),in.nextInt()));
        System.out.println("Площадь Circle: "+ test.get(test.size()-1).getArea());
        System.out.println(test.get(test.size()-1).toString());


        System.out.print( "Создание Rectangle\n");
        System.out.println("Введите цвет, ширину и высоту  через пробел: ");
        test.add(new Rectangle(in.next(),in.nextInt(),in.nextInt()));
        System.out.println("Периметр Rectangle: "+ test.get(test.size()-1).getPerimeter());
        System.out.print(test.get(test.size()-1).toString());

        System.out.print( "Создание Square\n");
        System.out.println("Введите цвет и размер грани через пробел");
        test.add(new Square(in.next(),in.nextInt()));
        System.out.println("Периметр Square: "+ test.get(test.size()-1).getPerimeter());
        System.out.print(test.get(test.size()-1).toString());




    }
}
