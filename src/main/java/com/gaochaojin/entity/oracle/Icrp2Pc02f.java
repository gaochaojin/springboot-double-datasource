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
@Table(name = "ICRP2_PC02F")
public class Icrp2Pc02f {
    /**
     * null
     */
    @Id
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "PC02FS01")
    private String pc02fs01;

    /**
     * null
     */
    @Column(name = "PC02FS02")
    private String pc02fs02;

    /**
     * null
     */
    @Column(name = "PC02FJ01")
    private String pc02fj01;

    /**
     * null
     */
    @Column(name = "PC02FJ02")
    private String pc02fj02;

    /**
     * null
     */
    @Column(name = "PC02FJ03")
    private String pc02fj03;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getPc02fs01() {
        return pc02fs01;
    }

    public void setPc02fs01(String pc02fs01) {
        this.pc02fs01 = pc02fs01 == null ? null : pc02fs01.trim();
    }

    public String getPc02fs02() {
        return pc02fs02;
    }

    public void setPc02fs02(String pc02fs02) {
        this.pc02fs02 = pc02fs02 == null ? null : pc02fs02.trim();
    }

    public String getPc02fj01() {
        return pc02fj01;
    }

    public void setPc02fj01(String pc02fj01) {
        this.pc02fj01 = pc02fj01 == null ? null : pc02fj01.trim();
    }

    public String getPc02fj02() {
        return pc02fj02;
    }

    public void setPc02fj02(String pc02fj02) {
        this.pc02fj02 = pc02fj02 == null ? null : pc02fj02.trim();
    }

    public String getPc02fj03() {
        return pc02fj03;
    }

    public void setPc02fj03(String pc02fj03) {
        this.pc02fj03 = pc02fj03 == null ? null : pc02fj03.trim();
    }
}