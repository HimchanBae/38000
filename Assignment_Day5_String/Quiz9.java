package Assignment_Day5_String;

import java.util.Scanner;

public class Quiz9 
{

	public static void main(String[] args) 
	{//5개의 30자 이하 단어를 입력받아 역순으로 출력
		Scanner in = new Scanner(System.in);
		System.out.println("5개의 30자 이하 단어를 입력해 주세요 : ");
		String [] str = new String[5];
		 
		for(int i=0; i<5; i++)
		{
			str[i] = in.nextLine();
		}
		for(int i=4; i>=0; i--)
		{	
			int len = str[i].length();
			if (len > 30) 
			{
				System.out.println("30자 이하로 입력해 주세요.");
				break;
			}
			else
			{
				System.out.println(str[i]);
			}
		}
		in.close();
	}

}
