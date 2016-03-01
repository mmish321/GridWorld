package info.gridworld.grid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.AbstractGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList; 

public class SparseBoundedGrid<E> extends AbstractClass<E>{
	
	private SparseGridNode occupantArray[][];
	private int numRows;
	private int numCols;
	
	public SparseBoundedGrid(int rows, int col) {
		
		if (rows <= 0 ) {
			throw new IllegalArgumentException("rows <= 0"); 
		}
		if (col <= 0) {
			throw new IllegalArgumentException("cols <= 0"); 
		}
		numRows = rows;
		numCols = col;
		
	}
	
	public int getNumRows()
	 {
	 return numRows;
	 }
	 public int getNumCols()
	 {
	 return numCols;
	 }
	 
	public boolean isValid(Location loc) {
		return 0 <= loc.getRow() && loc.getRow() < getNumRows()
				 && 0 <= loc.getCol()
				 && loc.getCol() < getNumCols(); 
		
	}
	
	public ArrayList<Location> getOccupiedLocations() {
		ArrayList<Location> Locations = new ArrayList<Location>();
		 
		 for (int r = 0; r < getNumRows(); r++)
		 {

		 SparseGridNode p = occupantArray[r]; //get the row linked list
		 while(p != null) //traverse the row
		 {
		 Location loc = new Location(r, p.getNumCols());
		 Locations.add(loc);
		 p = p.getNext();
		 }
		 }
		 return Locations;
		
	}

}
