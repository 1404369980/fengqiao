package com.example.serviceImpl;

import com.example.mapper.TadminMapper;
import com.example.pojo.Tadmin;
import com.example.service.TadminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value="adminServiceImpl")
public class AdminServiceImpl  implements TadminService {
    @Autowired
    private TadminMapper adminMapper;

    @Override
    public Tadmin selectByPrimaryKey(Long adminid) throws Exception {
        Tadmin tadmin = adminMapper.selectByPrimaryKey(adminid);
        return tadmin;
    }

    @Override
    public int insert(Tadmin record) throws Exception {
        int count = adminMapper.insert(record);
        return count;
    }

    @Override
    public int deleteByPrimaryKey(Long adminid) throws Exception {
        int count = adminMapper.deleteByPrimaryKey(adminid);
        return count;
    }

    @Override
    public int updateByPrimaryKey(Tadmin record) throws Exception {
        int count = adminMapper.updateByPrimaryKey(record);
        return count;
    }

    @Override
    public List<Tadmin> selectAllAdmin() throws Exception {
        List<Tadmin> list_admin = adminMapper.selectAllAdmin();
        return list_admin;
    }
}
