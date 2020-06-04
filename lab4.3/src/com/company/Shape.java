package com.company;

public abstract class Shape {
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

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean isPointlnside(double x, double y);
}
