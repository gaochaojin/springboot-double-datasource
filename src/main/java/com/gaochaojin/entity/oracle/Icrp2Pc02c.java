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
@Table(name = "ICRP2_PC02C")
public class Icrp2Pc02c {
    /**
     * null
     */
    @Id
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "PC02CS01")
    private String pc02cs01;

    /**
     * null
     */
    @Column(name = "PC02CJ01")
    private String pc02cj01;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getPc02cs01() {
        return pc02cs01;
    }

    public void setPc02cs01(String pc02cs01) {
        this.pc02cs01 = pc02cs01 == null ? null : pc02cs01.trim();
    }

    public String getPc02cj01() {
        return pc02cj01;
    }

    public void setPc02cj01(String pc02cj01) {
        this.pc02cj01 = pc02cj01 == null ? null : pc02cj01.trim();
    }
}