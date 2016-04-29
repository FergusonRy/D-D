import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class CharecterCreation
	{
		static int a;
		static int b;
		static int d;
		static int e;
		static Scanner userInput = new Scanner(System.in);
		static int stats[] = new int[6];
		static ArrayList<Character> traits = new ArrayList<Character>();
		static Character c = new Character("", "", "", 0, rollDice(), rollDice(), rollDice(), rollDice(), rollDice(), rollDice(), 0, 0, 0, 0, 500);

		public static void main(String[] args) throws InterruptedException
			{
				fillName();
				rollDice();
				rollStats();
				chooseRace();
				chooseClass();
				chooseWeapon();
				chooseArmor();
				getHealth();
			}

		public static void printCharacter()
			{
				System.out.println("Your Characters name is " + c.getName() + " He/she is a " + c.getRace() + " "
						+ c.getType() + " you can do " + c.getAttack() + " damage, your Strength = " + c.getStrength()
						+ ", your Dextarity = " + c.getDexterity() + ", your Constitution = " + c.getConstitution()
						+ ", your Intellegence = " + c.getIntelligence() + ", your Wisdom = " + c.getWisdom()
						+ ", your Charisma =" + c.getCharisma() + ", you have " + c.getHitPoints()
						+ " Hit points, your armor class = " + c.getArmorClass() + ", and you have " + e
						+ " pieces of gold.");
			}

		public static void fillName() throws InterruptedException
			{
				System.out.println("             (o)");
				System.out.println("             <M");
				System.out.println("             <M"); 
				System.out.println("   .......  //:M------------------------------------------------,,,,,,");
				System.out.println("(O)[]XXXXXX[]I:K+}=====<{H}>================================------------>");
				System.out.println("   ^^^^^^^  \\:W------------------------------------------------''''''");
				System.out.println("             <W");  
				System.out.println("             <W");
				System.out.println("             (O)");
				Thread.sleep(2000);
				System.out.println("lol");
				System.out.println("Hello, I hope your ready to play an awesome game of DnD.");
				System.out.println("First of all you need to choose your Character's name so...");
				System.out.println("What do you want your characters name to be?");
				String word = userInput.nextLine();
				c.setName(word);
				System.out.println("Welcome " + c.getName() + "!!!");
				//if (word.equals("Arimir"))
					{
						//c.setStrength(c.getStrength()+15);
						//c.setDexterity(c.getDexterity()+19);
						//c.setConstitution(c.getConstitution()+13);
						//c.setIntelligence(c.getIntelligence()+12);
						//c.setWisdom(c.getWisdom()+16);
						//c.setCharisma(c.getCharisma()+8);
						//c.setRace(c.getRace()+"Wood Elf");
						//c.setType(c.getType()+"Ranger");
						//c.setAttack(c.getAttack()+15);
						//c.setHitPoints(c.getHitPoints()+53);
						//c.setArmorClass(c.getArmorClass()+17);
						//c.setStamina(c.getDexterity()+c.getStrength());
						//c.setMana(c.getIntelligence()+c.getCharisma());
						//c.getGold();
					}
			}

		public static int rollDice()
			{
				int diceTotal = 0;
				for (int j = 0; j < 3; j++)
					{
						int diceRoll = (int) (Math.random() * 6) + 1;
						diceTotal = diceTotal + diceRoll;
					}
				if (diceTotal<8)
					{
					diceTotal = 8;
					}
				else if (diceTotal>20)
					{
					diceTotal = 19;
					}
				return diceTotal;
			}

		public static void rollStats() throws InterruptedException
			{
				System.out.println("In order to play DnD we first need roll your stats.");
				System.out.println(
						"Your stats will influence the rest of the game, they will determine how strong your character is.");
				System.out.println(
						"Your 6 stats inclued Strength, Dexterity, Constitution, Intelligence, Wisdom, and Charisma.");
				System.out.println("please type 1 when you want to roll");
				int roll = userInput.nextInt();
				if (roll==1)
					{
						printStats();
					}
				else if (roll!=1)
					{
					rollStats();
					}
			}

		public static void printStats() throws InterruptedException
			{
				Thread.sleep(1500);
				System.out.println("Strength " + c.getStrength());
				Thread.sleep(1000);
				System.out.println("Dextarity " + c.getDexterity());
				Thread.sleep(1000);
				System.out.println("Constitution " + c.getConstitution());
				Thread.sleep(1000);
				System.out.println("Intelligence " + c.getIntelligence());
				Thread.sleep(1000);
				System.out.println("Wisdom " + c.getWisdom());
				Thread.sleep(1000);
				System.out.println("Charisma " + c.getCharisma());
				Thread.sleep(2000);
			}

		public static void chooseRace() throws InterruptedException
			{
				System.out.println("The second thing you need to do is choose a race.");
				System.out.println("Depending on what race you choose, it will influence your existing stats.");
				System.out.println("You have the choice between these 9 races:");
				System.out.println(" (1) Wood Elf, (2) elf, (3) Human, (4) Dwarf, (5) Half Orc, (6) Dragon Born, (7) Half Elf, (8) Halfling, (9) Dark Elf.");
				System.out.println("Please type the number of which race you would like to be on the line below.");
				System.out.println("Make sure the race you type is spelled the exact same way I spell it.");
				int race = userInput.nextInt();
				if (race==1)
					{
						System.out.println("You chose to be a Wood Elf!");
						System.out.println("Your people live deep in the forest and are great hunters and nature magic wielders.");
						c.setDexterity(c.getDexterity() + 2);
						c.setWisdom(c.getWisdom() + 1);
						System.out.println("Because you chose to be a wood-elf, you increased your dexterity and wisdom.");
						System.out.println("Your new stats are...");
						c.setRace("Wood Elf");
						printStats();
					} 
				else if (race==2)
					{
						System.out.println("You chose Elf!");
						System.out.println("Your people are a divine race and are great with studying magic");
						c.setIntelligence(c.getIntelligence() + 2);
						c.setConstitution(c.getConstitution() + 1);
						System.out.println("Because you chose to be an elf you increased your intellegence and your constitution.");
						System.out.println("Your new stats are...");
						c.setRace("Elf");
						printStats();
					} 
				else if (race==3)
					{
						System.out.println("You chose Human!");
						System.out.println("Your race is one of the most versatile of races you can be anything.");
						c.setStrength(c.getStrength() + 1);
						c.setDexterity(c.getDexterity() + 1);
						c.setConstitution(c.getConstitution() + 1);
						System.out.println("Because you chose to be a human you increased your strength, dexterity, and constitution.");
						System.out.println("Your new stats are...");
						c.setRace("Human");
						printStats();
					} 
				else if (race==4)
					{
						System.out.println("You chose Dwarf!");
						System.out.println("Your people are a loyal and hidden folk prefering caves and the underground to the sun above. Your people are also very strong");
						c.setStrength(c.getStrength() + 2);
						c.setConstitution(c.getConstitution() + 1);
						c.setCharisma(c.getCharisma() + 1);
						System.out.println("Because you chose to be a dwarf you increased your strength, constitution, and your charisma.");
						System.out.println("Your new stats are...");
						c.setRace("Dwarf");
						printStats();
					} 
				else if (race==5)
					{
						System.out.println("You chose Half Orc!");
						System.out.println("Your people are a savage group of barbarians whose strength scares even the strongest of Kingdoms");
						c.setStrength(c.getStrength() + 2);
						c.setConstitution(c.getConstitution() + 2);
						System.out.println("Because you chose to be a half orc you increased your strength and constitution.");
						System.out.println("Your new stats are...");
						c.setRace("Half Orc");
						printStats();
					} 
				else if (race==6)
					{
						System.out.println("You chose Dragon Born!");
						System.out.println("Your people are descended from Dragons. They are a Noble Folk and often there skin color tells you what substance they can blow from there mouth.");
						c.setStrength(c.getStrength() + 2);
						c.setIntelligence(c.getIntelligence() + 1);
						System.out.println("Because you chose to be a Dragon Born, you increased your strength and intellegence.");
						System.out.println("Your new stats are...");
						c.setRace("Dragon Born");
						printStats();
					} 
				else if (race==7)
					{
						System.out.println("You chose Half Elf!");
						System.out.println("Your people are a mix of Elves and Humans they are very quick, sneaky, and smart.");
						c.setIntelligence(c.getIntelligence() + 1);
						c.setConstitution(c.getConstitution() + 1);
						c.setStrength(c.getStrength() + 1);
						c.setDexterity(c.getDexterity() + 1);
						System.out.println("Because you chose to be a Half Elf you increased your intellegence, constitution, strength, and dexterity.");
						System.out.println("Your new stats are...");
						c.setRace("Half Elf");
						printStats();
					} 
				else if (race==8)
					{
						System.out.println("You chose to be Halfling!");
						System.out.println("Your people are a tiny folk but can be very usefull they have an uncanny ability to stay hidden.");
						c.setWisdom(c.getWisdom() + 1);
						c.setDexterity(c.getDexterity() + 1);
						c.setIntelligence(c.getIntelligence() + 1);
						System.out.println("Because you chose to be a Halfling you increased your intellegence, wisdom, dexterity.");
						System.out.println("Your new stats are...");
						c.setRace("Halfling");
						printStats();
					} 
				else if (race==9)
					{
						System.out.println("You chose to be a Dark Elf");
						System.out.println("Your people are a dark tribe often living underground despised by the people above. They stay hidden practicing in dark magic and stealth.");
						c.setIntelligence(c.getIntelligence() + 2);
						c.setDexterity(c.getDexterity() + 2);
						System.out.println("Because you chose to be an Dark Elf you increased your intellegence and your dexterity.");
						System.out.println("Your new stats are...");
						c.setRace("Dark Elf");
						printStats();
					}
				else if (race<1||race>9)
					{
						System.out.println("That is not a ligitamit Race please try again");
						chooseRace();
					}
			}

		public static void chooseClass() throws InterruptedException
			{
				System.out.println("Now you need to choose your Class.");
				System.out.println("You may choose from these classes: (1) Warrior, (2) Paladin, (3) Fighter, (4) Ranger, (5) Rogue, (6) Sorceror, (7) Druid, (8) Warlock,");
				int Type = userInput.nextInt();
				if (Type==1)
					{
						System.out.println(
								"You chose the Warrior class. Warriors are very strong, they are usually Proficient wearing Heavy Armor and wielding a sword and shield");
						c.setStrength(c.getStrength() + 1);
						c.setConstitution(c.getConstitution() + 1);
						System.out.println("Because you chose to be an Warrior you increased your strength and your constitution.");
						System.out.println("Your new stats are...");
						c.setType("Warrior");
						printStats();
					} 
				else if (Type==2)
					{
						System.out.println(
								"You chose Paladin. Paladins are nobel Knights usually wearing heavy armor and weilding a sword and shield, the difference between the Paladins and worriors is that the Palidans have healing abilities.");
						c.setIntelligence(c.getIntelligence() + 1);
						c.setConstitution(c.getConstitution() + 1);
						c.setStrength(c.getStrength() + 1);
						System.out.println(
								"Because you chose to be a Paladin you increased your Intellegence, constitution, and Strength.");
						System.out.println("Your new stats are...");
						c.setType("Paladin");
						printStats();
					} 
				else if (Type==3)
					{
						System.out.println(
								"You chose to be a fighter. fighters are usualy very Strong and fast being proficient in almost all combat and armor they are the jack of all traits");
						c.setStrength(c.getStrength() + 2);
						c.setConstitution(c.getConstitution() + 2);
						System.out.println(
								"Because you chose to be a Fighter you increased your Strength and your Constitution");
						System.out.println("Your new stats are...");
						c.setType("Fighter");
						printStats();
					} 
				else if (Type==4)
					{
						System.out.println(
								"You chose Rangers. Usually a mix between the fighter and rouge class Rangers are proficent in medium armor, and are known for there accuracy with bows.");
						c.setDexterity(c.getDexterity() + 2);
						c.setStrength(c.getStrength() + 1);
						System.out.println(
								"Because you chose to be a Ranger you increased your Dextarity and your Strength");
						System.out.println("Your new stats are...");
						c.setType("Rangers");
						printStats();
					} 
				else if (Type==5)
					{
						System.out.println(
								"You chose to be a Rogue. Rogues are a sneeky class your usually proficent in light/medium armor and knives. your gifted in breaking rules, stealing, and assasinating. you live in the shadows");
						c.setDexterity(c.getDexterity() + 2);
						c.setWisdom(c.getWisdom() + 2);
						System.out.println(
								"Because you chose to be a Rouge you increased your Dextarity and your Wisdom");
						System.out.println("Your new stats are...");
						c.setType("Rogues");
						printStats();
					} 
				else if (Type==6)
					{
						System.out.println(
								"You chose Sorceror. Sorcerors are the master magic class being proficent in many types of magic they can blow stuff up, shoot magic missels out of there finger tips, and of corse make stuff levitate. they were light armor and usually use quater staffs or wands");
						c.setIntelligence(c.getIntelligence() + 4);
						System.out.println("Because you chose to be a Sorceror you increased your Intelligence alot");
						System.out.println("Your new stats are...");
						c.setType("Sorceror");
						printStats();
					} 
				else if (Type==7)
					{
						System.out.println(
								"You chose druid. Druids are magic users but they usually weild nature magic making vines entangle people and turning spears to flowers. They usually use quater staffs and wear light armor.");
						c.setIntelligence(c.getIntelligence() + 3);
						c.setWisdom(c.getWisdom() + 1);
						System.out.println(
								"Because you chose to be a druid you increased your Intelligence and your Wisdom");
						System.out.println("Your new stats are...");
						c.setType("Druid");
						printStats();
					} 
				else if (Type==8)
					{
						System.out.println(
								"You chose warlock. Warlocks are dark magic users being proficient in narcotic magic. They can summon demons, throw dark crystal balls, and encase people in clouds of black and purple fog");
						c.setIntelligence(c.getIntelligence() + 3);
						c.setCharisma(c.getCharisma() + 1);
						System.out.println(
								"Because you chose to be a Warlock you increased your Intelligence and your Charisma");
						System.out.println("Your new stats are...");
						c.setType("Warlock");
						printStats();
					}
				else if (Type<1||Type>8)
					{
						System.out.println("That is not a ligitamit Class please try again");
						chooseClass();
					}
			}

		public static void chooseWeapon() throws InterruptedException
			{
				int cost = 0;
				ArrayList<Weapon> weapons = new ArrayList<Weapon>();
				System.out.println("now you need to choose your weapon!");
				System.out.println("you may choose from the wide asortment of weapons at your local merchant");
				System.out.println("the merchant is willing to sell you these weapons");
				System.out.println("Remember you only have 500 pieces of gold.");
				weapons.add(new Weapon("(1) bow", 9, 50));
				weapons.add(new Weapon("(2) longsword", 8, 60));
				weapons.add(new Weapon("(3) greatsword", 12, 100));
				weapons.add(new Weapon("(4) quarterstaff", 6, 40));
				weapons.add(new Weapon("(5) shield", 0, 60));
				weapons.add(new Weapon("(6) two knives", 10, 80));
				weapons.add(new Weapon("(7) spellbook", 0, 100));
				weapons.add(new Weapon("(8) axe", 9, 70));
				weapons.add(new Weapon("(9) greataxe", 13, 120));
				weapons.add(new Weapon("(10) mace", 7, 50));
				weapons.add(new Weapon("(11) wand", 10, 45));
				for (Weapon we : weapons)
					{
						Thread.sleep(1000);
						System.out.println(we.getName() + ": Its attack is " + we.getDamage() + " and it costs " + we.getCost() + " pieces of gold.");
					}
				System.out.println("Which weapon would you like to buy?");
				int item = userInput.nextInt();
				if (item==1)
					{
						a = c.getGold() - weapons.get(0).getCost();
						System.out.println("Now you have " + a + " gold left.");
						b = c.setAttack(weapons.get(0).getDamage());
					} 
				else if (item==2)
					{
						a = c.getGold() - weapons.get(1).getCost();
						System.out.println("Now you have " + a + " gold left.");
						b = c.setAttack(weapons.get(1).getDamage());
					}
				else if (item==3)
					{
						a = c.getGold() - weapons.get(2).getCost();
						System.out.println("Now you have " + a + " gold left.");
						b = c.setAttack(weapons.get(2).getDamage());
					} 
				else if (item==4)
					{
						a = c.getGold() - weapons.get(3).getCost();
						System.out.println("Now you have " + a + " gold left.");
						b = c.setAttack(weapons.get(3).getDamage());
					} 
				else if (item==5)
					{
						a = c.getGold() - weapons.get(4).getCost();
						System.out.println("Now you have " + a + " gold left.");
						b = c.setAttack(weapons.get(4).getDamage());
					} 
				else if (item==6)
					{
						a = c.getGold() - weapons.get(5).getCost();
						System.out.println("Now you have " + a + " gold left.");
						b = c.setAttack(weapons.get(5).getDamage());
					} 
				else if (item==7)
					{
						a = c.getGold() - weapons.get(6).getCost();
						System.out.println("Now you have " + a + " gold left.");
						b = c.setAttack(weapons.get(6).getDamage());
					} 
				else if (item==8)
					{
						a = c.getGold() - weapons.get(7).getCost();
						System.out.println("Now you have " + a + " gold left.");
						b = c.setAttack(weapons.get(7).getDamage());
					}
				else if (item==9)
					{
						a = c.getGold() - weapons.get(8).getCost();
						System.out.println("Now you have " + a + " gold left.");
						b = c.setAttack(weapons.get(8).getDamage());
					} 
				else if (item==10)
					{
						a = c.getGold() - weapons.get(9).getCost();
						System.out.println("Now you have " + a + " gold left.");
						b = c.setAttack(weapons.get(9).getDamage());
					} 
				else if (item==11)
					{
						a = c.getGold() - weapons.get(10).getCost();
						System.out.println("Now you have " + a + " gold left.");
						b = c.setAttack(weapons.get(10).getDamage());
					}
				else if (item<1||item>11)
					{
						System.out.println("that is not a valid weapon please pick one that the merchant has in stock.");
						chooseWeapon();
					}
			}

		public static void chooseArmor() throws InterruptedException
			{
				ArrayList<Armor> armor = new ArrayList<Armor>();
				System.out.println("Now you need armor.");
				System.out.println("The merchant is offering to sell you many types of Armor.");
				System.out.println("Keep in mind that the armor you purchase will effect your armor class but may lower some of your stats.");
				System.out.println("For example if you buy heavy armor it will lower your dexterity");
				System.out.println("Also remember you only have " + a + " pieces of gold.");
				armor.add(new Armor(" (1) robes", 13, "light armor", 100));
				armor.add(new Armor("(2) leather", 15, "light armor", 150));
				armor.add(new Armor("(3) studded leather", 16, "medium armor", 175));
				armor.add(new Armor("(4) hide", 17, "medium armor", 150));
				armor.add(new Armor("(5) chain mail", 18, "heavy armor", 225));
				armor.add(new Armor("(6) scail mail", 19, "heavy armor", 275));
				armor.add(new Armor("(7) plate mail", 20, "heavy armor", 350));
				for (Armor ar : armor)
					{
						Thread.sleep(1000);
						System.out.println(ar.getName() + ": its durability is " + ar.getDurability() + ", its type is "+ ar.getType() + ", and it costs " + ar.getCost() + " pieces of gold.");
					}
				System.out.println("Which piece of armor would you like to buy?");
				int outfit = userInput.nextInt();
				if (outfit==1)
					{
						e = a - armor.get(0).getCost();
						System.out.println("now you have " + e + " gold left.");
						d = c.setArmorClass(armor.get(0).getDurability());
						c.setIntelligence(c.getIntelligence() + 2);
						c.setStrength(c.getStrength() - 1);
						c.setIntelligence(c.getIntelligence() + 1);
						System.out.println("Because you chose to wear robes you lost some Strength but increased your Intelligence. Your new stats are...");
						printStats();
					} 
				else if (outfit==2)
					{
						e = a - armor.get(1).getCost();
						System.out.println("now you have " + e + " gold left.");
						d = c.setArmorClass(armor.get(1).getDurability());
						c.setStrength(c.getStrength() - 1);
						c.setDexterity(c.getDexterity() + 1);
						System.out.println("Because you chose to wear leather armor you lost some Strength but increased your dextarity. Your new stats are...");
						printStats();
					} 
				else if (outfit==3)
					{
						e = a - armor.get(2).getCost();
						System.out.println("now you have " + e + " gold left.");
						d = c.setArmorClass(armor.get(2).getDurability());
						c.setDexterity(c.getDexterity() + 2);
						System.out.println("Because you chose to wear studded leather armor you increased your Dextarity. Your new stats are...");
						printStats();
					} 
				else if (outfit==4)
					{
						e = a - armor.get(3).getCost();
						System.out.println("now you have " + e + " gold left.");
						d = c.setArmorClass(armor.get(3).getDurability());
						c.setDexterity(c.getDexterity() + 1);
						c.setStrength(c.getStrength() + 1);
						System.out.println("Because you chose to wear hide armor you increased some Strength and you increased some Dextarity. Your new stats are...");
						printStats();
					} 
				else if (outfit==5)
					{
						e = a - armor.get(4).getCost();
						System.out.println("now you have " + e + " gold left.");
						d = c.setArmorClass(armor.get(4).getDurability());
						c.setDexterity(c.getDexterity() - 2);
						c.setStrength(c.getStrength() + 1);
						System.out.println("Because you chose to wear chain mail armor you lost some dextarity but increased your Strength. Your new stats are...");
						printStats();
					} 
				else if (outfit==6)
					{
						e = a - armor.get(5).getCost();
						System.out.println("now you have " + e + " gold left.");
						d = c.setArmorClass(armor.get(5).getDurability());
						c.setDexterity(c.getDexterity() - 2);
						c.setStrength(c.getStrength() + 1);
						System.out.println("Because you chose to wear scail mail armor you lost some dextarity but increased your Strength. Your new stats are...");
						printStats();
					} 
				else if (outfit==7)
					{
						e = a - armor.get(6).getCost();
						System.out.println("now you have " + e + " gold left.");
						d = c.setArmorClass(armor.get(6).getDurability());
						c.setDexterity(c.getDexterity() - 3);
						c.setStrength(c.getStrength() + 1);
						System.out.println("Because you chose to wear plate mail you lost alot of dextarity but increased your Strength. Your new stats are...");
						printStats();
					}
				else if (outfit<1||outfit>7)
					{
						System.out.println("that is not a valid armor type please buy armor that the merchant current has in stock.");
					}
			}
		public static void getHealth()
			{
			
			}
		

	}
