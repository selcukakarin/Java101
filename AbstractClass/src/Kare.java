/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author microman
 */
public class Kare extends Sekil {
    private int kenar;

    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar=kenar;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+" alanı "+(kenar*kenar)+" dır.");
    }
    public void cevreHesapla(){
        System.out.println(getIsim()+" in çevresi "+(4*kenar));
    }
    
}
