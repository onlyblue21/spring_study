package ksm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import ksm.dao.Dao;
import ksm.service.Pro_Service;
import ksm.vo.UserVo;
import ksm.vo.User_Board;

import org.springframework.stereotype.Service;

@Service("Pro_Service")
public class Pro_ServiceImpl implements Pro_Service{

	@Resource
	private Dao dao;
	
	@Override
	public int test() throws Exception {
		return dao.test();
	}
	@Override
	public boolean Login(UserVo uservo) throws Exception {
		return dao.Login(uservo);
	}
	@Override
	public List<User_Board> UserBoard(User_Board user_board) throws Exception{
		return dao.UserBoard(user_board);
	}
	@Override
	public String LoginSession(UserVo uservo) throws Exception {
		return dao.LoginSession(uservo);
	}
	@Override
	public int Join(UserVo uservo)throws Exception{
		
		return dao.Join(uservo);
	}
	@Override
	public HashMap<String,String> content(User_Board user_Board) throws Exception{
		
		return dao.content(user_Board);
	}
	@Override
	public int AddContent(User_Board user_board) throws Exception{
		
		return dao.addcontent(user_board);
	}
	@Override
	public void contentdelete(User_Board user_board)throws Exception{

		dao.contentdelete(user_board);
	}
	@Override
	public void contentupdate(User_Board user_board)throws Exception{
		
		dao.contentupdate(user_board);
	}
	
	@Override
	public int maxseq(User_Board user_board)throws Exception{
		
		return dao.maxseq(user_board);
	}
	
	@Override
	public void create_db_user()throws Exception{
		
		dao.create_db_user();
	}
	
	@Override
	public void create_db_board()throws Exception{
		
		dao.create_db_board();
	}
	
	@Override
	public int Check_id(UserVo uservo)throws Exception{
		
		return dao.Check_id(uservo);
	}
	
}
