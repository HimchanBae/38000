package Assignment_Day5_Array;

import java.util.Scanner;

public class Quiz7 
{

	public static void main(String[] args) 
	{//100미만의 양의 정수 입력 -> 0이 입력 되면 마지막에 입력된 0을 제외하고 (break;) -> 십의 자리 숫자 몇 개인지 작은 수부터 0은 제외 
		Scanner in = new Scanner (System.in);
		System.out.print("100미만의 양의 정수를 입력하세요 : "); //입력 받음
		int[] arr = new int[100]; //범위는 어디까지?
		int[] cntAry = new int[10];
		
		for (int i=0; ; i++) //범위는 어디까지?
		{
			arr[i] = in.nextInt();
			
			if (arr[i] >= 100 || arr[i] < 0) //100 미만의 양의 정수가 아닐 때
			{
				System.out.println("올바른 값을 입력하세요.");
				break;
			}
			
			else if (arr[i] == 0) //0일 때
			{
				break;
			}
			
			switch (arr[i]/10) //십의 자리 숫자
			{
				case 0 :
					cntAry[0] ++;
					break;
				case 1 : 
					cntAry[1] ++;
					break;
				case 2 :
					cntAry[2] ++;
					break;
				case 3 :
					cntAry[3] ++;
					break;
				case 4 :
					cntAry[4] ++;
					break;
				case 5 :
					cntAry[5] ++;
					break;
				case 6 :
					cntAry[6] ++;
					break;
				case 7 :
					cntAry[7] ++;
					break;
				case 8 :
					cntAry[8] ++;
					break;
				case 9 :
					cntAry[9] ++;
					break;
			}
		}
		for (int i=0; i<10; i++) //카운트어레이 출력을 위해
		{
			if (cntAry[i] != 0) //0개가 아닐 때 출력
			{
				System.out.println( i + " : " + cntAry[i] );
			}
		}
		in.close();
	}

}
