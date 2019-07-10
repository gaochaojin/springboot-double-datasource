package com.gaochaojin.dao.mysql;

import com.gaochaojin.entity.mysql.SrcIcr2LoanInfo;
import com.gaochaojin.entity.mysql.SrcIcr2SpecialTrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 16:46 2019/7/3
 */
@Repository
public interface SrcIcr2SpecialTradeDAO extends JpaRepository<SrcIcr2SpecialTrade, Integer>{

    List<SrcIcr2SpecialTrade> findBySrcIcId(Integer srcIcId);

}
