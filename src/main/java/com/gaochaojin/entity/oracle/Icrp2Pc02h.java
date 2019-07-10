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
@Table(name = "ICRP2_PC02H")
public class Icrp2Pc02h {
    /**
     * null
     */
    @Id
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "PC02HS01")
    private String pc02hs01;

    /**
     * null
     */
    @Column(name = "PC02HS02")
    private String pc02hs02;

    /**
     * null
     */
    @Column(name = "PC02HJ01")
    private String pc02hj01;

    /**
     * null
     */
    @Column(name = "PC02HJ02")
    private String pc02hj02;

    /**
     * null
     */
    @Column(name = "PC02HJ03")
    private String pc02hj03;

    /**
     * null
     */
    @Column(name = "PC02HJ04")
    private String pc02hj04;

    /**
     * null
     */
    @Column(name = "PC02HJ05")
    private String pc02hj05;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getPc02hs01() {
        return pc02hs01;
    }

    public void setPc02hs01(String pc02hs01) {
        this.pc02hs01 = pc02hs01 == null ? null : pc02hs01.trim();
    }

    public String getPc02hs02() {
        return pc02hs02;
    }

    public void setPc02hs02(String pc02hs02) {
        this.pc02hs02 = pc02hs02 == null ? null : pc02hs02.trim();
    }

    public String getPc02hj01() {
        return pc02hj01;
    }

    public void setPc02hj01(String pc02hj01) {
        this.pc02hj01 = pc02hj01 == null ? null : pc02hj01.trim();
    }

    public String getPc02hj02() {
        return pc02hj02;
    }

    public void setPc02hj02(String pc02hj02) {
        this.pc02hj02 = pc02hj02 == null ? null : pc02hj02.trim();
    }

    public String getPc02hj03() {
        return pc02hj03;
    }

    public void setPc02hj03(String pc02hj03) {
        this.pc02hj03 = pc02hj03 == null ? null : pc02hj03.trim();
    }

    public String getPc02hj04() {
        return pc02hj04;
    }

    public void setPc02hj04(String pc02hj04) {
        this.pc02hj04 = pc02hj04 == null ? null : pc02hj04.trim();
    }

    public String getPc02hj05() {
        return pc02hj05;
    }

    public void setPc02hj05(String pc02hj05) {
        this.pc02hj05 = pc02hj05 == null ? null : pc02hj05.trim();
    }
}