package Assignment_Day5_Array;

import java.util.Scanner;

public class Quiz6 
{

	public static void main(String[] args) 
	{//1000을 넘지 않는 10개의 정수를 입력받아 그 중 가장 작은 수 출력
		Scanner in = new Scanner (System.in);
		System.out.print("정수를 10개 입력해 주세요 : "); //정수를 입력 받음
		
		int[] numArray = new int[10];
		int champion = 1000; //최소값을 찾기 위한 비교 대상을 선언
		
		for (int i = 0; i<10; i++) 
		{
			numArray[i] = in.nextInt();
			champion = Math.min(numArray[i], champion);
		}
		System.out.println( champion );
		in.close();
	}

}
