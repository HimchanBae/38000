package Assignment_Day4;

import java.util.Scanner;

public class Quiz9 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("자연수를 입력해 주세요 : ");
		int n = in.nextInt();
		
		int a = 1; //숫자가 1부터 시작이므로
		
		for ( int row = 0; row < n; row++ ) //n줄만큼 행을 만들어 줌
		{
			for ( int column = 0; column < n; column++ ) //n줄만큼 열을 만들어 줌
			{
				System.out.print(a + " ");
				a = (a+2)%10; //홀수는 +2씩 해주면 되고 10 미만의 수만 나오려면 10으로 나눴을 때 나머지 값만 구해주면 됨
			}
			System.out.println();
		}
		in.close();
	}

}