/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringozellikleri;

/**
 *
 * @author microman
 */
public class StringOzellikleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String a="Selçuk";
        String b=new String("Selçuk");
        System.out.println(b);*/
        /*System.out.println("Harf Sayısı : "+b.length());
        System.out.println("0. indeks : "+b.charAt(0));
        System.out.println("2. indeks : "+b.charAt(2));
        System.out.println("Son eleman : "+b.charAt(b.length()-1));
        
        for(int i=0;i<b.length();i++){
            System.out.println(b.charAt(i));
        }
        
        System.out.println(b.startsWith("Sel"));
        
        System.out.println(b.endsWith("çuk"));
        
        System.out.println(b.indexOf('ç'));
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
        
        String a="1923";
        int b=Integer.parseInt(a);
        System.out.println(b);
        
        int a=1923;
        String b=String.valueOf(a);
        System.out.println(a);*/
        
        String a1="selçuk";
        String a2="selçuk";
        if(a1==a2){
            System.out.println("Eşitler");
        }
        String b1=new String("selçuk");
        String b2=new String("selçuk");
        if(b1!=b2){
            System.out.println("Eşit değiller");
        }
        if(b1.equals(b2)){
            System.out.println("Değerleri eşitler");
        }
        
    }
    
}
