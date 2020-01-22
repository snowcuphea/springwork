package di.constructor01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import di.constructor.basic.Insa;

public class Test01 {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("config/bean.xml");
		
		AbstractPlayer p = factory.getBean("player", AbstractPlayer.class);

		p.play();
		
		System.out.println("���� ���� �ֻ����� ��:"+p.getTotalValue());
	}

}
