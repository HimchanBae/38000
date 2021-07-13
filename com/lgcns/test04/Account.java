package com.lgcns.test04;

class Account
{
	private String account; //필드1 : 계좌 번호 (문자열)
	private int balance; //필드2 : 잔액 (정수)
	private double interestRate; //필드3 : 이율 (실수)

	public Account() //빈 생성자
	{
		
	}

	public Account ( String account, int balance, double interestRate) //생성자
	{
		this.account = account; //매개변수랑 필드의 이름이 같으니까 this 사용
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void setAccount ( String account ) //접근지정자가 private인 필드에 접근,설정
	{
		this.account = account;
	}

	public String getAccount ()
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
	
	public double calculateInterest() //이율 계산 메서드
	{
		return balance*interestRate/100;
	}

	public void deposit (int money) //입금 계산 메서드
	{
		balance = balance + money;
	}

	public void withdraw (int money) //출금 계산 메서드
	{
		balance = balance - money;
	}
}
