/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficusage;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Selcuk
 */
public class GrafikKullanimi extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        g.setColor(Color.white);
        
        g.drawRect(100, 10, 50, 40);
        
        g.fillRect(200, 100, 30, 40);
        
        g.setColor(Color.blue);
        
        g.drawOval(200, 200, 30, 30);
        
        g.fillOval(300, 300, 40, 40);
        
        g.setColor(Color.yellow);
        
        g.draw3DRect(150, 150, 10, 10, true);
        
        g.drawLine(200, 200, 300, 300);
        
        
    }

    public GrafikKullanimi() {
        setBackground(Color.BLACK);
        
    }
    
    
    
}
