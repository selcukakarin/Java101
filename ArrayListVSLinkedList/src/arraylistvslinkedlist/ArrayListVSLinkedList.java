/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistvslinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Selcuk
 */
public class ArrayListVSLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist=new LinkedList<Integer>();
        ArrayList<Integer> arraylist=new ArrayList<Integer>();
        
        zamanHesapla("LinkedList",linkedlist);
        zamanHesapla("ArrayList",arraylist);
        zamanHesapla2("LinkedList",linkedlist);
        zamanHesapla2("ArrayList",arraylist);
        
        
    }
    
    public static void zamanHesapla(String veriTipi,List<Integer> list){
        long baslangic;
        long bitis;
        
        baslangic=System.currentTimeMillis();
        
        for(int i=0;i<1000000;i++){
            list.add(i);
            
        }
        
        bitis=System.currentTimeMillis();
        
        System.out.println(veriTipi+" ekleme süresi: "+(bitis-baslangic)+" ms");
    }
    public static void zamanHesapla2(String veriTipi,List<Integer> list){
        long baslangic;
        long bitis;
        
        baslangic=System.currentTimeMillis();
        
        for(int i=0;i<10000;i++){
            list.add(0,i);
            
        }
        
        bitis=System.currentTimeMillis();
        
        System.out.println(veriTipi+" ekleme süresi: "+(bitis-baslangic)+" ms");
    }
    
}
