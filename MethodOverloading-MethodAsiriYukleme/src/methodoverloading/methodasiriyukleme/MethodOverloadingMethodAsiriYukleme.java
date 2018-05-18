/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading.methodasiriyukleme;

/**
 *
 * @author microman
 */
public class MethodOverloadingMethodAsiriYukleme {
    public static void puanHesapla(String isim,int puan){
        System.out.println(isim+" isimli oyuncunun "+puan+" puanı var.");
    }
    public static void puanHesapla(String isim){
        System.out.println(isim+" isimli oyuncunun hiç puanı yok.");
    }
    public static void puanHesapla(int puan){
        System.out.println("İsimsiz oyuncunun "+puan+" puanı var.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        puanHesapla("Selçuk", 60);
        puanHesapla("Mert");
        puanHesapla(50);
    }
    
}
