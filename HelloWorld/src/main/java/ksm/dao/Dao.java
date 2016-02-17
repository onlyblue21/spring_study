package ksm.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ksm.vo.UserVo;
import ksm.vo.User_Board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("ksm.dao.TestDao")
public class Dao{

	@Autowired
	private SqlSession sqlSession;
	
	public int test(){
		return sqlSession.selectOne("ksm.test");
	}
	// Login
	public boolean Login(UserVo uservo){
		int x = sqlSession.selectOne("ksm.Login",uservo);
		return x < 1 ? false:true;
	}
	//Listvalue
	public List<User_Board> UserBoard(User_Board user_board){
		
		return sqlSession.selectList("ksm.UserBoard");
	}
	
	public String LoginSession(UserVo uservo){
		
		return sqlSession.selectOne("ksm.LoginSession",uservo); 
	}
	
	public int Join(UserVo uservo){

		return sqlSession.insert("ksm.Join",uservo);
	}
	
	public HashMap<String,String> content(User_Board user_Board){
		
		return sqlSession.selectOne("ksm.content",user_Board);
	}
	public int addcontent(User_Board user_board){
		
		return sqlSession.insert("ksm.AddContent", user_board);
	}
	public void contentdelete(User_Board user_board){

		sqlSession.delete("ksm.c_delete", user_board);
	}
	public int maxseq(User_Board user_board){
		
		return sqlSession.selectOne("ksm.maxseq",user_board);
	}
	public void contentupdate(User_Board user_board){
		
		sqlSession.update("ksm.contentupdate",user_board);
	}
	public void create_db_user(){
		sqlSession.insert("ksm.create_db_user");
	}
	public void create_db_board(){
		sqlSession.insert("ksm.create_db_board");
	}
	public int Check_id(UserVo uservo){
		return sqlSession.selectOne("ksm.Check_id");
	}
	
	
}
