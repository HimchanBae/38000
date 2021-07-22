package Assignment_OOP1;

public class CoinIn 
{
	public int coin = 0; //자판기에 들어갈 동전
	public int change = 0; //잔돈
	
	public void culc (int cupCount)  //잔돈 계산 메소드
	{
		change = coin - cupCount * 200;
	}
}
