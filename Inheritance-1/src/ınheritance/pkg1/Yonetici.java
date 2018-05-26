/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınheritance.pkg1;

/**
 *
 * @author microman
 */
public class Yonetici extends Calisan{ //subclass
    private int sorumlu_kisi; // Ektra özellik  
    public Yonetici(String isim,int maas,String departman,int sorumlu_kisi){
        super(isim, maas, departman);
        this.sorumlu_kisi=sorumlu_kisi;
    }
    public void zamYap(int zamMiktari){
        System.out.println("Çalışanlara "+zamMiktari+" tl zam yapıldı.");
    }
    public void bilgileriGoster(){
        /*System.out.println("İsim : "+getIsim());
        System.out.println("Maaş : "+getMaas());
        System.out.println("Departman : "+getDepartman());*/
        super.bilgileriGoster();
        
        System.out.println("Sorumlu kişi sayısı : "+sorumlu_kisi);
    }
    
}
