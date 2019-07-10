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
 * @date   2019-07-03
 */
@Entity
@Table(name = "src_icr2_large_amount_installment")
public class SrcIcr2LargeAmountInstallment {
    /**
     * 
     */
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * src_ic主键id
     */
    @Column(name = "src_ic_id")
    private Integer srcIcId;

    /**
     * 报告编号
     */
    @Column(name = "report_no")
    private String reportNo;

    /**
     * 账户序号
     */
    @Column(name = "item_no")
    private String itemNo;

    /**
     * 账户编号
     */
    @Column(name = "account")
    private String account;

    /**
     * 账户类型
     */
    @Column(name = "account_type")
    private String accountType;

    /**
     * 大额专项分期额度
     */
    @Column(name = "large_amount_installment_amount")
    private BigDecimal largeAmountInstallmentAmount;

    /**
     * 分期额度生效日期
     */
    @Column(name = "large_amount_installment_start_date")
    private String largeAmountInstallmentStartDate;

    /**
     * 分期额度到期日期
     */
    @Column(name = "large_amount_installment_end_date")
    private String largeAmountInstallmentEndDate;

    /**
     * 已用分期金额
     */
    @Column(name = "used_installment_amount")
    private BigDecimal usedInstallmentAmount;

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

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }


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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public BigDecimal getLargeAmountInstallmentAmount() {
        return largeAmountInstallmentAmount;
    }

    public void setLargeAmountInstallmentAmount(BigDecimal largeAmountInstallmentAmount) {
        this.largeAmountInstallmentAmount = largeAmountInstallmentAmount;
    }

    public String getLargeAmountInstallmentStartDate() {
        return largeAmountInstallmentStartDate;
    }

    public void setLargeAmountInstallmentStartDate(String largeAmountInstallmentStartDate) {
        this.largeAmountInstallmentStartDate = largeAmountInstallmentStartDate == null ? null : largeAmountInstallmentStartDate.trim();
    }

    public String getLargeAmountInstallmentEndDate() {
        return largeAmountInstallmentEndDate;
    }

    public void setLargeAmountInstallmentEndDate(String largeAmountInstallmentEndDate) {
        this.largeAmountInstallmentEndDate = largeAmountInstallmentEndDate == null ? null : largeAmountInstallmentEndDate.trim();
    }

    public BigDecimal getUsedInstallmentAmount() {
        return usedInstallmentAmount;
    }

    public void setUsedInstallmentAmount(BigDecimal usedInstallmentAmount) {
        this.usedInstallmentAmount = usedInstallmentAmount;
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