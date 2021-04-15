package InterfaceTest;
//인터페이스(추상메서드만을 가지는 클래스)
// 명세로서만 존재, 약속, 코드의 분리, 느슨한 결합

public interface Calculator {

	int add( int a, int b);
	int substr(int a, int b);
	int multi(int a, int b);
	double divide(int a, int b);

	
}

