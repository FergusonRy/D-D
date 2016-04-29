
public class Character 
	{
	String name;
	String race;
	String type;
	int attack;
	int strength;
	int dexterity;
	int constitution;
	int intelligence;
	int wisdom;
	int charisma;
	int hitPoints;
	int armorClass;
	int stamina;
	int mana;
	int gold;
		public Character(String n, String r, String t, int att, int s, int d, int c, int i, int wd, int ch, int hp, int ac, int st, int m, int g)
		{
		name = n;
		race = r;
		type = t;
		attack = att;
		strength = s;
		dexterity = d;
		constitution = c;
		intelligence = i;
		wisdom = wd;
		charisma = ch;
		hitPoints = hp;
		armorClass = ac;
		stamina= st;
		mana = m;
		gold = g;
		
		}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public String getRace()
			{
				return race;
			}
		public void setRace(String race)
			{
				this.race = race;
			}
		public String getType()
			{
				return type;
			}
		public void setType(String type)
			{
				this.type = type;
			}
		public int getAttack()
			{
				return attack;
			}
		public int setAttack(int attack)
			{
				return this.attack = attack;
			}
		public int getStrength()
			{
				return strength;
			}
		public void setStrength(int strength)
			{
				this.strength = strength;
			}
		public int getDexterity()
			{
				return dexterity;
			}
		public void setDexterity(int dexterity)
			{
				this.dexterity = dexterity;
			}
		public int getConstitution()
			{
				return constitution;
			}
		public void setConstitution(int constitution)
			{
				this.constitution = constitution;
			}
		public int getIntelligence()
			{
				return intelligence;
			}
		public void setIntelligence(int intelligence)
			{
				this.intelligence = intelligence;
			}
		public int getWisdom()
			{
				return wisdom;
			}
		public void setWisdom(int wisdom)
			{
				this.wisdom = wisdom;
			}
		public int getCharisma()
			{
				return charisma;
			}
		public void setCharisma(int charisma)
			{
				this.charisma = charisma;
			}
		public int getHitPoints()
			{
				return hitPoints;
			}
		public void setHitPoints(int hitPoints)
			{
				this.hitPoints = hitPoints;
			}
		public int getArmorClass()
			{
				return armorClass;
			}
		public int setArmorClass(int armorClass)
			{
				return this.armorClass = armorClass;
			}
		public int getStamina()
			{
				return stamina;
			}
		public void setStamina(int stamina)
			{
				this.stamina = stamina;
			}
		public int getMana()
			{
				return mana;
			}
		public void setMana(int mana)
			{
				this.mana = mana;
			}
		public int getGold()
			{
				return gold;
			}
		public void setGold(int gold)
			{
				this.gold = gold;
			}
	
	}