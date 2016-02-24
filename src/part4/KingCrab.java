package part4;
import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.*;
import info.gridworld.grid.Location;


public class KingCrab extends CrabCritter {
	public KingCrab() {
		setColor(Color.YELLOW);
	}
	
public void processActors(ArrayList<Actor> actors) {
		for (Actor a : actors) {
			Location loc = a.getLocation();
			Location locMoveTo = loc.getAdjacentLocation(getLocation().getDirectionToward(loc));
			
			if (getGrid().isValid(locMoveTo)) {
				a.moveTo(locMoveTo);
			}
			else {
				a.removeSelfFromGrid();
			}
		}
		
	}

}
