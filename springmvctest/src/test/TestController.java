package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("컨트롤러 요청 완료");
		
		ModelAndView mvmv = new ModelAndView();
		String data ="";
		
		for(int i =1;i<10;i++) {
			data = data+(9+"*"+i+"="+(9*i)+"<br/>");
			
		}
		
		mvmv.addObject("gugu",data);
		
		mvmv.setViewName("/WEB-INF/test/result.jsp");
		
		
		
		return mvmv;
	}

}
