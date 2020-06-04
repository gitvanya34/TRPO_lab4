package com.company;

public class Square extends Rectangle {
    public Square(double sideLength)throws MinusException
    {
        super(sideLength,sideLength);
    }
    public Square(String color,double side)throws MinusException
    {
        super(color,side,side);
        if  (side<0) throw new MinusException("Введенный side меньше нуля",side);
    }
    @Override
    public String toString()
    {
        return "\nSquare with side="+width+" extending "+ super.toString()+"\n";
    }

}
