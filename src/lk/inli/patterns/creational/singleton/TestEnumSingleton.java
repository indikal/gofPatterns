package lk.inli.patterns.creational.singleton;

public class TestEnumSingleton {
	
	public static void main(String[] args) {

		EnumSingleton singleton1 = EnumSingleton.INSTANCE;
		System.out.println("Instance 1: " + singleton1.getValue());
		
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;
		singleton2.setValue(2);
		System.out.println("Instance 2: " + singleton2.getValue());
		System.out.println("Instance 1: " + singleton1.getValue());
	}
}
