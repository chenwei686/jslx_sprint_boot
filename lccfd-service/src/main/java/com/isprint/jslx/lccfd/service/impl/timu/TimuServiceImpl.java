package com.isprint.jslx.lccfd.service.impl.timu;

import com.isprint.jslx.lccfd.dao.BaseTimuSearchMapper;
import com.isprint.jslx.lccfd.service.inter.timu.TimuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author HYL
 * @create 2017-11-12 下午12:15
 **/
@Service
public class TimuServiceImpl implements TimuService {

    @Autowired
    private BaseTimuSearchMapper timuSearchMapper;

    @Override
    public List<Map<String, Object>> getBaseTimusByPage(Integer skip, Integer end) {
        List<Map<String, Object>> baseTimuSearchList = timuSearchMapper.getBaseTimuSearchList(skip, end);
        return baseTimuSearchList;
    }
}
