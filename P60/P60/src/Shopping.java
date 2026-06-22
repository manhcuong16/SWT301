/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Shopping {
   
  
     public static int calcTotal(int[] bills) {
        int total = 0;
        for (int value : bills) {
            total += value;
        }
        return total;
    }

    
    public static void payMoney(int total, int wallet) {
        System.out.println("This is total of bill: " + total);
        if (wallet >= total) {
            System.out.println("You can buy it.");
        } else {
            System.out.println("You can't buy it.");
        }
       
    }
}



