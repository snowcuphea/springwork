package di.setter.basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	//constructor Injection���� DAO��ü�� ���Թޱ� ���� �ʿ�
	
	public InsaImpl() {
		System.out.println("InsaImpl �⺻������");
	}
	

	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl �Ű����� 1�� ������");
	}
	//setter Injection���� MemberDAO��ü�� ���Թޱ� ���� setter�޼ҵ带 �غ�. ������ ��� setter��!

	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}
	
	public MemberDAO getDao() {
		return dao;
	}

	public void setDao(MemberDAO dao) {
		System.out.println("setter�޼ҵ� ȣ��");
		this.dao = dao;
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
