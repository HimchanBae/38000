package Assignment_Day5_String;

public class Quiz2 
{

	public static void main(String[] args) 
	{
		String str = "Hong Gil Dong";
		String answer = str.substring(3, 7); //substring은 a~b까지 추출, 실제로는 a~b-1까지
		
		System.out.println(answer);
	}

}
