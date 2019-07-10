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
@Table(name = "ICRP2_PD02A")
public class Icrp2Pd02a {

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
    @Column(name = "PD02AI01")
    private String pd02ai01;

    /**
     * null
     */
    @Column(name = "PD02AD01")
    private String pd02ad01;

    /**
     * null
     */
    @Column(name = "PD02AI02")
    private String pd02ai02;

    /**
     * null
     */
    @Column(name = "PD02AI03")
    private String pd02ai03;

    /**
     * null
     */
    @Column(name = "PD02AD02")
    private String pd02ad02;

    /**
     * null
     */
    @Column(name = "PD02AJ01")
    private String pd02aj01;

    /**
     * null
     */
    @Column(name = "PD02AD03")
    private String pd02ad03;

    /**
     * null
     */
    @Column(name = "PD02AR01")
    private String pd02ar01;

    /**
     * null
     */
    @Column(name = "PD02AR02")
    private String pd02ar02;

    /**
     * null
     */
    @Column(name = "PD02AD04")
    private String pd02ad04;

    /**
     * null
     */
    @Column(name = "PD02AJ04")
    private String pd02aj04;

    /**
     * null
     */
    @Column(name = "PD02AJ03")
    private String pd02aj03;

    /**
     * null
     */
    @Column(name = "PD02AI04")
    private String pd02ai04;

    public String getPd02ai01() {
        return pd02ai01;
    }

    public void setPd02ai01(String pd02ai01) {
        this.pd02ai01 = pd02ai01 == null ? null : pd02ai01.trim();
    }

    public String getPd02ad01() {
        return pd02ad01;
    }

    public void setPd02ad01(String pd02ad01) {
        this.pd02ad01 = pd02ad01 == null ? null : pd02ad01.trim();
    }

    public String getPd02ai02() {
        return pd02ai02;
    }

    public void setPd02ai02(String pd02ai02) {
        this.pd02ai02 = pd02ai02 == null ? null : pd02ai02.trim();
    }

    public String getPd02ai03() {
        return pd02ai03;
    }

    public void setPd02ai03(String pd02ai03) {
        this.pd02ai03 = pd02ai03 == null ? null : pd02ai03.trim();
    }

    public String getPd02ad02() {
        return pd02ad02;
    }

    public void setPd02ad02(String pd02ad02) {
        this.pd02ad02 = pd02ad02 == null ? null : pd02ad02.trim();
    }

    public String getPd02aj01() {
        return pd02aj01;
    }

    public void setPd02aj01(String pd02aj01) {
        this.pd02aj01 = pd02aj01 == null ? null : pd02aj01.trim();
    }

    public String getPd02ad03() {
        return pd02ad03;
    }

    public void setPd02ad03(String pd02ad03) {
        this.pd02ad03 = pd02ad03 == null ? null : pd02ad03.trim();
    }

    public String getPd02ar01() {
        return pd02ar01;
    }

    public void setPd02ar01(String pd02ar01) {
        this.pd02ar01 = pd02ar01 == null ? null : pd02ar01.trim();
    }

    public String getPd02ar02() {
        return pd02ar02;
    }

    public void setPd02ar02(String pd02ar02) {
        this.pd02ar02 = pd02ar02 == null ? null : pd02ar02.trim();
    }

    public String getPd02ad04() {
        return pd02ad04;
    }

    public void setPd02ad04(String pd02ad04) {
        this.pd02ad04 = pd02ad04 == null ? null : pd02ad04.trim();
    }

    public String getPd02aj04() {
        return pd02aj04;
    }

    public void setPd02aj04(String pd02aj04) {
        this.pd02aj04 = pd02aj04 == null ? null : pd02aj04.trim();
    }

    public String getPd02aj03() {
        return pd02aj03;
    }

    public void setPd02aj03(String pd02aj03) {
        this.pd02aj03 = pd02aj03 == null ? null : pd02aj03.trim();
    }

    public String getPd02ai04() {
        return pd02ai04;
    }

    public void setPd02ai04(String pd02ai04) {
        this.pd02ai04 = pd02ai04 == null ? null : pd02ai04.trim();
    }
}