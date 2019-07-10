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
@Table(name = "ICRP2_PC02E")
public class Icrp2Pc02e {
    /**
     * null
     */
    @Id
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "PC02ES01")
    private String pc02es01;

    /**
     * null
     */
    @Column(name = "PC02ES02")
    private String pc02es02;

    /**
     * null
     */
    @Column(name = "PC02EJ01")
    private String pc02ej01;

    /**
     * null
     */
    @Column(name = "PC02EJ02")
    private String pc02ej02;

    /**
     * null
     */
    @Column(name = "PC02EJ03")
    private String pc02ej03;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getPc02es01() {
        return pc02es01;
    }

    public void setPc02es01(String pc02es01) {
        this.pc02es01 = pc02es01 == null ? null : pc02es01.trim();
    }

    public String getPc02es02() {
        return pc02es02;
    }

    public void setPc02es02(String pc02es02) {
        this.pc02es02 = pc02es02 == null ? null : pc02es02.trim();
    }

    public String getPc02ej01() {
        return pc02ej01;
    }

    public void setPc02ej01(String pc02ej01) {
        this.pc02ej01 = pc02ej01 == null ? null : pc02ej01.trim();
    }

    public String getPc02ej02() {
        return pc02ej02;
    }

    public void setPc02ej02(String pc02ej02) {
        this.pc02ej02 = pc02ej02 == null ? null : pc02ej02.trim();
    }

    public String getPc02ej03() {
        return pc02ej03;
    }

    public void setPc02ej03(String pc02ej03) {
        this.pc02ej03 = pc02ej03 == null ? null : pc02ej03.trim();
    }
}