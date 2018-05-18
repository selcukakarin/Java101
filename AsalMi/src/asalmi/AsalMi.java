/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asalmi;

/**
 *
 * @author microman
 */
public class AsalMi {
    public static boolean asalMi(int sayi){
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                return false;
            }
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=2;i<1000;i++){
            if(asalMi(i)){
                System.out.println(i);
            }
        }
    }
    
}
