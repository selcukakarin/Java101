/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticanahtarkelimesi;

/**
 *
 * @author microman
 */
public class Seyirci {
    private static String isim;
    private static  int seyirciSayisi=0;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Seyirci(String isim) {
        this.isim = isim;
        seyirciSayisi++;
    }
    
    public void oyunSeyret(){
        System.out.println(isim+" oyun seyrediyor...");
    }
    public static int getSeyirciSayisi(){
        System.out.println(isim);
        return seyirciSayisi;
    }
    
}
