package part4;

import info.gridworld.actor.*;
import info.gridworld.actor.Critter;
import info.gridworld.grid.*;
import java.awt.Color;
import java.util.ArrayList;

public class PoopCritter extends Critter {
	private int poopFrequency;
	private int poopCount = 0;

	public PoopCritter(int poops) {
		poopFrequency = poops;
		setColor(new Color(89, 48, 1));
	}

	public void processActors(ArrayList<Actor> actors) {
		for (Actor a : actors) {
			Location loc = a.getLocation();
			Location locMoveTo = loc.getAdjacentLocation(getLocation().getDirectionToward(loc));
			if (!(a instanceof Flower) && !(a instanceof Rock)) {
				if (getGrid().isValid(locMoveTo)) {
					a.moveTo(locMoveTo);
				} else {
					a.removeSelfFromGrid();
				}
			}
		}

	}

	public void makeMove(Location Loc) {
		if (poopCount >= poopFrequency) {
			int front = getDirection();
			int behind = ((front >= 180) ? front - 180 : 360 - (180 - front));
			Flower poop = new Flower(new Color (89,48,1));
			poop.putSelfInGrid(getGrid(), getLocation().getAdjacentLocation(behind));
		} else {
			poopCount++;
		}
		super.makeMove(Loc);
	}

}
