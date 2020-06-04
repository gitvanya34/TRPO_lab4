package com.company;

public class Shape {
    private String color;
    public Shape(String color)
    {
        this.color=color;
    }
    public String toString()
    {
    //    System.out.print("Shape with"+ color +"color");
        return "\nShape with "+color+" color\n";
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}
