package mintest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestControllerTest implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("��Ʈ�ѷ� ��û �Ϸ�!");
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("message","��������Ʈ�ѷ����� �ѱ� ������");
		
		mav.setViewName("mintest/result");
		return mav;
	}

}
