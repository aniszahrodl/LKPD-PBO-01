/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author acer
 */
public class Bola {
    double phi;
    double ruas;
    
    public void hitungVol(){
        double vol= (4/3)*phi*(ruas*ruas*ruas);
        System.out.println("Volume bola: "+vol+" satuan volume");
        }
    public void hitungLuasSelimut(){
        double mut= 4*phi*(ruas*ruas);
        System.out.println("Luas selimut bola: "+mut+" satuan luas");
        }
    
}
