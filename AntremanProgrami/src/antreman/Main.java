/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antreman;

import java.util.Scanner;

/**
 *
 * @author microman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Idman programına hoşgeldiniz.");
        String idmanlar="Geçerli hareketler...\n"
                        +"Burpee\n"
                        +"Pushup(Şınav)\n"
                        +"Situp(Mekik)\n"
                        +"Squat";
        System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun...");
        System.out.println("Burpee sayısı : ");
        int burpee=scan.nextInt();
        System.out.println("Pushup sayısı : ");
        int pushup=scan.nextInt();
        System.out.println("Situp sayısı : ");
        int situp=scan.nextInt();
        System.out.println("Squat sayısı : ");
        int squat=scan.nextInt();
        scan.nextLine();
        
        Antreman antreman=new Antreman(burpee, pushup, situp, squat);
        System.out.println("İdmanınız başlıyor...");
        
        while(!(antreman.antremanBittiMi())){
            System.out.println("Hareket türü(Burpee,Pushup,Situp,Squat) : ");
            String tur=scan.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksın? : ");
            int sayi=scan.nextInt();
            scan.nextLine();
            antreman.hareketYap(tur, sayi);
        }
        
        System.out.println("İdmanını başarıyla bitirdin. Tebrikler.");
        
    }
    
}
