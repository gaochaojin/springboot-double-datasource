package com.gaochaojin.entity.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author null
 * @date 2019-07-03
 */
@Entity
@Table(name = "src_icr2_std_loancard_info")
public class SrcIcr2StdLoancardInfo {
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
     * 授信协议编号
     */
    @Column(name = "quasi_credit_limit_no")
    private String quasiCreditLimitNo;

    /**
     * 管理机构类型
     */
    @Column(name = "quasi_finance_type")
    private String quasiFinanceType;

    /**
     * 管理机构代码
     */
    @Column(name = "quasi_finance_org")
    private String quasiFinanceOrg;

    /**
     * 账户编号
     */
    @Column(name = "account")
    private String account;

    /**
     * 账户标识
     */
    @Column(name = "account_note")
    private String accountNote;

    /**
     * 账户类型
     */
    @Column(name = "quasi_account_type")
    private String quasiAccountType;

    /**
     * 建立账户日期
     */
    @Column(name = "quasi_open_date")
    private String quasiOpenDate;

    /**
     * 账户授信额度
     */
    @Column(name = "quasi_credit_limit_amount")
    private BigDecimal quasiCreditLimitAmount;

    /**
     * 共享授信额度
     */
    @Column(name = "quasi_share_credit_limit_amount")
    private BigDecimal quasiShareCreditLimitAmount;

    /**
     * 币种
     */
    @Column(name = "quasi_currency")
    private String quasiCurrency;

    /**
     * 担保方式
     */
    @Column(name = "quasi_guarantee_type")
    private String quasiGuaranteeType;

    /**
     * 最近一次月份
     */
    @Column(name = "quasi_latest_month")
    private String quasiLatestMonth;

    /**
     * 账户状态
     */
    @Column(name = "quasi_state")
    private String quasiState;

    /**
     * 余额
     */
    @Column(name = "quasi_balance")
    private BigDecimal quasiBalance;

    /**
     * 已用额度
     */
    @Column(name = "quasi_used_amount")
    private BigDecimal quasiUsedAmount;

    /**
     * 未出单的大额专项分期余额
     */
    @Column(name = "quasi_large_scale_special_balance")
    private BigDecimal quasiLargeScaleSpecialBalance;

    /**
     * 剩余分期期数
     */
    @Column(name = "quasi_remain_payment_cyc")
    private Double quasiRemainPaymentCyc;

    /**
     * 账单日
     */
    @Column(name = "quasi_scheduled_payment_date")
    private String quasiScheduledPaymentDate;

    /**
     * 本月实还款
     */
    @Column(name = "quasi_actual_payment_amount")
    private BigDecimal quasiActualPaymentAmount;

    /**
     * 最近一次还款日期
     */
    @Column(name = "quasi_latest_payment_date")
    private String quasiLatestPaymentDate;

    /**
     * 透支180天以上未付余额
     */
    @Column(name = "quasi_overdue_over180_amount")
    private Double quasiOverdueOver180Amount;

    /**
     * 最近6个月平均使用额度-60天未还本金
     */
    @Column(name = "quasi_latest6_month_used_avg_amount")
    private BigDecimal quasiLatest6MonthUsedAvgAmount;

    /**
     * 最大透支余额
     */
    @Column(name = "quasi_used_highest_amount")
    private BigDecimal quasiUsedHighestAmount;

    /**
     * 信息报告日期
     */
    @Column(name = "quasi_state_end_date")
    private String quasiStateEndDate;

    /**
     * 近24个月还款状态起始年月
     */
    @Column(name = "quasi_begin_month")
    private String quasiBeginMonth;

    /**
     * 近24个月还款状态截止年月
     */
    @Column(name = "quasi_end_month")
    private String quasiEndMonth;

    /**
     * 近24个月还款记录月份
     */
    @Column(name = "quasi_latest24_month")
    private String quasiLatest24Month;

    /**
     * 近24个月还款还款状态
     */
    @Column(name = "quasi_latest24_state")
    private String quasiLatest24State;

    /**
     * 最新账户状态
     */
    @Column(name = "quasi_recent_state")
    private String quasiRecentState;

    /**
     * 准贷记卡销户日期
     */
    @Column(name = "quasi_pay_back_date")
    private String quasiPayBackDate;

    /**
     * 最新本金余额
     */
    @Column(name = "quasi_recent_balance")
    private BigDecimal quasiRecentBalance;

    /**
     * 最新还款日期
     */
    @Column(name = "quasi_recent_pay_date")
    private String quasiRecentPayDate;

