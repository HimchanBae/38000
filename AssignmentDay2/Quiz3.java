package AssignmentDay2;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하시오 : ");
		int x = input.nextInt();
		System.out.print("두 번째 정수를 입력하시오 : ");
		int y = input.nextInt();
		
		//연산을 위해서 x랑 y를 변수로 정의 (증감연산값을 그대로 나타내기 위해서)
		int a = x++;
		int b = --y;
		
		//줄이 넘어가서 x y 가 증감연산 된 후의 수치로 표시됨 + 연산은 변수 사용했으므로 원래로 돌아갔
		System.out.print( x + " " );
		System.out.print( y + " " );
		System.out.println( a * b );
		
		input.close();
		
	}

}
