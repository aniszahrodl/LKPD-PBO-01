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
public class BangunRuangMain {
    public static void main(String[] args){
        Bola b1=new Bola();
        b1.phi=3.14;
        b1.ruas=3;
        b1.hitungVol();
        b1.hitungLuasSelimut();
        
        Tabung t1=new Tabung();
        t1.phi=3.14;
        t1.ruas=3;
        t1.tinggi=5;
        t1.hitungVol();
        t1.hitungLuasSelimut();
        
        Kerucut k1=new Kerucut();
        k1.phi=3.14;
        k1.ruas=3;
        k1.tinggi=4;
        k1.garisS=25;
        k1.hitungVol();
        k1.hitungLuasSelimut();
    }
}
