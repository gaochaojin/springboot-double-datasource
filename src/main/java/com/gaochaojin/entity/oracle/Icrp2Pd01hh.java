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
@Table(name = "ICRP2_PD01HH")
public class Icrp2Pd01hh  {
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
    @Column(name = "PD01HJ01")
    private String pd01hj01;

    /**
     * null
     */
    @Column(name = "PD01HR01")
    private String pd01hr01;

    /**
     * null
     */
    @Column(name = "PD01HR02")
    private String pd01hr02;

    /**
     * null
     */
    @Column(name = "PD01HJ02")
    private String pd01hj02;

    public String getPd01hj01() {
        return pd01hj01;
    }

    public void setPd01hj01(String pd01hj01) {
        this.pd01hj01 = pd01hj01 == null ? null : pd01hj01.trim();
    }

    public String getPd01hr01() {
        return pd01hr01;
    }

    public void setPd01hr01(String pd01hr01) {
        this.pd01hr01 = pd01hr01 == null ? null : pd01hr01.trim();
    }

    public String getPd01hr02() {
        return pd01hr02;
    }

    public void setPd01hr02(String pd01hr02) {
        this.pd01hr02 = pd01hr02 == null ? null : pd01hr02.trim();
    }

    public String getPd01hj02() {
        return pd01hj02;
    }

    public void setPd01hj02(String pd01hj02) {
        this.pd01hj02 = pd01hj02 == null ? null : pd01hj02.trim();
    }
}