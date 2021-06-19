package Assignment_Day5_Array;

import java.util.Scanner;

public class Quiz5 
{

	public static void main(String[] args) 
	{	//100개의 정수를 저장할 수 있는 배열 선언
		//정수를 차례로 입력 받다가 0이 입력되면 0을 제외(break)
		//그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력
		Scanner in = new Scanner (System.in);

		int[] numArray = new int[100];
		int temp = 0; //인덱스에 값이 저장되지 않으면 0으로 남게되므로 그 부분을 찾기 위해 temp를 선언
		
		System.out.print("정수를 입력해 주세요 : ");
		for (int i = 0; i < 100; i++)
		{
			numArray[i] = in.nextInt();
			if (numArray[i] == 0) //0이면 종료
			{
				temp = i-1; //0이 입력된 부분까지의 갯수(인덱스)에서 0 부분은 빼야하기 때문에 1을 빼줌
				break;
			}
		}
		
		for (int i = temp; i>=0; i--) //입력된 값들의 인덱스 번호를 끝에서부터 1개씩 출력하기 위해
		{
			System.out.print(numArray[i] + " ");
		}
		
		in.close();
	}

}
