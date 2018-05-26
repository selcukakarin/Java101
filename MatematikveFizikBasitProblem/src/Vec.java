
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
public class Vec {
    private String isim;
    private int i,j,k;
    public Vec(String isim){
        this.isim=isim;
        Scanner scanner=new Scanner(System.in);
        System.out.println(isim+ " vektörün i, j, k değerlerini girin.");
        System.out.println("i : ");
        this.i=scanner.nextInt();
        System.out.println("j : ");
        this.i=scanner.nextInt();
        System.out.println("k : ");
        this.i=scanner.nextInt();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
}
