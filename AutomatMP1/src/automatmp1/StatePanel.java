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
public class StatePanel extends JPanel{
    private boolean current;
    private boolean visited;
    private String label;
    
    public void paintComponent(Graphics g) {
    super.paintComponent(g);

    //
    // yellow circle
    g.setColor(Color.black);
    g.drawOval(0, 0, 50, 50);
    g.drawString(label, 5, 30);
//    g.setColor(Color.yellow);
//    g.fillOval(0, 0, 15, 15);
    
            if(current == true)
	    {
		    g.setColor(Color.green);
		    g.drawOval(0, 0, 50, 50);
		    g.drawString(label, 5, 30);
	    }
	    else
	    {
		    g.setColor(Color.black);
		    g.drawOval(0, 0, 50, 50);
		    g.drawString(label, 5, 30); 	
	    }

    
    }
    
    public void setCurrent(boolean value) {
    	current = value;
    }
    
    public void setLabel(String label) {
    	this.label = label;
    }
    
    public boolean isVisited() {
    	return visited;
    }
}
