package part2;

import info.gridworld.actor.Bug;

public class ZBug extends Bug {
	private boolean done = false;
	private int steps;
	private int sideLength;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public ZBug(int length) {
		steps = 0;
		sideLength = length;
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
		if (!done) {
			this.setDirection(90);
			for (int i = 0; i < sideLength; i++) {
				move();
			}
			this.turn();
			this.turn();
			this.turn();
			for (int i = 0; i < sideLength; i++) {
				move();
			}
			this.turn();
			this.turn();
			this.turn();
			this.turn();
			this.turn();
			for (int i = 0; i < sideLength; i++) {
				move();
			}
			done = true;
		} 
	}

}
