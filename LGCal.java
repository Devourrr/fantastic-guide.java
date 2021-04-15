package InterfaceTest;

public class LGCal implements Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("LG 더하기");
		return a+b;
	}

	@Override
	public int substr(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("LG 빼기");
		return a-b;
	}

	@Override
	public int multi(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("LG 곱하기" );
		return a*b;
	}

	@Override
	public double divide(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("LG나누기");
		return a/b;
	}
	

}
