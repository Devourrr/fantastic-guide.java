package week04_day4_cellphone;

public class SamsungBattery implements Battery{

	public SamsungBattery() {
		System.out.println("삼성 배터리입니다");
}
	@Override
	public void getEnergy() {
		// TODO Auto-generated method stub
		
		System.out.println("삼성 에너지를 얻어옴");
		
		
	}

}
