/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatmp1;

import java.util.ArrayList;
//import javax.swing.text.html.parser.Entity;

/**
 *
 * @author Belle
 */
public class Earth {
    Formatter formatter;
    ArrayList<String> occupants;
    
    public Earth(){
    	
    }
    
    public void addOccupant(String name) {
    	occupants.add(name);
    }
    
    public void removeOccupant(String name) {
    	for(int i = 0; i < occupants.size(); i++)
    	{
    		if(occupants.get(i).equals(name))
    			occupants.remove(i);
    	}
    }
    
    public ArrayList<String> getOccupants(){
    	return occupants;
    }
    
//    Entity e = new Entity("Scientist", "Earth");
//    formatter.appendToPane(jTextPane1, "Passenger #" + e.name, color.blue);
}
