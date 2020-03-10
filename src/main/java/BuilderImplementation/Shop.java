package BuilderImplementation;

public class Shop {

	public static void main(String[] args) {
	Phone phone= new PhoneBuilder().setOs("Android").setRamSize(2).setBattery(3000).getPhone();
	System.out.println(phone);

	}

}
