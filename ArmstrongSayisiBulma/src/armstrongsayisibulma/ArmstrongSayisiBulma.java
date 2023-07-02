/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrongsayisibulma;

import java.util.Scanner;

/**
 *
 * @author microman
 */
public class ArmstrongSayisiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi=scan.nextInt();
        int basamak_sayisi=0;
        int gecici_sayi=sayi;
        int gecici_sayi2=sayi;
        int toplam=0;
        for(;0<gecici_sayi2;basamak_sayisi++){
            gecici_sayi2/=10;
        }
        do{
            int basamak_degeri=gecici_sayi%10;
            gecici_sayi/=10;
            toplam+=Math.pow(basamak_degeri, basamak_sayisi);
        }while(gecici_sayi>0);
        if(sayi==toplam){
            System.out.println("Girilen sayı bir armstrong sayısıdır.");
        }else{
            System.out.println("Girilen sayı bir armstrong sayısı değildir.");
        }
    }
    
}
