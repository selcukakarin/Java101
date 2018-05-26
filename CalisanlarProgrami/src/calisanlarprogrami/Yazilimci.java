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
public class Yazilimci extends Calisan {
    private String diller;
    public Yazilimci(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller=diller;
    }
    public void formatAt(String isletimSistemi){
        System.out.println(getAd()+" "+isletimSistemi+"'ni yüklüyor.");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yazılımcının bildiği diller : "+diller);
    }
    
}
