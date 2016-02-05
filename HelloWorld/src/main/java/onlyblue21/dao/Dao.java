package onlyblue21.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import onlyblue21.vo.UserVo;
import onlyblue21.vo.User_Board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("onlyblue21.dao.TestDao")
public class Dao{

	@Autowired
	private SqlSession sqlSession;
	
	public int test(){
		return sqlSession.selectOne("onlyblue21.test");
	}
	// Login
	public boolean Login(UserVo uservo){
		int x = sqlSession.selectOne("onlyblue21.Login",uservo);
		return x < 1 ? false:true;
	}
	//Listvalue
	public List<User_Board> UserBoard(User_Board user_board){
		
		return sqlSession.selectList("onlyblue21.UserBoard");
	}
	
	public String LoginSession(UserVo uservo){
		
		return sqlSession.selectOne("onlyblue21.LoginSession",uservo); 
	}
	
	public int Join(UserVo uservo){

		return sqlSession.insert("onlyblue21.Join",uservo);
	}
	
	public HashMap<String,String> content(User_Board user_Board){
		
		return sqlSession.selectOne("onlyblue21.content",user_Board);
	}
	public int addcontent(User_Board user_board){
		
		return sqlSession.insert("onlyblue21.AddContent", user_board);
	}
	public void contentdelete(User_Board user_board){

		sqlSession.delete("onlyblue21.c_delete", user_board);
	}
	public int maxseq(User_Board user_board){
		
		return sqlSession.selectOne("onlyblue21.maxseq",user_board);
	}
	public void contentupdate(User_Board user_board){
		
		sqlSession.update("onlyblue21.contentupdate",user_board);
	}
	public void create_db_user(){
		sqlSession.insert("onlyblue21.create_db_user");
	}
	public void create_db_board(){
		sqlSession.insert("onlyblue21.create_db_board");
	}
	public int Check_id(UserVo uservo){
		return sqlSession.selectOne("onlyblue21.Check_id");
	}
	
	
}
