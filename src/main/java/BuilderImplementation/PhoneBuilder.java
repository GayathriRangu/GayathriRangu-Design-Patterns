package BuilderImplementation;

public class PhoneBuilder {
	private String os;
	private String processor;
	private int ramSize;
	private double screenSize;
	private int battery;
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setRamSize(int ramSize) {
		this.ramSize = ramSize;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
	this.screenSize = screenSize;
	return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
	return this;
	}
	public Phone getPhone() {
		return new Phone(os, processor, ramSize, screenSize, battery);
	}

}
