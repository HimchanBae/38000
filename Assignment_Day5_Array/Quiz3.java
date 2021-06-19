package Assignment_Day5_Array;

import java.util.Scanner;

public class Quiz3 
{

	public static void main(String[] args) 
	{
		double [] average = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 }; //1~6반의 평균 점수를 배열에 저장
		
		Scanner in = new Scanner (System.in);
		System.out.print("두 반의 번호를 입력해 주세요 : "); //2개반의 번호를 각각 입력 받음
		int classnumber1 = in.nextInt(), classnumber2 = in.nextInt();
		
		double sum = average[classnumber1-1] + average[classnumber2-1]; 
		//담아둔 평균 점수는 0부터 시작이므로 입력 값에서 1을 뺀 뒤에 불러옴
		System.out.printf( "%.1f",sum ); //소수 첫째자리까지 출력
		in.close();
	}

}
