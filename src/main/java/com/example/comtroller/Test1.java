package com.example.comtroller;


import com.example.mapper.TuserMapper;
import com.example.pojo.Tuser;
import org.springframework.beans.factory.annotation.Autowired;

public class Test1 {

/*
   是否允许  读者借书  ，  某本书是否允许借，  没本书借的时候都要经过管理员的同意
 */
    @Autowired
    private TuserMapper tuserMapper;

    public static void main(String[] args) {

//        long id =1;
//        Tuser user = tuserMapper.selectByPrimaryKey(id);
    }
}
