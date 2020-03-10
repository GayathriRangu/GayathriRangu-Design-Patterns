import com.gayathri.DesignPatterns.*;

import FactoryDesignPattern.OS;
import FactoryDesignPattern.OsFactory;
public class FactoryMain {

	public static void main(String[] args) {
		OsFactory osf=new OsFactory();
		OS obj=osf.getInstance("open source");
		
obj.specification();
	}

}
