/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Triangle extends Shape{
    private double a,b,c;
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    @Override
    public double getArea() {
         double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    @Override
     public void printResult() {
        System.out.println("Side A: " + a);
        System.out.println("Side B: " + b);
        System.out.println("Side C: " + c);
        System.out.println("Area:" + getArea());
        System.out.println("Perimeter:" + getPerimeter());
 
    }
}
