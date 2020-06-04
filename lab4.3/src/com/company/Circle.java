package com.company;

public class Circle extends Shape{
    private double radius;

    public Circle(String color,double radius) {
        super(color);
        this.radius= radius>0 ? radius : 0 ;
    }
    @Override
    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }

    @Override
    public boolean isPointlnside(double x, double y)
    {
        return Math.sqrt(x*x+y*y)<=radius? true : false;
    }

    @Override
    public String toString()
    {
      return "\nA Circle with radius="+radius+" extending "+ super.toString()+"\n";
    }
}
