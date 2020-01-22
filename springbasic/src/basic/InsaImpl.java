package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	//1. null 오류 없애기 ! : 생성자를 이용해 작업
		
	public InsaImpl() {
		//기본생성자
	}
	
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
	}

	//2.  null 오류 없애기 ! setter메소드를 이용해서 작업하는 방법
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}

	
	
	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}



	
	@Override
	public MemberDTO getUser(String id) {
		MemberDTO mem = new MemberDTO();

		dao.getUser("id");
		return mem;
	}

}
