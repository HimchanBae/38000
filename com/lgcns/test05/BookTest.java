package com.lgcns.test05;

public class BookTest 
{

	public static void main(String[] args) 
	{
		Book[] bookArray = new Book[3]; //크기3의 객체 어레이 bookArray 생성
		
		bookArray[0] = new Book ("SQL Plus",50000,5); //각 객체에 정보 입력
		bookArray[1] = new Book ("JAVA 2.0",40000,3);
		bookArray[2] = new Book ("JSP Servlet",60000,6);
		
		int sum = 0; //책 가격의 합 출력을 위해
		double discountedSum = 0.0; //할인 된 책 가격의 합 출력을 위해
		
		for (int i=0; i<3; i++) //반복문을 이용하여 배열에 있는 객체 정보 출력과 동시에 누적 합산
		{
			System.out.print(bookArray[i].getBookName() + " "); 
			System.out.print(bookArray[i].getBookPrice() + "원 ");
			System.out.println((int)bookArray[i].getBookDiscountRate() + "%"); //실행 결과 예에 정수로 나와있으니 int로 캐스팅
			sum += bookArray[i].getBookPrice();
			discountedSum += bookArray[i].getDiscountBookPrice();
		}
		System.out.println("\n책 가격의 합: " + sum + "원"); //책 가격의 합 출력
		System.out.print("할인 된 책 가격의 합: " + discountedSum + "원"); //할인 된 책 가격의 합 출력
	}

}
