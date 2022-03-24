/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangsapxep;

import java.util.Random;
import java.util.Scanner;

public class Cau_4 {

    public static void main(String[] args) {
         int[] b= cau_a();
           cauB();
           timKiem();
           timKiemTatCa();
    }

    public static int[] cau_a() {
        int[] a = new int[100];
        int n;
        Random rand = new Random();
        n = rand.nextInt(1, 9);

        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(10);
        }
        return a;
    }

    public static void cauB() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        System.out.println("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        System.out.println("Nhap mang A là: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("mang a la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void timKiem() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        System.out.println("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        System.out.println("Nhap mang A là: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Nhap gia tri can tim:");
        int tim = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (tim == a[i]) {
                tim = a[i];
                System.out.print("vi tri gia tri can tim:" + i);
                break;
            } 

        }
       
    }
    public static int timKiemTatCa() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        System.out.println("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        System.out.println("Nhap mang A là: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Nhap gia tri can tim:");
        int tim = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (tim == a[i]) {
                tim = a[i];
               return i;
            } 
      
        }
          return -1;
    }
       
    
    
}
