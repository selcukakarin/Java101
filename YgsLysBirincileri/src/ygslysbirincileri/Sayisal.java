/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ygslysbirincileri;

/**
 *
 * @author microman
 */
public class Sayisal extends Aday {

    public Sayisal(int turkce, int matematik, int edebiyat, int fizik,String isim) {
        super(turkce, matematik, edebiyat, fizik,isim);
    }

    @Override
    public int puanHesapla() {
        return getTurkce()*5+getMatematik()*5+getFizik()*4+getEdebiyat()*1;
    }
    
}
