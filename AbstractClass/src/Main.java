/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author microman
 */
public class Main {
    public static void main(String[] args) {
        //Sekil sekil=new Sekil("Sekil");
        Sekil sekil;
        sekil=new Kare("Kare 2", 6);
        sekil.alanHesapla();
        Kare kare1=new Kare("Kare 1", 5);
        Daire daire1=new Daire("Daire 1", 3);
        
        kare1.alanHesapla();
        daire1.alanHesapla();
        
        kare1.cevreHesapla();
        
    }
}
