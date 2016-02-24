package part4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.grid.Location;


public class BlusterCritter extends Critter {
	 private int cour;
	 private static final double DARKENING_FACTOR = 0.05;
	
	 public BlusterCritter (int courage) {
		cour = courage;
		setColor(Color.ORANGE);
	}
	 
	public ArrayList<Actor> getActors() {
	ArrayList<Actor> actors = new ArrayList<Actor>();
	Location loc = getLocation();
		  for(int r = loc.getRow() - 2; r <= loc.getRow() + 2; r++ )
		    for(int c = loc.getCol() - 2; c <= loc.getCol() + 2; c++)
		  {
		   Location tempLoc = new Location(r,c);
		   if(getGrid().isValid(tempLoc))
		   {
		     Actor a = getGrid().get(tempLoc);
		     if(a != null && a != this)
		        actors.add(a);
		     }
		 }
		 return actors; 
	}
	
	public void processActors(ArrayList<Actor> actors) {
		int count = 0;
	 for(Actor a: actors) {
		 if(a instanceof Critter) {
		    count++;
		 }
		 
	  }
	 if(count < cour) {
		   brighten();
		 }
		 else {
		   darken();
		 }
	 System.out.println(count + " " + cour);
	 
	}

	 private void brighten(){
		 Color c = getColor();
	        int red = (int) ((c.getRed() + 2) * (1 + DARKENING_FACTOR));
	        int green = (int) ((c.getGreen() + 2) * (1 + DARKENING_FACTOR));
	        int blue = (int) ((c.getBlue() + 2) * (1 + DARKENING_FACTOR));
	        if(red > 255)
	        	red = 255;
	        if(green > 255)
	        	green = 255;
	        if(blue > 255)
	        	blue = 255;
	        setColor(new Color(red, green, blue));
	    }
	 
	 private void darken(){
		 System.out.println("darken");
	    	Color c = getColor();
	        int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
	        int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
	        int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));
	        setColor(new Color(red, green, blue));
	    }
	 
	

}
