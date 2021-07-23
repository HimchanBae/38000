package Assignment_OOP3;

public class SphereGoblin extends Goblin
{
	String sphereType;
	
	SphereGoblin ()
	{
		name = "SphereGoblin";
		rank = "병사";
		size = "small";
		life = 100;
		attackType = "레인지공격";
		damage = 10;
		sphereType = "긴 창";
	}
	
	SphereGoblin (String name, String rank, int life, String size, String attackType, int damage, String sphereType)
	{
		this.name = name;
		this.rank = rank;
		this.size = size;
		this.life = life;
		this.attackType = attackType;
		this.damage = damage;
		this.sphereType = sphereType;
	}
	
	void showStatus () 
	{
		System.out.print("이름: " + name + "\n등급: " + rank + "\n사이즈: " + size + "\n라이프: " + life + "\n공격타입: " + attackType + "\n데미지: " + damage + "\n창 타입: " + sphereType);
	}
	
	public static void main(String[] args) 
	{
		SphereGoblin goblin1 = new SphereGoblin();
		
		goblin1.showStatus();
	}
}
