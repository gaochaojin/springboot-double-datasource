package com.gaochaojin.entity.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 *
 * @author null
 * @date   2019-07-05
 */
@Entity
@Table(name = "src_icr2_credit_info")
public class SrcIcr2CreditInfo {
    /**
     * 
     */
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * src_ic的id
     */
    @Column(name = "src_ic_id")
    private Integer srcIcId;

    /**
     * 报告编号
     */
    @Column(name = "report_no")
    private String reportNo;

    /**
     * 
     */
    @Column(name = "item_no")
    private String itemNo;

    /**
     * 授信协议编号
     */
    @Column(name = "credit_no")
    private String creditNo;

    /**
     * 管理机构类型
     */
    @Column(name = "finance_type")
    private String financeType;

    /**
     * 管理机构代码
     */
    @Column(name = "finance_org")
    private String financeOrg;

    /**
     * 授信协议标识
     */
    @Column(name = "credit_note")
    private String creditNote;

    /**
     * 授信额度用途
     */
    @Column(name = "credit_application")
    private String creditApplication;

    /**
     * 授信额度
     */
    @Column(name = "credit_amount")
    private BigDecimal creditAmount;

    /**
     * 币种
     */
    @Column(name = "credit_currency")
    private String creditCurrency;

    /**
     * 生效日期
     */
    @Column(name = "credit_effective_date")
    private String creditEffectiveDate;

    /**
     * 到期日期
     */
    @Column(name = "credit_expiration_date")
    private String creditExpirationDate;

    /**
     * 授信协议状态
     */
    @Column(name = "credit_state")
    private String creditState;

    /**
     * 已用额度
     */
    @Column(name = "used_amount")
    private BigDecimal usedAmount;

    /**
     * 授信限额
     */
    @Column(name = "credit_limit_amount")
    private BigDecimal creditLimitAmount;

    /**
     * 授信限额编号
     */
    @Column(name = "credit_limit_no")
    private String creditLimitNo;

    /**
     * 插入时间
     */
    @Column(name = "insert_time")
    private Date insertTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSrcIcId() {
        return srcIcId;
    }

    public void setSrcIcId(Integer srcIcId) {
        this.srcIcId = srcIcId;
    }

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo == null ? null : reportNo.trim();
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    public String getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo == null ? null : creditNo.trim();
    }

    public String getFinanceType() {
        return financeType;
    }

    public void setFinanceType(String financeType) {
        this.financeType = financeType == null ? null : financeType.trim();
    }

    public String getFinanceOrg() {
        return financeOrg;
    }

    public void setFinanceOrg(String financeOrg) {
        this.financeOrg = financeOrg == null ? null : financeOrg.trim();
    }

    public String getCreditNote() {
        return creditNote;
    }

    public void setCreditNote(String creditNote) {
        this.creditNote = creditNote == null ? null : creditNote.trim();
    }

    public String getCreditApplication() {
        return creditApplication;
    }

    public void setCreditApplication(String creditApplication) {
        this.creditApplication = creditApplication == null ? null : creditApplication.trim();
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCreditCurrency() {
        return creditCurrency;
    }

    public void setCreditCurrency(String creditCurrency) {
        this.creditCurrency = creditCurrency == null ? null : creditCurrency.trim();
    }

    public String getCreditEffectiveDate() {
        return creditEffectiveDate;
    }

    public void setCreditEffectiveDate(String creditEffectiveDate) {
        this.creditEffectiveDate = creditEffectiveDate == null ? null : creditEffectiveDate.trim();
    }

    public String getCreditExpirationDate() {
        return creditExpirationDate;
    }

    public void setCreditExpirationDate(String creditExpirationDate) {
        this.creditExpirationDate = creditExpirationDate == null ? null : creditExpirationDate.trim();
    }

    public String getCreditState() {
        return creditState;
    }

    public void setCreditState(String creditState) {
        this.creditState = creditState;
    }

    public BigDecimal getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(BigDecimal usedAmount) {
        this.usedAmount = usedAmount;
    }

    public BigDecimal getCreditLimitAmount() {
        return creditLimitAmount;
    }

    public void setCreditLimitAmount(BigDecimal creditLimitAmount) {
        this.creditLimitAmount = creditLimitAmount;
    }

    public String getCreditLimitNo() {
        return creditLimitNo;
    }

    public void setCreditLimitNo(String creditLimitNo) {
        this.creditLimitNo = creditLimitNo == null ? null : creditLimitNo.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}