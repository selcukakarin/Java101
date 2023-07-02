/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author microman
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int bakiye=1000;
        String islemler="1.İşlem : Bakiye Öğrenme\n"
                        +"2.İşlem : Para Çekme\n"
                        +"3.İşlem : Para Yatırma\n"
                        +"Çıkış yapmak için q'ya basın";
        System.out.println("**********************");
        System.out.println(islemler);
        System.out.println("**********************");
        
        while(true){
            System.out.print("İşlem seçiniz : ");
            String islem=scan.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }else if(islem.equals("1")){
                System.out.println("Bakiyeniz : "+bakiye);
            }else if(islem.equals("2")){
                System.out.print("Çekmek istediğiniz tutar : ");
                int tutar=scan.nextInt();
                scan.nextLine();
                if(bakiye<tutar){
                    System.out.println("Yeterli bakiye yok. Bakiyeniz : "+bakiye);
                }else{
                    bakiye-=tutar;
                    System.out.println("Yeni bakiyeniz : "+bakiye);
                }
            }else if(islem.equals("3")){
                System.out.println("Yatırmak istediğiniz tutar : ");
                int tutar=scan.nextInt();
                scan.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni bakiyeniz : "+bakiye);
            }
        }
    }
    
}
