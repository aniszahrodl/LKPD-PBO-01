/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mypackage;

/**
 *
 * @author acer
 */
public class MyClass {
    public static void main(String[] args){
        OperasiBilangan op1 = new OperasiBilangan();
        op1.bilPertama=10;
        op1.bilKedua=20;
        op1.hitungPenjumlahan();
        op1.hitungPengurangan();
        op1.hitungPerkalian();
        op1.hitungPembagian();
        
        OperasiBilangan op2 = new OperasiBilangan();
        op2.bilPertama=25;
        op2.bilKedua=55;
        op2.hitungPenjumlahan();
        op2.hitungPengurangan();
        op2.hitungPerkalian();
        op2.hitungPembagian();
        
        OperasiBilangan op3 = new OperasiBilangan();
        op3.bilPertama=100;
        op3.bilKedua=150;
        op3.hitungPenjumlahan();
        op3.hitungPengurangan();
        op3.hitungPerkalian();
        op3.hitungPembagian();
    }
}
