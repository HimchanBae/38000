package Assignment_Day4;

import java.util.Scanner;

public class Quiz5 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("자연수를 입력해 주세요 : "); //입력받음
		int n = in.nextInt();

        for ( int row = 0; row < n; row++ ) //단순히 입력 받은 값 만큼의 행을 만듦
        	//0인 이유는 첫줄은 띄어쓰기가 없기 때문. 아래의 과정으로
        	//column == 0 일 때, row <= column 에서 1 <= 0 이 맞지 않게 되므로 진행x
        {
            for ( int column = 1; column <= row; column++ ) //띄어쓰기는 둘째줄 부터 1칸씩 늘어나도록 
            {
            	System.out.print(" ");
            }
            for ( int column = 1; column <= (n-row)*2-1; column++ ) //별은 항상 맨 위가 n*2-1개이다.
            {
            	System.out.print("*");
            }
            System.out.println();
        }
        in.close();
	}

}