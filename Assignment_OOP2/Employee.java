package Assignment_OOP2;

public abstract class Employee //추상클래스
{
	String irum; //이름
	int nai; //나이
	
	Employee () //디폴트생성자
	{
		irum = "";
		nai = 1;
	}

	Employee (String irum, int nai) //생성자
	{
		this.irum = irum;
		this.nai = nai;
	}
	
	abstract int pay(); //추상메소드, 반환형 정수
	abstract String dataPrint(); //추상메소드, 반환형 문자열
	
//	String irumnaiPrint(String irum, int nai) 왜 필요한지...?
//	{
//		return "이름 : " + irum + ", 나이 : " + nai;
//	}
}
