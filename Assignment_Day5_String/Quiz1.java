package Assignment_Day5_String;

import java.util.Scanner;

public class Quiz1 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("문자열을 입력해 주세요 : ");
		String str = in.next();
		
		System.out.println(str.concat(str)); //concat은 문자열 두 개를 붙여서 출력해 줌.
		in.close();
	}

}
