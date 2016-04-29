
public class Weapon 
	{
		String name;
		int damage; 
		int cost; 
		
		public Weapon(String nm, int d, int c)
		{
			name = nm;
			damage = d;
			cost = c;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getDamage() {
			return damage;
		}

		public void setDamage(int damage) {
			this.damage = damage;
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}
	}
