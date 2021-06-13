package Assignment_Day4;

import java.util.Scanner;

public class Quiz2 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner ( System.in );
		System.out.print("2부터 9까지의 수 중 두 개를 입력하시오 : ");
		int number1 = in.nextInt(), number2 = in.nextInt(); //숫자 두 개를 입력 받음.
		
		while ((2 <= number1 && number1 <= 9) && (2 <= number2 && number2 <= 9)) //2부터 9까지
		{
			if ( number1 < number2 ) //처음 입력한 수가 작을 경우
			{
				for ( int column = 1; column <= 9; column++ ) //행(뒤에 곱해지는 수)
				{	
					for ( int row = number1; row <= number2; row++ ) //열(앞의 수)
					{
						int value = row * column;
					    System.out.print(row + " * " + column + " = " + value + "   ");
					}  
					System.out.println();
				}
			}
			else if ( number1 > number2) //처음 입력한 수가 클 경우
			{
				for ( int column = 1; column <= 9; column++ ) //위와 동일
				{	
					for ( int row = number1; row >= number2; row-- ) //앞이 더 크므로 빼줌 
					{
						int value = row * column;
					    System.out.print(row + " * " + column + " = " + value + "   ");
					}  
					System.out.println();
				}
			}
			else {
				System.out.println("서로 다른 두 개의 숫자를 입력해 주세요."); //같은 숫자를 입력했을 경우
			} break;
		}
		in.close();
	}

}