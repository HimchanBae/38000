package Assignment;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		System.out.print("첫번째 숫자를 입력하시오:");
		int x = input.nextInt();
		System.out.print("두번째 숫자를 입력하시오:");
		int y = input.nextInt();
		System.out.print("세번째 숫자를 입력하시오:");
		int z = input.nextInt();
		
		int sum = x + y + z;
		int avg = sum / 3;
		
		System.out.println("sum = " + sum + "\navg = " + avg);
		
	}

}
