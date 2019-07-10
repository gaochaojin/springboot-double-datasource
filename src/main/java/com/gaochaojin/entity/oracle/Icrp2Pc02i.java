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
@Table(name = "ICRP2_PC02I")
public class Icrp2Pc02i {
    /**
     * null
     */
    @Id
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "PC02IS01")
    private String pc02is01;

    /**
     * null
     */
    @Column(name = "PC02IS02")
    private String pc02is02;

    /**
     * null
     */
    @Column(name = "PC02IJ01")
    private String pc02ij01;

    /**
     * null
     */
    @Column(name = "PC02IJ02")
    private String pc02ij02;

    /**
     * null
     */
    @Column(name = "PC02IJ03")
    private String pc02ij03;

    /**
     * null
     */
    @Column(name = "PC02IJ04")
    private String pc02ij04;

    /**
     * null
     */
    @Column(name = "PC02IJ05")
    private String pc02ij05;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getPc02is01() {
        return pc02is01;
    }

    public void setPc02is01(String pc02is01) {
        this.pc02is01 = pc02is01 == null ? null : pc02is01.trim();
    }

    public String getPc02is02() {
        return pc02is02;
    }

    public void setPc02is02(String pc02is02) {
        this.pc02is02 = pc02is02 == null ? null : pc02is02.trim();
    }

    public String getPc02ij01() {
        return pc02ij01;
    }

    public void setPc02ij01(String pc02ij01) {
        this.pc02ij01 = pc02ij01 == null ? null : pc02ij01.trim();
    }

    public String getPc02ij02() {
        return pc02ij02;
    }

    public void setPc02ij02(String pc02ij02) {
        this.pc02ij02 = pc02ij02 == null ? null : pc02ij02.trim();
    }

    public String getPc02ij03() {
        return pc02ij03;
    }

    public void setPc02ij03(String pc02ij03) {
        this.pc02ij03 = pc02ij03 == null ? null : pc02ij03.trim();
    }

    public String getPc02ij04() {
        return pc02ij04;
    }

    public void setPc02ij04(String pc02ij04) {
        this.pc02ij04 = pc02ij04 == null ? null : pc02ij04.trim();
    }

    public String getPc02ij05() {
        return pc02ij05;
    }

    public void setPc02ij05(String pc02ij05) {
        this.pc02ij05 = pc02ij05 == null ? null : pc02ij05.trim();
    }
}