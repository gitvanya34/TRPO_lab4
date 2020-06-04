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
    public  double getPerimeter()
    {
        return 2*(width+height);
    }

   @Override
    public String toString()
    {
        return "\nRectangle with width= "+width+" and height= "+height+" extending "+super.toString()+"\n";
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
