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
@Table(name = "src_icr2_loancard_info")
public class SrcIcr2LoancardInfo {
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
    @Column(name = "card_credit_limit_no")
    private String cardCreditLimitNo;

    /**
     * 管理机构类型
     */
    @Column(name = "card_finance_type")
    private String cardFinanceType;

    /**
     * 管理机构代码
     */
    @Column(name = "card_finance_org")
    private String cardFinanceOrg;

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
    @Column(name = "card_account_type")
    private String cardAccountType;

    /**
     * 建立账户日期
     */
    @Column(name = "card_open_date")
    private String cardOpenDate;

    /**
     * 账户授信额度
     */
    @Column(name = "card_credit_limit_amount")
    private BigDecimal cardCreditLimitAmount;

    /**
     * 共享授信额度
     */
    @Column(name = "card_share_credit_limit_amount")
    private BigDecimal cardShareCreditLimitAmount;

    /**
     * 币种
     */
    @Column(name = "card_currency")
    private String cardCurrency;

    /**
     * 业务种类
     */
    @Column(name = "card_cardbiz_type")
    private String cardCardbizType;

    /**
     * 担保方式
     */
    @Column(name = "card_guarantee_type")
    private String cardGuaranteeType;

    /**
     * 最近一次月份
     */
    @Column(name = "card_latest_month")
    private String cardLatestMonth;

    /**
     * 账户状态
     */
    @Column(name = "card_state")
    private String cardState;

    /**
     * 余额
     */
    @Column(name = "card_balance")
    private BigDecimal cardBalance;

    /**
     * 已用额度
     */
    @Column(name = "card_used_amount")
    private BigDecimal cardUsedAmount;

    /**
     * 未出单的大额专项分期余额
     */
    @Column(name = "card_large_scale_special_balance")
    private BigDecimal cardLargeScaleSpecialBalance;

    /**
     * 剩余分期期数
     */
    @Column(name = "card_remain_payment_cyc")
    private Double cardRemainPaymentCyc;

    /**
     * 本应还款日
     */
    @Column(name = "card_scheduled_payment_date")
    private String cardScheduledPaymentDate;

    /**
     * 本月应还款
     */
    @Column(name = "card_scheduled_payment_amount")
    private BigDecimal cardScheduledPaymentAmount;

    /**
     * 本月实还款
     */
    @Column(name = "card_actual_payment_amount")
    private BigDecimal cardActualPaymentAmount;

    /**
     * 最近一次还款日期
     */
    @Column(name = "card_latest_payment_date")
    private String cardLatestPaymentDate;

    /**
     * 当前逾期期数
     */
    @Column(name = "card_curr_overdue_cyc")
    private Double cardCurrOverdueCyc;

    /**
     * 当前逾期总额
     */
    @Column(name = "card_curr_overdue_amount")
    private BigDecimal cardCurrOverdueAmount;

    /**
     * 最近6个月平均使用额度-60天未还本金
     */
    @Column(name = "card_latest6_month_used_avg_amount")
    private BigDecimal cardLatest6MonthUsedAvgAmount;

    /**
     * 最大使用额度
     */
    @Column(name = "card_used_highest_amount")
    private BigDecimal cardUsedHighestAmount;

    /**
     * 信息报告日期
     */
    @Column(name = "card_state_end_date")
    private String cardStateEndDate;

    /**
     * 近24个月还款状态起始年月
     */
    @Column(name = "card_begin_month")
    private String cardBeginMonth;

    /**
     * 近24个月还款状态截止年月
     */
    @Column(name = "card_end_month")
    private String cardEndMonth;

    /**
     * 近24个月还款记录月份
     */
    @Column(name = "card_latest24_month")
    private String cardLatest24Month;

    /**
     * 近24个月还款还款状态
     */
    @Column(name = "card_latest24_state")
    private String cardLatest24State;

    /**
     * 最新账户状态
     */
    @Column(name = "card_recent_state")
    private String cardRecentState;

    /**
     * 贷记卡销户日期
     */
    @Column(name = "card_pay_back_date")
    private String cardPayBackDate;

    /**
     * 最新本金余额
     */
    @Column(name = "card_recent_balance")
    private BigDecimal cardRecentBalance;

    /**
     * 最新还款日期
     */
    @Column(name = "card_recent_pay_date")
    private String cardRecentPayDate;

