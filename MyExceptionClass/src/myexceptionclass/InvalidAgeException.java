/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myexceptionclass;

/**
 *
 * @author Selcuk
 */
public class InvalidAgeException extends ArithmeticException {

    public InvalidAgeException(String mesaj){
        super(mesaj);
    }
    
    @Override
    public void printStackTrace() {
        System.out.println("Bu bir invalid age hatasıdır....");
    }
    

}
