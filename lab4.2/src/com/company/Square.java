package com.company;

public class Square extends Rectangle {
    public Square(double sideLength)
    {
        super(sideLength,sideLength);
    }
    public Square(String color,double side)
    {
        super(color,side,side);
    }
    @Override
    public String toString()
    {
        return "\nSquare with side="+width+" extending "+ super.toString()+"\n";
    }

}
