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
@Table(name = "ICRP2_PC02DH")
public class Icrp2Pc02dh  {

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
    @Column(name = "PC02DD01")
    private String pc02dd01;

    /**
     * null
     */
    @Column(name = "PC02DS02")
    private String pc02ds02;

    /**
     * null
     */
    @Column(name = "PC02DS03")
    private String pc02ds03;

    /**
     * null
     */
    @Column(name = "PC02DJ01")
    private String pc02dj01;

    /**
     * null
     */
    @Column(name = "PC02DS04")
    private String pc02ds04;

    public String getPc02dd01() {
        return pc02dd01;
    }

    public void setPc02dd01(String pc02dd01) {
        this.pc02dd01 = pc02dd01 == null ? null : pc02dd01.trim();
    }

    public String getPc02ds02() {
        return pc02ds02;
    }

    public void setPc02ds02(String pc02ds02) {
        this.pc02ds02 = pc02ds02 == null ? null : pc02ds02.trim();
    }

    public String getPc02ds03() {
        return pc02ds03;
    }

    public void setPc02ds03(String pc02ds03) {
        this.pc02ds03 = pc02ds03 == null ? null : pc02ds03.trim();
    }

    public String getPc02dj01() {
        return pc02dj01;
    }

    public void setPc02dj01(String pc02dj01) {
        this.pc02dj01 = pc02dj01 == null ? null : pc02dj01.trim();
    }

    public String getPc02ds04() {
        return pc02ds04;
    }

    public void setPc02ds04(String pc02ds04) {
        this.pc02ds04 = pc02ds04 == null ? null : pc02ds04.trim();
    }
}