package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {       
		this.studentName = studentName;                   
		this.money = money;
	}
	
	public void takeBus(Bus bus) {            //Bus 라는 객체와 협업
		bus.take(1000);
		money -= 1000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}
