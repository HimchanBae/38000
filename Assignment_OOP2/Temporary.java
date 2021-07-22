package Assignment_OOP2;

public class Temporary extends Employee //Employee 클래스를 상속 받음
{
	int ilsu; //일수
	int ildang; //일당
	
	Temporary () //디폴트생성자
 	{
 		irum = "";
 		nai = 1;
 		ilsu = 0;
 		ildang = 0;
 	}

 	Temporary (String irum, int nai, int ilsu, int ildang) //생성자
 	{
 		this.irum = irum;
 		this.nai = nai;
 		this.ilsu = ilsu;
 		this.ildang = ildang;
 	}
	
	int pay() //월급은 일수 * 일당
	{
		return ilsu * ildang;
	}

	String dataPrint() //정보 출력
	{
		return irumnaiPrint(irum, nai) + ", 월급 : " + pay();
	}
}
