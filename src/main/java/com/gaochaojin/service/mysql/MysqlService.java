package com.gaochaojin.service.mysql;

import com.gaochaojin.dao.mysql.SrcIcr2DAO;
import com.gaochaojin.entity.mysql.SrcIcr2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 13:20 2019/7/4
 */
@Service
public class MysqlService {

    @Autowired
    private SrcIcr2DAO srcIcr2DAO;

    public SrcIcr2 querySrcIcr2ById(Integer id) {
        return srcIcr2DAO.findById(id).get();
    }
}
