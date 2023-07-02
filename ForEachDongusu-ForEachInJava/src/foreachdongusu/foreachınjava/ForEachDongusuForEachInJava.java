/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreachdongusu.foreachınjava;

/**
 *
 * @author microman
 */
public class ForEachDongusuForEachInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] array={"Elma","Armut","Kiraz"};
        int[] array2={1,2,3,4,5,6};
        Deneme[] deneme={new Deneme("Selçuk"),new Deneme("Akarın")};
        for(int i:array2){
            System.out.println(i);
        }
        for(String a:array){
            System.out.println(a);
        }
        for(Deneme d:deneme){
            d.yaz();
        }
    }
    
}
