package exam.practice.tv;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		
		TV tv = factory.getBean("samssung", TV.class);
		
		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();

	}

}
