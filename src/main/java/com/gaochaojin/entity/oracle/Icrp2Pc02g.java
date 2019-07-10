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
@Table(name = "ICRP2_PC02G")
public class Icrp2Pc02g {
    /**
     * null
     */
    @Id
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "PC02GS01")
    private String pc02gs01;

    /**
     * null
     */
    @Column(name = "PC02GS02")
    private String pc02gs02;

    /**
     * null
     */
    @Column(name = "PC02GJ01")
    private String pc02gj01;

    /**
     * null
     */
    @Column(name = "PC02GJ02")
    private String pc02gj02;

    /**
     * null
     */
    @Column(name = "PC02GJ03")
    private String pc02gj03;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getPc02gs01() {
        return pc02gs01;
    }

    public void setPc02gs01(String pc02gs01) {
        this.pc02gs01 = pc02gs01 == null ? null : pc02gs01.trim();
    }

    public String getPc02gs02() {
        return pc02gs02;
    }

    public void setPc02gs02(String pc02gs02) {
        this.pc02gs02 = pc02gs02 == null ? null : pc02gs02.trim();
    }

    public String getPc02gj01() {
        return pc02gj01;
    }

    public void setPc02gj01(String pc02gj01) {
        this.pc02gj01 = pc02gj01 == null ? null : pc02gj01.trim();
    }

    public String getPc02gj02() {
        return pc02gj02;
    }

    public void setPc02gj02(String pc02gj02) {
        this.pc02gj02 = pc02gj02 == null ? null : pc02gj02.trim();
    }

    public String getPc02gj03() {
        return pc02gj03;
    }

    public void setPc02gj03(String pc02gj03) {
        this.pc02gj03 = pc02gj03 == null ? null : pc02gj03.trim();
    }
}