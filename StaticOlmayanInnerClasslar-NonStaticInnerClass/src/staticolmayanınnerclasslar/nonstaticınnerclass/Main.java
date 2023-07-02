/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticolmayanınnerclasslar.nonstaticınnerclass;

import java.util.Scanner;

/**
 *
 * @author microman
 */
public class Main {
    public static void main(String[] args) {
        Matematik.Faktoriyel faktoriyel=new Matematik().new Faktoriyel();
        Matematik.Asal asal=new Matematik().new Asal();
        Matematik.Alan alan=new Matematik().new Alan();
        Matematik.Alan.DaireAlan daireAlan=new Matematik().new Alan().new DaireAlan();
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi=scanner.nextInt();
        if(asal.asalMi(sayi)){
            System.out.println("Bu sayı asaldır.");
        }else{
            System.out.println("Bu sayı asal değildir.");
        }
        faktoriyel.faktoriyel();
        //alan.daireAlan(sayi);
        daireAlan.daireAlan(6);
        
    }
}
