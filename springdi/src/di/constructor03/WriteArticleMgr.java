package di.constructor03;

public class WriteArticleMgr implements IWrtieArticleMgr {

	IArticleDAO articleDAO;
	
	//컨테이너가 받을 수 있게 생성자 준비해놔야함 
	
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
