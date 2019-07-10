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
@Table(name = "ICRP2_PD01EH")
public class Icrp2Pd01eh {

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
    @Column(name = "PD01ER03")
    private String pd01er03;

    /**
     * null
     */
    @Column(name = "PD01ED01")
    private String pd01ed01;

    /**
     * null
     */
    @Column(name = "PD01EJ01")
    private String pd01ej01;

    public String getPd01er03() {
        return pd01er03;
    }

    public void setPd01er03(String pd01er03) {
        this.pd01er03 = pd01er03 == null ? null : pd01er03.trim();
    }

    public String getPd01ed01() {
        return pd01ed01;
    }

    public void setPd01ed01(String pd01ed01) {
        this.pd01ed01 = pd01ed01 == null ? null : pd01ed01.trim();
    }

    public String getPd01ej01() {
        return pd01ej01;
    }

    public void setPd01ej01(String pd01ej01) {
        this.pd01ej01 = pd01ej01 == null ? null : pd01ej01.trim();
    }
}