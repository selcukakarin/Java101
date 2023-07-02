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
public class OOPAtm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ATM atm=new ATM();
        Hesap hesap=new Hesap("selcuk","1235",2000);
        
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor...");
    }
    
}
