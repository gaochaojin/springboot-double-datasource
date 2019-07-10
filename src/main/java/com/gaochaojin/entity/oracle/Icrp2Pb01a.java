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
@Table(name = "ICRP2_PB01A")
public class Icrp2Pb01a {
    /**
     * null
     */
    @Id
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "PB01AD01")
    private String pb01ad01;

    /**
     * null
     */
    @Column(name = "PB01AR01")
    private String pb01ar01;

    /**
     * null
     */
    @Column(name = "PB01AD02")
    private String pb01ad02;

    /**
     * null
     */
    @Column(name = "PB01AD03")
    private String pb01ad03;

    /**
     * null
     */
    @Column(name = "PB01AD04")
    private String pb01ad04;

    /**
     * null
     */
    @Column(name = "PB01AQ01")
    private String pb01aq01;

    /**
     * null
     */
    @Column(name = "PB01AQ02")
    private String pb01aq02;

    /**
     * null
     */
    @Column(name = "PB01AD05")
    private String pb01ad05;

    /**
     * null
     */
    @Column(name = "PB01AQ03")
    private String pb01aq03;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getPb01ad01() {
        return pb01ad01;
    }

    public void setPb01ad01(String pb01ad01) {
        this.pb01ad01 = pb01ad01 == null ? null : pb01ad01.trim();
    }

    public String getPb01ar01() {
        return pb01ar01;
    }

    public void setPb01ar01(String pb01ar01) {
        this.pb01ar01 = pb01ar01 == null ? null : pb01ar01.trim();
    }

    public String getPb01ad02() {
        return pb01ad02;
    }

    public void setPb01ad02(String pb01ad02) {
        this.pb01ad02 = pb01ad02 == null ? null : pb01ad02.trim();
    }

    public String getPb01ad03() {
        return pb01ad03;
    }

    public void setPb01ad03(String pb01ad03) {
        this.pb01ad03 = pb01ad03 == null ? null : pb01ad03.trim();
    }

    public String getPb01ad04() {
        return pb01ad04;
    }

    public void setPb01ad04(String pb01ad04) {
        this.pb01ad04 = pb01ad04 == null ? null : pb01ad04.trim();
    }

    public String getPb01aq01() {
        return pb01aq01;
    }

    public void setPb01aq01(String pb01aq01) {
        this.pb01aq01 = pb01aq01 == null ? null : pb01aq01.trim();
    }

    public String getPb01aq02() {
        return pb01aq02;
    }

    public void setPb01aq02(String pb01aq02) {
        this.pb01aq02 = pb01aq02 == null ? null : pb01aq02.trim();
    }

    public String getPb01ad05() {
        return pb01ad05;
    }

    public void setPb01ad05(String pb01ad05) {
        this.pb01ad05 = pb01ad05 == null ? null : pb01ad05.trim();
    }

    public String getPb01aq03() {
        return pb01aq03;
    }

    public void setPb01aq03(String pb01aq03) {
        this.pb01aq03 = pb01aq03 == null ? null : pb01aq03.trim();
    }
}