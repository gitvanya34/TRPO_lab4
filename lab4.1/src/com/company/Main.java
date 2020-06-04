package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int key=0;
        Vector[] vector = Vector.generate(in.nextInt());
        System.out.printf("" +
                "1) Длинна ветора \n" +
                "2) Скалярное произведение\n" +
                "3) Векторное произведение \n" +
                "4) Сложение векторов \n" +
                "5) Разность веторов\n" +
                "6) Косинус между веторами\n");
        try
        {
            while(key != 10) {
                System.out.printf("Выберете пункт меню:");
                key = in.nextInt();
                switch (key) {
                    case 1:
                        System.out.print("Введите номер вектора: ");
                        System.out.println(vector[in.nextInt()].length());
                        break;
                    case 2:
                        System.out.print("Введите номера векторов через пробел: ");
                        System.out.println(vector[in.nextInt()].scalarProduct(vector[in.nextInt()]));
                        break;
                    case 3:
                        System.out.print("Введите номера векторов через пробел: ");
                        Vector.out(vector[in.nextInt()].crossProduct(vector[in.nextInt()]));

                        break;
                    case 4:

                        System.out.print("Введите номера векторов через пробел: ");
                        Vector.out(vector[in.nextInt()].add(vector[in.nextInt()]));
                        break;
                    case 5:
                        System.out.print("Введите номера векторов через пробел: ");
                        Vector.out(vector[in.nextInt()].sub(vector[in.nextInt()]));
                        break;
                    case 6:
                        System.out.print("Введите номера векторов через пробел: ");
                        System.out.println(vector[in.nextInt()].cos(vector[in.nextInt()]));
                        break;
                }
            }
        } catch (Exception ex)
        {
            System.out.printf("Неверная комманда\n");
        }

    }
}
