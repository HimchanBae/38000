package MidTermExam;

public class Quiz6 
{

	public static void main(String[] args) 
	{
		
		for (int i=0; i<5; i++) 
		{
			for ( int j = 1; j <= 4-i; j++) //맨 윗줄의 띄어쓰는 횟수는 n-1
			{
				System.out.print(" ");
			}
			for ( int j = 1; j <= i+1; j++ ) //숫자는 줄수에 비례해서 1개씩 늘어남
			{
				char c = 'A';
				System.out.print((char)(c + i));
			}
			System.out.println();
		}
	}

}
