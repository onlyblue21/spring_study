package dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("Pro_DAO")
public class Pro_DAO extends SqlSessionDaoSupport{
	
	@Resource(name="sqlSessionTemplate")
	public void setSqlsessionTemplate(SqlSessionTemplate sqlSession) {
		super.setSqlSessionTemplate(sqlSession);
	}
	
	public List<Map<String, String>> testList() throws Exception{
		return getSqlSession().selectList("selectTest");
	}
}
