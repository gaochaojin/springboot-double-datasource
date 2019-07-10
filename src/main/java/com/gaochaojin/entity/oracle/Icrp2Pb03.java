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
@Table(name = "ICRP2_PB03")
public class Icrp2Pb03 {

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
    @Column(name = "PB030D01")
    private String pb030d01;

    /**
     * null
     */
    @Column(name = "PB030Q01")
    private String pb030q01;

    /**
     * null
     */
    @Column(name = "PB030Q02")
    private String pb030q02;

    /**
     * null
     */
    @Column(name = "PB030R01")
    private String pb030r01;

    public String getPb030d01() {
        return pb030d01;
    }

    public void setPb030d01(String pb030d01) {
        this.pb030d01 = pb030d01 == null ? null : pb030d01.trim();
    }

    public String getPb030q01() {
        return pb030q01;
    }

    public void setPb030q01(String pb030q01) {
        this.pb030q01 = pb030q01 == null ? null : pb030q01.trim();
    }

    public String getPb030q02() {
        return pb030q02;
    }

    public void setPb030q02(String pb030q02) {
        this.pb030q02 = pb030q02 == null ? null : pb030q02.trim();
    }

    public String getPb030r01() {
        return pb030r01;
    }

    public void setPb030r01(String pb030r01) {
        this.pb030r01 = pb030r01 == null ? null : pb030r01.trim();
    }
}