/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficusage;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Selcuk
 */
public class AnaEkran extends JFrame{

    public AnaEkran(String title) throws HeadlessException {
        super(title);
    }
    
    
    
    
    public static void main(String[] args) {
        
        GrafikKullanimi grafik=new GrafikKullanimi();
        
        AnaEkran ekran=new AnaEkran("Grafik Kullanımı");
        
        ekran.setVisible(true);
        ekran.setResizable(true);
        ekran.setSize(800,600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ekran.add(grafik);
        
    }
    
}
