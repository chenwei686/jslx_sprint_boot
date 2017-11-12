package com.isprint.jslx.lccfd.service.inter.timu;

import java.util.List;
import java.util.Map;

/**
 * @author HYL
 * @create 2017-11-12 上午11:49
 **/
public interface TimuService {
    public List<Map<String,Object>> getBaseTimusByPage(Integer skip,Integer end);
}
