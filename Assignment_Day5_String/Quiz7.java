package Assignment_Day5_String;

import java.util.Scanner;

public class Quiz7 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("100개 이하의 문자열을 입력하세요 : ");
		String str = in.next();
		char[] arr = new char[100];
		
		for (int i=0; i<100; i++)
		{
			arr[i] = str.charAt(i);
			
		    if (arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= 'A' && arr[i] <= 'Z' || arr[i] >= '0' && arr[i] <= '9') 
		    {
		    	if (arr[i] >= 'A' && arr[i] <= 'Z') 
		    	{
                    System.out.print(String.valueOf(arr[i]).toLowerCase());
                } 
		    	else 
		    	{
		    		System.out.print(arr[i]);
		    	}
		    }
		}
		System.out.println(str.toLowerCase());
		in.close();
	}
	
}
