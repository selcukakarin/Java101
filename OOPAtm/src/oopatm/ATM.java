/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopatm;

import java.util.Scanner;

/**
 *
 * @author microman
 */
public class ATM {
    public void calis(Hesap hesap){
        Login login=new Login();
        Scanner scan=new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz...");
        System.out.println("************************");
        System.out.println("Kullanıcı girişi : ");
        System.out.println("************************");
        int girisHakki=3;
        
        while (true) {
            if(login.login(hesap)){
                System.out.println("Giriş Başarılı...");
                break;
            }else{
                System.out.println("Giriş Başarısız...");
                girisHakki--;
                System.out.println("Giriş hakkınız : "+girisHakki);
            }
            if(girisHakki==0){
                System.out.println("Giriş hakkınız bitti.....");
                return;
            }
        }
        
        System.out.println("*************************");
        String islemler="1. Bakiye Görüntüle\n"
                        +"2. Para Yatırma\n"
                        +"3. Para Çekme\n"
                        +"Çıkış için q'ya basın";   
        System.out.println(islemler);
        System.out.println("*************************");
        
        while(true){
            System.out.println("İşlemi seçiniz");
            String islem=scan.nextLine();
            if(islem.equals("q")){
                break;
            }else if(islem.equals("1")){
                System.out.println("Bakiyeniz : "+hesap.getBakiye());
            }else if(islem.equals("2")){
                System.out.print("Yatırmak istediğiniz tutar : ");
                int tutar=scan.nextInt();
                scan.nextLine();
                hesap.paraYatir(tutar);
            }else if(islem.equals("3")){
                System.out.print("Çekmek istediğiniz tutar : ");
                int tutar=scan.nextInt();
                scan.nextLine();
                hesap.paraCek(tutar);
            }else{
                System.out.println("Geçersiz işlem...");
            }
        }
        
    }
}
