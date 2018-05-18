
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author microman
 */
public class BedenKitleIndeksi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kilonuzu giriniz: ");
        int weight=scan.nextInt();
        System.out.print("Boyunuzu giriniz (Örnek:1,75): ");
        double height=scan.nextDouble();
        double result=weight/(height*height);
        System.out.println("Beden kitle endeksiniz: "+result);
    }
}
