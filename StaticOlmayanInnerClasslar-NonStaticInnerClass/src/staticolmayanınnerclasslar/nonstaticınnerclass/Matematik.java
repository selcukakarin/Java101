/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticolmayanınnerclasslar.nonstaticınnerclass;

import java.util.Scanner;

/**
 *
 * @author microman
 */
public class Matematik {
    
    private double PI=Math.PI;
    
    public class Faktoriyel{
        public void faktoriyel(){
            Scanner scanner=new Scanner(System.in);
            
            System.out.println("Bir sayı giriniz:");
            int sayi=scanner.nextInt();
            int fakt=1;
            for(int i=2;i<=sayi;i++){
                fakt*=i;
            }
            System.out.print("Faktöriyel : "+fakt);
            System.out.println("");
        }

    }
    public class Asal{
        public boolean asalMi(int sayi){
            int i=2;
            while(i<sayi){
                if(sayi%i==0){
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    public class Alan{
        
        public class DaireAlan{
            public void daireAlan(int yaricap){
            System.out.println("Dairenin alanı: "+(yaricap*yaricap*PI));
        }
        }
    }
    
    
}
