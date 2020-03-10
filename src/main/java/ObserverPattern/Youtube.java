package ObserverPattern;

public class Youtube {
	public static void main(String args[])
	{
	Channel green=new Channel();
	
Subscriber s=new Subscriber("Simran");
Subscriber s1=new Subscriber("Maya");
Subscriber s2=new Subscriber("Greena");
Subscriber s3=new Subscriber("Manas");

green.subscribe(s1);
green.subscribe(s);
green.subscribe(s2);
green.subscribe(s3);

s.subscribeChannel(green);
s1.subscribeChannel(green);
s2.subscribeChannel(green);
s3.subscribeChannel(green);

green.upload("green ojects");
}
}
