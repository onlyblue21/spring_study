package onlyblue21.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import onlyblue21.vo.UserVo;
import onlyblue21.vo.User_Board;

public interface Pro_Service {
	
	public int test()throws Exception;

	public boolean Login(UserVo uservo) throws Exception;
	
	public String LoginSession(UserVo uservo) throws Exception;
	
	public List<User_Board> UserBoard(User_Board user_board) throws Exception;

	public int Join(UserVo uservo) throws Exception;
	
	public HashMap<String,String> content(User_Board user_board) throws Exception;
	
	public int AddContent(User_Board user_board) throws Exception;
	
	public void contentdelete(User_Board user_board) throws Exception;

	public int maxseq(User_Board user_board) throws Exception;
	
	public void contentupdate(User_Board user_board)throws Exception;
	
	public void create_db_user()throws Exception;
	
	public void create_db_board()throws Exception;
	
	public int Check_id(UserVo uservo)throws Exception;
	
}
