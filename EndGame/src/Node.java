
public class Node {
	State state;
	Node parent;
	Operators operator;
	int depth;
	int cost;
	
	public Node(State state, Node parent, Operators operator, int depth, int cost) {
		this.state = state;
		this.parent = parent;
		this.operator = operator;
		this.depth = depth;
		this.cost = cost;
	}	
}
