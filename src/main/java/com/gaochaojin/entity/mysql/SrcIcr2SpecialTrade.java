package com.gaochaojin.entity.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author null
 * @date 2019-07-05
 */
@Entity
@Table(name = "src_icr2_special_trade")
public class SrcIcr2SpecialTrade {
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
    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

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
     * 特殊交易类型
     */
    @Column(name = "special_trade_type")
    private String specialTradeType;

    /**
     * 特殊交易发生日期
     */
    @Column(name = "special_trade_date")
    private String specialTradeDate;

    /**
     * 到期日期变更月数
     */
    @Column(name = "special_trade_chenged_months")
    private String specialTradeChengedMonths;

    /**
     * 特殊交易发生金额
     */
    @Column(name = "special_trade_amount")
    private BigDecimal specialTradeAmount;

    /**
     * 特殊交易明细记录
     */
    @Column(name = "special_trade_detail")
    private String specialTradeDetail;

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

    public String getSpecialTradeType() {
        return specialTradeType;
    }

    public void setSpecialTradeType(String specialTradeType) {
        this.specialTradeType = specialTradeType == null ? null : specialTradeType.trim();
    }

    public String getSpecialTradeDate() {
        return specialTradeDate;
    }

    public void setSpecialTradeDate(String specialTradeDate) {
        this.specialTradeDate = specialTradeDate == null ? null : specialTradeDate.trim();
    }

    public String getSpecialTradeChengedMonths() {
        return specialTradeChengedMonths;
    }

    public void setSpecialTradeChengedMonths(String specialTradeChengedMonths) {
        this.specialTradeChengedMonths = specialTradeChengedMonths == null ? null : specialTradeChengedMonths.trim();
    }

    public BigDecimal getSpecialTradeAmount() {
        return specialTradeAmount;
    }

    public void setSpecialTradeAmount(BigDecimal specialTradeAmount) {
        this.specialTradeAmount = specialTradeAmount;
    }

    public String getSpecialTradeDetail() {
        return specialTradeDetail;
    }

    public void setSpecialTradeDetail(String specialTradeDetail) {
        this.specialTradeDetail = specialTradeDetail == null ? null : specialTradeDetail.trim();
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