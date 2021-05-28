package ConditionExercise;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {

		//성별을 입력 받음 
		Scanner input = new Scanner (System.in);
		System.out.print("성별을 입력해 주세요 (남성 = M 여성 = F) : ");
		char sex = input.next().charAt(0);
		
		//나이를 입력 받음  
		Scanner input2 = new Scanner (System.in);
		System.out.print("나이를 입력해 주세요 : ");
		int age = input2.nextInt();
		
		//판단문 작성 
		if ( sex == 'M' && age >= 18 )
		{
			System.out.print("MAN");			
		}
		else if ( sex == 'M' && age < 18 )
		{
			System.out.print("BOY");			
		}
		else if ( sex == 'F' && age >= 18 )
		{
			System.out.print("WOMAN");			
		}
		else if ( sex == 'F' && age < 18 ) 
		{
			System.out.print("GIRL");			
		}
		else
		{
			System.out.print("제대로 입력했는지 확인해 주세요.");
		}
		
		input.close();
		input2.close();
		
	}

}
