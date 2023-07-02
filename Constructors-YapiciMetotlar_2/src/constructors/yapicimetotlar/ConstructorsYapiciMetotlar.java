    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors.yapicimetotlar;

/**
 *
 * @author microman
 */
public class ConstructorsYapiciMetotlar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account account1=new Account();
        //System.out.println(account1.getBakiye());
        //System.out.println(account1.getIsim());
        Account account2=new Account("selçuk akarın","example@gmail.com","15236");
        /*System.out.println(account2.getIsim());
        System.out.println(account2.getHesapNo());
        System.out.println(account2.getBakiye());*/
        account1.bilgileriGoster();
        account2.bilgileriGoster();
    }
    
}
