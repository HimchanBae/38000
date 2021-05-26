package AssignmentDay2;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하시오 : ");
		int x = input.nextInt();
		System.out.print("두 번째 정수를 입력하시오 : ");
		int y = input.nextInt();
		System.out.print("세 번째 정수를 입력하시오 : ");
		int z = input.nextInt();
		
		boolean a = ( x > y ) && ( x > z );
		boolean b = ( x == y ) && ( x == z);
		System.out.print( a + " " );
		System.out.print( b );
		
		input.close();
		
	}

}
