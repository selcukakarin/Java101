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
public class GenericClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Character[] charDizi={'J','A','V','A'};
        Integer[] integerDizi={1,2,3,4,5,6};
        String[] stringDizi={"Java","C#","Pyhton","Php"};
        Ogrenci[] ogrenciDizi={new Ogrenci("Selçuk"),new Ogrenci("Mustafa"),new Ogrenci("Alican")};
        
        /*CharYazdir.yazdir(charDizi);
        System.out.println("***************");
        IntegerYazdir.yazdir(integerDizi);
        System.out.println("***************");
        StringYazdir.yazdir(stringDizi);
        System.out.println("***************");
        OgrenciYazdir.yazdir(ogrenciDizi);*/
        
        YazdirmaSinifi<Character> yazdirCharacter=new YazdirmaSinifi<Character>();
        YazdirmaSinifi<String> yazdirString=new YazdirmaSinifi<String>();
        YazdirmaSinifi<Integer> yazdirInteger=new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<Ogrenci> yazdirOgrenci=new YazdirmaSinifi<Ogrenci>();
        
        yazdirCharacter.yazdir(charDizi);
        System.out.println("***************");
        yazdirString.yazdir(stringDizi);
        System.out.println("***************");
        yazdirInteger.yazdir(integerDizi);
        System.out.println("***************");
        yazdirOgrenci.yazdir(ogrenciDizi);
        
    }
    
}
