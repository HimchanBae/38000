package Class_Day9;

public class Dice
{	//Math.random() * 6 + 1 == 주사위
	int value; //필드1

	public Dice() //생성자 
	{
		value=0;
	}

	public int roll() //0~6 랜덤값 리턴하는 메소드
	{
		value=(int)(Math.random() * 6) + 1; //Math.ran은 실수니까 int로 캐스팅
		return value;
	}

	public static void main(String[] args) 
	{
		Dice dice1=new Dice();
		Dice dice2=new Dice(); //주사위 각각 2개 만듬
		int count = 0; //나오는데 걸린 횟수

		while(true) //주사위의 합이 2가 될 때까지 굴리니까 루프로 만들고 break
		{
			dice1.roll();
			dice2.roll();
			System.out.println("주사위1= "+dice1.roll()+" 주사위2= "+ dice2.roll());
			count++;
			if(dice1.roll() + dice2.roll() == 2) 
			{
				break;
			}
		}
		System.out.println("(1,1)이 나오는데 걸린 횟수="+count);
	}
}
