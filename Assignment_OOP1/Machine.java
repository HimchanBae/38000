package Assignment_OOP1;

public class Machine 
{
	public int cupCount = 1; //뽑을 커피의 잔수
	CoinIn coinMachine = new CoinIn(); //클래스를 필드로 가지고 옴
//	public int coin = 0;
//	public int change = 0;
//	
//	public void culc (int cupCount) 
//	{
//		change = coin - cupCount * 200;
//	}
	public String showData (int coin, int change) 
	{
		return "커피 " + cupCount + "잔과 잔돈 " + change + "원";
	}
}
