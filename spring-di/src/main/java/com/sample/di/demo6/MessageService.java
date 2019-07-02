package com.sample.di.demo6;

public class MessageService {

	private GoodMorning morning;
	public void setMorning(GoodMorning morning) {
		this.morning = morning;
	}
	
	private Goodbye bye;
	public void setBye(Goodbye bye) {
		this.bye = bye;
	}
	
	public MessageService() {}
	
	public MessageService(GoodMorning morning, Goodbye bye)	{
		this.morning = morning;
		this.bye = bye;
	}
	
	public void say() {
		morning.sayHiello();
		bye.sayBye();
	}
}
