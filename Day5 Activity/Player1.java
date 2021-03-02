
public class Player1 implements Comparable<Player1>
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player1(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Player1 o) {
		
		return 0;
	}
	
	

}