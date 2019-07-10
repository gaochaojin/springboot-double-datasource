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
@Table(name = "ICRP2_PC02AH")
public class Icrp2Pc02ah{

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
    @Column(name = "PC02AD01")
    private String pc02ad01;

    /**
     * null
     */
    @Column(name = "PC02AD02")
    private String pc02ad02;

    /**
     * null
     */
    @Column(name = "PC02AS03")
    private String pc02as03;

    /**
     * null
     */
    @Column(name = "PC02AR01")
    private String pc02ar01;

    public String getPc02ad01() {
        return pc02ad01;
    }

    public void setPc02ad01(String pc02ad01) {
        this.pc02ad01 = pc02ad01 == null ? null : pc02ad01.trim();
    }

    public String getPc02ad02() {
        return pc02ad02;
    }

    public void setPc02ad02(String pc02ad02) {
        this.pc02ad02 = pc02ad02 == null ? null : pc02ad02.trim();
    }

    public String getPc02as03() {
        return pc02as03;
    }

    public void setPc02as03(String pc02as03) {
        this.pc02as03 = pc02as03 == null ? null : pc02as03.trim();
    }

    public String getPc02ar01() {
        return pc02ar01;
    }

    public void setPc02ar01(String pc02ar01) {
        this.pc02ar01 = pc02ar01 == null ? null : pc02ar01.trim();
    }
}