package week04_day4;
//class
//��� is a
// - �߻� Ŭ����
// - �������̽�

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
