package Assignment_OOP1;

import java.util.Scanner;

public class MachineTest 
{

	public static void main(String[] args) 
	{
		Machine coffeeMachine = new Machine(); //Machine 클래스로부터 coffeeMachine 객체 생성

		Scanner in = new Scanner (System.in);

		char answer; //do-while로 맹글려고 char 변수 선언

		do
		{
			System.out.print("동전을 입력하세요 : ");
			coffeeMachine.coinMachine.coin = in.nextInt(); //coin 필드에 동전 얼마인지 넣어 줌
			System.out.print("몇 잔을 원하세요 : ");
			coffeeMachine.cupCount = in.nextInt(); //couCount 필드에 몇 잔 필요한지 넣어 줌
			
			coffeeMachine.coinMachine.culc(coffeeMachine.cupCount); //입력 받은 값으로 잔돈 계산
			
			if (coffeeMachine.coinMachine.change < 0) //change가 음수 == 요금이 부족하다.
			{
				System.out.print("요금이 부족합니다. (커피 한잔에 200원)");
			}
			else //change가 0이거나 양수 == 요금이 안 부족하다. showData 출력
			{
				System.out.print(coffeeMachine.showData(coffeeMachine.coinMachine.coin, coffeeMachine.coinMachine.change));
			}
			System.out.print("\n다시 입력하시겠습니까? (stop: 'n' or 'N')");
			answer = in.next().charAt(0);
		} while (answer != 'n' && answer != 'N');
		in.close();
	}

}
