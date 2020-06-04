package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Shape> test=new ArrayList<Shape>();

//        System.out.print( "Создание Shape\n");
//        System.out.print("Введите цвет: ");
//        test.add( new Shape(in.next()));
//        System.out.println(test.get(test.size()-1).toString());
try {

    System.out.print("Создание Circle\n");
    System.out.println("Введите цвет и радиус через пробел: ");
    test.add(new Circle(in.next(), in.nextDouble()));
    System.out.println("Периметр Circle: " + test.get(test.size() - 1).getPerimeter());
    System.out.println("Площадь Circle: " + test.get(test.size() - 1).getArea());
    System.out.println("Введите координаты точки для выстрела через пробел : ");
    System.out.println(test.get(test.size() - 1).isPointlnside(in.nextDouble(), in.nextDouble()));
    System.out.println(test.get(test.size() - 1).toString());


        System.out.print( "Создание Rectangle\n");
        System.out.println("Введите цвет, ширину и высоту  через пробел: ");
        test.add(new Rectangle(in.next(),in.nextDouble(),in.nextDouble()));
        System.out.println("Периметр Rectangle: "+ test.get(test.size()-1).getPerimeter());
        System.out.println("Площадь Rectangle: "+ test.get(test.size()-1).getArea());
        System.out.println("Введите координаты точки для выстрела через пробел : ");
        System.out.println(test.get(test.size()-1).isPointlnside(in.nextDouble(),in.nextDouble()));
        System.out.print(test.get(test.size()-1).toString());

        System.out.print( "Создание Square\n");
        System.out.println("Введите цвет и размер грани через пробел");
        test.add(new Square(in.next(),in.nextDouble()));
        System.out.println("Периметр Square:"+ test.get(test.size()-1).getPerimeter());
        System.out.println("Площадь Square: "+ test.get(test.size()-1).getArea());
        System.out.println("Введите координаты точки для выстрела через пробел : ");
        System.out.println(test.get(test.size()-1).isPointlnside(in.nextDouble(),in.nextDouble()));
        System.out.print(test.get(test.size()-1).toString());


        }
        catch (MinusException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
        catch (Exception ex)
        {
            System.out.println("Введен неверный символ");
        }


    }
}
