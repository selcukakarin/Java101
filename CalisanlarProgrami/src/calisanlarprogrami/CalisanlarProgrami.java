/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisanlarprogrami;

import java.util.Scanner;

/**
 *
 * @author microman
 */
public class CalisanlarProgrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Çalışanlar programına hoşgeldiniz.");
        String islemler="İşlemler\n"
                        +"1. Yazılımcı işlemleri\n"
                        +"2. Yönetici işlemleri\n"
                        +"Çıkış için q'ya basın";
        System.out.println("****************************");
        System.out.println(islemler);
        System.out.println("****************************");
        while (true) {            
            System.out.println("İşlemi seçiniz : ");
            String islem=scan.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor.");
                break;
            }else if(islem.equals("1")){
                Yazilimci yazilimci=new Yazilimci("Selçuk", "Akarın", 562,"C#, Java, C");
                String yazilimciIslem="1. Format at\n"
                                        +"2. Bilgileri göster\n"
                                        +"Çıkış için q'ya basın";
                System.out.println(yazilimciIslem);
                while (true) {    
                    System.out.println("İşlemi seçiniz");
                    
                    String yaIslem=scan.nextLine();
                    if(yaIslem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor.");
                        break;
                    }else if(yaIslem.equals("1")){
                        System.out.println("İşletim sistemi");
                        String isletimSistemi=scan.nextLine();
                        yazilimci.formatAt(isletimSistemi);
                    }else if(yaIslem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }else{
                        System.out.println("Geçersiz yazılımcı işlemi");
                    }
                }
                
            }else if(islem.equals("2")){
                Yonetici yonetici=new Yonetici("Selçuk", "Akarın", 12,20);
                String yoneticiIslem="Yönetici işlemleri\n"
                                    +"1. Zam yapın\n"
                                    +"2. Bilgileri göster"
                                    +"Çıkış için q'ya basın";
                System.out.println(yoneticiIslem);
                
                while (true) {                    
                    System.out.println("İşlemi seçin");
                    String yIslem=scan.nextLine();
                    if(yIslem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor.");
                        break;
                    }else if(yIslem.equals("1")){
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz?");
                        int zamMiktari=scan.nextInt();
                        scan.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }else if(yIslem.equals("2")){
                        yonetici.bilgileriGoster();
                    }else{
                        System.out.println("Geçersiz yönetici işlemi");
                    }
                }
            }else{
                System.out.println("Geçersiz işlem..."); 
           }
        }
    }
    
}
