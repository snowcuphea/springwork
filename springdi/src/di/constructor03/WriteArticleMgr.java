package di.constructor03;

public class WriteArticleMgr implements IWrtieArticleMgr {

	IArticleDAO articleDAO;
	
	//�����̳ʰ� ���� �� �ְ� ������ �غ��س����� 
	
	public WriteArticleMgr() {
		super();
		// TODO Auto-generated constructor stub
	}



	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}


	@Override
	public void write(ArticleDTO article) {
		articleDAO.insert(article);

	}

}
