package com.example.service;


import com.example.pojo.Userborrow;
import com.example.pojo.Userborrow;

import java.util.List;


public interface UserBorrowService {

	public List<Userborrow> selectByPrimaryUserKey(long usersid) throws Exception;

	public List<Userborrow> selectByPrimaryBookKey(long booksisbn) throws Exception;

	public int insert(Userborrow record) throws Exception;

	public int deleteByPrimaryUserKey(long usersid) throws Exception;

	public int deleteByPrimaryBookKey(long booksisbn) throws Exception;

	public int updateByPrimaryUserKey(Userborrow record) throws Exception;

	public int updateByPrimaryBookKey(Userborrow record) throws Exception;

	public List<Userborrow> selectAllBorrow() throws Exception;

	public int deleteBorrow(Userborrow record) throws Exception;
}


