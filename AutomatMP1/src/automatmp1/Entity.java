/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatmp1;

import java.awt.Color;

/**
 *
 * @author Belle
 */
public class Entity {
    public String name;
    public int location;
    
    public Entity(String name, int location){
        this.name = name;
        this.location = location;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getLocation() {
    	return location;
    }
    
    public void setLocation(int location){
        this.location = location;
    }


}
