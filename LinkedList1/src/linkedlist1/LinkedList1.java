/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist1;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author microman
 */
public class LinkedList1 {
    public static void listeyiBastir(LinkedList<String> gidilecekYerler){
        /*for(String s:gidilecekYerler){
            System.out.println(s);
        }*/
        ListIterator<String> iterator=gidilecekYerler.listIterator();
        while (iterator.hasNext()) {            
            System.out.println(iterator.next());
        }
    }
    public static void siraliEkle(LinkedList<String> gidilecekYerler,String yeni){
        ListIterator<String> iterator=gidilecekYerler.listIterator();
        while (iterator.hasNext()) {            
            int karsilastir=iterator.next().compareTo(yeni);
            
            if(karsilastir==0){
                //iki değer eşit
                System.out.println("Listenizde bu eleman zaten var...");
                return;
            }else if(karsilastir<0){
                // Yeni değer iterator.next ten daha büyük
            }else if(karsilastir>0){
                iterator.previous();
                iterator.add(yeni);
                return;
            }
            
        }
        iterator.add(yeni);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> gidilecekYerler=new LinkedList<String>();
        siraliEkle(gidilecekYerler, "Postane");
        siraliEkle(gidilecekYerler, "Market");
        siraliEkle(gidilecekYerler, "Ev");
        /*gidilecekYerler.add("Postane");
        gidilecekYerler.add("Market");
        gidilecekYerler.add("Okul");
        gidilecekYerler.add("Kütüphane");
        gidilecekYerler.add("Sport salonu");
        gidilecekYerler.add("Ev");
        
        listeyiBastir(gidilecekYerler);
        System.out.println("-------------------------");
        //gidilecekYerler.add(4,"Alışveriş Merkezi");
        gidilecekYerler.remove(3);
        listeyiBastir(gidilecekYerler);*/
        
        listeyiBastir(gidilecekYerler);
        
    }
    
}
