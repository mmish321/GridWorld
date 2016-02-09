package part2;
import info.gridworld.actor.Bug;
public class DancingBug extends Bug {
	private int steps;
	private int sideLength;
	private int[] arr;
    private int arrPos = 0;
	
	public DancingBug(int[] arr) {
		this.arr = arr;
		steps = 0;
	}

	
	public void act() {
		if (steps < 5 && canMove()) {
			move();
			steps++;
		} else {
		   arrPos++;
		   this.setDirection(arr[(arrPos % arr.length)] * 45);
			steps = 0;
		}
	
	
	}	
	

}
