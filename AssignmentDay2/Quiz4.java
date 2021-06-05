package AssignmentDay2;

import java.util.Scanner;

public class Quiz4 
{

	public static void main(String[] args) 
	{	//사용자에게 필요한 정보를 입력 받음
		Scanner input = new Scanner(System.in);
		System.out.print( "민수는 키를 입력하거라 : " );
		int height1 = input.nextInt();
		System.out.print( "민수는 몸무게를 입력하거라 : " );
		int weight1 = input.nextInt();
		System.out.print( "기영이는 키를 입력하거라 : " );
		int height2 = input.nextInt();
		System.out.print( "기영이는 몸무게를 입력하거라 : " );
		int weight2 = input.nextInt();
		
		//관계연산자와 논리연산자를 사용하여 출력값을 나타냄
		boolean a = ( height1 > height2 ) && ( weight1 > weight2 );
		System.out.println( a );
		
		input.close();
	}

}
