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
public class EsitAgirlik extends Aday {

    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik,String isim) {
        super(turkce, matematik, edebiyat, fizik,isim);
    }

    @Override
    int puanHesapla() {
        return getTurkce()*5+getMatematik()*5+getFizik()*1+getEdebiyat()*4;
    }
    
}
