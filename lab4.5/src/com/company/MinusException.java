package com.company;

public class MinusException extends Exception {
    private double num;
    public double getNumber(){return num;}
    public MinusException(String message, double num){

        super(message);
        this.num=num;
    }
}
