/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongtrinhbac2;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class PhuongTrinhBac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            double a, b, c, x1, x2, dt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = sc.nextDouble();
        System.out.print("Nhập b: ");
        b = sc.nextDouble();
        System.out.print("Nhập c: ");
        c = sc.nextDouble();
        dt = Math.pow(b,2) - 4 * a * c;
        if (dt < 0) {
            System.out.println("Phương trình vô nghiệm!");
        } else if (dt == 0) {
            x1 = -b / (2 * a);
            System.out.println("Phương trinh có 1 nghiệm là x1 = x2 = " + x1);
        } else {
            x1 = (-b + Math.sqrt(dt)) / (2 * a);
            x2 = (-b - Math.sqrt(dt)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2);
        }
        } catch (Exception e) {
            System.out.println("Nhap sai du lieu.");
        }
         
    }    
}
