package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	//1. null ���� ���ֱ� ! : �����ڸ� �̿��� �۾�
		
	public InsaImpl() {
		//�⺻������
	}
	
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
	}

	//2.  null ���� ���ֱ� ! setter�޼ҵ带 �̿��ؼ� �۾��ϴ� ���
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
