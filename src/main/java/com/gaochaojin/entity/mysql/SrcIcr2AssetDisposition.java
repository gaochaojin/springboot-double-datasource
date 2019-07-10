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
@Table(name = "src_icr2_asset_disposition")
public class SrcIcr2AssetDisposition {
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
     * 账户序号
     */
    @Column(name = "item_no")
    private String itemNo;

    /**
     * 管理机构类型
     */
    @Column(name = "asset_dispos_organname_type")
    private String assetDisposOrgannameType;

    /**
     * 管理机构代码
     */
    @Column(name = "asset_dispos_organname")
    private String assetDisposOrganname;

    /**
     * 账户类型
     */
    @Column(name = "asset_dispos_account_type")
    private String assetDisposAccountType;

    /**
     * 业务种类
     */
    @Column(name = "asset_dispos_loanbiz_type")
    private String assetDisposLoanbizType;

    /**
     * 债权转移时的还款状态
     */
    @Column(name = "asset_dispos_payment_state")
    private String assetDisposPaymentState;

    /**
     * 债务接收日期
     */
    @Column(name = "asset_dispos_get_time")
    private String assetDisposGetTime;

    /**
     * 接收的债权金额
     */
    @Column(name = "asset_dispos_amount")
    private BigDecimal assetDisposAmount;

    /**
     * 最新账户状态
     */
    @Column(name = "asset_dispos_recent_account_state")
    private String assetDisposRecentAccountState;

    /**
     * 最新信息报告日期
     */
    @Column(name = "asset_dispos_recent_account_end_date")
    private String assetDisposRecentAccountEndDate;

    /**
     * 最新账户关闭日期
     */
    @Column(name = "asset_dispos_recent_account_over_date")
    private String assetDisposRecentAccountOverDate;

    /**
     * 最新余额
     */
    @Column(name = "asset_dispos_recent_balance")
    private BigDecimal assetDisposRecentBalance;

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

    public String getAssetDisposOrgannameType() {
        return assetDisposOrgannameType;
    }

    public void setAssetDisposOrgannameType(String assetDisposOrgannameType) {
        this.assetDisposOrgannameType = assetDisposOrgannameType == null ? null : assetDisposOrgannameType.trim();
    }

    public String getAssetDisposOrganname() {
        return assetDisposOrganname;
    }

    public void setAssetDisposOrganname(String assetDisposOrganname) {
        this.assetDisposOrganname = assetDisposOrganname == null ? null : assetDisposOrganname.trim();
    }

    public String getAssetDisposAccountType() {
        return assetDisposAccountType;
    }

    public void setAssetDisposAccountType(String assetDisposAccountType) {
        this.assetDisposAccountType = assetDisposAccountType == null ? null : assetDisposAccountType.trim();
    }

    public String getAssetDisposLoanbizType() {
        return assetDisposLoanbizType;
    }

    public void setAssetDisposLoanbizType(String assetDisposLoanbizType) {
        this.assetDisposLoanbizType = assetDisposLoanbizType == null ? null : assetDisposLoanbizType.trim();
    }

    public String getAssetDisposPaymentState() {
        return assetDisposPaymentState;
    }

    public void setAssetDisposPaymentState(String assetDisposPaymentState) {
        this.assetDisposPaymentState = assetDisposPaymentState == null ? null : assetDisposPaymentState.trim();
    }

    public String getAssetDisposGetTime() {
        return assetDisposGetTime;
    }

    public void setAssetDisposGetTime(String assetDisposGetTime) {
        this.assetDisposGetTime = assetDisposGetTime == null ? null : assetDisposGetTime.trim();
    }

    public BigDecimal getAssetDisposAmount() {
        return assetDisposAmount;
    }

    public void setAssetDisposAmount(BigDecimal assetDisposAmount) {
        this.assetDisposAmount = assetDisposAmount;
    }

    public String getAssetDisposRecentAccountState() {
        return assetDisposRecentAccountState;
    }

    public void setAssetDisposRecentAccountState(String assetDisposRecentAccountState) {
        this.assetDisposRecentAccountState = assetDisposRecentAccountState == null ? null : assetDisposRecentAccountState.trim();
    }

    public String getAssetDisposRecentAccountEndDate() {
        return assetDisposRecentAccountEndDate;
    }

    public void setAssetDisposRecentAccountEndDate(String assetDisposRecentAccountEndDate) {
        this.assetDisposRecentAccountEndDate = assetDisposRecentAccountEndDate == null ? null : assetDisposRecentAccountEndDate.trim();
    }

    public String getAssetDisposRecentAccountOverDate() {
        return assetDisposRecentAccountOverDate;
    }

    public void setAssetDisposRecentAccountOverDate(String assetDisposRecentAccountOverDate) {
        this.assetDisposRecentAccountOverDate = assetDisposRecentAccountOverDate == null ? null : assetDisposRecentAccountOverDate.trim();
    }

    public BigDecimal getAssetDisposRecentBalance() {
        return assetDisposRecentBalance;
    }

    public void setAssetDisposRecentBalance(BigDecimal assetDisposRecentBalance) {
        this.assetDisposRecentBalance = assetDisposRecentBalance;
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