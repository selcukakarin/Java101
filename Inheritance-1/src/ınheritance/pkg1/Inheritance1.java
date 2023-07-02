/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınheritance.pkg1;

/**
 *
 * @author microman
 */
public class Inheritance1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // IS-A
        Yonetici yonetici=new Yonetici("Selçuk Akarın", 2500, "IT",10);
        yonetici.bilgileriGoster();
        //yonetici.zamYap(200);
    }
    
}
