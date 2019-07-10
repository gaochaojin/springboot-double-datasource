package com.gaochaojin.dao.mysql;

import com.gaochaojin.entity.mysql.SrcIcr2;
import com.gaochaojin.entity.mysql.SrcIcr2AssetDisposition;
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
public interface SrcIcr2AssetDispositionDAO extends JpaRepository<SrcIcr2AssetDisposition, Integer>{

    List<SrcIcr2AssetDisposition> findBySrcIcId(Integer srcIcId);

}
