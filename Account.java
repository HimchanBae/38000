package Class_Day9;

public class Account 
{
	private String account; //필드1
	private int balance; //필드2
	private double interestRate; //필드3

	public Account() //빈 생성자
	{
	}

	public Account ( String account, int balance, double interestRate) //생성자
	{
		this.account = account; //매개변수랑 필드의 이름이 같으니까 this 사용
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void setAccount ( String account ) //접근지정자가 private인 필드에 접근,설정 (순서는 상관 없나?)
	{
		this.account = account;
	}

	public String getAccount () //전부 다 만들어주는게 맞는거겠지...?
	{
		return account;
	}

	public void setBalance(int balance) 
	{
		this.balance = balance;
	}

	public int getBalance () 
	{
		return balance;
	}

	public void setInterestRate(double interestRate) 
	{
		this.interestRate = interestRate;
	}

	public double getInterestRate() 
	{
		return interestRate;
	}
	
	public double calculateInterest() //이율 계산 메소드
	{
		return balance*interestRate;
	}

	public void deposit (int money) //입금 계산 메소드
	{
		balance = money + balance;
	}

	public void withdraw (int money) //출금 계산 메소드
	{
		balance = balance - money;
	}

	public static void main (String[] args) 
	{
		Account acc = new Account(); //Account 클래스로부터 객체 acc 생성

		acc.setAccount("411-0290-1203"); //계좌 설정
		acc.setBalance(500000); //잔액 설정
		acc.setInterestRate(7.3/100); //이율 설정 (7.3퍼센트니까 100으로 나눠 줌)
		
		System.out.println("계좌정보: " + acc.account + " 현재잔액: " + acc.balance);
		//기준 계좌와 잔액 출력
		acc.deposit(20000); //입금 계산 메소드를 이용하여 20000원 입금
		acc.calculateInterest(); //변경된 balance로 이율 계산
		
		System.out.println("계좌정보: " + acc.account + " 현재잔액: " + acc.balance);
		System.out.println("이자: " + acc.calculateInterest()); //각각 출력
	}
}


