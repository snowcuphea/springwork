package mintest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestControllerTest implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("컨트롤러 요청 완료!");
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("message","스프링컨트롤러에서 넘긴 데이터");
		
		mav.setViewName("mintest/result");
		return mav;
	}

}
