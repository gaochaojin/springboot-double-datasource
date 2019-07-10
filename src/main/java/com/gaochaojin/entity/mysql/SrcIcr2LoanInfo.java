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
@Table(name = "src_icr2_loan_info")
public class SrcIcr2LoanInfo {
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
    @Column(name = "loan_credit_limit_no")
    private String loanCreditLimitNo;

    /**
     * 管理机构类型
     */
    @Column(name = "loan_finance_type")
    private String loanFinanceType;

    /**
     * 管理机构代码
     */
    @Column(name = "loan_finance_org")
    private String loanFinanceOrg;

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
    @Column(name = "loan_account_type")
    private String loanAccountType;

    /**
     * 首次放款日期
     */
    @Column(name = "loan_open_date")
    private String loanOpenDate;

    /**
     * 到期日期
     */
    @Column(name = "loan_end_date")
    private String loanEndDate;

    /**
     * 借款金额
     */
    @Column(name = "loan_business_amount")
    private BigDecimal loanBusinessAmount;

    /**
     * 币种
     */
    @Column(name = "loan_currency")
    private String loanCurrency;

    /**
     * 业务种类
     */
    @Column(name = "loan_loanbiz_type")
    private String loanLoanbizType;

    /**
     * 担保方式
     */
    @Column(name = "loan_guarantee_type")
    private String loanGuaranteeType;

    /**
     * 还款期数
     */
    @Column(name = "loan_payment_cyc")
    private Double loanPaymentCyc;

    /**
     * 还款频率
     */
    @Column(name = "loan_payment_rating")
    private String loanPaymentRating;

    /**
     * 还款方式
     */
    @Column(name = "loan_payment_type")
    private String loanPaymentType;

    /**
     * 共同借款标志
     */
    @Column(name = "loan_together_type")
    private String loanTogetherType;

    /**
     * 最近一次月份
     */
    @Column(name = "loan_latest_month")
    private String loanLatestMonth;

    /**
     * 账户状态
     */
    @Column(name = "loan_state")
    private String loanState;

    /**
     * 五级分类
     */
    @Column(name = "loan_class5_state")
    private String loanClass5State;

    /**
     * 余额
     */
    @Column(name = "loan_balance")
    private BigDecimal loanBalance;

    /**
     * 剩余还款期数
     */
    @Column(name = "loan_remain_payment_cyc")
    private Double loanRemainPaymentCyc;

    /**
     * 本应还款日
     */
    @Column(name = "loan_scheduled_payment_date")
    private String loanScheduledPaymentDate;

    /**
     * 本月应还款
     */
    @Column(name = "loan_scheduled_payment_amount")
    private BigDecimal loanScheduledPaymentAmount;

    /**
     * 本月实还款
     */
    @Column(name = "loan_actual_payment_amount")
    private BigDecimal loanActualPaymentAmount;

    /**
     * 最近一次还款日期
     */
    @Column(name = "loan_latest_payment_date")
    private String loanLatestPaymentDate;

    /**
     * 当前逾期期数
     */
    @Column(name = "loan_curr_overdue_cyc")
    private Double loanCurrOverdueCyc;

    /**
     * 当前逾期总额
     */
    @Column(name = "loan_curr_overdue_amount")
    private BigDecimal loanCurrOverdueAmount;

    /**
     * 逾期31-60天未还本金
     */
    @Column(name = "loan_overdue31_to60_amount")
    private BigDecimal loanOverdue31To60Amount;

    /**
     * 逾期61-90天未还本金
     */
    @Column(name = "loan_overdue61_to90_amount")
    private BigDecimal loanOverdue61To90Amount;

    /**
     * 逾期91-180天未还本金
     */
    @Column(name = "loan_overdue91_to180_amount")
    private BigDecimal loanOverdue91To180Amount;

    /**
     * 逾期180天以上未还本金
     */
    @Column(name = "loan_overdue_over180_amount")
    private BigDecimal loanOverdueOver180Amount;

    /**
     * 信息报告日期
     */
    @Column(name = "loan_state_end_date")
    private String loanStateEndDate;

    /**
     * 近24个月还款状态起始年月
     */
    @Column(name = "loan_begin_month")
    private String loanBeginMonth;

    /**
     * 近24个月还款状态截止年月
     */
    @Column(name = "loan_end_month")
    private String loanEndMonth;

    /**
     * 近24个月还款记录月份
     */
    @Column(name = "loan_latest24_month")
    private String loanLatest24Month;

    /**
     * 近24个月还款还款状态
     */
    @Column(name = "loan_latest24_state")
    private String loanLatest24State;

    /**
     * 最新账户状态
     */
    @Column(name = "loan_recent_state")
    private String loanRecentState;

    /**
     * 贷款结清日期
     */
    @Column(name = "loan_pay_back_date")
    private String loanPayBackDate;

