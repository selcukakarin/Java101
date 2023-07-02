/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sehirturulinkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author microman
 */
public class SehirTuruLinkedList {
    public static void islemleriBastir(){
        System.out.println("0 - İşlemleri görüntüler");
        System.out.println("1 - Bir sonraki şehire git");
        System.out.println("2 - Bir önceki şehire git");
        System.out.println("3 - Uygulamadan çık");
    }
    
    public static void sehirleriTurla(LinkedList<String> sehirler){
        ListIterator<String> iterator=sehirler.listIterator();
        
        int islem;
        
        islemleriBastir();
        
        Scanner scanner=new Scanner(System.in);
        
        if(!iterator.hasNext()){
            System.out.println("Herhangi bir şehir bulunmuyor.");
        }
        boolean cikis=false;
        boolean ileri=true;
        while (!cikis) {            
            System.out.println("Bir işlem seçiniz:");
            islem=scanner.nextInt();
            switch(islem){
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    if(!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileri=true;
                    }
                    if(iterator.hasNext()){
                        System.out.println("Şehre gidiliyor : "+iterator.next());
                        
                    }else{
                        System.out.println("Gidilecek şehir kalmadı.");
                        ileri=true;
                    }
                    break;
                case 2:
                    if(ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri=false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Şehre gidiliyor : "+iterator.previous());
                    }else{
                        System.out.println("Şehir turu başladı.");
                    }
                    break;
                case 3:
                    cikis=true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;
            }
            
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> sehirler=new LinkedList<String>();
        
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("Sakarya");
        
        sehirleriTurla(sehirler);
        
        
    }
    
}
