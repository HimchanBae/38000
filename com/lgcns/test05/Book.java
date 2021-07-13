package com.lgcns.test05;

public class Book 
{
	private String bookName; //필드1 : 책 이름 (문자열)
	private int bookPrice; //필드2 : 책 가격 (정수)
	private double bookDiscountRate; //필드3 : 책 할인율 (실수)
	
	public Book() //빈 생성자
	{
		
	}
	
	public Book(String bookName, int bookPrice, double bookDiscountRate) //생성자
	{
		this.bookName = bookName; 
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public void setBookName(String bookName) 
	{
		this.bookName = bookName;
	}
	
	public String getBookName() 
	{
		return bookName;
	}
	
	public void setBookPrice(int bookPrice) 
	{
		this.bookPrice = bookPrice;
	}
	
	public int getBookPrice() 
	{
		return bookPrice;
	}
	
	public void setBookDiscountRate(double bookDiscountRate) 
	{
		this.bookDiscountRate = bookDiscountRate;
	}

	public double getBookDiscountRate() 
	{
		return bookDiscountRate;
	}
	
	public double getDiscountBookPrice() //할인된 책 가격 계산 메서드
	{
		return bookPrice*(1-bookDiscountRate/100);
	}
}
