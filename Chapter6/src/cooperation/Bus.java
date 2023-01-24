package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {       // 버스번호
		this.busNumber = busNumber;
	}
	
	public void take(int money) {     
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo( ) {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명 이고, 수입은 "
				+ money + "원 입니다.");
	}
}
