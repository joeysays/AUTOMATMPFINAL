/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatmp1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Belle
 */
public class LinePanel1 extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawLine(10, 0, 520, 250);
        g.setColor(Color.black);
        g.drawLine(10, 10, 520, 260);
        g.setColor(Color.black);
        
    }
}
