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
@Table(name = "ICRP2_PA01B")
public class Icrp2Pa01b {
    /**
     * null
     */
    @Id
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "PA01BQ01")
    private String pa01bq01;

    /**
     * null
     */
    @Column(name = "PA01BD01")
    private String pa01bd01;

    /**
     * null
     */
    @Column(name = "PA01BI01")
    private String pa01bi01;

    /**
     * null
     */
    @Column(name = "PA01BI02")
    private String pa01bi02;

    /**
     * null
     */
    @Column(name = "PA01BD02")
    private String pa01bd02;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getPa01bq01() {
        return pa01bq01;
    }

    public void setPa01bq01(String pa01bq01) {
        this.pa01bq01 = pa01bq01 == null ? null : pa01bq01.trim();
    }

    public String getPa01bd01() {
        return pa01bd01;
    }

    public void setPa01bd01(String pa01bd01) {
        this.pa01bd01 = pa01bd01 == null ? null : pa01bd01.trim();
    }

    public String getPa01bi01() {
        return pa01bi01;
    }

    public void setPa01bi01(String pa01bi01) {
        this.pa01bi01 = pa01bi01 == null ? null : pa01bi01.trim();
    }

    public String getPa01bi02() {
        return pa01bi02;
    }

    public void setPa01bi02(String pa01bi02) {
        this.pa01bi02 = pa01bi02 == null ? null : pa01bi02.trim();
    }

    public String getPa01bd02() {
        return pa01bd02;
    }

    public void setPa01bd02(String pa01bd02) {
        this.pa01bd02 = pa01bd02 == null ? null : pa01bd02.trim();
    }
}