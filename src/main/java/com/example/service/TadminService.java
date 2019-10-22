package com.example.service;

import com.example.pojo.Tadmin;


import java.util.List;

public interface TadminService {
    public Tadmin selectByPrimaryKey(Long adminid) throws Exception;

    public int insert(Tadmin record) throws Exception;

    public  int deleteByPrimaryKey(Long adminid) throws Exception;

    public int updateByPrimaryKey(Tadmin record) throws Exception;

    public List<Tadmin> selectAllAdmin() throws Exception;
}
