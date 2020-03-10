package ObserverPattern;

import java.util.List;
import java.util.ArrayList;

public class Channel {
	private List<Subscriber> subscribers=new ArrayList<Subscriber>();
	public String title;
	public void subscribe(Subscriber sub)
	{
		subscribers.add(sub);
		
	}
	public void unsubscribe(Subscriber sub)
	{
		subscribers.remove(sub);
	}
	public void notifySubscrbers() {
		for(Subscriber sub: subscribers) {
			sub.update();
			
		}
	}
public void upload(String title)
{
	this.title=title;
	notifySubscrbers();
}
}