    /**
     * 最新还款金额
     */
    @Column(name = "card_recent_pay_amount")
    private BigDecimal cardRecentPayAmount;

    /**
     * 最新五级分类
     */
    @Column(name = "card_recent_class5_state")
    private String cardRecentClass5State;

    /**
     * 最新还款状态
     */
    @Column(name = "card_recent_payment_state")
    private String cardRecentPaymentState;

    /**
     * 最新信息报告日期
     */
    @Column(name = "card_recent_state_begin_date")
    private String cardRecentStateBeginDate;

    /**
     * 最近5年内的起始年月
     */
    @Column(name = "card_latest5_year_begin_month")
    private String cardLatest5YearBeginMonth;

    /**
     * 最近5年内的截止年月
     */
    @Column(name = "card_latest5_year_end_month")
    private String cardLatest5YearEndMonth;

    /**
     * 最近5年内的月数
     */
    @Column(name = "card_latest5_year_months")
    private String cardLatest5YearMonths;

    /**
     * 最近5年内的月份
     */
    @Column(name = "card_latest5_year_payment_month")
    private String cardLatest5YearPaymentMonth;

    /**
     * 最近5年内的还款状态
     */
    @Column(name = "card_latest5_year_payment_state")
    private String cardLatest5YearPaymentState;

    /**
     * 最近5年内的逾期（透支）总额
     */
    @Column(name = "card_latest5_year_overdue_money")
    private String cardLatest5YearOverdueMoney;

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

    public String getCardCreditLimitNo() {
        return cardCreditLimitNo;
    }

    public void setCardCreditLimitNo(String cardCreditLimitNo) {
        this.cardCreditLimitNo = cardCreditLimitNo == null ? null : cardCreditLimitNo.trim();
    }

    public String getCardFinanceType() {
        return cardFinanceType;
    }

    public void setCardFinanceType(String cardFinanceType) {
        this.cardFinanceType = cardFinanceType == null ? null : cardFinanceType.trim();
    }

    public String getCardFinanceOrg() {
        return cardFinanceOrg;
    }

