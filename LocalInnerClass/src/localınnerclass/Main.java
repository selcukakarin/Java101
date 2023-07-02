/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localınnerclass;

/**
 *
 * @author microman
 */
public class Main {
    public static void main(String[] args) {
        
        
        class Alan{
            public void daireAlan(int yaricap){
                System.out.println("Dairenin alanı : "+(yaricap*yaricap*Math.PI));
            }
        }
        Alan alan=new Alan();
        Alan alan2=new Alan();
        alan.daireAlan(10);
        alan2.daireAlan(3);
    }
    /*public static void deneme(){
        Alan alan1=new Alan();
    }*/
}
