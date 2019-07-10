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
@Table(name = "ICRP2_PD01B")
public class Icrp2Pd01b {

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
    @Column(name = "PD01BD01")
    private String pd01bd01;

    /**
     * null
     */
    @Column(name = "PD01BR01")
    private String pd01br01;

    /**
     * null
     */
    @Column(name = "PD01BR04")
    private String pd01br04;

    /**
     * null
     */
    @Column(name = "PD01BJ01")
    private String pd01bj01;

    /**
     * null
     */
    @Column(name = "PD01BR02")
    private String pd01br02;

    /**
     * null
     */
    @Column(name = "PD01BJ02")
    private String pd01bj02;

    /**
     * null
     */
    @Column(name = "PD01BD03")
    private String pd01bd03;

    /**
     * null
     */
    @Column(name = "PD01BD04")
    private String pd01bd04;

    /**
     * null
     */
    @Column(name = "PD01BR03")
    private String pd01br03;

    public String getPd01bd01() {
        return pd01bd01;
    }

    public void setPd01bd01(String pd01bd01) {
        this.pd01bd01 = pd01bd01 == null ? null : pd01bd01.trim();
    }

    public String getPd01br01() {
        return pd01br01;
    }

    public void setPd01br01(String pd01br01) {
        this.pd01br01 = pd01br01 == null ? null : pd01br01.trim();
    }

    public String getPd01br04() {
        return pd01br04;
    }

    public void setPd01br04(String pd01br04) {
        this.pd01br04 = pd01br04 == null ? null : pd01br04.trim();
    }

    public String getPd01bj01() {
        return pd01bj01;
    }

    public void setPd01bj01(String pd01bj01) {
        this.pd01bj01 = pd01bj01 == null ? null : pd01bj01.trim();
    }

    public String getPd01br02() {
        return pd01br02;
    }

    public void setPd01br02(String pd01br02) {
        this.pd01br02 = pd01br02 == null ? null : pd01br02.trim();
    }

    public String getPd01bj02() {
        return pd01bj02;
    }

    public void setPd01bj02(String pd01bj02) {
        this.pd01bj02 = pd01bj02 == null ? null : pd01bj02.trim();
    }

    public String getPd01bd03() {
        return pd01bd03;
    }

    public void setPd01bd03(String pd01bd03) {
        this.pd01bd03 = pd01bd03 == null ? null : pd01bd03.trim();
    }

    public String getPd01bd04() {
        return pd01bd04;
    }

    public void setPd01bd04(String pd01bd04) {
        this.pd01bd04 = pd01bd04 == null ? null : pd01bd04.trim();
    }

    public String getPd01br03() {
        return pd01br03;
    }

    public void setPd01br03(String pd01br03) {
        this.pd01br03 = pd01br03 == null ? null : pd01br03.trim();
    }
}