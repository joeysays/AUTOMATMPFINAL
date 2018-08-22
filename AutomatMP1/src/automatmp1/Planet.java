package automatmp1;

import java.util.ArrayList;

public class Planet {
    ArrayList<String> occupants;
    
    public Planet(){
    	occupants = new ArrayList();
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
    
    public void removeAllOccupants() {
    	for(int i = 0; i < occupants.size(); i++)
    	{
    		occupants.remove(i);
    	}
    }
    
    public String check() {
    	
    	int lion = 0;
    	int cow = 0;
    	int grains = 0;
    	int human1 = 0;
    	int human2 = 0;
    	int scientist = 0;
    	
    	for(int i = 0; i < occupants.size(); i++)
    	{
    		if(occupants.get(i).equals("Lion"))
    			lion = 1;
    		if(occupants.get(i).equals("Cow"))
    			cow = 1;
    		if(occupants.get(i).equals("Grains"))
    			grains = 1;
    		if(occupants.get(i).equals("Human 1"))
    			human1 = 1;
    		if(occupants.get(i).equals("Human 2"))
    			human2 = 1;
    		if(occupants.get(i).equals("Scientist"))
    			scientist = 1;
    	}
    	
//    	System.out.println("Lion: " + lion);
//    	System.out.println("Cow: " + cow);
//    	System.out.println("Grains: " + grains);
//    	System.out.println("Human 1: " + human1);
//    	System.out.println("Human 2: " + human2);
//    	System.out.println("Scientist: " + scientist);

    	if(scientist == 0) //if scientist is not present in the spaceship
    	{
    	if(lion == 1 && cow == 1) {
    		System.out.println("The lion ate the cow! :(");
    		return "The lion ate the cow! :(";
    	}
    	else if(cow == 1 && grains == 1) {
    			System.out.println("The cow ate the grains! :(");
    			return "The cow ate the grains! :(";
    		}
    		else if(human1 == 1 && lion == 1) {
    				System.out.println("The human (1) killed the lion! :(");
    				return "The human (1) killed the lion! :(";
    			}
    			else if(human2 == 1 && lion == 1) {
    					System.out.println("The human (2) killed the lion! :(");
    					return "The human (2) killed the lion! :(";
    				}
    				else if(human1 == 1 && cow == 1) {
    						System.out.println("The human (1) ate the cow! :(");
    						return "The human (1) ate the cow! :(";
    					}	
    					else if(human2 == 1 && lion == 1) {
    							System.out.println("The human (2) ate the cow! :(");
    							return "The human (2) ate the cow! :(";
    						}	
    						else
    							return "valid";
    	}
    	else
    		return "valid";
    }
}
