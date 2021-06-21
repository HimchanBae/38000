package Assignment_Day5_String;

import java.util.Scanner;

public class Quiz3 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("문자열을 입력해 주세요 : ");
		String str = in.next();
		System.out.print("정수를 입력해 주세요 : ");
		int num = in.nextInt();

		char[] ary = new char[100]; //문자열 길이는 최대 100자
		int len = str.length(); //입력 받은 글자 수를 알아야 하므로

		if (num > len) 
		{
		    num = len; //입력 받은 정수가 문자열의 길이보다 크다면 문자열을 그대로 출력하므로
		}
		for (int i = len - 1; i >= len - num; i--) //i는 인덱스 값이므로 -1부터, 범위는 입력 정수값 만큼 뒤에서니까 -1 안 해도 됨.
		{
		    ary[i] = str.charAt(i);
		    System.out.print(arr[i]);
		}
        in.close();
	}

}
