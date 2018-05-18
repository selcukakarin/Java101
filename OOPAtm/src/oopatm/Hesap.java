/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopatm;

/**
 *
 * @author microman
 */
public class Hesap {
    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    public Hesap(String kullaniciAdi, String parola, int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void paraYatir(int tutar){
        bakiye+=tutar;
        System.out.println("Bakiye : "+bakiye);
    }
    
    public void paraCek(int tutar){
        if(bakiye-tutar<0){
            System.out.println("Yeterli bakiyeniz yok");
        }else{
            bakiye-=tutar;
            System.out.println("Yeni bakiyeniz : "+bakiye);
        }
    }
    
}
