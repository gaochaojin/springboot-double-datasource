package com.gaochaojin.dao.oracle;

import com.gaochaojin.entity.oracle.Icrp2Pa01a;
import com.gaochaojin.entity.oracle.Icrp2Pa01b;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 11:28 2019/2/22
 */
@Repository
public interface Icrp2Pa01bDAO extends JpaRepository<Icrp2Pa01b, Integer> {
}
