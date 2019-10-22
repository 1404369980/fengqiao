package com.example.service;


import com.example.pojo.Tbook;

import java.util.List;


public interface TbookService {

	public Tbook selectByPrimaryKey(Long booksisbn) throws Exception;

	public int insert(Tbook record) throws Exception;

	public int deleteByPrimaryKey(Long booksisbn) throws Exception;

	public int updateByPrimaryKey(Tbook record) throws Exception;

	public List<Tbook> selectAllBook() throws Exception;
}


