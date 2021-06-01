package Assignment_Day3;

public class Quiz6 
{
	public static void main(String[] args) 
	{ 
		for (int i = 1; i < 6; i++ ) //세로 
		{ 
			for (int j = 1; j <= 5; j++ ) //가로 
			{
				System.out.print( i + j + " " ); //세로한줄 
			}
			System.out.println(); //띄어주기 
		}
	}
}