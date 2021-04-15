package InterfaceTest;

public class AmazonCal implements Calculator {

	@Override
	public int add(int a, int b) {
		
	// TODO Auto-generated method stub
	System.out.print("Amaazon add  " );
	return a+b;	
	}

	@Override
	public int substr(int a, int b) {
		// TODO Auto-generated method stub
		System.out.print("Amazon substr  ");
	return a-b;
	}

	@Override
	public int multi(int a, int b) {
		// TODO Auto-generated method stub
		System.out.print("Amazon multi  ");
	return a*b;
	}

	@Override
	public double divide(int a, int b) {
		// TODO Auto-generated method stub
		System.out.print("Amazon divide  ");
	return a/b;
	}

}
