package com.gaochaojin.controller;

import com.gaochaojin.entity.mysql.SrcIcr2;
import com.gaochaojin.service.mysql.MysqlService;
import com.gaochaojin.service.oracle.OracleService;
import oracle.jdbc.OracleDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 13:21 2019/7/4
 */
@RestController
public class DataHandleController {

    @Autowired
    private MysqlService mysqlService;
    @Autowired
    private OracleService oracleService;

    @GetMapping(name = "/icpr")
    public String mysqlConvertOracle(@RequestParam("id") Integer id){
        SrcIcr2 srcIcr2 = mysqlService.querySrcIcr2ById(id);
        if (srcIcr2 == null){
            return "征信数据为空。。。";
        }
        String msg = oracleService.saveSrcIcrInfo(srcIcr2);
        return msg;
    }

}
