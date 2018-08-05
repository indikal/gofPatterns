package lk.inli.patterns.creational.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	private int instanceCount = 0;

	private ThreadSafeSingleton() {
		instanceCount++;
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

	public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}

	public void sayHello(String name) {
		System.out.println("Instance " + instanceCount + " says: Hello, " + name + "!");
	}
}
