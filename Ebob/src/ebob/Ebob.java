/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebob;

import java.util.Scanner;

/**
 *
 * @author microman
 */
public class Ebob {
    public static int ebobBul(int a,int b){
        int ebob=1;
        for(int i=1;i<=a && i<=b;i++){
            if((a%i==0)&&(b%i==0)){
                ebob=i;
            }
        }
        return ebob;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.print("Ebobu bulunacak ilk sayıyı giriniz : ");
        int ilk=scan.nextInt();
        System.out.print("\nEbobu bulunacak ikinci sayıyı giriniz : ");
        int ikinci=scan.nextInt();
        System.out.println("\nİki sayının ebobu : "+ebobBul(ilk, ikinci));
    }
    
}
