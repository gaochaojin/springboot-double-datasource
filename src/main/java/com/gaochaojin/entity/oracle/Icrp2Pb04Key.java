package com.gaochaojin.entity.oracle;

import javax.persistence.Column;

/**
 * null
 *
 * @author null
 * @date   2019-07-03
 */
public class Icrp2Pb04Key {
    /**
     * null
     */
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
}