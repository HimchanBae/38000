package Assignment_OOP3;

public class Hero extends Unit
{
	Goblin goblins = new Goblin();
	SphereGoblin spheregoblins = new SphereGoblin();

	Hero ()
	{
		name = "Hero";
		rank = "영웅";
		size = "big";
		life = 300;
	}

	Hero (String name, String rank, int life, String size, Goblin goblins, SphereGoblin spheregoblins)
	{
		this.name = name;
		this.rank = rank;
		this.size = size;
		this.life = life;
	}

	void showOnGoblins() 
	{
		System.out.print("현재 영웅이 소유한 고블린은 " + goblins + "명, 창 고블린은 " + spheregoblins + "명입니다.");
	}

	void makeGoblinsAttack() 
	{
		System.out.print("[" + name + "]이 공격합니다! 상대방 데미지(" + 3 + ")");
	}
	
	public static void main(String[] args) 
	{
		Goblin[] goblins = new Goblin[10];
		SphereGoblin[] sphereGoblins = new SphereGoblin[10];
		
	 	Goblin goblin1 = new Goblin();
	 	Goblin goblin2 = new Goblin();
	 	SphereGoblin sphereGoblin1 = new SphereGoblin();

		Hero hero1 = new Hero();
		hero1.showStatus();
	}
}
