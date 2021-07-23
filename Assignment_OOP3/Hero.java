package Assignment_OOP3;

public class Hero extends Unit
{
	Goblin[] goblins;
	SphereGoblin[] sphereGoblins;

	Hero ()
	{
		name = "Hero";
		rank = "영웅";
		size = "big";
		life = 300;
		goblins = null;
		sphereGoblins = null;
	}

	Hero (String name, String rank, String size, int life, Goblin[] goblins, SphereGoblin[] sphereGoblins)
	{
		this.name = name;
		this.rank = rank;
		this.size = size;
		this.life = life;
		this.goblins = goblins;
		this.sphereGoblins = sphereGoblins;
	}

	void showOnGoblins() 
	{
		System.out.println("현재 영웅이 소유한 고블린은 " + goblins.length + "명, 창 고블린은 " + sphereGoblins.length + "명입니다.");
	}

	void makeGoblinsAttack() 
	{
		if (goblins.length > 0) 
		{
			for (int i=0; i<goblins.length; i++) 
			{
				System.out.println("[Goblin]이 공격합니다! 상대방 데미지(15)");
			}
		}
		if (sphereGoblins.length > 0) 
		{
			for (int i=0; i<sphereGoblins.length; i++) 
			{
				System.out.println("[SphereGoblin]이 공격합니다! 상대방 데미지(10)");
			}
		}
	}
	
//	void addGoblins(String name, Goblin[] goblins) 
//	{
//		this.name = name;
//		this.goblins = goblins;
//	}
//	
//	void removeGoblins(String name, Goblin[] goblins) 
//	{
//		this.name = name;
//		this.goblins = goblins;
//	}

	public static void main(String[] args) 
	{
		Goblin[] goblins = new Goblin[2];
		SphereGoblin[] sphereGoblins = new SphereGoblin[1];
		
		goblins[0] = new Goblin();
		goblins[1] = new Goblin();
		sphereGoblins[0] = new SphereGoblin();
		
		Hero hero = new Hero("Hero","영웅","big",300,goblins,sphereGoblins);
		
		hero.showOnGoblins();
		hero.makeGoblinsAttack();
		
//		Hero hero1 = new Hero();
//		hero1.showStatus();
	}
}
