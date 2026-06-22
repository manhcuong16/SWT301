
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Main {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====Calculator Shape Program====");

        System.out.println("Please input side width of Rectangle: ");
        double width = sc.nextDouble();
        System.out.println("Please input length of Rectangle: ");
        double length = sc.nextDouble();
        Rectangle rect = new Rectangle(width, length);

        System.out.println("Please input radius of Circle: ");
        double radius = sc.nextDouble();
        Circle cir = new Circle(radius);

        System.out.println("Please input side A of Triangle: ");
        double a = sc.nextDouble();
        System.out.println("Please input side B of Triangle: ");
        double b = sc.nextDouble();
        System.out.println("Please input side C of Triangle: ");
        double c = sc.nextDouble();

        Triangle tri = null;
        if (a + b > c && a + c > b && b + c > a) {
            tri = new Triangle(a, b, c);
        } else {
            System.out.println("Triangle sides are invalid!");
        }

        System.out.println("-----Rectangle-----");
        rect.printResult();

        System.out.println("-----Circle-----");
        cir.printResult();

        if (tri != null) {
            System.out.println("-----Triangle-----");
            tri.printResult();
        }

        sc.close();
    }
}
