/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputstream1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Selcuk
 */
public class FileInputStream1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        
        FileOutputStream fos=null;
        
        //File file=new File("dosya.txt");
        
        try {
            fos=new FileOutputStream("dosya.txt",true);
            
            fos.write(65);
            fos.write(74);

            //byte[] array={101,75,65,22};
            
            String s="Selçuk akarın";
            byte[] sArray=s.getBytes();
            fos.write(sArray);
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception oluştu.");
        } catch (IOException ex) {
            System.out.println("Dosyaya yazılırken bir hata oluştu. ");
        }finally{
            
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir hata oluştu.");
            }
        }*/
       
       FileInputStream fis=null;
       
        try {
            fis=new FileInputStream("dosya.txt");
            
            int deger;
            
            String s="";
            
            int say=0;
            fis.skip(5);
            
            while((deger=fis.read())!=-1){
                
                s+=(char)deger;
                
                say++;
                
                if(say==10){
                    break;
                }
                
            }
            System.out.println("Dosyanın 5. yerinden itibaren 10 karakter: "+s);
            
            
            
           /* while((deger=fis.read())!=-1){
                
                s+=(char)deger;
                
            }
            
            System.out.println("Dosya içeriği : "+s);
            */
           
            
            
            
            /*System.out.println("Birinci karakter: "+(char)fis.read());
            System.out.println("İkinci karakter: "+(char)fis.read());
            System.out.println("Üçüncü karakter: "+(char)fis.read());

            fis.skip(5);
            System.out.println("Okunan karakter : "+(char)fis.read());
            System.out.println("Okunan karakter : "+(char)fis.read());
            */
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException ex) {
            System.out.println("Dosya okunurken hata oluştu.");
        }finally{
           try {
               if(fis!=null){
                   fis.close();
               }

           } catch (IOException ex) {
               System.out.println("Dosya kapatılırken bir hata oluştu.");
           }
        }
       
    } 
    
}
