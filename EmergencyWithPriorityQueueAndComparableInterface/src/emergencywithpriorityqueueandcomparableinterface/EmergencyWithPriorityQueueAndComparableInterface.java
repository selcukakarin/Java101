/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergencywithpriorityqueueandcomparableinterface;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Selcuk
 */
public class EmergencyWithPriorityQueueAndComparableInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Hasta> acilservis=new PriorityQueue<Hasta>();
        
        acilservis.offer(new Hasta("Selçuk","Yanık"));
        acilservis.offer(new Hasta("Alican","Apandisit"));
        acilservis.offer(new Hasta("Mustafa","Baş ağrısı"));
        acilservis.offer(new Hasta("Paul Pogba","Yanık"));
        acilservis.offer(new Hasta("Kante","Apandisit"));
        acilservis.offer(new Hasta("Quaresma","Baş ağrısı"));
        
        int i=1;
    
        while(acilservis.isEmpty()!=true){
            System.out.println("**********************************");
            System.out.println(i+".sırada");
            System.out.println(acilservis.poll());
            System.out.println("**********************************");
        }
    }
    
    
    
}
