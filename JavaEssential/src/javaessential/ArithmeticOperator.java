package javaessential;
import java.util.*;
public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요:");
		int i = in.nextInt();
		int second = i % 60;
		int minute = (i / 60) % 60;
		int hour = (i / 60) / 60;
		
		System.out.println(i + "초는");
		System.out.println(hour + "시간");
		System.out.println(minute + "분");
		System.out.println(second + "초 입니다.");
	}
}
