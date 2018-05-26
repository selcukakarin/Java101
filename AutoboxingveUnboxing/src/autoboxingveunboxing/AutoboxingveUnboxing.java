/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxingveunboxing;

import java.util.ArrayList;

/**
 *
 * @author microman
 */
public class AutoboxingveUnboxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Wrapper Class
        boolean -----> Boolean
        char -----> Character
        byte -----> Byte
        short -----> Short
        int -----> Integer
        long -----> Long
        float -----> Float
        double -----> Double
        */
                
        ArrayList<String> arrayList=new ArrayList<String>();
        
        //ArrayList<int> arrayList2=new ArrayList <int>();
        ArrayList<Integer> arrayList2=new ArrayList <Integer>();
        
        /*for(int i=0;i<10;i++){
            arrayList2.add(Integer.valueOf(i*4));  // Autoboxing
        }
        
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList2.get(i).intValue()); // Unboxing
        }*/
        for(int i=0;i<10;i++){
            arrayList2.add(i*4);  // Autoboxing kendi yapıyor. Integer.valueOf(i*4)
        }
        
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList2.get(i)); // Unboxing kendi yapıyor. (arrayList2.get(i).intValue());
        }
        
    }
    
}