    /**
     * 最新本金余额
     */
    @Column(name = "loan_recent_balance")
    private BigDecimal loanRecentBalance;

    /**
     * 最新还款日期
     */
    @Column(name = "loan_recent_pay_date")
    private String loanRecentPayDate;

    /**
     * 最新还款金额
     */
    @Column(name = "loan_recent_pay_amount")
    private BigDecimal loanRecentPayAmount;

    /**
     * 最新五级分类
     */
    @Column(name = "loan_recent_class5_state")
    private String loanRecentClass5State;

    /**
     * 最新还款状态
     */
    @Column(name = "loan_recent_payment_state")
    private String loanRecentPaymentState;

    /**
     * 最新信息报告日期
     */
    @Column(name = "loan_recent_state_begin_date")
    private String loanRecentStateBeginDate;

    /**
     * 最近5年内的起始年月
     */
    @Column(name = "loan_latest5_year_begin_month")
    private String loanLatest5YearBeginMonth;

    /**
     * 最近5年内的截止年月
     */
    @Column(name = "loan_latest5_year_end_month")
    private String loanLatest5YearEndMonth;

    /**
     * 最近5年内的月数
     */
    @Column(name = "loan_latest5_year_months")
    private String loanLatest5YearMonths;

    /**
     * 最近5年内的月份
     */
    @Column(name = "loan_latest5_year_payment_month")
    private String loanLatest5YearPaymentMonth;

    /**
     * 最近5年内的还款状态
     */
    @Column(name = "loan_latest5_year_payment_state")
    private String loanLatest5YearPaymentState;

    /**
     * 最近5年内的逾期（透支）总额
     */
    @Column(name = "loan_latest5_year_overdue_money")
    private String loanLatest5YearOverdueMoney;

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

    public String getLoanCreditLimitNo() {
        return loanCreditLimitNo;
    }

    public void setLoanCreditLimitNo(String loanCreditLimitNo) {
        this.loanCreditLimitNo = loanCreditLimitNo == null ? null : loanCreditLimitNo.trim();
    }

    public String getLoanFinanceType() {
        return loanFinanceType;
    }

    public void setLoanFinanceType(String loanFinanceType) {
        this.loanFinanceType = loanFinanceType == null ? null : loanFinanceType.trim();
    }

    public String getLoanFinanceOrg() {
        return loanFinanceOrg;
    }

