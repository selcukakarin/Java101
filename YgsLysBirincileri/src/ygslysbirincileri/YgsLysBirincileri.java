/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ygslysbirincileri;

import java.util.Scanner;

/**
 *
 * @author microman
 */
public class YgsLysBirincileri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Ygs Lyg birinci bulma programına hoşgeldin...");
        Scanner scanner=new Scanner(System.in);
        
        String islemler="İşlemler...\n"
                + "1. Eşit ağırlık öğrencileri birincisi\n"
                + "2. Sayısal öğrencileri birincisi\n";
        System.out.println("**********************************");
        System.out.println(islemler);
        System.out.println("**********************************");
        
        while (true) {   
        System.out.println("Çıkış için q ya basın. devam için enter a basın");
        String cevap=scanner.nextLine();
        if(cevap.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
        }
        
            // Birinci öğrenci
                System.out.println("Birinci öğrencinin ismi : ");
                String isim1=scanner.nextLine();
                System.out.println("Netler(Türkçe Matematik Edebiyat Fizik : ");
                int turkce1=scanner.nextInt();
                int matematik1=scanner.nextInt();
                int edebiyat1=scanner.nextInt();
                int fizik1=scanner.nextInt();
                scanner.nextLine();
           // İkinci öğrenci
                System.out.println("İkinci öğrencinin ismi : ");
                String isim2=scanner.nextLine();
                System.out.println("Netler(Türkçe Matematik Edebiyat Fizik : ");
                int turkce2=scanner.nextInt();
                int matematik2=scanner.nextInt();
                int edebiyat2=scanner.nextInt();
                int fizik2=scanner.nextInt();
                scanner.nextLine();
           // Üçüncü öğrenci
                System.out.println("Üçüncü öğrencinin ismi : ");
                String isim3=scanner.nextLine();
                System.out.println("Netler(Türkçe Matematik Edebiyat Fizik : ");
                int turkce3=scanner.nextInt();
                int matematik3=scanner.nextInt();
                int edebiyat3=scanner.nextInt();
                int fizik3=scanner.nextInt();
                scanner.nextLine();
                
            System.out.println("İşlemi giriniz : ");
            String islem=scanner.nextLine();
             if(islem.equals("1")){
                EsitAgirlik ogrenci1=new EsitAgirlik(turkce1, matematik1, edebiyat1, fizik1, isim1);
                EsitAgirlik ogrenci2=new EsitAgirlik(turkce2, matematik2, edebiyat2, fizik2, isim2);
                EsitAgirlik ogrenci3=new EsitAgirlik(turkce3, matematik3, edebiyat3, fizik3, isim3);
                
                EsitAgirlik birinci=birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Birinci eşit ağırlık öğrencisi : "+birinci.getIsim());
                
                System.out.println("Öğrencinin puanı : "+birinci.puanHesapla());
                
            }else if(islem.equals("2")){
                Sayisal ogrenci1=new Sayisal(turkce1, matematik1, edebiyat1, fizik1, isim1);
                Sayisal ogrenci2=new Sayisal(turkce2, matematik2, edebiyat2, fizik2, isim2);
                Sayisal ogrenci3=new Sayisal(turkce3, matematik3, edebiyat3, fizik3, isim3);
                
                Sayisal birinci2=birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Birinci sayısal öğrencisi : "+birinci2.getIsim());
                
                System.out.println("Öğrencinin puanı : "+birinci2.puanHesapla());
                
            }else{
                System.out.println("Geçersiz işlem.");
            }
            
            
        }
        
        
    }
    public static <E extends Aday> E birinci(E e1,E e2,E e3){
        if(e1.puanHesapla()>e2.puanHesapla()&& e1.puanHesapla()>e3.puanHesapla()){
            return e1;
        }else if(e2.puanHesapla()>e1.puanHesapla()&& e2.puanHesapla()>e3.puanHesapla()){
            return e2;
        }else if(e3.puanHesapla()>e2.puanHesapla()&& e3.puanHesapla()>e1.puanHesapla()){
            return e3;
        }else{
            return e1;
        }
    }
    
}
