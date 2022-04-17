/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuoi;

import java.util.Scanner;

public class Cau_5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi : ");
        String a = sc.nextLine();
        int dem = 0;
        char[] stt = a.toCharArray();
        for (int i = 0; i < stt.length; i++) {
            for (int j = 0; j < stt.length; j++) {
                if (stt[i] == stt[j]) {
                    dem = dem + 1;
                  
                }
            }
            System.out.println("ky tu " + stt[i] + ":" + dem);
            dem=0;
        }

    }
}
