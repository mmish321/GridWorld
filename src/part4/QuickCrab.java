package part4;

import java.util.ArrayList;

import info.gridworld.grid.Location;
import info.gridworld.grid.Grid; 

public class QuickCrab extends CrabCritter {
	
	public ArrayList<Location> getMoveLocations() {
		 ArrayList<Location> locs = new ArrayList<Location>();
		 Grid g = getGrid();

		 addTwo(locs,getDirection() + Location.LEFT);
		 addTwo(locs,getDirection() + Location.RIGHT);

		 if (locs.size() == 0)
		 return super.getMoveLocations();

		 return locs; 
	}
	private void addTwo(ArrayList<Location> locs, int dir) {
		 Grid g = getGrid();
		 Location loc = getLocation();

		 Location temp = loc.getAdjacentLocation(dir);

		 if(g.isValid(temp) && g.get(temp) == null)
		 {
		  Location loc2 = temp.getAdjacentLocation(dir);
		  if(g.isValid(loc2) && g.get(loc2)== null)
		  locs.add(loc2);
		  } 
	}
	
  
}
