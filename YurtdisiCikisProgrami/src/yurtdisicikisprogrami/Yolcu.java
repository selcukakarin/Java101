/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yurtdisicikisprogrami;

import java.util.Scanner;

/**
 *
 * @author microman
 */
public class Yolcu implements YurtdisiKurallari {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
    public Yolcu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yatırdığınız harç bedeli : ");
        this.harc=scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Herhangi bir siyasi yasağınız bulunuyor mu? (evet veya hayır)");
        String cevap=scanner.nextLine();
        if(cevap=="evet"){
            this.siyasiYasak=true;
        }else{
            this.siyasiYasak=false;
        }
        System.out.println("Vizeniz bulunuyor mu? (evet veya hayır)");
        String cevap2=scanner.nextLine();
        if(cevap2.equals("evet")){
            this.vizeDurumu=true;
        }else{
            this.vizeDurumu=false;
        }
        
    }

    @Override
    public boolean yurtdisiHarciKontrol() {
        if(this.harc<15){
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın....");
            return false;
        }else{
            System.out.println("Yurtdışı harcı tamam!");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if(this.siyasiYasak==true){
            System.out.println("Siyasi yasağınız bulunuyor. Yurtdışına çıkamazsınız...");
            return false;
        }else{
            System.out.println("Siyasi yasağınız bulunmuyor...");
            return  true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if(this.vizeDurumu==true){
            System.out.println("Vize işlemleri tamam!");
            return true;
        }else{
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmuyor...");
            return false;
        }
    }
    
}
