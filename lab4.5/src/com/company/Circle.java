package com.company;

public class Circle extends Shape{
    private double radius;

    public Circle(String color,double radius)throws MinusException {
        super(color);
        this.radius=radius;
      //  this.radius=radius>0 ? radius : 0 ;
       if  (radius<0) throw new MinusException("Введенный radius меньше нуля", radius);

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
