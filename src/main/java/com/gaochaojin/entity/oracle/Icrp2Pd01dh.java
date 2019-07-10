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
@Table(name = "ICRP2_PD01DH")
public class Icrp2Pd01dh {

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
    @Column(name = "PD01DR03")
    private String pd01dr03;

    /**
     * null
     */
    @Column(name = "PD01DD01")
    private String pd01dd01;

    public String getPd01dr03() {
        return pd01dr03;
    }

    public void setPd01dr03(String pd01dr03) {
        this.pd01dr03 = pd01dr03 == null ? null : pd01dr03.trim();
    }

    public String getPd01dd01() {
        return pd01dd01;
    }

    public void setPd01dd01(String pd01dd01) {
        this.pd01dd01 = pd01dd01 == null ? null : pd01dd01.trim();
    }
}