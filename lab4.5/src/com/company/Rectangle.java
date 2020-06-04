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
    public Rectangle(double width,double height)throws MinusException
    {
        super("white");
        this.width=width;
        this.height=height;
        if  (width<0) throw new MinusException("Введенный width меньше нуля", width);
        if  (height<0) throw new MinusException("Введенный height меньше нуля", height);


       // this.width= width>0 ? width : 1;
       // this.height= height>0 ? height : 1;
    }
    public Rectangle(String color,double width,double height)throws MinusException
    {
        super(color);
//        this.width= width>0 ? width : 1;
//        this.height= height>0 ? height : 1;
        if  (width<0) throw new MinusException("Введенный width меньше нуля", width);
           else this.width=width;
        if  (height<0) throw new MinusException("Введенный height меньше нуля", height);
           else this.height=height;
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
