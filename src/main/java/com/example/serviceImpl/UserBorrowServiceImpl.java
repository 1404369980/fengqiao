package com.example.serviceImpl;

import com.example.mapper.UserborrowMapper;
import com.example.pojo.Userborrow;
import com.example.service.UserBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component(value="userborrowServiceImpl")
public class UserBorrowServiceImpl implements UserBorrowService {

	@Autowired
	private UserborrowMapper UserborrowMapper;

	@Override
	public List<Userborrow> selectByPrimaryUserKey(long usersid) throws Exception {
		List<Userborrow> list_userborrowr = UserborrowMapper.selectByPrimaryUserKey(usersid);
		return list_userborrowr;
	}

	@Override
	public List<Userborrow> selectByPrimaryBookKey(long booksisbn) throws Exception {
		List<Userborrow> list_userborrowr = UserborrowMapper.selectByPrimaryBookKey(booksisbn);
		return list_userborrowr;
	}

	@Override
	public int insert(Userborrow record) throws Exception {
		int count = UserborrowMapper.insert(record);
		return count;
	}

	@Override
	public int deleteByPrimaryUserKey(long usersid) throws Exception {
		int count = UserborrowMapper.deleteByPrimaryUserKey(usersid);
		return count;
	}

	@Override
	public int deleteByPrimaryBookKey(long booksisbn) throws Exception {
		int count = UserborrowMapper.deleteByPrimaryBookKey(booksisbn);
		return count;
	}

	@Override
	public int updateByPrimaryUserKey(Userborrow record) throws Exception {
		int count = UserborrowMapper.updateByPrimaryUserKey(record);
		return count;
	}

	@Override
	public int updateByPrimaryBookKey(Userborrow record) throws Exception {
		int count = UserborrowMapper.updateByPrimaryBookKey(record);
		return count;
	}


    @Override
    public List<Userborrow> selectAllBorrow() throws Exception {
        List<Userborrow> list_userborrow = UserborrowMapper.selectAllBorrow();
        return list_userborrow;
    }

	@Override
	public int deleteBorrow(Userborrow record) throws Exception {
		int count = UserborrowMapper.deleteBorrow(record);
		return count;
	}
}
