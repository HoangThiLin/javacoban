/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuoi;

import java.util.Scanner;

public class Cau_4 {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập vào chuỗi : ");
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                System.out.println("Kí tự ở vị trí " + i + " là: " + ch);
            }
        }
}
