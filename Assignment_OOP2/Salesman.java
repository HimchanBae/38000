package Assignment_OOP2;

public class Salesman extends Regular //Regular 클래스를 상속 받음
{
	int sales; //실적
	double commission; //수수료
	
	Salesman () //디폴트생성자
 	{
 		irum = "";
 		nai = 1;
 		sales = 0;
 		salary = 0;
 		commission = 0.0;
 	}

 	Salesman (String irum, int nai, int salary, int sales, double commission) //생성자
 	{
 		this.irum = irum;
 		this.nai = nai;
 		this.salary = salary;
 		this.sales = sales;
 		this.commission = commission;
 	}
	
	int pay() //수령액은 급여 + 영업수당 (실적 * 수수료)
	{
		return (int)(salary + sales * commission);
	}

	String dataPrint() //정보 출력
	{
		return "이름 : " + irum + ", 나이 : " + nai + ", 수령액 : " + pay();
	}
}
