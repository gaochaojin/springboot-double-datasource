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
@Table(name = "ICRP2_PC02KH")
public class Icrp2Pc02kh{

    /**
     * null
     */
    @Id
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "ITEMNO")
    private String itemno;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno == null ? null : itemno.trim();
    }
    /**
     * null
     */
    @Column(name = "PC02KD01")
    private String pc02kd01;

    /**
     * null
     */
    @Column(name = "PC02KD02")
    private String pc02kd02;

    /**
     * null
     */
    @Column(name = "PC02KS02")
    private String pc02ks02;

    /**
     * null
     */
    @Column(name = "PC02KJ01")
    private String pc02kj01;

    /**
     * null
     */
    @Column(name = "PC02KJ02")
    private String pc02kj02;

    public String getPc02kd01() {
        return pc02kd01;
    }

    public void setPc02kd01(String pc02kd01) {
        this.pc02kd01 = pc02kd01 == null ? null : pc02kd01.trim();
    }

    public String getPc02kd02() {
        return pc02kd02;
    }

    public void setPc02kd02(String pc02kd02) {
        this.pc02kd02 = pc02kd02 == null ? null : pc02kd02.trim();
    }

    public String getPc02ks02() {
        return pc02ks02;
    }

    public void setPc02ks02(String pc02ks02) {
        this.pc02ks02 = pc02ks02 == null ? null : pc02ks02.trim();
    }

    public String getPc02kj01() {
        return pc02kj01;
    }

    public void setPc02kj01(String pc02kj01) {
        this.pc02kj01 = pc02kj01 == null ? null : pc02kj01.trim();
    }

    public String getPc02kj02() {
        return pc02kj02;
    }

    public void setPc02kj02(String pc02kj02) {
        this.pc02kj02 = pc02kj02 == null ? null : pc02kj02.trim();
    }
}