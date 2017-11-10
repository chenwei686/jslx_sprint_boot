package com.isprint.jslx.lccfd.service.inter.templecheck;

import com.alibaba.fastjson.JSONObject;

/**
 * @author HYL
 * @create 2017-11-10 上午11:33
 **/
public interface TempleCheck {
    public JSONObject getDate(Integer subectId, Integer index, String remark);
}
