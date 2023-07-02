/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınterface1;

/**
 *
 * @author microman
 */
public class Interface1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*PcMuhendisi muhendis1=new PcMuhendisi(false, false);
        muhendis1.askerlikDurumuSorgula();
        muhendis1.adliSicilSorgula();
        System.out.println(muhendis1.mezuniyetOrtalamasi(3.07));
        String [] tecrube={"Vestel","Havelsan","Turksat"};
        muhendis1.isTecrubesi(tecrube);*/
        MakineMuhendisi muhendis2=new MakineMuhendisi(true, false);
        String[] tecrube={};
        String[] referans={"Selçuk akarın","Furkan Sarıkaya"};
        muhendis2.adliSicilSorgula();
        muhendis2.askerlikDurumuSorgula();
        System.out.println(muhendis2.mezuniyetOrtalamasi(2.36));
        muhendis2.isTecrubesi(tecrube);
        muhendis2.referansGetir(referans);
        muhendis2.calis();
        
    }
    
}
