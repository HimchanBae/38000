package AssignmentDay2;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하시오: ");
		int x = input.nextInt();
		System.out.print("두번째 정수를 입력하시오: ");
		int y = input.nextInt();
		
		boolean a = x > y;
		boolean b = x < y;
		boolean c = x >= y;
		boolean d = x <= y;
		
		System.out.println( x + " > " + y + " --- " + a );
		System.out.println( x + " < " + y + " --- " + b );
		System.out.println( x + " >= " + y + " --- " + c );
		System.out.println( x + " <= " + y + " --- " + d );
		
		input.close();
	}

}
