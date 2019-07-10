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
@Table(name = "ICRP2_PD01E")
public class Icrp2Pd01e {

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
    @Column(name = "PD01ER01")
    private String pd01er01;

    /**
     * null
     */
    @Column(name = "PD01ER02")
    private String pd01er02;

    /**
     * null
     */
    @Column(name = "PD01ES01")
    private String pd01es01;

    public String getPd01er01() {
        return pd01er01;
    }

    public void setPd01er01(String pd01er01) {
        this.pd01er01 = pd01er01 == null ? null : pd01er01.trim();
    }

    public String getPd01er02() {
        return pd01er02;
    }

    public void setPd01er02(String pd01er02) {
        this.pd01er02 = pd01er02 == null ? null : pd01er02.trim();
    }

    public String getPd01es01() {
        return pd01es01;
    }

    public void setPd01es01(String pd01es01) {
        this.pd01es01 = pd01es01 == null ? null : pd01es01.trim();
    }
}