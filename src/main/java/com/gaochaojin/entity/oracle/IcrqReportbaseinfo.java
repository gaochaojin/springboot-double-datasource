package com.gaochaojin.entity.oracle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * null
 *
 * @author null
 * @date   2019-07-05
 */
@Entity
@Table(name = "ICRQ_REPORTBASEINFO")
public class IcrqReportbaseinfo {
    /**
     * null
     */
    @Id
    @Column(name = "REPORTNO")
    private String reportno;

    /**
     * null
     */
    @Column(name = "CUSTOMERNAME")
    private String customername;

    /**
     * null
     */
    @Column(name = "CERTTYPE")
    private String certtype;

    /**
     * null
     */
    @Column(name = "CERTNO")
    private String certno;

    /**
     * null
     */
    @Column(name = "QUERYREASON")
    private String queryreason;

    /**
     * null
     */
    @Column(name = "QUERYFORMAT")
    private String queryformat;

    /**
     * null
     */
    @Column(name = "REPORTPATH")
    private String reportpath;

    /**
     * null
     */
    @Column(name = "REPORTTIME")
    private String reporttime;

    /**
     * null
     */
    @Column(name = "PARSEFLAG")
    private String parseflag;

    /**
     * null
     */
    @Column(name = "PARSETIME")
    private String parsetime;

    /**
     * null
     */
    @Column(name = "ENCRYPTFLAG")
    private String encryptflag;

    /**
     * null
     */
    @Column(name = "ENCRYPTPWD")
    private String encryptpwd;

    /**
     * null
     */
    @Column(name = "ENCRYPTTIME")
    private String encrypttime;

    /**
     * null
     */
    @Column(name = "FINANCEID")
    private String financeid;

    /**
     * null
     */
    @Column(name = "QUERYACCOUNT")
    private String queryaccount;

    /**
     * null
     */
    @Column(name = "QUERYUSERID")
    private String queryuserid;

    /**
     * null
     */
    @Column(name = "QUERYORGID")
    private String queryorgid;

    /**
     * null
     */
    @Column(name = "QUERYTIME")
    private String querytime;

    /**
     * null
     */
    @Column(name = "PAYFLAG")
    private String payflag;

    /**
     * null
     */
    @Column(name = "FREEDAYS")
    private Short freedays;

    /**
     * null
     */
    @Column(name = "UNITPRICE")
    private BigDecimal unitprice;

    /**
     * null
     */
    @Column(name = "DATARATIO")
    private BigDecimal dataratio;

    /**
     * null
     */
    @Column(name = "QUERYRATIO")
    private BigDecimal queryratio;

    /**
     * null
     */
    @Column(name = "PRIVILEGERATIO")
    private BigDecimal privilegeratio;

    /**
     * null
     */
    @Column(name = "QUERYCOST")
    private BigDecimal querycost;

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno == null ? null : reportno.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCerttype() {
        return certtype;
    }

    public void setCerttype(String certtype) {
        this.certtype = certtype == null ? null : certtype.trim();
    }

    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno == null ? null : certno.trim();
    }

    public String getQueryreason() {
        return queryreason;
    }

    public void setQueryreason(String queryreason) {
        this.queryreason = queryreason == null ? null : queryreason.trim();
    }

    public String getQueryformat() {
        return queryformat;
    }

    public void setQueryformat(String queryformat) {
        this.queryformat = queryformat == null ? null : queryformat.trim();
    }

    public String getReportpath() {
        return reportpath;
    }

    public void setReportpath(String reportpath) {
        this.reportpath = reportpath == null ? null : reportpath.trim();
    }

    public String getReporttime() {
        return reporttime;
    }

    public void setReporttime(String reporttime) {
        this.reporttime = reporttime == null ? null : reporttime.trim();
    }

    public String getParseflag() {
        return parseflag;
    }

    public void setParseflag(String parseflag) {
        this.parseflag = parseflag == null ? null : parseflag.trim();
    }

    public String getParsetime() {
        return parsetime;
    }

    public void setParsetime(String parsetime) {
        this.parsetime = parsetime == null ? null : parsetime.trim();
    }

    public String getEncryptflag() {
        return encryptflag;
    }

    public void setEncryptflag(String encryptflag) {
        this.encryptflag = encryptflag == null ? null : encryptflag.trim();
    }

    public String getEncryptpwd() {
        return encryptpwd;
    }

    public void setEncryptpwd(String encryptpwd) {
        this.encryptpwd = encryptpwd == null ? null : encryptpwd.trim();
    }

    public String getEncrypttime() {
        return encrypttime;
    }

    public void setEncrypttime(String encrypttime) {
        this.encrypttime = encrypttime == null ? null : encrypttime.trim();
    }

    public String getFinanceid() {
        return financeid;
    }

    public void setFinanceid(String financeid) {
        this.financeid = financeid == null ? null : financeid.trim();
    }

    public String getQueryaccount() {
        return queryaccount;
    }

    public void setQueryaccount(String queryaccount) {
        this.queryaccount = queryaccount == null ? null : queryaccount.trim();
    }

    public String getQueryuserid() {
        return queryuserid;
    }

    public void setQueryuserid(String queryuserid) {
        this.queryuserid = queryuserid == null ? null : queryuserid.trim();
    }

    public String getQueryorgid() {
        return queryorgid;
    }

    public void setQueryorgid(String queryorgid) {
        this.queryorgid = queryorgid == null ? null : queryorgid.trim();
    }

    public String getQuerytime() {
        return querytime;
    }

    public void setQuerytime(String querytime) {
        this.querytime = querytime == null ? null : querytime.trim();
    }

    public String getPayflag() {
        return payflag;
    }

    public void setPayflag(String payflag) {
        this.payflag = payflag == null ? null : payflag.trim();
    }

    public Short getFreedays() {
        return freedays;
    }

    public void setFreedays(Short freedays) {
        this.freedays = freedays;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public BigDecimal getDataratio() {
        return dataratio;
    }

    public void setDataratio(BigDecimal dataratio) {
        this.dataratio = dataratio;
    }

    public BigDecimal getQueryratio() {
        return queryratio;
    }

    public void setQueryratio(BigDecimal queryratio) {
        this.queryratio = queryratio;
    }

    public BigDecimal getPrivilegeratio() {
        return privilegeratio;
    }

    public void setPrivilegeratio(BigDecimal privilegeratio) {
        this.privilegeratio = privilegeratio;
    }

    public BigDecimal getQuerycost() {
        return querycost;
    }

    public void setQuerycost(BigDecimal querycost) {
        this.querycost = querycost;
    }
}