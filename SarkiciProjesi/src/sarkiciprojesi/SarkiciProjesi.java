    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarkiciprojesi;

import java.util.Scanner;

/**
 *
 * @author microman
 */
public class SarkiciProjesi {
    private static Sarkicilar sarkicilar=new Sarkicilar();
    private static Scanner scanner=new Scanner(System.in);
    
    public static void islemleriBastir(){
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çık");
    }
    public static void sarkiciGoruntule(){
        sarkicilar.sarkicilariBastir();
    }
    public static void  sarkiciEkle(){
        System.out.println("Eklemek istediğiniz şarkıcının ismi :");
        String isim=scanner.nextLine();
        sarkicilar.sarkiciEkle(isim);
    }
    public static void sarkiciGuncelle(){
        System.out.println("Güncellemek istediğiniz pozisyon(1,2,3....) :");
        int pozisyon=scanner.nextInt();
        scanner.nextLine();
        
        String yeniIsim=scanner.nextLine();
        sarkicilar.sarkiciGuncelle(yeniIsim, (pozisyon-1));
    }
    public static void sarkiciSil(){
        System.out.println("Silmek istediğiniz pozisyon(1,2,3....) :");
        int pozisyon=scanner.nextInt();
        sarkicilar.sarkiciSil(pozisyon-1);
    }
    public static void sarkiciAra(){
        System.out.println("Aramak istediğiniz şarkıcı :");
        String isim=scanner.nextLine();
        sarkicilar.sarkiciAra(isim);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz");
        
        islemleriBastir();
        
        boolean cikis=false;
        int islem;
        while (!cikis) {            
            System.out.println("Bir işlem seçiniz.");
            islem=scanner.nextInt();
            scanner.nextLine();
            
            switch(islem){
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    sarkiciGoruntule();
                    break;
                case 2:
                    sarkiciEkle();
                    break;
                case 3:
                    sarkiciGuncelle();
                    break;
                case 4:
                    sarkiciSil();
                    break;
                case 5:
                    sarkiciAra();
                    break;
                case 6:
                    cikis=true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;
            }
            
            
        }
        
        
    }
    
}
