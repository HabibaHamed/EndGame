
public abstract class Problem {
	State initialState;
	Operators operators;
	
	public abstract boolean goalTest(State state);
	public abstract State transitionFunction(State state, Operators operator);
	public abstract void pathCostFunction(State state);
}

