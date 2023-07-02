/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass2;

/**
 *
 * @author microman
 */
public class Sayisal extends Aday {

    public Sayisal(int turkce, int matematik, int edebiyat, int fizik) {
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override
    public int puanHesapla() {
        return getTurkce()*5+getMatematik()*5+getFizik()*4+getEdebiyat()*1;
    }
    
}
