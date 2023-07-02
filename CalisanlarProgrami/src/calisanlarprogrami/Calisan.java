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
public class Calisan {
    private String ad;
    private String soyad;
    private int id;

    public void bilgileriGoster(){
        System.out.println("Çalışan bilgileri");
        System.out.println("Ad : "+ad);
        System.out.println("Soyad : "+soyad);
        System.out.println("ID : "+id);
    }
    
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calisan(String ad, String soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }
}
