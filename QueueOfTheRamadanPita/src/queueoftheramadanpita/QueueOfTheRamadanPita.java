/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueoftheramadanpita;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author Selcuk
 */
public class QueueOfTheRamadanPita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ramazan pidesi uygulaması....");
        Random rnd=new Random();
        
        Queue<String> pideKuyrugu=new LinkedList<String>();
        pideKuyrugu.offer("Selçuk");
        pideKuyrugu.offer("Alican");
        pideKuyrugu.offer("Mustafa");
        pideKuyrugu.offer("Furkan");
        pideKuyrugu.offer("Mert");
        pideKuyrugu.offer("Quaresma");
        pideKuyrugu.offer("Talisca");
        pideKuyrugu.offer("Cenk Tosun");
        pideKuyrugu.offer("Adriano");
        pideKuyrugu.offer("Medel");
        
        int pideSayisi=1+rnd.nextInt(10);
        System.out.println("Pideler çıkıyor...");
        System.out.println("Çıkan pide sayısı : "+pideSayisi);
        Thread.sleep(3000);
        
        while(pideSayisi!=0){
            System.out.println(pideKuyrugu.poll()+" pideyi aldı..");
            pideSayisi--;
            Thread.sleep(1000);
        }
        System.out.println("Pide kalmadı.");
        
    }
    
}
