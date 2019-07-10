package com.gaochaojin.entity.oracle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * null
 *
 * @author null
 * @date   2019-07-03
 */
@Entity
@Table(name = "ICRP2_PC02BH")
public class Icrp2Pc02bh {

    /**
     * null
     */
    @Id
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "ITEMNO")
    private String itemno;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno == null ? null : itemno.trim();
    }

    /**
     * null
     */
    @Column(name = "PC02BD01")
    private String pc02bd01;

    /**
     * null
     */
    @Column(name = "PC02BS03")
    private String pc02bs03;

    /**
     * null
     */
    @Column(name = "PC02BJ02")
    private String pc02bj02;

    public String getPc02bd01() {
        return pc02bd01;
    }

    public void setPc02bd01(String pc02bd01) {
        this.pc02bd01 = pc02bd01 == null ? null : pc02bd01.trim();
    }

    public String getPc02bs03() {
        return pc02bs03;
    }

    public void setPc02bs03(String pc02bs03) {
        this.pc02bs03 = pc02bs03 == null ? null : pc02bs03.trim();
    }

    public String getPc02bj02() {
        return pc02bj02;
    }

    public void setPc02bj02(String pc02bj02) {
        this.pc02bj02 = pc02bj02 == null ? null : pc02bj02.trim();
    }
}