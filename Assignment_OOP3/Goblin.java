package Assignment_OOP3;

public class Goblin extends Unit
{
	String attackType;
	int damage;
	
	Goblin ()
	{
		name = "Goblin";
		rank = "병사";
		size = "small";
		life = 100;
		attackType = "근접 공격";
		damage = 15;
	}
	
	Goblin (String name, String rank, int life, String size, String attackType, int damage)
	{
		this.name = name;
		this.rank = rank;
		this.size = size;
		this.life = life;
		this.attackType = attackType;
		this.damage = damage;
	}
	
	void showStatus () 
	{
		System.out.print("이름: " + name + "\n등급: " + rank + "\n사이즈: " + size + "\n라이프: " + life + "\n공격타입: " + attackType + "\n데미지: " + damage);
	}
	
	void attack ()
	{
		System.out.print("[" + name + "]이 공격합니다! 상대방 데미지(" + damage + ")");
	}
	
//	public static void main(String[] args) 
//	{
//		Goblin goblin1 = new Goblin();
//		
//		goblin1.showStatus();
//	}
}