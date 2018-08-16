/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoutputstream1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Selcuk
 */
public class FileOutputStream1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FileOutputStream fos=null;
        
        //File file=new File("dosya.txt");
        
        try {
            fos=new FileOutputStream("dosya.txt",true);
            
            /*fos.write(65);
            fos.write(74);
*/
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
        }
        
        
        
    }
    
}
