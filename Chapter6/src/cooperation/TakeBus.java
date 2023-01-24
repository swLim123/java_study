package cooperation;
public class TakeBus {
	public static int add(int a, int b)
	{
		return a+b;
	}
	
	public static void changeAB(Student s)
	{
		// 대충 s의 있는 변수 바꾸는 코드
	}
	public static void main(String[] args) {
		Student j = new Student("James", 5000);
		Student t = new Student("Tomas", 10000);
		
		Bus b100 = new Bus(100);
		j.takeBus(b100);
		j.showInfo();
		b100.showInfo();
		
		t.takeBus(b100);
		t.showInfo();
		b100.showInfo();
		
//		Student t = new Student("Tomas", 10000);
//		
//		t = "주소"
		//객체지향의 장점
		//코드 중복이 적음
		//수정, 확장 용이함.
		
		int a = 3;
		int b = 3;
		//int c = add(a,b);
		//call - by - value;
		changeAB(a,b);
		
		//call - by - reference
		changeAB(j);
		System.out.println(a + " " + b);
	}
}
