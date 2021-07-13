package com.lgcns.test04;

public class AccountTest 
{

	public static void main(String[] args) 
	{
		Account account = new Account("411-0290-1203",500000,7.3); //Account 클래스로부터 account 객체 생성
		
		System.out.println("계좌정보: " + account.getAccount() + " 현재잔액: " + account.getBalance()); //account 기본 정보(계좌와 잔액) 출력
		account.deposit(20000); //입금 계산 메서드를 이용하여 20000원 입금
		account.calculateInterest(); //변경된 balance로 이율 계산
		
		System.out.println("계좌정보: " + account.getAccount() + " 현재잔액: " + account.getBalance()); //account 변경 정보 출력
		System.out.print("이자: " + account.calculateInterest()); //이자 출력
	}

}
