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
@Table(name = "ICRP2_PD01D")
public class Icrp2Pd01d{

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
    @Column(name = "PD01DR01")
    private String pd01dr01;

    /**
     * null
     */
    @Column(name = "PD01DR02")
    private String pd01dr02;

    public String getPd01dr01() {
        return pd01dr01;
    }

    public void setPd01dr01(String pd01dr01) {
        this.pd01dr01 = pd01dr01 == null ? null : pd01dr01.trim();
    }

    public String getPd01dr02() {
        return pd01dr02;
    }

    public void setPd01dr02(String pd01dr02) {
        this.pd01dr02 = pd01dr02 == null ? null : pd01dr02.trim();
    }
}