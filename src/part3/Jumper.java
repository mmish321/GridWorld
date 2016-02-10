package part3;
import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


public class Jumper extends Bug {
	public Jumper() {
	}
	
	public boolean canMove() {
		if (getGrid() == null)
		return false;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
		if (!getGrid().isValid(next))
		return false;
		Actor neighbor = getGrid().get(next);
		return (neighbor == null);
	}
	
	public void move() {
	if (getGrid() == null)
		return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
	if (getGrid().isValid(next))
		 moveTo(next);
	else
		 removeSelfFromGrid();		
	}
	
	public void act() {
		if (canMove()) {
			move();
		}
		else if (getGrid().isValid(getLocation().getAdjacentLocation(getDirection())) && !(getGrid().get(getLocation().getAdjacentLocation(getDirection())) instanceof Flower )) {
			moveTo(getLocation().getAdjacentLocation(getDirection()));
			turn();
			turn();
			move();
			
		}
		else {
			turn();
			turn();
			move();
		}
		
		
	}
	
	

}
