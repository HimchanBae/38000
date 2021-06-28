package Array_String_Exercise;

public class Quiz2 
{

	public static void main(String[] args) 
	{
		int[][] ary = new int[5][5];
		ary[0][0] = 1; ary[0][2] =1; ary[0][4] =1;
		for (int i = 0; i < 1; i++)
		{
			for (int j = 0; j < 5; j++) 
			{
				System.out.print(ary[i][j] + " ");
			}
		}
		System.out.println();
		
		for (int i = 1; i < 5; i++) 
		{
			for (int j = 0; j < 1; j++)
			{
				ary[i][j] = ary[i-1][j+1];
				System.out.print( ary[i][j] + " " );
			}
			for (int j = 1; j < 4; j++) 
			{
				ary[i][j] = ary[i-1][j-1] + ary[i-1][j+1];
				System.out.print( ary[i][j] + " " );
			}
			for (int j = 4; j < 5; j++) 
			{
				ary[i][j] = ary[i-1][j-1];
				System.out.print( ary[i][j]);
			}
			System.out.println();
		}
	}

}
