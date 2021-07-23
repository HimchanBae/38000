package Assignment_OOP3;

public class Unit 
{
	String name; //이름도 출력해줘야 하니까?
	String rank;
	String size;
	int life;
	
	Unit ()
	{
		name = "";
		rank = "";
		size = "";
		life = 0;
	}
	
	Unit (String name, String rank, String size, int life)
	{
		this.name = name;
		this.rank = rank;
		this.size = size;
		this.life = life;
	}
	
//	public void inint() 디폴트 생성자랑 뭐가 다를까?
//	{
//		rank = "";
//		life = 0;
//		size = "";
//	}
	
	void showStatus () 
	{
		System.out.print("이름: " + name + "\n등급: " + rank + "\n사이즈: " + size + "\n라이프: " + life);
	}
	
//	public static void main(String[] args) 
//	{
//		Unit goblin1 = new Unit ("Goblin", "병사", "small", 100);
//		
//		goblin1.showStatus();
//	}
}
