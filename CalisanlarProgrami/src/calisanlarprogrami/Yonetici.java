/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisanlarprogrami;

/**
 *
 * @author microman
 */
public class Yonetici extends Calisan {
    private int sorumluKisiSayisi;

    public Yonetici(String ad, String soyad, int id,int sorumluKisiSayisi) {
        super(ad, soyad, id);
        this.sorumluKisiSayisi=sorumluKisiSayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı : "+sorumluKisiSayisi);
    }
    public void zamYap(int zamMiktari){
        System.out.println(getAd()+" çalışanlara "+zamMiktari+" zam yapıyor.");
    }
}
