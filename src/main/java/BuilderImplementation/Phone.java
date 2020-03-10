package BuilderImplementation;

public class Phone {
	private String os;
	private String processor;
	private int ramSize;
	private double screenSize;
	private int battery;
	public Phone(String os, String processor, int ramSize, double screenSize, int battery) {
		super();
		this.os = os;
		this.processor = processor;
		this.ramSize = ramSize;
		this.screenSize = screenSize;
		this.battery = battery;
		
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", ramSize=" + ramSize + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}
}
