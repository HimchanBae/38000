package Assignment_OOP2;

public class EmployeeTest 
{

	public static void main(String[] args) 
	{	  //클래스별로 각각의 객체 생성
		  Temporary t = new Temporary ("홍길동", 25, 20, 15000);
		  Regular r = new Regular ("한국인", 27, 3500000);
		  Salesman s = new Salesman ("손오공", 29, 1200000, 5000000, 0.25);
		  //dataPrint 이용하여 출력
		  System.out.println(t.dataPrint() + "\n" + r.dataPrint() + "\n" + s.dataPrint() );
	}

}
