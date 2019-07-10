package com.gaochaojin.dao.mysql;

import com.gaochaojin.entity.mysql.SrcIcr2AssetDisposition;
import com.gaochaojin.entity.mysql.SrcIcr2NonReloanInfo;
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
public interface SrcIcr2NonReloanInfoDAO extends JpaRepository<SrcIcr2NonReloanInfo, Integer>{

    List<SrcIcr2NonReloanInfo> findBySrcIcId(Integer srcIcId);

}