    public void setCardFinanceOrg(String cardFinanceOrg) {
        this.cardFinanceOrg = cardFinanceOrg == null ? null : cardFinanceOrg.trim();
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

    public String getCardAccountType() {
        return cardAccountType;
    }

    public void setCardAccountType(String cardAccountType) {
        this.cardAccountType = cardAccountType == null ? null : cardAccountType.trim();
    }

    public String getCardOpenDate() {
        return cardOpenDate;
    }

    public void setCardOpenDate(String cardOpenDate) {
        this.cardOpenDate = cardOpenDate == null ? null : cardOpenDate.trim();
    }

    public BigDecimal getCardCreditLimitAmount() {
        return cardCreditLimitAmount;
    }

    public void setCardCreditLimitAmount(BigDecimal cardCreditLimitAmount) {
        this.cardCreditLimitAmount = cardCreditLimitAmount;
    }

    public BigDecimal getCardShareCreditLimitAmount() {
        return cardShareCreditLimitAmount;
    }

    public void setCardShareCreditLimitAmount(BigDecimal cardShareCreditLimitAmount) {
        this.cardShareCreditLimitAmount = cardShareCreditLimitAmount;
    }

    public String getCardCurrency() {
        return cardCurrency;
    }

    public void setCardCurrency(String cardCurrency) {
        this.cardCurrency = cardCurrency == null ? null : cardCurrency.trim();
    }

    public String getCardCardbizType() {
        return cardCardbizType;
    }

    public void setCardCardbizType(String cardCardbizType) {
        this.cardCardbizType = cardCardbizType == null ? null : cardCardbizType.trim();
    }

    public String getCardGuaranteeType() {
        return cardGuaranteeType;
    }

    public void setCardGuaranteeType(String cardGuaranteeType) {
        this.cardGuaranteeType = cardGuaranteeType == null ? null : cardGuaranteeType.trim();
    }

    public String getCardLatestMonth() {
        return cardLatestMonth;
    }

    public void setCardLatestMonth(String cardLatestMonth) {
        this.cardLatestMonth = cardLatestMonth == null ? null : cardLatestMonth.trim();
    }

    public String getCardState() {
        return cardState;
    }

    public void setCardState(String cardState) {
        this.cardState = cardState == null ? null : cardState.trim();
    }

    public BigDecimal getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(BigDecimal cardBalance) {
        this.cardBalance = cardBalance;
    }

    public BigDecimal getCardUsedAmount() {
        return cardUsedAmount;
    }

    public void setCardUsedAmount(BigDecimal cardUsedAmount) {
        this.cardUsedAmount = cardUsedAmount;
    }

    public BigDecimal getCardLargeScaleSpecialBalance() {
        return cardLargeScaleSpecialBalance;
    }

    public void setCardLargeScaleSpecialBalance(BigDecimal cardLargeScaleSpecialBalance) {
        this.cardLargeScaleSpecialBalance = cardLargeScaleSpecialBalance;
    }

    public Double getCardRemainPaymentCyc() {
        return cardRemainPaymentCyc;
    }

    public void setCardRemainPaymentCyc(Double cardRemainPaymentCyc) {
        this.cardRemainPaymentCyc = cardRemainPaymentCyc;
    }

    public String getCardScheduledPaymentDate() {
        return cardScheduledPaymentDate;
    }

    public void setCardScheduledPaymentDate(String cardScheduledPaymentDate) {
        this.cardScheduledPaymentDate = cardScheduledPaymentDate == null ? null : cardScheduledPaymentDate.trim();
    }

    public BigDecimal getCardScheduledPaymentAmount() {
        return cardScheduledPaymentAmount;
    }

    public void setCardScheduledPaymentAmount(BigDecimal cardScheduledPaymentAmount) {
        this.cardScheduledPaymentAmount = cardScheduledPaymentAmount;
    }

    public BigDecimal getCardActualPaymentAmount() {
        return cardActualPaymentAmount;
    }

    public void setCardActualPaymentAmount(BigDecimal cardActualPaymentAmount) {
        this.cardActualPaymentAmount = cardActualPaymentAmount;
    }

    public String getCardLatestPaymentDate() {
        return cardLatestPaymentDate;
    }

    public void setCardLatestPaymentDate(String cardLatestPaymentDate) {
        this.cardLatestPaymentDate = cardLatestPaymentDate == null ? null : cardLatestPaymentDate.trim();
    }

    public Double getCardCurrOverdueCyc() {
        return cardCurrOverdueCyc;
    }

    public void setCardCurrOverdueCyc(Double cardCurrOverdueCyc) {
        this.cardCurrOverdueCyc = cardCurrOverdueCyc;
    }

    public BigDecimal getCardCurrOverdueAmount() {
        return cardCurrOverdueAmount;
    }

    public void setCardCurrOverdueAmount(BigDecimal cardCurrOverdueAmount) {
        this.cardCurrOverdueAmount = cardCurrOverdueAmount;
    }

    public BigDecimal getCardLatest6MonthUsedAvgAmount() {
        return cardLatest6MonthUsedAvgAmount;
    }

    public void setCardLatest6MonthUsedAvgAmount(BigDecimal cardLatest6MonthUsedAvgAmount) {
        this.cardLatest6MonthUsedAvgAmount = cardLatest6MonthUsedAvgAmount;
    }

    public BigDecimal getCardUsedHighestAmount() {
        return cardUsedHighestAmount;
    }

    public void setCardUsedHighestAmount(BigDecimal cardUsedHighestAmount) {
        this.cardUsedHighestAmount = cardUsedHighestAmount;
    }

    public String getCardStateEndDate() {
        return cardStateEndDate;
    }

    public void setCardStateEndDate(String cardStateEndDate) {
        this.cardStateEndDate = cardStateEndDate == null ? null : cardStateEndDate.trim();
    }

    public String getCardBeginMonth() {
        return cardBeginMonth;
    }

    public void setCardBeginMonth(String cardBeginMonth) {
        this.cardBeginMonth = cardBeginMonth == null ? null : cardBeginMonth.trim();
    }

    public String getCardEndMonth() {
        return cardEndMonth;
    }

    public void setCardEndMonth(String cardEndMonth) {
        this.cardEndMonth = cardEndMonth == null ? null : cardEndMonth.trim();
    }

    public String getCardLatest24Month() {
        return cardLatest24Month;
    }

    public void setCardLatest24Month(String cardLatest24Month) {
        this.cardLatest24Month = cardLatest24Month == null ? null : cardLatest24Month.trim();
    }

    public String getCardLatest24State() {
        return cardLatest24State;
    }

    public void setCardLatest24State(String cardLatest24State) {
        this.cardLatest24State = cardLatest24State == null ? null : cardLatest24State.trim();
    }

    public String getCardRecentState() {
        return cardRecentState;
    }

    public void setCardRecentState(String cardRecentState) {
        this.cardRecentState = cardRecentState == null ? null : cardRecentState.trim();
    }

    public String getCardPayBackDate() {
        return cardPayBackDate;
    }

    public void setCardPayBackDate(String cardPayBackDate) {
        this.cardPayBackDate = cardPayBackDate == null ? null : cardPayBackDate.trim();
    }

    public BigDecimal getCardRecentBalance() {
        return cardRecentBalance;
    }

    public void setCardRecentBalance(BigDecimal cardRecentBalance) {
        this.cardRecentBalance = cardRecentBalance;
    }

    public String getCardRecentPayDate() {
        return cardRecentPayDate;
    }

    public void setCardRecentPayDate(String cardRecentPayDate) {
        this.cardRecentPayDate = cardRecentPayDate == null ? null : cardRecentPayDate.trim();
    }

    public BigDecimal getCardRecentPayAmount() {
        return cardRecentPayAmount;
    }

    public void setCardRecentPayAmount(BigDecimal cardRecentPayAmount) {
        this.cardRecentPayAmount = cardRecentPayAmount;
    }

    public String getCardRecentClass5State() {
        return cardRecentClass5State;
    }

    public void setCardRecentClass5State(String cardRecentClass5State) {
        this.cardRecentClass5State = cardRecentClass5State == null ? null : cardRecentClass5State.trim();
    }

    public String getCardRecentPaymentState() {
        return cardRecentPaymentState;
    }

    public void setCardRecentPaymentState(String cardRecentPaymentState) {
        this.cardRecentPaymentState = cardRecentPaymentState == null ? null : cardRecentPaymentState.trim();
    }

    public String getCardRecentStateBeginDate() {
        return cardRecentStateBeginDate;
    }

    public void setCardRecentStateBeginDate(String cardRecentStateBeginDate) {
        this.cardRecentStateBeginDate = cardRecentStateBeginDate == null ? null : cardRecentStateBeginDate.trim();
    }

    public String getCardLatest5YearBeginMonth() {
        return cardLatest5YearBeginMonth;
    }

    public void setCardLatest5YearBeginMonth(String cardLatest5YearBeginMonth) {
        this.cardLatest5YearBeginMonth = cardLatest5YearBeginMonth == null ? null : cardLatest5YearBeginMonth.trim();
    }

    public String getCardLatest5YearEndMonth() {
        return cardLatest5YearEndMonth;
    }

    public void setCardLatest5YearEndMonth(String cardLatest5YearEndMonth) {
        this.cardLatest5YearEndMonth = cardLatest5YearEndMonth == null ? null : cardLatest5YearEndMonth.trim();
    }

    public String getCardLatest5YearMonths() {
        return cardLatest5YearMonths;
    }

    public void setCardLatest5YearMonths(String cardLatest5YearMonths) {
        this.cardLatest5YearMonths = cardLatest5YearMonths == null ? null : cardLatest5YearMonths.trim();
    }

    public String getCardLatest5YearPaymentMonth() {
        return cardLatest5YearPaymentMonth;
    }

    public void setCardLatest5YearPaymentMonth(String cardLatest5YearPaymentMonth) {
        this.cardLatest5YearPaymentMonth = cardLatest5YearPaymentMonth == null ? null : cardLatest5YearPaymentMonth.trim();
    }

    public String getCardLatest5YearPaymentState() {
        return cardLatest5YearPaymentState;
    }

    public void setCardLatest5YearPaymentState(String cardLatest5YearPaymentState) {
        this.cardLatest5YearPaymentState = cardLatest5YearPaymentState == null ? null : cardLatest5YearPaymentState.trim();
    }

    public String getCardLatest5YearOverdueMoney() {
        return cardLatest5YearOverdueMoney;
    }

    public void setCardLatest5YearOverdueMoney(String cardLatest5YearOverdueMoney) {
        this.cardLatest5YearOverdueMoney = cardLatest5YearOverdueMoney == null ? null : cardLatest5YearOverdueMoney.trim();
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