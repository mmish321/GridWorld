package part3;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.*;
import info.gridworld.grid.Location;

public class JumperRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		Jumper sam = new Jumper();
		world.add(new Location(0,0), sam);
		world.show(); 

	}

}
