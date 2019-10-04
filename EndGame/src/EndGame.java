import javax.sql.rowset.CachedRowSet;


public class EndGame extends Problem{
	String[][] grid;
	String strategy;
	boolean visualize;
	

	public boolean isMoveValid(State state, Operators operator) {
		int position_x = state.currentPositon.position.get(0);
		int position_y = state.currentPositon.position.get(1);
		switch(operator) {
		case up: if( position_x != 0 && 
				! grid[position_x-1][position_y].equalsIgnoreCase("W") &&
				!(grid[position_x-1][position_y].equalsIgnoreCase("T") &&
						(state.stones.isEmpty()    ) // add damage
						))

						
			return true;
			break;
			
		case down:if( position_x != grid.length-1 && 
				! grid[position_x+1][position_y].equalsIgnoreCase("W") &&
				!(grid[position_x+1][position_y].equalsIgnoreCase("T") &&
						(state.stones.isEmpty()    ) // add damage
						))
			return true;break;
		
		
		case right:if( position_y != grid[position_x].length-1 && 
				! grid[position_x][position_y+1].equalsIgnoreCase("W") &&
				!(grid[position_x][position_y+1].equalsIgnoreCase("T") &&
						(state.stones.isEmpty()    ) // add damage
						))
			return true;break;
		
		case left:if( position_y != 0 && 
				! grid[position_x][position_y-1].equalsIgnoreCase("W") &&
				!(grid[position_x][position_y-1].equalsIgnoreCase("T") &&
						(state.stones.isEmpty()    ) // add damage
						))
			return true;break;
			
		case collect: if(grid[position_x][position_y].equalsIgnoreCase("S"))
			return true;break;
		
		case kill: if(grid[position_x][position_y].equalsIgnoreCase("W"))
			return true;break;
		}
	}
	@Override
	public boolean goalTest(State state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public State transitionFunction(State state, Operators operator) {
		// TODO Auto-generated method stub
		switch(operator) {
		case up: if()
			break;
		default: break;
		}
		
	}

	@Override
	public void pathCostFunction(State state) {
		// TODO Auto-generated method stub
		
	}

}
