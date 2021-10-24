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

public class Kerucut {
    double phi;
    double ruas;
    double tinggi;
    double garisS;
    
    public void hitungVol(){
        double vol= (1.0/3)*phi*(ruas*ruas)*tinggi;
        System.out.println("Volume kerucut: "+vol+" satuan volume");
        }
    public void hitungLuasSelimut(){
        double mut= phi*ruas*garisS;
        System.out.println("Luas selimut kerucut: "+mut+" satuan luas");
        }
}
