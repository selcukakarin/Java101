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
        /*Account account1=new Account("selçuk akarın","selcukakarin@gmail.com","1233556");
        Account account2=account1;
        Account account3=new Account();
        
        if(account1==account3){
            System.out.println("Aynı objeyi işaret ediyorlar.");
        }else{
            System.out.println("Aynı objeyi işaret etmiyorlar.");
        }*/
        
        new Account("alican","example@gmai.com","12335").bilgileriGoster();
        
        
    }
    
}
