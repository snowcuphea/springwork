package di.constructor02;

public class ServiceImpl implements Service {
	Logic mylogic;
	String name;
	String msg;
	
	//생성자 만들기
	public ServiceImpl(Logic mylogic, String name, String msg) {
		super();
		this.mylogic = mylogic;
		this.name = name;
		this.msg = msg;
		System.out.println("ServiceImpl의 매개변수 3개 생성자");
	}

	@Override
	public void test() {
		//Logic의 메소드를 호출하는 클래스
		
		System.out.println(msg+ ", " + name);
		mylogic.testLogic();

	}

}
