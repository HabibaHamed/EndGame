import java.util.ArrayList;


public class Position {
	ArrayList<Integer> position;
	
	public Position(int x, int y) {
		position = new ArrayList<Integer>();
		position.add(x);
		position.add(y);
	}
	
	public ArrayList<Integer> getPostion() {
		return position;
	}
}
