package onlyblue21.service;

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
	
	public HashMap content(User_Board user_board) throws Exception;
	
	public int AddContent(User_Board user_board) throws Exception;
	
	public int contentdelete(User_Board user_board) throws Exception;

	public int maxseq(User_Board user_board) throws Exception;
	
	public void contentupdate(User_Board user_board)throws Exception;
	
}
