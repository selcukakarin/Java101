/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopatm;

import java.util.Scanner;

/**
 *
 * @author microman
 */
public class Login {
    public boolean login(Hesap hesap){
        
        Scanner scanner=new Scanner(System.in);
        String kullaniciAdi;
        String parola;
        
        System.out.print("Kullanici adi : ");
        kullaniciAdi=scanner.nextLine();
        System.out.print("Parola : ");
        parola=scanner.nextLine();
        if(hesap.getKullaniciAdi().equals(kullaniciAdi)&&hesap.getParola().equals(parola)){
            return true;
        } else{
            return false;
        }

    }
    
}
