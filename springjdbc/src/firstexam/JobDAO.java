package firstexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//hr계정의 job테이블을 제어하는 DAO클래스
@Repository("jobdao")
public class JobDAO {
	@Autowired
	JdbcTemplate myTemplate;
	
	//job테이블의 레코드 갯수를 리턴하는 메소드
	public int count() {
		
		
		return myTemplate.queryForObject("select count(*) from jobs", Integer.class);
				//쿼리문을 작성하고, 쿼리문을 실행하고 나오는 값의 타입을 적어준다. 
	}

}
