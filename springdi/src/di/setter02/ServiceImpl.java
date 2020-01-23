package di.setter02;

public class ServiceImpl implements Service {
	Logic mylogic; // setter Injection
	String name; //Constructor Injection
	String msg; // Constructor Injection
	
	public ServiceImpl(String name, String msg) {
		super(); //얘네 두개는 Constructor Injection으로 하기
		this.name = name;
		this.msg = msg;
		System.out.println("매개변수 2개 생성자");
	}

	public ServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setMylogic(Logic mylogic) {
		this.mylogic = mylogic;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

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
