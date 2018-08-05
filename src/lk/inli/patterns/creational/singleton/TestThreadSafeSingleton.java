package lk.inli.patterns.creational.singleton;

public class TestThreadSafeSingleton {

	public static void main(String[] args) {
		ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstance();
		singleton1.sayHello("Indika");
		
		ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();
		singleton2.sayHello("Kamal");
	}

}
