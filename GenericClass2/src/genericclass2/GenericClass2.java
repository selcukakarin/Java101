/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass2;

/**
 *
 * @author microman
 */
public class GenericClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Character[] charDizi={'J','A','V','A'};
        Integer[] integerDizi={1,2,3,4,5,6};
        String[] stringDizi={"Java","C#","Pyhton","Php"};
        Ogrenci[] ogrenciDizi={new Ogrenci("Selçuk"),new Ogrenci("Mustafa"),new Ogrenci("Alican")};
        
        yazdir(charDizi);
        yazdir(ogrenciDizi);
        yazdir(stringDizi);
        yazdir(integerDizi);*/
        
        Sayisal sayisal1=new Sayisal(30, 40, 20, 30);
        Sayisal sayisal2=new Sayisal(25, 45, 30, 40);
        
        Sayisal birinci=birinci(sayisal1, sayisal2);
        System.out.println("Birinci sayısal öğrencinin puanı : "+birinci.puanHesapla());
        
        EsitAgirlik esitagirlik1=new EsitAgirlik(30, 20, 40, 2);
        EsitAgirlik esitAgirlik2=new EsitAgirlik(40, 10, 50, 0);
        
        EsitAgirlik birinci2=birinci(esitagirlik1,esitAgirlik2);
        
        System.out.println("Birinci eşit ağırlık öğrencinin puanı : "+birinci2.puanHesapla());
        
    }
    
    public static <E extends Aday> E birinci(E e1,E e2){
        if(e1.puanHesapla()>e2.puanHesapla()){
            return e1;
        }else{
            return e2;
        }
    }
    
    /*public static <E> void yazdir(E[] dizi){
        for(E e:dizi){
            System.out.println(e);
        }    
        
        
        }
    */
}
