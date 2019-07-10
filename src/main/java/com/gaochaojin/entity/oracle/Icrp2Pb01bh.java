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
@Table(name = "ICRP2_PB01BH")
public class Icrp2Pb01bh {

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
    @Column(name = "PB01BQ01")
    private String pb01bq01;

    /**
     * null
     */
    @Column(name = "PB01BR01")
    private String pb01br01;

    public String getPb01bq01() {
        return pb01bq01;
    }

    public void setPb01bq01(String pb01bq01) {
        this.pb01bq01 = pb01bq01 == null ? null : pb01bq01.trim();
    }

    public String getPb01br01() {
        return pb01br01;
    }

    public void setPb01br01(String pb01br01) {
        this.pb01br01 = pb01br01 == null ? null : pb01br01.trim();
    }
}