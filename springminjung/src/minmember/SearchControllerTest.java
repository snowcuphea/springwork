package minmember;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SearchControllerTest implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String search = req.getParameter("search");
		System.out.println("°Ë»ö¾î : "+search);
		
		return new ModelAndView("mintest/index");
	}

}
