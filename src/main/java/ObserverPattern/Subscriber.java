package ObserverPattern;

public class Subscriber {
	private String name;
	public  Channel channel=new Channel();
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public void update()
	{
		System.out.println("hey"+name+"video uploaded");
	}
	
public void subscribeChannel(Channel ch)
{
	channel=ch;
}
}
