/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author acer
 */
public class Lingkaran {
        double phi;
        double ruas;
    
    public void hitungLuas(){
        double luas= phi*(ruas*ruas);
        System.out.println("Luas lingkaran: "+luas+" satuan luas");
    }
    
    public void hitungKeliling(){
        double keliling= (2*ruas)*phi;
        System.out.println("Keliling lingkaran: "+keliling+" satuan keliling");
    }
}
