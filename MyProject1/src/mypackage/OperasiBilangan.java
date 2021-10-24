/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mypackage;

/**
 *
 * @author acer
 */
public class OperasiBilangan {
    //* atribut *//
    public int bilPertama;
    public int bilKedua;

    //* methods *//
    public void hitungPenjumlahan(){
        int hasil = bilPertama + bilKedua;
        System.out.println(bilPertama+"+"+bilKedua+" = "+ hasil);
    }

    public void hitungPengurangan(){
        int hasil = bilPertama - bilKedua;
        System.out.println(bilPertama+"-"+bilKedua+" = "+ hasil);
    }
    
    public void hitungPerkalian(){
        int hasil = bilPertama*bilKedua;
        System.out.println(bilPertama+"x"+bilKedua+" = "+ hasil);
    }
    
    public void hitungPembagian(){
        double bilPertamaD= bilPertama;
        double bilKeduaD= bilKedua;
        double hasil = bilPertamaD/bilKeduaD;
        System.out.println(bilPertama+":"+bilKedua+" = " + hasil);
    }
}
