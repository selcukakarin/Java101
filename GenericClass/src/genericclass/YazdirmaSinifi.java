/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass;

/**
 *
 * @author microman
 */
public class YazdirmaSinifi<E> {
    public void yazdir(E[] dizi){
        for(E e:dizi){
            System.out.println(e);
        }
        
    }
    
    
    
}
