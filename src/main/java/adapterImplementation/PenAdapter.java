package adapterImplementation;

import com.gayathri.DesignPatterns.GelPen;

public class PenAdapter implements Pen{
	
GelPen gelpenObject=new GelPen();


	public void write(String str) {
		
		gelpenObject.mark(str);
	}

}