    public void setLoanFinanceOrg(String loanFinanceOrg) {
        this.loanFinanceOrg = loanFinanceOrg == null ? null : loanFinanceOrg.trim();
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

    public String getLoanAccountType() {
        return loanAccountType;
    }

    public void setLoanAccountType(String loanAccountType) {
        this.loanAccountType = loanAccountType == null ? null : loanAccountType.trim();
    }

    public String getLoanOpenDate() {
        return loanOpenDate;
    }

    public void setLoanOpenDate(String loanOpenDate) {
        this.loanOpenDate = loanOpenDate == null ? null : loanOpenDate.trim();
    }

    public String getLoanEndDate() {
        return loanEndDate;
    }

    public void setLoanEndDate(String loanEndDate) {
        this.loanEndDate = loanEndDate == null ? null : loanEndDate.trim();
    }

    public BigDecimal getLoanBusinessAmount() {
        return loanBusinessAmount;
    }

    public void setLoanBusinessAmount(BigDecimal loanBusinessAmount) {
        this.loanBusinessAmount = loanBusinessAmount;
    }

    public String getLoanCurrency() {
        return loanCurrency;
    }

    public void setLoanCurrency(String loanCurrency) {
        this.loanCurrency = loanCurrency == null ? null : loanCurrency.trim();
    }

    public String getLoanLoanbizType() {
        return loanLoanbizType;
    }

    public void setLoanLoanbizType(String loanLoanbizType) {
        this.loanLoanbizType = loanLoanbizType == null ? null : loanLoanbizType.trim();
    }

    public String getLoanGuaranteeType() {
        return loanGuaranteeType;
    }

    public void setLoanGuaranteeType(String loanGuaranteeType) {
        this.loanGuaranteeType = loanGuaranteeType == null ? null : loanGuaranteeType.trim();
    }

    public Double getLoanPaymentCyc() {
        return loanPaymentCyc;
    }

    public void setLoanPaymentCyc(Double loanPaymentCyc) {
        this.loanPaymentCyc = loanPaymentCyc;
    }

    public String getLoanPaymentRating() {
        return loanPaymentRating;
    }

    public void setLoanPaymentRating(String loanPaymentRating) {
        this.loanPaymentRating = loanPaymentRating == null ? null : loanPaymentRating.trim();
    }

    public String getLoanPaymentType() {
        return loanPaymentType;
    }

    public void setLoanPaymentType(String loanPaymentType) {
        this.loanPaymentType = loanPaymentType == null ? null : loanPaymentType.trim();
    }

    public String getLoanTogetherType() {
        return loanTogetherType;
    }

    public void setLoanTogetherType(String loanTogetherType) {
        this.loanTogetherType = loanTogetherType == null ? null : loanTogetherType.trim();
    }

    public String getLoanLatestMonth() {
        return loanLatestMonth;
    }

    public void setLoanLatestMonth(String loanLatestMonth) {
        this.loanLatestMonth = loanLatestMonth == null ? null : loanLatestMonth.trim();
    }

    public String getLoanState() {
        return loanState;
    }

    public void setLoanState(String loanState) {
        this.loanState = loanState == null ? null : loanState.trim();
    }

    public String getLoanClass5State() {
        return loanClass5State;
    }

    public void setLoanClass5State(String loanClass5State) {
        this.loanClass5State = loanClass5State == null ? null : loanClass5State.trim();
    }

    public BigDecimal getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(BigDecimal loanBalance) {
        this.loanBalance = loanBalance;
    }

    public Double getLoanRemainPaymentCyc() {
        return loanRemainPaymentCyc;
    }

    public void setLoanRemainPaymentCyc(Double loanRemainPaymentCyc) {
        this.loanRemainPaymentCyc = loanRemainPaymentCyc;
    }

    public String getLoanScheduledPaymentDate() {
        return loanScheduledPaymentDate;
    }

    public void setLoanScheduledPaymentDate(String loanScheduledPaymentDate) {
        this.loanScheduledPaymentDate = loanScheduledPaymentDate == null ? null : loanScheduledPaymentDate.trim();
    }

    public BigDecimal getLoanScheduledPaymentAmount() {
        return loanScheduledPaymentAmount;
    }

    public void setLoanScheduledPaymentAmount(BigDecimal loanScheduledPaymentAmount) {
        this.loanScheduledPaymentAmount = loanScheduledPaymentAmount;
    }

    public BigDecimal getLoanActualPaymentAmount() {
        return loanActualPaymentAmount;
    }

    public void setLoanActualPaymentAmount(BigDecimal loanActualPaymentAmount) {
        this.loanActualPaymentAmount = loanActualPaymentAmount;
    }

    public String getLoanLatestPaymentDate() {
        return loanLatestPaymentDate;
    }

    public void setLoanLatestPaymentDate(String loanLatestPaymentDate) {
        this.loanLatestPaymentDate = loanLatestPaymentDate == null ? null : loanLatestPaymentDate.trim();
    }

    public Double getLoanCurrOverdueCyc() {
        return loanCurrOverdueCyc;
    }

    public void setLoanCurrOverdueCyc(Double loanCurrOverdueCyc) {
        this.loanCurrOverdueCyc = loanCurrOverdueCyc;
    }

    public BigDecimal getLoanCurrOverdueAmount() {
        return loanCurrOverdueAmount;
    }

    public void setLoanCurrOverdueAmount(BigDecimal loanCurrOverdueAmount) {
        this.loanCurrOverdueAmount = loanCurrOverdueAmount;
    }

    public BigDecimal getLoanOverdue31To60Amount() {
        return loanOverdue31To60Amount;
    }

    public void setLoanOverdue31To60Amount(BigDecimal loanOverdue31To60Amount) {
        this.loanOverdue31To60Amount = loanOverdue31To60Amount;
    }

    public BigDecimal getLoanOverdue61To90Amount() {
        return loanOverdue61To90Amount;
    }

    public void setLoanOverdue61To90Amount(BigDecimal loanOverdue61To90Amount) {
        this.loanOverdue61To90Amount = loanOverdue61To90Amount;
    }

    public BigDecimal getLoanOverdue91To180Amount() {
        return loanOverdue91To180Amount;
    }

    public void setLoanOverdue91To180Amount(BigDecimal loanOverdue91To180Amount) {
        this.loanOverdue91To180Amount = loanOverdue91To180Amount;
    }

    public BigDecimal getLoanOverdueOver180Amount() {
        return loanOverdueOver180Amount;
    }

    public void setLoanOverdueOver180Amount(BigDecimal loanOverdueOver180Amount) {
        this.loanOverdueOver180Amount = loanOverdueOver180Amount;
    }

    public String getLoanStateEndDate() {
        return loanStateEndDate;
    }

    public void setLoanStateEndDate(String loanStateEndDate) {
        this.loanStateEndDate = loanStateEndDate == null ? null : loanStateEndDate.trim();
    }

    public String getLoanBeginMonth() {
        return loanBeginMonth;
    }

    public void setLoanBeginMonth(String loanBeginMonth) {
        this.loanBeginMonth = loanBeginMonth == null ? null : loanBeginMonth.trim();
    }

    public String getLoanEndMonth() {
        return loanEndMonth;
    }

    public void setLoanEndMonth(String loanEndMonth) {
        this.loanEndMonth = loanEndMonth == null ? null : loanEndMonth.trim();
    }

    public String getLoanLatest24Month() {
        return loanLatest24Month;
    }

    public void setLoanLatest24Month(String loanLatest24Month) {
        this.loanLatest24Month = loanLatest24Month == null ? null : loanLatest24Month.trim();
    }

    public String getLoanLatest24State() {
        return loanLatest24State;
    }

    public void setLoanLatest24State(String loanLatest24State) {
        this.loanLatest24State = loanLatest24State == null ? null : loanLatest24State.trim();
    }

    public String getLoanRecentState() {
        return loanRecentState;
    }

    public void setLoanRecentState(String loanRecentState) {
        this.loanRecentState = loanRecentState == null ? null : loanRecentState.trim();
    }

    public String getLoanPayBackDate() {
        return loanPayBackDate;
    }

    public void setLoanPayBackDate(String loanPayBackDate) {
        this.loanPayBackDate = loanPayBackDate == null ? null : loanPayBackDate.trim();
    }

    public BigDecimal getLoanRecentBalance() {
        return loanRecentBalance;
    }

    public void setLoanRecentBalance(BigDecimal loanRecentBalance) {
        this.loanRecentBalance = loanRecentBalance;
    }

    public String getLoanRecentPayDate() {
        return loanRecentPayDate;
    }

    public void setLoanRecentPayDate(String loanRecentPayDate) {
        this.loanRecentPayDate = loanRecentPayDate == null ? null : loanRecentPayDate.trim();
    }

    public BigDecimal getLoanRecentPayAmount() {
        return loanRecentPayAmount;
    }

    public void setLoanRecentPayAmount(BigDecimal loanRecentPayAmount) {
        this.loanRecentPayAmount = loanRecentPayAmount;
    }

    public String getLoanRecentClass5State() {
        return loanRecentClass5State;
    }

    public void setLoanRecentClass5State(String loanRecentClass5State) {
        this.loanRecentClass5State = loanRecentClass5State == null ? null : loanRecentClass5State.trim();
    }

    public String getLoanRecentPaymentState() {
        return loanRecentPaymentState;
    }

    public void setLoanRecentPaymentState(String loanRecentPaymentState) {
        this.loanRecentPaymentState = loanRecentPaymentState == null ? null : loanRecentPaymentState.trim();
    }

    public String getLoanRecentStateBeginDate() {
        return loanRecentStateBeginDate;
    }

    public void setLoanRecentStateBeginDate(String loanRecentStateBeginDate) {
        this.loanRecentStateBeginDate = loanRecentStateBeginDate == null ? null : loanRecentStateBeginDate.trim();
    }

    public String getLoanLatest5YearBeginMonth() {
        return loanLatest5YearBeginMonth;
    }

    public void setLoanLatest5YearBeginMonth(String loanLatest5YearBeginMonth) {
        this.loanLatest5YearBeginMonth = loanLatest5YearBeginMonth == null ? null : loanLatest5YearBeginMonth.trim();
    }

    public String getLoanLatest5YearEndMonth() {
        return loanLatest5YearEndMonth;
    }

    public void setLoanLatest5YearEndMonth(String loanLatest5YearEndMonth) {
        this.loanLatest5YearEndMonth = loanLatest5YearEndMonth == null ? null : loanLatest5YearEndMonth.trim();
    }

    public String getLoanLatest5YearMonths() {
        return loanLatest5YearMonths;
    }

    public void setLoanLatest5YearMonths(String loanLatest5YearMonths) {
        this.loanLatest5YearMonths = loanLatest5YearMonths == null ? null : loanLatest5YearMonths.trim();
    }

    public String getLoanLatest5YearPaymentMonth() {
        return loanLatest5YearPaymentMonth;
    }

    public void setLoanLatest5YearPaymentMonth(String loanLatest5YearPaymentMonth) {
        this.loanLatest5YearPaymentMonth = loanLatest5YearPaymentMonth == null ? null : loanLatest5YearPaymentMonth.trim();
    }

    public String getLoanLatest5YearPaymentState() {
        return loanLatest5YearPaymentState;
    }

    public void setLoanLatest5YearPaymentState(String loanLatest5YearPaymentState) {
        this.loanLatest5YearPaymentState = loanLatest5YearPaymentState == null ? null : loanLatest5YearPaymentState.trim();
    }

    public String getLoanLatest5YearOverdueMoney() {
        return loanLatest5YearOverdueMoney;
    }

    public void setLoanLatest5YearOverdueMoney(String loanLatest5YearOverdueMoney) {
        this.loanLatest5YearOverdueMoney = loanLatest5YearOverdueMoney == null ? null : loanLatest5YearOverdueMoney.trim();
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