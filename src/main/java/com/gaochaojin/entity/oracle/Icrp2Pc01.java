package com.gaochaojin.entity.oracle;

import javax.persistence.Column;

/**
 * null
 *
 * @author null
 * @date   2019-07-03
 */
public class Icrp2Pc01 {
    /**
     * null
     */
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "PC010Q01")
    private String pc010q01;

    /**
     * null
     */
    @Column(name = "PC010Q02")
    private String pc010q02;

    /**
     * null
     */
    @Column(name = "PC010S01")
    private String pc010s01;

    /**
     * null
     */
    @Column(name = "PC010D01")
    private String pc010d01;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getPc010q01() {
        return pc010q01;
    }

    public void setPc010q01(String pc010q01) {
        this.pc010q01 = pc010q01 == null ? null : pc010q01.trim();
    }

    public String getPc010q02() {
        return pc010q02;
    }

    public void setPc010q02(String pc010q02) {
        this.pc010q02 = pc010q02 == null ? null : pc010q02.trim();
    }

    public String getPc010s01() {
        return pc010s01;
    }

    public void setPc010s01(String pc010s01) {
        this.pc010s01 = pc010s01 == null ? null : pc010s01.trim();
    }

    public String getPc010d01() {
        return pc010d01;
    }

    public void setPc010d01(String pc010d01) {
        this.pc010d01 = pc010d01 == null ? null : pc010d01.trim();
    }
}