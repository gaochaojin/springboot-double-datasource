package com.gaochaojin.entity.oracle;

import javax.persistence.Column;

/**
 * null
 *
 * @author null
 * @date   2019-07-03
 */
public class Icrp2Pc05a {
    /**
     * null
     */
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "PC05AR01")
    private String pc05ar01;

    /**
     * null
     */
    @Column(name = "PC05AD01")
    private String pc05ad01;

    /**
     * null
     */
    @Column(name = "PC05AI01")
    private String pc05ai01;

    /**
     * null
     */
    @Column(name = "PC05AQ01")
    private String pc05aq01;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getPc05ar01() {
        return pc05ar01;
    }

    public void setPc05ar01(String pc05ar01) {
        this.pc05ar01 = pc05ar01 == null ? null : pc05ar01.trim();
    }

    public String getPc05ad01() {
        return pc05ad01;
    }

    public void setPc05ad01(String pc05ad01) {
        this.pc05ad01 = pc05ad01 == null ? null : pc05ad01.trim();
    }

    public String getPc05ai01() {
        return pc05ai01;
    }

    public void setPc05ai01(String pc05ai01) {
        this.pc05ai01 = pc05ai01 == null ? null : pc05ai01.trim();
    }

    public String getPc05aq01() {
        return pc05aq01;
    }

    public void setPc05aq01(String pc05aq01) {
        this.pc05aq01 = pc05aq01 == null ? null : pc05aq01.trim();
    }
}