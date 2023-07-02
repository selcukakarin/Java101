/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayoperations;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author microman
 */
public class ArrayOperations {
    public static int[] arrayiDoldur(int sayi){
        Scanner scan=new Scanner(System.in);
        int[] cikti=new int[sayi];
        for(int i=0;i<sayi;i++){
            cikti[i]=scan.nextInt();
        }
        return cikti;
    }
    public static void arrayiBastir(int [] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+(i+1)+":"+array[i]);
        }
    }
    public static void arraySort(int[] array){
        Arrays.sort(array);
        arrayiBastir(array);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a=arrayiDoldur(5);
        arrayiBastir(a);
        arraySort(a);
    }
    
}
