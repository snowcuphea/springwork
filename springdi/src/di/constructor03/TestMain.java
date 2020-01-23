package di.constructor03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import di.constructor02.Service;

public class TestMain {

	public static void main(String[] args) {
		
	
		
		ApplicationContext factory = new GenericXmlApplicationContext("config/bean.xml");
		IWrtieArticleMgr mgr = factory.getBean("write",IWrtieArticleMgr.class);
		//�ٸ� �Ŵ����� ������ �� �ֱ� ������ �Ŵ����� ���� Ÿ������ �ش�.
		
		ArticleDTO arti = new ArticleDTO();
		
		mgr.write(arti);
		
	}

}
