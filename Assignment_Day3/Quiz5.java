package Assignment_Day3;

import java.util.Scanner;

public class Quiz5 
{

	public static void main(String[] args) 
	{	

		while (true) //묻지도 따지지도 말고 그냥 해라 
		{	//밑변과 높이를 입력 받음 
			Scanner input = new Scanner ( System.in );
			System.out.print("Base = ");
			double base = input.nextDouble();
			
			Scanner input2 = new Scanner ( System.in );
			System.out.print("Height = ");
			double height = input2.nextDouble();
			
			double width = ( base * height ) / 2; //넓이 계산
			//계산의 결과 값을 소수점 첫째자리까지 출력 		
			System.out.printf("Triangle width = " + "%.1f" , width );
			//계속할지 물어봄 
			Scanner input3 = new Scanner ( System.in );
			System.out.print("\nContinue? ");
			char answer = input3.next().charAt(0);
				//답변이 y or Y 라면 처음으로 돌아가서 반복  
				if ( ( answer == 'y' ) || ( answer == 'Y' ) ) 
				{
					continue; //보조 제어문 (반복 계속) 
				}//답변이 y and Y 가 아니라면 끝남 
				if ( ( answer != 'y' ) && ( answer != 'Y' ) ) 
				{ 
					System.out.println("The end.");
					break; //보조 제어문 (반복 종료)
				}

			input.close();
			input2.close();
			input3.close();
		}

	}

}