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
@Table(name = "ICRP2_PB02")
public class Icrp2Pb02 {
    /**
     * null
     */
    @Id
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "PB020D01")
    private String pb020d01;

    /**
     * null
     */
    @Column(name = "PB020Q01")
    private String pb020q01;

    /**
     * null
     */
    @Column(name = "PB020D02")
    private String pb020d02;

    /**
     * null
     */
    @Column(name = "PB020I01")
    private String pb020i01;

    /**
     * null
     */
    @Column(name = "PB020Q02")
    private String pb020q02;

    /**
     * null
     */
    @Column(name = "PB020Q03")
    private String pb020q03;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getPb020d01() {
        return pb020d01;
    }

    public void setPb020d01(String pb020d01) {
        this.pb020d01 = pb020d01 == null ? null : pb020d01.trim();
    }

    public String getPb020q01() {
        return pb020q01;
    }

    public void setPb020q01(String pb020q01) {
        this.pb020q01 = pb020q01 == null ? null : pb020q01.trim();
    }

    public String getPb020d02() {
        return pb020d02;
    }

    public void setPb020d02(String pb020d02) {
        this.pb020d02 = pb020d02 == null ? null : pb020d02.trim();
    }

    public String getPb020i01() {
        return pb020i01;
    }

    public void setPb020i01(String pb020i01) {
        this.pb020i01 = pb020i01 == null ? null : pb020i01.trim();
    }

    public String getPb020q02() {
        return pb020q02;
    }

    public void setPb020q02(String pb020q02) {
        this.pb020q02 = pb020q02 == null ? null : pb020q02.trim();
    }

    public String getPb020q03() {
        return pb020q03;
    }

    public void setPb020q03(String pb020q03) {
        this.pb020q03 = pb020q03 == null ? null : pb020q03.trim();
    }
}