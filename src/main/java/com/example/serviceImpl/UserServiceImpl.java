package com.example.serviceImpl;

import com.example.mapper.TuserMapper;
import com.example.pojo.Tuser;
import com.example.service.TuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component(value="userServiceImpl")
public class UserServiceImpl implements TuserService {

	@Autowired
	private TuserMapper tuserMapper;
	
	public Tuser selectByPrimaryKey(long id) throws Exception {
		Tuser user = tuserMapper.selectByPrimaryKey(id);
		return user;
	}

	@Override
	public int insert(Tuser record) throws Exception {
		int count = tuserMapper.insert(record);
		return count;
	}

	@Override
	public int deleteByPrimaryKey(long usersid) throws Exception {
		int count = tuserMapper.deleteByPrimaryKey(usersid);
		return count;
	}

	@Override
	public int updateByPrimaryKey(Tuser record) throws Exception {
		int count = tuserMapper.updateByPrimaryKey(record);
		return count;
	}

	@Override
	public List<Tuser> selectAllUser() throws Exception {
		List<Tuser> list_use = tuserMapper.selectAllUser();
		return list_use;
	}

}
