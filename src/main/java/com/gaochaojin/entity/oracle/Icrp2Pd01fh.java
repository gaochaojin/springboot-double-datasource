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
@Table(name = "ICRP2_PD01FH")
public class Icrp2Pd01fh {
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

    /**
     * null
     */
    @Column(name = "ITEMNO2")
    private String itemno2;

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

    public String getItemno2() {
        return itemno2;
    }

    public void setItemno2(String itemno2) {
        this.itemno2 = itemno2 == null ? null : itemno2.trim();
    }

    /**
     * null
     */
    @Column(name = "PD01FD01")
    private String pd01fd01;

    /**
     * null
     */
    @Column(name = "PD01FR01")
    private String pd01fr01;

    /**
     * null
     */
    @Column(name = "PD01FS02")
    private String pd01fs02;

    /**
     * null
     */
    @Column(name = "PD01FJ01")
    private String pd01fj01;

    /**
     * null
     */
    @Column(name = "PD01FQ01")
    private String pd01fq01;

    public String getPd01fd01() {
        return pd01fd01;
    }

    public void setPd01fd01(String pd01fd01) {
        this.pd01fd01 = pd01fd01 == null ? null : pd01fd01.trim();
    }

    public String getPd01fr01() {
        return pd01fr01;
    }

    public void setPd01fr01(String pd01fr01) {
        this.pd01fr01 = pd01fr01 == null ? null : pd01fr01.trim();
    }

    public String getPd01fs02() {
        return pd01fs02;
    }

    public void setPd01fs02(String pd01fs02) {
        this.pd01fs02 = pd01fs02 == null ? null : pd01fs02.trim();
    }

    public String getPd01fj01() {
        return pd01fj01;
    }

    public void setPd01fj01(String pd01fj01) {
        this.pd01fj01 = pd01fj01 == null ? null : pd01fj01.trim();
    }

    public String getPd01fq01() {
        return pd01fq01;
    }

    public void setPd01fq01(String pd01fq01) {
        this.pd01fq01 = pd01fq01 == null ? null : pd01fq01.trim();
    }
}