package com.company;

public class Vector {
    private double x;
    private double y;
    private double z;
    public Vector ()
    {
        x=0;
        y=0;
        z=0;
    }

    public Vector(double x, double y, double z)
    {
        this.x=x;
        this.y=y;
        this.z=z;

    }
    public double length()
    {
        return  Math.sqrt(x*x + y*y + z*z);
    }
    public double scalarProduct(Vector vector)
    {
        return vector.x*x+ vector.y*y+ vector.z*z;
    }
//    public Vector crossProduct(Vector vector)
//    {
//        return;
//    }
    public Vector crossProduct(Vector vector)
    {
        x= y * vector.z - z * vector.y;
        y=z * vector.x - x * vector.z;
        z= x * vector.y - y * vector.x;
        return this;
    }
    public Vector add(Vector vector) // методы для сложения векторов;
    {
        x+=vector.x;
        y+=vector.y;
        z+=vector.z;

        return this;
    }
     public Vector sub(Vector vector) // методы для вычитания векторов
     {
         x-=vector.x;
         y-=vector.y;
         z-=vector.z;

         return this;
     }
   public double cos(Vector vector)
    {
        return this.scalarProduct(vector)/(this.length()*vector.length());
    }
    static void out(Vector vector)
     {
         System.out.println("Вектор  (" +  vector.x+","+ vector.y+","+ vector.z+ ")");
     }
    static Vector[] generate(int n)
    {
        Vector[] vector= new Vector[n];
        for(int i=0;i<n;i++)
        {
            vector[i] = new Vector( Math.random()*10,  Math.random()*10,  Math.random()*10);
            System.out.println("Вектор "+i+" (" + vector[i].x+","+ vector[i].y+ "," + vector[i].z+ ")");
        }
        return vector;
    }

}
