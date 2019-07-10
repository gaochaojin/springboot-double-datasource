package com.gaochaojin.dao.oracle;

import com.gaochaojin.entity.oracle.Icrp2Pc02i;
import com.gaochaojin.entity.oracle.Icrp2Pd01a;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 11:28 2019/2/22
 */
@Repository
public interface Icrp2Pd01aDAO extends JpaRepository<Icrp2Pd01a, Integer> {
}
