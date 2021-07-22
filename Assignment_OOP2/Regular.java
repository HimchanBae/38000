package Assignment_OOP2;

public class Regular extends Employee //Employee 클래스를 상속 받음
{
	int salary; //급여

	Regular () //디폴트생성자
	{
		irum = "";
		nai = 1;
		salary = 0;
	}

	Regular (String irum, int nai, int salary) //생성자
	{
		this.irum = irum;
		this.nai = nai;
		this.salary = salary;
	}

	int pay() //급여는 그대로 급여
	{
		return salary;
	}

	String dataPrint() //정보 출력
	{
		return irumnaiPrint(irum, nai) + ", 급여 : " + pay();
	}
}
