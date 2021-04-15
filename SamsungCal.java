package InterfaceTest;

public class SamsungCal implements Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("»ï¼º ´õÇÏ±â");
		return a+b;
	}

	@Override
	public int substr(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("»ï¼º »©±â");
		return a-b;
	}

	@Override
	public int multi(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("»ï¼º °öÇÏ±â");
		return a*b;
	}

	@Override
	public double divide(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("»ï¼º ³ª´©±â");
		return a/b;
	}

}
