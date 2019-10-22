package com.example.service;


import com.example.pojo.Tuser;

import java.util.List;


public interface TuserService {

	public Tuser selectByPrimaryKey(long id) throws Exception;

	public int insert(Tuser record) throws Exception;

	public int deleteByPrimaryKey(long usersid) throws Exception;

	public int updateByPrimaryKey(Tuser record) throws Exception;

	public List<Tuser> selectAllUser() throws Exception;
}