    /**
     * 最新还款金额
     */
    @Column(name = "quasi_recent_pay_amount")
    private BigDecimal quasiRecentPayAmount;

    /**
     * 最新五级分类
     */
    @Column(name = "quasi_recent_class5_state")
    private String quasiRecentClass5State;

    /**
     * 最新还款状态
     */
    @Column(name = "quasi_recent_payment_state")
    private String quasiRecentPaymentState;

    /**
     * 最新信息报告日期
     */
    @Column(name = "quasi_recent_state_begin_date")
    private String quasiRecentStateBeginDate;

    /**
     * 最近5年内的起始年月
     */
    @Column(name = "quasi_latest5_year_begin_month")
    private String quasiLatest5YearBeginMonth;

    /**
     * 最近5年内的截止年月
     */
    @Column(name = "quasi_latest5_year_end_month")
    private String quasiLatest5YearEndMonth;

    /**
     * 最近5年内的月数
     */
    @Column(name = "quasi_latest5_year_months")
    private String quasiLatest5YearMonths;

    /**
     * 最近5年内的月份
     */
    @Column(name = "quasi_latest5_year_payment_month")
    private String quasiLatest5YearPaymentMonth;

    /**
     * 最近5年内的还款状态
     */
    @Column(name = "quasi_latest5_year_payment_state")
    private String quasiLatest5YearPaymentState;

    /**
     * 最近5年内的逾期（透支）总额
     */
    @Column(name = "quasi_latest5_year_overdue_money")
    private String quasiLatest5YearOverdueMoney;

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

    public String getQuasiCreditLimitNo() {
        return quasiCreditLimitNo;
    }

    public void setQuasiCreditLimitNo(String quasiCreditLimitNo) {
        this.quasiCreditLimitNo = quasiCreditLimitNo == null ? null : quasiCreditLimitNo.trim();
    }

    public String getQuasiFinanceType() {
        return quasiFinanceType;
    }

    public void setQuasiFinanceType(String quasiFinanceType) {
        this.quasiFinanceType = quasiFinanceType == null ? null : quasiFinanceType.trim();
    }

    public String getQuasiFinanceOrg() {
        return quasiFinanceOrg;
    }

