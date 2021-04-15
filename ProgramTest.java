package InterfaceTest;

import java.util.Scanner;

public class ProgramTest {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

		
		AmazonCal amazon = new AmazonCal();
		
		int a;
		int b;
		a= sc.nextInt();
		b= sc.nextInt();
		int result_add  = amazon.add(a, b);
		 System.out.println( "=" +result_add);
		 
		
		int result_sstr = amazon.substr(a, b);
		 System.out.println( "=" +result_sstr);
		int result_multi = amazon.multi(a,b);
		System.out.println( "=" +result_multi);
		double result_divide = amazon.divide(a,b);
		 System.out.println( "=" +result_divide);
		
		
	
	}
	

}
