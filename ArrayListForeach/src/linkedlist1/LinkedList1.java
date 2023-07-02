/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist1;

import java.util.ArrayList;

/**
 *
 * @author microman
 */
public class LinkedList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> diller=new ArrayList<String>();
        
        diller.add("Java");
        diller.add("Php");
        diller.add("Pyhton");
        diller.add("Kotlin");
        diller.add("C#");
        
        /*for(int i=0;i<diller.size();i++){
            System.out.println(diller.get(i));
        }*/
        
        for(String s:diller){
            System.out.println(s);
        }
        System.out.println("-----------------------");
        diller.add(1,"C++");
        for(String s:diller){
            System.out.println(s);
        }
        
        
        
    }
    
}