    public void setQuasiFinanceOrg(String quasiFinanceOrg) {
        this.quasiFinanceOrg = quasiFinanceOrg == null ? null : quasiFinanceOrg.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getAccountNote() {
        return accountNote;
    }

    public void setAccountNote(String accountNote) {
        this.accountNote = accountNote == null ? null : accountNote.trim();
    }

    public String getQuasiAccountType() {
        return quasiAccountType;
    }

    public void setQuasiAccountType(String quasiAccountType) {
        this.quasiAccountType = quasiAccountType == null ? null : quasiAccountType.trim();
    }

    public String getQuasiOpenDate() {
        return quasiOpenDate;
    }

    public void setQuasiOpenDate(String quasiOpenDate) {
        this.quasiOpenDate = quasiOpenDate == null ? null : quasiOpenDate.trim();
    }

    public BigDecimal getQuasiCreditLimitAmount() {
        return quasiCreditLimitAmount;
    }

    public void setQuasiCreditLimitAmount(BigDecimal quasiCreditLimitAmount) {
        this.quasiCreditLimitAmount = quasiCreditLimitAmount;
    }

    public BigDecimal getQuasiShareCreditLimitAmount() {
        return quasiShareCreditLimitAmount;
    }

    public void setQuasiShareCreditLimitAmount(BigDecimal quasiShareCreditLimitAmount) {
        this.quasiShareCreditLimitAmount = quasiShareCreditLimitAmount;
    }

    public String getQuasiCurrency() {
        return quasiCurrency;
    }

    public void setQuasiCurrency(String quasiCurrency) {
        this.quasiCurrency = quasiCurrency == null ? null : quasiCurrency.trim();
    }

    public String getQuasiGuaranteeType() {
        return quasiGuaranteeType;
    }

    public void setQuasiGuaranteeType(String quasiGuaranteeType) {
        this.quasiGuaranteeType = quasiGuaranteeType == null ? null : quasiGuaranteeType.trim();
    }

    public String getQuasiLatestMonth() {
        return quasiLatestMonth;
    }

    public void setQuasiLatestMonth(String quasiLatestMonth) {
        this.quasiLatestMonth = quasiLatestMonth == null ? null : quasiLatestMonth.trim();
    }

    public String getQuasiState() {
        return quasiState;
    }

    public void setQuasiState(String quasiState) {
        this.quasiState = quasiState == null ? null : quasiState.trim();
    }

    public BigDecimal getQuasiBalance() {
        return quasiBalance;
    }

    public void setQuasiBalance(BigDecimal quasiBalance) {
        this.quasiBalance = quasiBalance;
    }

    public BigDecimal getQuasiUsedAmount() {
        return quasiUsedAmount;
    }

    public void setQuasiUsedAmount(BigDecimal quasiUsedAmount) {
        this.quasiUsedAmount = quasiUsedAmount;
    }

    public BigDecimal getQuasiLargeScaleSpecialBalance() {
        return quasiLargeScaleSpecialBalance;
    }

    public void setQuasiLargeScaleSpecialBalance(BigDecimal quasiLargeScaleSpecialBalance) {
        this.quasiLargeScaleSpecialBalance = quasiLargeScaleSpecialBalance;
    }

    public Double getQuasiRemainPaymentCyc() {
        return quasiRemainPaymentCyc;
    }

    public void setQuasiRemainPaymentCyc(Double quasiRemainPaymentCyc) {
        this.quasiRemainPaymentCyc = quasiRemainPaymentCyc;
    }

    public String getQuasiScheduledPaymentDate() {
        return quasiScheduledPaymentDate;
    }

    public void setQuasiScheduledPaymentDate(String quasiScheduledPaymentDate) {
        this.quasiScheduledPaymentDate = quasiScheduledPaymentDate == null ? null : quasiScheduledPaymentDate.trim();
    }

    public BigDecimal getQuasiActualPaymentAmount() {
        return quasiActualPaymentAmount;
    }

    public void setQuasiActualPaymentAmount(BigDecimal quasiActualPaymentAmount) {
        this.quasiActualPaymentAmount = quasiActualPaymentAmount;
    }

    public String getQuasiLatestPaymentDate() {
        return quasiLatestPaymentDate;
    }

    public void setQuasiLatestPaymentDate(String quasiLatestPaymentDate) {
        this.quasiLatestPaymentDate = quasiLatestPaymentDate == null ? null : quasiLatestPaymentDate.trim();
    }

    public Double getQuasiOverdueOver180Amount() {
        return quasiOverdueOver180Amount;
    }

    public void setQuasiOverdueOver180Amount(Double quasiOverdueOver180Amount) {
        this.quasiOverdueOver180Amount = quasiOverdueOver180Amount;
    }

    public BigDecimal getQuasiLatest6MonthUsedAvgAmount() {
        return quasiLatest6MonthUsedAvgAmount;
    }

    public void setQuasiLatest6MonthUsedAvgAmount(BigDecimal quasiLatest6MonthUsedAvgAmount) {
        this.quasiLatest6MonthUsedAvgAmount = quasiLatest6MonthUsedAvgAmount;
    }

    public BigDecimal getQuasiUsedHighestAmount() {
        return quasiUsedHighestAmount;
    }

    public void setQuasiUsedHighestAmount(BigDecimal quasiUsedHighestAmount) {
        this.quasiUsedHighestAmount = quasiUsedHighestAmount;
    }

    public String getQuasiStateEndDate() {
        return quasiStateEndDate;
    }

    public void setQuasiStateEndDate(String quasiStateEndDate) {
        this.quasiStateEndDate = quasiStateEndDate == null ? null : quasiStateEndDate.trim();
    }

    public String getQuasiBeginMonth() {
        return quasiBeginMonth;
    }

    public void setQuasiBeginMonth(String quasiBeginMonth) {
        this.quasiBeginMonth = quasiBeginMonth == null ? null : quasiBeginMonth.trim();
    }

    public String getQuasiEndMonth() {
        return quasiEndMonth;
    }

    public void setQuasiEndMonth(String quasiEndMonth) {
        this.quasiEndMonth = quasiEndMonth == null ? null : quasiEndMonth.trim();
    }

    public String getQuasiLatest24Month() {
        return quasiLatest24Month;
    }

    public void setQuasiLatest24Month(String quasiLatest24Month) {
        this.quasiLatest24Month = quasiLatest24Month == null ? null : quasiLatest24Month.trim();
    }

    public String getQuasiLatest24State() {
        return quasiLatest24State;
    }

    public void setQuasiLatest24State(String quasiLatest24State) {
        this.quasiLatest24State = quasiLatest24State == null ? null : quasiLatest24State.trim();
    }

    public String getQuasiRecentState() {
        return quasiRecentState;
    }

    public void setQuasiRecentState(String quasiRecentState) {
        this.quasiRecentState = quasiRecentState == null ? null : quasiRecentState.trim();
    }

    public String getQuasiPayBackDate() {
        return quasiPayBackDate;
    }

    public void setQuasiPayBackDate(String quasiPayBackDate) {
        this.quasiPayBackDate = quasiPayBackDate == null ? null : quasiPayBackDate.trim();
    }

    public BigDecimal getQuasiRecentBalance() {
        return quasiRecentBalance;
    }

    public void setQuasiRecentBalance(BigDecimal quasiRecentBalance) {
        this.quasiRecentBalance = quasiRecentBalance;
    }

    public String getQuasiRecentPayDate() {
        return quasiRecentPayDate;
    }

    public void setQuasiRecentPayDate(String quasiRecentPayDate) {
        this.quasiRecentPayDate = quasiRecentPayDate == null ? null : quasiRecentPayDate.trim();
    }

    public BigDecimal getQuasiRecentPayAmount() {
        return quasiRecentPayAmount;
    }

    public void setQuasiRecentPayAmount(BigDecimal quasiRecentPayAmount) {
        this.quasiRecentPayAmount = quasiRecentPayAmount;
    }

    public String getQuasiRecentClass5State() {
        return quasiRecentClass5State;
    }

    public void setQuasiRecentClass5State(String quasiRecentClass5State) {
        this.quasiRecentClass5State = quasiRecentClass5State == null ? null : quasiRecentClass5State.trim();
    }

    public String getQuasiRecentPaymentState() {
        return quasiRecentPaymentState;
    }

    public void setQuasiRecentPaymentState(String quasiRecentPaymentState) {
        this.quasiRecentPaymentState = quasiRecentPaymentState == null ? null : quasiRecentPaymentState.trim();
    }

    public String getQuasiRecentStateBeginDate() {
        return quasiRecentStateBeginDate;
    }

    public void setQuasiRecentStateBeginDate(String quasiRecentStateBeginDate) {
        this.quasiRecentStateBeginDate = quasiRecentStateBeginDate == null ? null : quasiRecentStateBeginDate.trim();
    }

    public String getQuasiLatest5YearBeginMonth() {
        return quasiLatest5YearBeginMonth;
    }

    public void setQuasiLatest5YearBeginMonth(String quasiLatest5YearBeginMonth) {
        this.quasiLatest5YearBeginMonth = quasiLatest5YearBeginMonth == null ? null : quasiLatest5YearBeginMonth.trim();
    }

    public String getQuasiLatest5YearEndMonth() {
        return quasiLatest5YearEndMonth;
    }

    public void setQuasiLatest5YearEndMonth(String quasiLatest5YearEndMonth) {
        this.quasiLatest5YearEndMonth = quasiLatest5YearEndMonth == null ? null : quasiLatest5YearEndMonth.trim();
    }

    public String getQuasiLatest5YearMonths() {
        return quasiLatest5YearMonths;
    }

    public void setQuasiLatest5YearMonths(String quasiLatest5YearMonths) {
        this.quasiLatest5YearMonths = quasiLatest5YearMonths == null ? null : quasiLatest5YearMonths.trim();
    }

    public String getQuasiLatest5YearPaymentMonth() {
        return quasiLatest5YearPaymentMonth;
    }

    public void setQuasiLatest5YearPaymentMonth(String quasiLatest5YearPaymentMonth) {
        this.quasiLatest5YearPaymentMonth = quasiLatest5YearPaymentMonth == null ? null : quasiLatest5YearPaymentMonth.trim();
    }

    public String getQuasiLatest5YearPaymentState() {
        return quasiLatest5YearPaymentState;
    }

    public void setQuasiLatest5YearPaymentState(String quasiLatest5YearPaymentState) {
        this.quasiLatest5YearPaymentState = quasiLatest5YearPaymentState == null ? null : quasiLatest5YearPaymentState.trim();
    }

    public String getQuasiLatest5YearOverdueMoney() {
        return quasiLatest5YearOverdueMoney;
    }

    public void setQuasiLatest5YearOverdueMoney(String quasiLatest5YearOverdueMoney) {
        this.quasiLatest5YearOverdueMoney = quasiLatest5YearOverdueMoney == null ? null : quasiLatest5YearOverdueMoney.trim();
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