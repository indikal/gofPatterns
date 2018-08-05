package lk.inli.patterns.creational.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		// Using builder to get the object in a single line of code and
		// without any inconsistent state or arguments management issues
		Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		
		System.out.println("Computer: HDD - " + computer.getHDD());
		System.out.println("Computer: RAM - " + computer.getRAM());
		System.out.println("Computer: Graphic - " + computer.isGraphicsCardEnabled());
		System.out.println("Computer: Bluetooth - " + computer.isBluetoothEnabled());
	}

}