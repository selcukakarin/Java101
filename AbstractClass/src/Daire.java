/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author microman
 */
public class Daire extends Sekil{
    private int yaricap;

    public Daire(String isim,int yaricap) {
        super(isim);
        this.yaricap=yaricap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+" alanı "+(Math.PI*yaricap*yaricap));
    }
    
}
