package week04_day4;
//class
//상속 is a
// - 추상 클래스
// - 인터페이스

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Animal a = new Animal();
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Cat();
		
		for(int i=0; i<animals.length; i++) {
			animals[i].bark();
		}
	}

}
