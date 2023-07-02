/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexmple2;

import java.util.ArrayList;

/**
 *
 * @author microman
 */
public class ArrayListExmple2 {
    public static void yazdir(ArrayList<String> a){
        
        for(int i=0;i<a.size();i++){
            System.out.println("Element "+(i+1)+" : "+a.get(i));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        
        arrayList.add("Metallica");
        arrayList.add("Guns' n roses");
        arrayList.add("Pink Floyd");
        arrayList.add("Tatu");
        arrayList.add("Tatu");

        /*System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.size());
        
        arrayList.remove("Guns' n roses");
        arrayList.remove(0);
        
        System.out.println(arrayList.indexOf("Tatu"));
        System.out.println(arrayList.lastIndexOf("Tatu"));
        System.out.println(arrayList.indexOf("selçuk"));
        
        arrayList.set(1, "selçuk");
        
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }*/
        yazdir(arrayList);
        
        
    }
    
}
