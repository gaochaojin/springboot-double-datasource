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
@Table(name = "ICRP2_PD01A")
public class Icrp2Pd01a{

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
    @Column(name = "PD01AI01")
    private String pd01ai01;

    /**
     * null
     */
    @Column(name = "PD01AD01")
    private String pd01ad01;

    /**
     * null
     */
    @Column(name = "PD01AD02")
    private String pd01ad02;

    /**
     * null
     */
    @Column(name = "PD01AI02")
    private String pd01ai02;

    /**
     * null
     */
    @Column(name = "PD01AI03")
    private String pd01ai03;

    /**
     * null
     */
    @Column(name = "PD01AI04")
    private String pd01ai04;

    /**
     * null
     */
    @Column(name = "PD01AD03")
    private String pd01ad03;

    /**
     * null
     */
    @Column(name = "PD01AR01")
    private String pd01ar01;

    /**
     * null
     */
    @Column(name = "PD01AD04")
    private String pd01ad04;

    /**
     * null
     */
    @Column(name = "PD01AJ01")
    private String pd01aj01;

    /**
     * null
     */
    @Column(name = "PD01AJ02")
    private String pd01aj02;

    /**
     * null
     */
    @Column(name = "PD01AJ03")
    private String pd01aj03;

    /**
     * null
     */
    @Column(name = "PD01AR02")
    private String pd01ar02;

    /**
     * null
     */
    @Column(name = "PD01AD05")
    private String pd01ad05;

    /**
     * null
     */
    @Column(name = "PD01AD06")
    private String pd01ad06;

    /**
     * null
     */
    @Column(name = "PD01AS01")
    private String pd01as01;

    /**
     * null
     */
    @Column(name = "PD01AD07")
    private String pd01ad07;

    /**
     * null
     */
    @Column(name = "PD01AD08")
    private String pd01ad08;

    /**
     * null
     */
    @Column(name = "PD01AD09")
    private String pd01ad09;

    /**
     * null
     */
    @Column(name = "PD01AD010")
    private String pd01ad010;

    public String getPd01ai01() {
        return pd01ai01;
    }

    public void setPd01ai01(String pd01ai01) {
        this.pd01ai01 = pd01ai01 == null ? null : pd01ai01.trim();
    }

    public String getPd01ad01() {
        return pd01ad01;
    }

    public void setPd01ad01(String pd01ad01) {
        this.pd01ad01 = pd01ad01 == null ? null : pd01ad01.trim();
    }

    public String getPd01ad02() {
        return pd01ad02;
    }

    public void setPd01ad02(String pd01ad02) {
        this.pd01ad02 = pd01ad02 == null ? null : pd01ad02.trim();
    }

    public String getPd01ai02() {
        return pd01ai02;
    }

    public void setPd01ai02(String pd01ai02) {
        this.pd01ai02 = pd01ai02 == null ? null : pd01ai02.trim();
    }

    public String getPd01ai03() {
        return pd01ai03;
    }

    public void setPd01ai03(String pd01ai03) {
        this.pd01ai03 = pd01ai03 == null ? null : pd01ai03.trim();
    }

    public String getPd01ai04() {
        return pd01ai04;
    }

    public void setPd01ai04(String pd01ai04) {
        this.pd01ai04 = pd01ai04 == null ? null : pd01ai04.trim();
    }

    public String getPd01ad03() {
        return pd01ad03;
    }

    public void setPd01ad03(String pd01ad03) {
        this.pd01ad03 = pd01ad03 == null ? null : pd01ad03.trim();
    }

    public String getPd01ar01() {
        return pd01ar01;
    }

    public void setPd01ar01(String pd01ar01) {
        this.pd01ar01 = pd01ar01 == null ? null : pd01ar01.trim();
    }

    public String getPd01ad04() {
        return pd01ad04;
    }

    public void setPd01ad04(String pd01ad04) {
        this.pd01ad04 = pd01ad04 == null ? null : pd01ad04.trim();
    }

    public String getPd01aj01() {
        return pd01aj01;
    }

    public void setPd01aj01(String pd01aj01) {
        this.pd01aj01 = pd01aj01 == null ? null : pd01aj01.trim();
    }

    public String getPd01aj02() {
        return pd01aj02;
    }

    public void setPd01aj02(String pd01aj02) {
        this.pd01aj02 = pd01aj02 == null ? null : pd01aj02.trim();
    }

    public String getPd01aj03() {
        return pd01aj03;
    }

    public void setPd01aj03(String pd01aj03) {
        this.pd01aj03 = pd01aj03 == null ? null : pd01aj03.trim();
    }

    public String getPd01ar02() {
        return pd01ar02;
    }

    public void setPd01ar02(String pd01ar02) {
        this.pd01ar02 = pd01ar02 == null ? null : pd01ar02.trim();
    }

    public String getPd01ad05() {
        return pd01ad05;
    }

    public void setPd01ad05(String pd01ad05) {
        this.pd01ad05 = pd01ad05 == null ? null : pd01ad05.trim();
    }

    public String getPd01ad06() {
        return pd01ad06;
    }

    public void setPd01ad06(String pd01ad06) {
        this.pd01ad06 = pd01ad06 == null ? null : pd01ad06.trim();
    }

    public String getPd01as01() {
        return pd01as01;
    }

    public void setPd01as01(String pd01as01) {
        this.pd01as01 = pd01as01 == null ? null : pd01as01.trim();
    }

    public String getPd01ad07() {
        return pd01ad07;
    }

    public void setPd01ad07(String pd01ad07) {
        this.pd01ad07 = pd01ad07 == null ? null : pd01ad07.trim();
    }

    public String getPd01ad08() {
        return pd01ad08;
    }

    public void setPd01ad08(String pd01ad08) {
        this.pd01ad08 = pd01ad08 == null ? null : pd01ad08.trim();
    }

    public String getPd01ad09() {
        return pd01ad09;
    }

    public void setPd01ad09(String pd01ad09) {
        this.pd01ad09 = pd01ad09 == null ? null : pd01ad09.trim();
    }

    public String getPd01ad010() {
        return pd01ad010;
    }

    public void setPd01ad010(String pd01ad010) {
        this.pd01ad010 = pd01ad010 == null ? null : pd01ad010.trim();
    }
}