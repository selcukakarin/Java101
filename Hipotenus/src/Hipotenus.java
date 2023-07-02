
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
public class Hipotenus {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz: ");
        int a=scan.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        int b=scan.nextInt();
        double hipo=Math.sqrt(a*a+b*b);
        System.out.print("Hipotenus: "+hipo+"\n");
    }
}
