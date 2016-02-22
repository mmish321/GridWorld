package part4;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.grid.Location;

public class RockHound extends Critter {
	
	public void processActors(ArrayList<Actor> actors) {
		for (Actor a : actors) {
			if (!(a instanceof Critter)) {
				a.removeSelfFromGrid();
			}
		}
	}
	

}
