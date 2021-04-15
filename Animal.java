package week04_day4;
// 추상클래스
// 추상메서드를 하나라도 가지면 추상클래스가 됨
// new 할 수 없다.
// Animal a = new Animal(); = > 불가능함
// 부모로서만 존재하는 클래스이다.
// 하위클래스가 추상메서드를 구현하도록 강제합니다

public abstract class Animal {	//추상클래스
	public final void sleep() {
		System.out.println("잔다");
	}
	abstract public void bark();	//추상메서드
	

	
}


//final
// final int a = 10; //변수를 상수화 시키는 것
// final void disp() {}// 상속시에 오버라이딩 금지
// final class Test{} // 상속금지
