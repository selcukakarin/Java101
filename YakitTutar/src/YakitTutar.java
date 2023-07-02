
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
public class YakitTutar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Aracınız km başı kaç tl yakıyor (Örnek:0,35) : ");
        double kmBasi=scan.nextDouble();
        System.out.print("Aracınızla kaç km gittiniz? : ");
        int km=scan.nextInt();
        System.out.println("Bu yolculuk için toplam harcadığınız tutar : "+(km*kmBasi));
    }
}
