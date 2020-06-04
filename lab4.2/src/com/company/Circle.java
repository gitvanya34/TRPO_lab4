package com.company;

public class Circle extends Shape{
    private double radius;

    public Circle(String color,double radius) {
        super(color);
        this.radius= radius>0 ? radius : 0 ;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString()
    {
      return "\nA Circle with radius="+radius+" extending "+ super.toString()+"\n";
    }
}
