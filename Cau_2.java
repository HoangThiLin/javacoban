/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuoi;

import java.util.Scanner;

public class Cau_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nNhập vào chuỗi cần xoa ky tu trắng: ");
        String a = sc.nextLine();
        System.err.println("Chuoi vua nhap la:" + a);
        String firstLetter = a.substring(0, 1);
        String remainingLetters = a.substring(1, a.length());
        firstLetter = firstLetter.toUpperCase();
        a = firstLetter + remainingLetters;
        System.out.println("Chuỗi sau khi đổi: " + a);
    }
}
