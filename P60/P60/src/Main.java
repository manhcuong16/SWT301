
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

        System.out.println("======= Shopping program =========");

        System.out.print("Input number of bills: ");
        int numberOfBills = sc.nextInt();

        int[] bills = new int[numberOfBills];
        for (int i = 0; i < numberOfBills; i++) {
            System.out.print("Input value of bill " + (i + 1) + ": ");
            bills[i] = sc.nextInt();
        }

        System.out.print("Input value of wallet: ");
        int wallet = sc.nextInt();

        int total = Shopping.calcTotal(bills);
        Shopping.payMoney(total, wallet);

        sc.close();
    }
}


