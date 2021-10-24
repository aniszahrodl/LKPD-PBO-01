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
public class Tabung {
    double phi;
    double ruas;
    double tinggi;
    
    public void hitungVol(){
        double vol= phi*(ruas*ruas)*tinggi;
        System.out.println("Volume tabung: "+vol+" satuan volume");
        }
    public void hitungLuasSelimut(){
        double mut= 2*ruas*phi*tinggi;
        System.out.println("Luas selimut tabung: "+mut+" satuan luas");
        }
}
