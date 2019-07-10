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
@Table(name = "src_icr2_guarantee")
public class SrcIcr2Guarantee {
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
     * 主借款人身份类别
     */
    @Column(name = "guarantee_identity")
    private String guaranteeIdentity;

    /**
     * 业务管理机构类型
     */
    @Column(name = "guarantee_org_type")
    private String guaranteeOrgType;

    /**
     * 业务管理机构
     */
    @Column(name = "guarantee_org")
    private String guaranteeOrg;

    /**
     * 业务种类
     */
    @Column(name = "guarantee_business_type")
    private String guaranteeBusinessType;

    /**
     * 开立日期
     */
    @Column(name = "guarantee_open_date")
    private String guaranteeOpenDate;

    /**
     * 到期日期
     */
    @Column(name = "guarantee_end_date")
    private String guaranteeEndDate;

    /**
     * 相关还款责任人类型
     */
    @Column(name = "guarantee_related_payment_type")
    private String guaranteeRelatedPaymentType;

    /**
     * 保证合同编号
     */
    @Column(name = "guarantee_contract_no")
    private String guaranteeContractNo;

    /**
     * 相关还款责任金额
     */
    @Column(name = "guarantee_amount")
    private BigDecimal guaranteeAmount;

    /**
     * 币种
     */
    @Column(name = "guarantee_currency")
    private String guaranteeCurrency;

    /**
     * 余额
     */
    @Column(name = "guarantee_balance")
    private BigDecimal guaranteeBalance;

    /**
     * 五级分类
     */
    @Column(name = "guarantee_class5_state")
    private String guaranteeClass5State;

    /**
     * 账户类型
     */
    @Column(name = "guarantee_account_type")
    private String guaranteeAccountType;

    /**
     * 还款状态
     */
    @Column(name = "guarantee_payment_state")
    private String guaranteePaymentState;

    /**
     * 逾期月数
     */
    @Column(name = "guarantee_overdue_months")
    private String guaranteeOverdueMonths;

    /**
     * 信息报告日期
     */
    @Column(name = "guarantee_state_end_date")
    private String guaranteeStateEndDate;

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

    public String getGuaranteeIdentity() {
        return guaranteeIdentity;
    }

    public void setGuaranteeIdentity(String guaranteeIdentity) {
        this.guaranteeIdentity = guaranteeIdentity == null ? null : guaranteeIdentity.trim();
    }

    public String getGuaranteeOrgType() {
        return guaranteeOrgType;
    }

    public void setGuaranteeOrgType(String guaranteeOrgType) {
        this.guaranteeOrgType = guaranteeOrgType == null ? null : guaranteeOrgType.trim();
    }

    public String getGuaranteeOrg() {
        return guaranteeOrg;
    }

    public void setGuaranteeOrg(String guaranteeOrg) {
        this.guaranteeOrg = guaranteeOrg == null ? null : guaranteeOrg.trim();
    }

    public String getGuaranteeBusinessType() {
        return guaranteeBusinessType;
    }

    public void setGuaranteeBusinessType(String guaranteeBusinessType) {
        this.guaranteeBusinessType = guaranteeBusinessType == null ? null : guaranteeBusinessType.trim();
    }

    public String getGuaranteeOpenDate() {
        return guaranteeOpenDate;
    }

    public void setGuaranteeOpenDate(String guaranteeOpenDate) {
        this.guaranteeOpenDate = guaranteeOpenDate == null ? null : guaranteeOpenDate.trim();
    }

    public String getGuaranteeEndDate() {
        return guaranteeEndDate;
    }

    public void setGuaranteeEndDate(String guaranteeEndDate) {
        this.guaranteeEndDate = guaranteeEndDate == null ? null : guaranteeEndDate.trim();
    }

    public String getGuaranteeRelatedPaymentType() {
        return guaranteeRelatedPaymentType;
    }

    public void setGuaranteeRelatedPaymentType(String guaranteeRelatedPaymentType) {
        this.guaranteeRelatedPaymentType = guaranteeRelatedPaymentType == null ? null : guaranteeRelatedPaymentType.trim();
    }

    public String getGuaranteeContractNo() {
        return guaranteeContractNo;
    }

    public void setGuaranteeContractNo(String guaranteeContractNo) {
        this.guaranteeContractNo = guaranteeContractNo == null ? null : guaranteeContractNo.trim();
    }

    public BigDecimal getGuaranteeAmount() {
        return guaranteeAmount;
    }

    public void setGuaranteeAmount(BigDecimal guaranteeAmount) {
        this.guaranteeAmount = guaranteeAmount;
    }

    public String getGuaranteeCurrency() {
        return guaranteeCurrency;
    }

    public void setGuaranteeCurrency(String guaranteeCurrency) {
        this.guaranteeCurrency = guaranteeCurrency == null ? null : guaranteeCurrency.trim();
    }

    public BigDecimal getGuaranteeBalance() {
        return guaranteeBalance;
    }

    public void setGuaranteeBalance(BigDecimal guaranteeBalance) {
        this.guaranteeBalance = guaranteeBalance;
    }

    public String getGuaranteeClass5State() {
        return guaranteeClass5State;
    }

    public void setGuaranteeClass5State(String guaranteeClass5State) {
        this.guaranteeClass5State = guaranteeClass5State == null ? null : guaranteeClass5State.trim();
    }

    public String getGuaranteeAccountType() {
        return guaranteeAccountType;
    }

    public void setGuaranteeAccountType(String guaranteeAccountType) {
        this.guaranteeAccountType = guaranteeAccountType == null ? null : guaranteeAccountType.trim();
    }

    public String getGuaranteePaymentState() {
        return guaranteePaymentState;
    }

    public void setGuaranteePaymentState(String guaranteePaymentState) {
        this.guaranteePaymentState = guaranteePaymentState == null ? null : guaranteePaymentState.trim();
    }

    public String getGuaranteeOverdueMonths() {
        return guaranteeOverdueMonths;
    }

    public void setGuaranteeOverdueMonths(String guaranteeOverdueMonths) {
        this.guaranteeOverdueMonths = guaranteeOverdueMonths == null ? null : guaranteeOverdueMonths.trim();
    }

    public String getGuaranteeStateEndDate() {
        return guaranteeStateEndDate;
    }

    public void setGuaranteeStateEndDate(String guaranteeStateEndDate) {
        this.guaranteeStateEndDate = guaranteeStateEndDate == null ? null : guaranteeStateEndDate.trim();
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