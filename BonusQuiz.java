package Exam_1;

import java.util.Scanner;

public class BonusQuiz {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print( "알파벳 소문자로 구성된 압축할 문자열을 입력해 주세요 (최대 1000자까지) : " );
		String s = in.next();
		
		int answer = s.length(); //최소값을 구해야 하므로 가장 큰 값부터 시작
		
		for ( int i = 1; i <= s.length()/2; i++ ) //압축 단위 i; 몇 개로 잘랐을 때 가장 최소 단위인가
			{
			int pos = 0; //연산 수행 위치 position (string의 맨 앞자리의 포지션은 0)
			int len = s.length(); //압축된 string의 길이(도전자) = 초기값 answer(챔피언)과 비교를 위해
			
			for ( ; pos+i <= s.length(); ) //압축 단위 i를 늘려가면서 비교 (1개로 묶을 때, 2개로 묶을 때 ...)
			{
				String unit = s.substring(pos, pos+i); //기준 위치 //substring = 범위 지정
				pos += i; //unit과 이동한 위치의 값을 달라지게 해주기 위해서
				
				int cnt = 0; //반복 횟수 파악을 위해서
				
				for ( ; pos+i <= s.length(); ) 
				{
					if (unit.equals(s.substring(pos, pos+i))) //unit과 이동한 위치 position 비교
					{
						cnt++; //같은 문자가 있으면 카운트가 더해짐
						pos += i; //계속해서 옆으로 이동하면서 같은 문자가 더 있는지 찾기 위해서
					}
					else //같은 문자가 없으면 종료됨
					{
						break;
					}
				}
				//위의 결과들을 토대로 length(도전자)의 값을 계산해야 함
				if ( cnt>0 ) //같은 문자가 있었을 경우
				{
					len -= i*cnt; //2a 3b 이런식으로 묶여있으니까 i도 따로 곱해줘야함
					
					if ( cnt<=9 ) //2a일 경우 숫자 자리가 한자리이므로 1 더해줘야함 
					{
						len += 1;
					}
					else if ( cnt<=99 ) //10a 이런식으로 묶이면 두자리가 되니까 
					{
						len += 2;
					}
					else if ( cnt<=999 ) //위와 동일 100a일 경우 세자리가 되니까 
					{
						len += 3;
					}
					else //1000a 
					{
						len += 4;
					}
				}
			}
			answer = Math.min(answer, len); //answer와 len을 비교하여 더 작은 값을 알려줌
		}
		System.out.println( answer ); //결과값 출력
		in.close();
	}

}
