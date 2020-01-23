package di.constructor03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import di.constructor02.Service;

public class TestMain {

	public static void main(String[] args) {
		
	
		
		ApplicationContext factory = new GenericXmlApplicationContext("config/bean.xml");
		IWrtieArticleMgr mgr = factory.getBean("write",IWrtieArticleMgr.class);
		//다른 매니저가 존재할 수 있기 때문에 매니저의 상위 타입으로 준다.
		
		ArticleDTO arti = new ArticleDTO();
		
		mgr.write(arti);
		
	}

}
