/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myexceptionclass;

import java.util.Scanner;

/**
 *
 * @author Selcuk
 */
public class MyExceptionClass {

    public static void mekanKontrol(int yas){
        if(yas<18){
            throw new InvalidAgeException("Invalid age");
        }else{
            System.out.println("Mekana hoşgeldiniz.");
        }
    }
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz.");
        int yas=scanner.nextInt();
        
        try{
            mekanKontrol(yas);
        }catch(InvalidAgeException e){
            e.printStackTrace();
        }
        
        
        
    }
    
}
