package com.company;

public class Rectangle extends Shape{
    protected double width;
    protected double height;

    public Rectangle()
    {
        super("white");
        width=1;
        height=1;
    }
    public Rectangle(double width,double height)
    {
        super("white");
        this.width= width>0 ? width : 1;
        this.height= height>0 ? height : 1;
    }
    public Rectangle(String color,double width,double height) {
        super(color);
        this.width= width>0 ? width : 1;
        this.height= height>0 ? height : 1;
    }
    @Override
    public  double getPerimeter()
    {
        return 2*(width+height);
    }

    @Override
    public boolean isPointlnside(double x, double y) {
      //  if(Math.abs(x)<=width/2 && Math.abs(y)<=height/2)
        return Math.abs(x)<=width/2 && Math.abs(y)<=height/2 ? true:false;
    }

    @Override
    public String toString()
    {
        return "\nRectangle with width= "+width+" and height= "+height+" extending "+super.toString()+"\n";
    }

    @Override
    public double getArea() {
        return width*height;
    }

    public void setLength()
    {
        width=height;
    }
    public void setWidth()
    {
        height=width;
    }
}
