package javaessential;

import java.util.*;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("내 정보");
		Scanner in = new Scanner(System.in);
		String name = in.next();
		System.out.println("이름은 " + name + "입니다.");
		int age = in.nextInt();
		System.out.println("나이는 " + age + "살 입니다.");
		String test = in.nextLine();
		String address = in.nextLine();
		System.out.println("주소는 " + address + "입니다.");
		in.close();
	}
}