package week04_day4_cellphone;

public class Cellphone {

	private Battery battery ;

	void setBattery(Battery battery) {
		this.battery = battery;
	}
	void poweron() {
		battery.getEnergy();
		System.out.println("�ڵ����� �����ϴ�");
	}
}
