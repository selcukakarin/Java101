/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findthepalindrome;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Selcuk
 */
public class FindThePalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cümleyi giriniz.");
        String cumle=scanner.nextLine();
        
        Stack<Character> stack=new Stack<Character>();
        
        for(int i=0;i<cumle.length()/2;i++){
            stack.push(cumle.charAt(i));
        }
        if(isPalindrome(cumle, stack)){
            System.out.println("Bu cümle palindrome'dur");
        }else{
            System.out.println("Bu cümle palindrome değildir.");
        }
    }
    
    public static boolean isPalindrome(String cumle,Stack<Character> stack){
        for(int i=(cumle.length()/2)+1;i<cumle.length();i++){
            if(cumle.charAt(i)!=stack.pop()){
                return false;
            }
        }
        return true;
    }
    
}
