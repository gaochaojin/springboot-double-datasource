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
@Table(name = "ICRP2_PA01A")
public class Icrp2Pa01a {
    /**
     * null
     */
    @Id
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "PA01AI01")
    private String pa01ai01;

    /**
     * null
     */
    @Column(name = "PA01AR01")
    private String pa01ar01;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getPa01ai01() {
        return pa01ai01;
    }

    public void setPa01ai01(String pa01ai01) {
        this.pa01ai01 = pa01ai01 == null ? null : pa01ai01.trim();
    }

    public String getPa01ar01() {
        return pa01ar01;
    }

    public void setPa01ar01(String pa01ar01) {
        this.pa01ar01 = pa01ar01 == null ? null : pa01ar01.trim();
    }
}