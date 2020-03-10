package FactoryDesignPattern;

public class OsFactory {
	public OS getInstance(String str)
	{
		if(str.equals("open source"))
			return new Android();
		else if(str.equals("closed source"))
			return new IOS();
		else 
			return new Windows();
	}
}
