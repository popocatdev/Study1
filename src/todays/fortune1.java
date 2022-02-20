package todays;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class fortune1 {
	public static void main(String[] args) {
		
		//date 클래스 객체 생성
		Date today = new Date();
		
		//날짜 출력에 대한 출력형식
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy년 MM월 dd일");
		
		System.out.print(dateFormat.format(today));
		
		//random 클래스 객체 생성
		Random r = new Random();
		//100으로 나눈 나머지의 양수에 1을 더한 값
		int randomNum = Math.abs(r.nextInt() % 100)+1;
		System.out.println("금전운(100): "+randomNum+"%");
	}
}
