package javaessential;
import java.util.*;
public class Grading {
	public static void main(String[] args) {
		char grade;
		Scanner in = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요:");
		int score = in.nextInt();
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else if(score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("학점은 " + grade +"입니다.");
		in.close();
	}
}
