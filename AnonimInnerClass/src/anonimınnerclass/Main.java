/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonimınnerclass;

/**
 *
 * @author microman
 */
public class Main {
    public static void main(String[] args) {
        
        IOgrenci ogrenci=new IOgrenci() {
            @Override
            public void dersCalis() {
                System.out.println("Ders çalışıyorum");
            }

            @Override
            public void derseGir() {
                System.out.println("Derse giriyorum");
            }
        };
        ogrenci.dersCalis();
        ogrenci.derseGir();
        
        System.out.println("*********************");
        AOgrenci ogrenci2=new AOgrenci("Selçuk Akarın",111) {
            @Override
            void kayitYaptir() {
                System.out.println("Kayıt yapılıyor "+"İsim "+getIsim()+" Numara "+getNumara());
            }
        };
        ogrenci2.kayitYaptir();
        ogrenci2.selamla();
        
    }
    public static abstract class AOgrenci{
        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }
        
        
        abstract void kayitYaptir();
        public void selamla(){
            System.out.println("Selamlar");
        }

        /**
         * @return the isim
         */
        public String getIsim() {
            return isim;
        }

        /**
         * @param isim the isim to set
         */
        public void setIsim(String isim) {
            this.isim = isim;
        }

        /**
         * @return the numara
         */
        public int getNumara() {
            return numara;
        }

        /**
         * @param numara the numara to set
         */
        public void setNumara(int numara) {
            this.numara = numara;
        }
    }
    
    public interface IOgrenci{
        void dersCalis();
        void derseGir();
    }
   
}
