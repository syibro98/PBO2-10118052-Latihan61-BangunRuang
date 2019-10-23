/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan61.bangunruang;

/**
 *	
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program dengan konsep abstraksi untuk menghitung
 * volume bangun ruang
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola bolaBasket = new Bola();
        bolaBasket.setJariJari(7);
        
        Tabung tabung = new Tabung();
        tabung.setJariJari(10);
        tabung.setTinggi(21);
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJariJari(14);
        kerucut.setTinggi(9);
        
        System.out.println("===Bola Basket===");
        System.out.printf("Jari-jari \t= %.1f cm%n", bolaBasket.getJariJari());
        System.out.printf("Volume \t\t= %.1f cm3%n", bolaBasket.hitungVolume());
        
        System.out.println("\n===Tabung===");
        System.out.printf("Jari-jari \t= %.1f cm%n", tabung.getJariJari());
        System.out.printf("Tinggi \t\t= %.1f cm%n", tabung.getTinggi());
        System.out.printf("Volume \t\t= %.1f cm3%n", tabung.hitungVolume());
        
        System.out.println("\n===Kerucut===");
        System.out.printf("Jari-jari \t= %.1f cm%n", kerucut.getJariJari());
        System.out.printf("Tinggi \t\t= %.1f cm%n", kerucut.getTinggi());
        System.out.printf("Volume \t\t= %.1f cm3%n", kerucut.hitungVolume());
    }
    
}
