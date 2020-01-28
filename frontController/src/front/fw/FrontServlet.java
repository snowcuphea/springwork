package front.fw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//모든 요청이 FrontServlet을 통해 들어올 수 있도록 설정 
@WebServlet(name="front",urlPatterns= {"*.do", "*.jsp","*.html"})
//확장자가 do, jsp, html로 끝나는것은 전부다 여기로 들어오게함
public class FrontServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청정보를 분석해서 추출 - 어떤 path로 요청할지 모른다. 
		System.out.println("요청받기"); //요청받는지 파악 확인 테스트 
		System.out.println("request.getContextPath()=>"
				+ request.getContextPath());
		System.out.println("request.getRequestURI()=>"
				+ request.getRequestURI());
		
		String contextPath = request.getContextPath();
		String requestURI = request.getRequestURI();
		String path = requestURI.substring(contextPath.length());
		System.out.println("path=> " + path);
		
		//추출한 요청 path로 등록되어 있는 실행할 클래스 정보를 찾아오는 작업
		//RequestMapping 객체에 의뢰 => RequestMapping객체의 메소드를 호출하면 
		//							실제 실행할 객체를 찾아서 리턴
		RequestMapping mappingObj = new RequestMapping();
		Action action = mappingObj.mapping(path); //요청에 따라서 action객체는 달라진다.
		//일단 상위타입인 Action으로 정의해준다. 
		
		//Action객체의 메소드를 호출
		action.run(request, response);
		
		//run메소드의 실행결과를 받아서 응답 view를 만든다.
		
		//응답 view로 forward or redirect
		
	}

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
