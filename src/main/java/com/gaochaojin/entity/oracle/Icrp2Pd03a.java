package com.gaochaojin.entity.oracle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * null
 *
 * @author null
 * @date 2019-07-03
 */
@Entity
@Table(name = "ICRP2_PD03A")
public class Icrp2Pd03a {
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
    @Column(name = "PD03AD08")
    private String pd03ad08;

    /**
     * null
     */
    @Column(name = "PD03AD01")
    private String pd03ad01;

    /**
     * null
     */
    @Column(name = "PD03AQ01")
    private String pd03aq01;

    /**
     * null
     */
    @Column(name = "PD03AD02")
    private String pd03ad02;

    /**
     * null
     */
    @Column(name = "PD03AR01")
    private String pd03ar01;

    /**
     * null
     */
    @Column(name = "PD03AR02")
    private String pd03ar02;

    /**
     * null
     */
    @Column(name = "PD03AD03")
    private String pd03ad03;

    /**
     * null
     */
    @Column(name = "PD03AQ02")
    private String pd03aq02;

    /**
     * null
     */
    @Column(name = "PD03AJ01")
    private String pd03aj01;

    /**
     * null
     */
    @Column(name = "PD03AD04")
    private String pd03ad04;

    /**
     * null
     */
    @Column(name = "PD03AJ02")
    private String pd03aj02;

    /**
     * null
     */
    @Column(name = "PD03AD05")
    private String pd03ad05;

    /**
     * null
     */
    @Column(name = "PD03AD06")
    private String pd03ad06;

    /**
     * null
     */
    @Column(name = "PD03AD07")
    private String pd03ad07;

    /**
     * null
     */
    @Column(name = "PD03AS01")
    private String pd03as01;

    /**
     * null
     */
    @Column(name = "PD03AR03")
    private String pd03ar03;

    public String getPd03ad08() {
        return pd03ad08;
    }

    public void setPd03ad08(String pd03ad08) {
        this.pd03ad08 = pd03ad08 == null ? null : pd03ad08.trim();
    }

    public String getPd03ad01() {
        return pd03ad01;
    }

    public void setPd03ad01(String pd03ad01) {
        this.pd03ad01 = pd03ad01 == null ? null : pd03ad01.trim();
    }

    public String getPd03aq01() {
        return pd03aq01;
    }

    public void setPd03aq01(String pd03aq01) {
        this.pd03aq01 = pd03aq01 == null ? null : pd03aq01.trim();
    }

    public String getPd03ad02() {
        return pd03ad02;
    }

    public void setPd03ad02(String pd03ad02) {
        this.pd03ad02 = pd03ad02 == null ? null : pd03ad02.trim();
    }

    public String getPd03ar01() {
        return pd03ar01;
    }

    public void setPd03ar01(String pd03ar01) {
        this.pd03ar01 = pd03ar01 == null ? null : pd03ar01.trim();
    }

    public String getPd03ar02() {
        return pd03ar02;
    }

    public void setPd03ar02(String pd03ar02) {
        this.pd03ar02 = pd03ar02 == null ? null : pd03ar02.trim();
    }

    public String getPd03ad03() {
        return pd03ad03;
    }

    public void setPd03ad03(String pd03ad03) {
        this.pd03ad03 = pd03ad03 == null ? null : pd03ad03.trim();
    }

    public String getPd03aq02() {
        return pd03aq02;
    }

    public void setPd03aq02(String pd03aq02) {
        this.pd03aq02 = pd03aq02 == null ? null : pd03aq02.trim();
    }

    public String getPd03aj01() {
        return pd03aj01;
    }

    public void setPd03aj01(String pd03aj01) {
        this.pd03aj01 = pd03aj01 == null ? null : pd03aj01.trim();
    }

    public String getPd03ad04() {
        return pd03ad04;
    }

    public void setPd03ad04(String pd03ad04) {
        this.pd03ad04 = pd03ad04 == null ? null : pd03ad04.trim();
    }

    public String getPd03aj02() {
        return pd03aj02;
    }

    public void setPd03aj02(String pd03aj02) {
        this.pd03aj02 = pd03aj02 == null ? null : pd03aj02.trim();
    }

    public String getPd03ad05() {
        return pd03ad05;
    }

    public void setPd03ad05(String pd03ad05) {
        this.pd03ad05 = pd03ad05 == null ? null : pd03ad05.trim();
    }

    public String getPd03ad06() {
        return pd03ad06;
    }

    public void setPd03ad06(String pd03ad06) {
        this.pd03ad06 = pd03ad06 == null ? null : pd03ad06.trim();
    }

    public String getPd03ad07() {
        return pd03ad07;
    }

    public void setPd03ad07(String pd03ad07) {
        this.pd03ad07 = pd03ad07 == null ? null : pd03ad07.trim();
    }

    public String getPd03as01() {
        return pd03as01;
    }

    public void setPd03as01(String pd03as01) {
        this.pd03as01 = pd03as01 == null ? null : pd03as01.trim();
    }

    public String getPd03ar03() {
        return pd03ar03;
    }

    public void setPd03ar03(String pd03ar03) {
        this.pd03ar03 = pd03ar03 == null ? null : pd03ar03.trim();
    }
}