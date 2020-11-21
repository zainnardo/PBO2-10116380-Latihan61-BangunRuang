/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan61.bangunruang;

/**
 * @author 
 * Nama : Zain Achmad R
 * Nim : 10116380
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi tentang menghitung volume bangun ruang
 */
public class PBO210116380Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BolaBasket bola = new BolaBasket();
        bola.setJari(7);
        System.out.println("=========HitungBola=========");
        System.out.println("Jari Jari Bola : "+bola.getJari());
        System.out.println("Volume Bola : "+bola.hitungVolume());
        System.out.println("");
        
        Tabung tabung = new Tabung();
        tabung.setTinggi(21);
        tabung.setJari(10);
        System.out.println("=========HitungTabung==========");
        System.out.println("Tinggi Tabung : "+tabung.getTinggi());
        System.out.println("Jari Jari Tabung : "+tabung.getJari());
        System.out.println("Volume Tabung : "+Math.ceil(tabung.hitungVolume()));
        System.out.println("");
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJari(14);
        kerucut.setTinggi(9);
        System.out.println("=========HitungKerucut===========");
        System.out.println("Volume kerucut " + kerucut.hitungVolume());
        
    }
    
}
