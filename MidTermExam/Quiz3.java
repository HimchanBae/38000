package MidTermExam;

import java.util.Scanner;

public class Quiz3 
{

	public static void main(String[] args) 
	{
		int[] lottoNum = new int[7]; //랜덤으로 생성 된 로또 번호들의 배열
		int[] userNum = new int[7]; //사용자에게 입력 받을 번호들의 배열
		
		for (int i=0; i<7; i++) //랜덤으로 생성 된 로또 번호 7개를 배열에 담아주기 위한 반복문 실행
		{
			lottoNum[i] = (int)(Math.random()*45+1); //1~45의 수들을 랜덤으로 생성해주는 메서드 사용
			for (int j = 0; j < i; j++) 
			{
				if (lottoNum[i] == lottoNum[j]) //중복 제거; 중복일 경우 다시 다른 값을 넣어줄 수 있게
				{
					i--;
				}
			}
		}
//		for (int i=0; i<7; i++) //출력 테스트
//		{
//			System.out.print(lottoNum[i] + " ");
//		}
		Scanner in = new Scanner (System.in);
		
		for (int i=0; i<7; i++) //사용자에게 숫자들을 7번 입력 받기 위한 반복문 실행
		{
			System.out.print((i+1) + "번째 숫자를 입력하세요: ");
			userNum[i] = in.nextInt();
			if (userNum[i] < 1 || userNum[i] > 45) //1부터 45까지의 숫자만 입력 받기 위한 조건문
			{
				System.out.println("1부터 45사이의 숫자를 처음부터 다시 입력해 주세요.");
				i--;
			}
			for (int j = 0; j < i; j++) //중복 제거; 중복일 경우 다시 입력할 수 있게
			{
				if (userNum[i] == userNum[j])
				{
					System.out.println("중복되었습니다. 다시 입력하세요.");
					i--;
				}
			}
		}
		int cnt = 0; //몇 개의 숫자가 일치하는지 알아보기 위한 변수
		boolean bonus = false; //보너스 숫자가 일치하는지 알아보기 위한 변수 
		
		for (int i=0; i<6; i++) //보너스 숫자를 제외한 숫자 중 몇 개가 사용자가 입력한 숫자와 일치하는지 알아보기 위한 반복문 실행
		{
			for (int j=0; j<7; j++)
			if (lottoNum[i] == userNum[j])
			{
				cnt++;
			}
		}
		for (int i=0; i<7; i++) //사용자가 입력한 숫자 중 보너스 숫자와 일치하는 숫자가 있는지 알아보기 위한 반복문 실행
		{
			if (lottoNum[6] == userNum[i])
			{
				bonus = true;
			}
		}
		
		if (cnt == 6) //보너스 숫자 빼고 6개 숫자가 일치한다면 1등
		{
			System.out.println("축하합니다. 1등에 당첨되셨습니다.");
		}
		else if (cnt == 5 && bonus == true) //보너스 숫자를 포함하여 6개 숫자가 일치한다면 2등
		{		
			System.out.println("축하합니다. 2등에 당첨되셨습니다.");
		}
		else if (cnt == 5 && bonus == false || cnt == 4 && bonus == true) //보너스 숫자를 포함하여 5개 숫자가 일치한다면 3등
		{
			System.out.println("축하합니다. 3등에 당첨되셨습니다.");
		}
		else if (cnt == 4 && bonus == false || cnt == 3 && bonus == true) 
		{
			System.out.println("축하합니다. 4등에 당첨되셨습니다.");
		}
		else if (cnt == 3 && bonus == false || cnt == 2 && bonus == true) 
		{
			System.out.println("축하합니다. 5등에 당첨되셨습니다.");
		}
		else
		{
			System.out.println("꽝!!");
		}
		in.close();
	}

}
