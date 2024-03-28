package test1;

abstract class Animal {
	abstract void show();
	void key() {
		System.out.println("animal:");
	}
}

class Dog extends Animal {
	void show() {
		System.out.println("dog");
	}
}
public class test2 {

	public static void main(String[] args) {
		Animal d = new Dog();
		d.show();
	}

}
