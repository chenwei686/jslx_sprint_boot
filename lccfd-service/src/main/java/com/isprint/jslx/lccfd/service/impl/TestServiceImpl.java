package com.isprint.jslx.lccfd.service.impl;

import com.isprint.jslx.lccfd.dao.BaseTimuSearchMapper;
import com.isprint.jslx.lccfd.model.BaseTimuSearch;
import com.isprint.jslx.lccfd.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HYL
 * @create 2017-08-19 下午8:55
 **/
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private BaseTimuSearchMapper baseTimuSearchMapper;
    @Override
    public BaseTimuSearch findById(String id) {
        BaseTimuSearch baseTimuSearch = baseTimuSearchMapper.selectByPrimaryKey(id);
        return baseTimuSearch;
    }
}
