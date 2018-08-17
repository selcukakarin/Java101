/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3kopyalama;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Selcuk
 */
public class Mp3Kopyalama {

    private static ArrayList<Integer> icerik=new ArrayList<Integer>();
    
    public static void dosyaOku(){
        
        FileInputStream in;
        try {
            in = new FileInputStream("dramakoprusu.mp3");
            
            int oku;
        
            while((oku=in.read())!=-1){
            
                icerik.add(oku);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mp3Kopyalama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Mp3Kopyalama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void kopyala(String dosyaismi){
        
        try {
            FileOutputStream out=new FileOutputStream(dosyaismi);
            
            for(int deger:icerik){
                
                out.write(deger);
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mp3Kopyalama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Mp3Kopyalama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    
    public static void main(String[] args) {
       
        dosyaOku();
        long baslangic=System.currentTimeMillis();
        kopyala("dramakoprusu2.mp3");
        kopyala("dramakoprusu3.mp3");
        kopyala("dramakoprusu4.mp3");
        long bitis=System.currentTimeMillis();
        
        System.out.println("Üç dosyanın kopyalanması şu kadar sürdü : "+(bitis-baslangic)/1000+" saniye");
        
    }
    
}
