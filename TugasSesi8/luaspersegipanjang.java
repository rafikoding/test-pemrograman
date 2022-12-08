/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;

/**
 *
 * @author Muhammad Rafi
 */
public class luaspersegipanjang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int panjang, lebar, luas;
        System.out.println("PROGRAM JAVA MENGHITUNG LUAS PERSEGI PANJANG : ");
        
        System.out.print("Masukan Panjang      : ");
        panjang=input.nextInt();
        System.out.print("Masukan Lebar        : ");
        lebar=input.nextInt();
        
        luas=panjang*lebar;
        
        System.out.println("Luas Persegi Panjang : "+luas);
    }
    
}
