/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınheritance.pkg2;

/**
 *
 * @author microman
 */
public class Kopek extends Hayvan{
    private int disSayisi;
    
    public Kopek(String isim,int kilo,int boy,int bacak_sayisi,int disSayisi){
        super(isim, kilo, boy, bacak_sayisi);
        this.disSayisi=disSayisi;
    }
    
    public void kos(int hiz){
        System.out.println("Köpek koşuyor..");
        super.hareketeGec(hiz);
    }

    public int getDisSayisi() {
        return disSayisi;
    }

    public void setDisSayisi(int disSayisi) {
        this.disSayisi = disSayisi;
    }
}
