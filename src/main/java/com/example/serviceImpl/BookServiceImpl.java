package com.example.serviceImpl;

import com.example.mapper.TbookMapper;
import com.example.pojo.Tbook;
import com.example.service.TbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component(value="bookServiceImpl")
public class BookServiceImpl implements TbookService {

	@Autowired
	private TbookMapper bookMapper;


    @Override
    public Tbook selectByPrimaryKey(Long booksisbn) throws Exception {
        Tbook book  = bookMapper.selectByPrimaryKey(booksisbn);
        return book;
    }

    @Override
    public int insert(Tbook record) throws Exception {
        int count  = bookMapper.insert(record);
        return count;
    }

    @Override
    public int deleteByPrimaryKey(Long booksisbn) throws Exception {
        int count  = bookMapper.deleteByPrimaryKey(booksisbn);
        return count;
    }

    @Override
    public int updateByPrimaryKey(Tbook record) throws Exception {
        int count  = bookMapper.updateByPrimaryKey(record);
        return count;
    }

    @Override
    public List<Tbook> selectAllBook() throws Exception {
        List<Tbook> list_book  = bookMapper.selectAllBook();
        return list_book;
    }
}
