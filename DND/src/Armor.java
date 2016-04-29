public class Armor 
{
	String name;
	int durability;
	String type;
	int cost; 
	
	public Armor(String nm, int d, String t, int c)
	{
		name = nm;
		durability = d;
		type = t;
		cost = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}
}