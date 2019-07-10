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
@Table(name = "src_icr2_non_reloan_info")
public class SrcIcr2NonReloanInfo {
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
    @Column(name = "non_reloan_credit_limit_no")
    private String nonReloanCreditLimitNo;

    /**
     * 管理机构类型
     */
    @Column(name = "non_reloan_finance_type")
    private String nonReloanFinanceType;

    /**
     * 管理机构代码
     */
    @Column(name = "non_reloan_finance_org")
    private String nonReloanFinanceOrg;

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
    @Column(name = "non_reloan_account_type")
    private String nonReloanAccountType;

    /**
     * 首次放款日期
     */
    @Column(name = "non_reloan_open_date")
    private String nonReloanOpenDate;

    /**
     * 到期日期
     */
    @Column(name = "non_reloan_end_date")
    private String nonReloanEndDate;

    /**
     * 借款金额
     */
    @Column(name = "non_reloan_business_amount")
    private BigDecimal nonReloanBusinessAmount;

    /**
     * 币种
     */
    @Column(name = "non_reloan_currency")
    private String nonReloanCurrency;

    /**
     * 业务种类
     */
    @Column(name = "non_reloan_loanbiz_type")
    private String nonReloanLoanbizType;

    /**
     * 担保方式
     */
    @Column(name = "non_reloan_guarantee_type")
    private String nonReloanGuaranteeType;

    /**
     * 还款期数
     */
    @Column(name = "non_reloan_payment_cyc")
    private Double nonReloanPaymentCyc;

    /**
     * 还款频率
     */
    @Column(name = "non_reloan_payment_rating")
    private String nonReloanPaymentRating;

    /**
     * 还款方式
     */
    @Column(name = "non_reloan_payment_type")
    private String nonReloanPaymentType;

    /**
     * 共同借款标志
     */
    @Column(name = "non_reloan_together_type")
    private String nonReloanTogetherType;

    /**
     * 贷款发放形式
     */
    @Column(name = "non_reloan_open_type")
    private String nonReloanOpenType;

    /**
     * 最近一次月份
     */
    @Column(name = "non_reloan_latest_month")
    private String nonReloanLatestMonth;

    /**
     * 账户状态
     */
    @Column(name = "non_reloan_state")
    private String nonReloanState;

    /**
     * 五级分类
     */
    @Column(name = "non_reloan_class5_state")
    private String nonReloanClass5State;

    /**
     * 余额
     */
    @Column(name = "non_reloan_balance")
    private BigDecimal nonReloanBalance;

    /**
     * 剩余还款期数
     */
    @Column(name = "non_reloan_remain_payment_cyc")
    private Double nonReloanRemainPaymentCyc;

    /**
     * 本应还款日
     */
    @Column(name = "non_reloan_scheduled_payment_date")
    private String nonReloanScheduledPaymentDate;

    /**
     * 本月应还款
     */
    @Column(name = "non_reloan_scheduled_payment_amount")
    private BigDecimal nonReloanScheduledPaymentAmount;

    /**
     * 本月实还款
     */
    @Column(name = "non_reloan_actual_payment_amount")
    private BigDecimal nonReloanActualPaymentAmount;

    /**
     * 最近一次还款日期
     */
    @Column(name = "non_reloan_latest_payment_date")
    private String nonReloanLatestPaymentDate;

    /**
     * 当前逾期期数
     */
    @Column(name = "non_reloan_curr_overdue_cyc")
    private Double nonReloanCurrOverdueCyc;

    /**
     * 当前逾期总额
     */
    @Column(name = "non_reloan_curr_overdue_amount")
    private BigDecimal nonReloanCurrOverdueAmount;

    /**
     * 逾期31-60天未还本金
     */
    @Column(name = "non_reloan_overdue31_to60_amount")
    private BigDecimal nonReloanOverdue31To60Amount;

    /**
     * 逾期61-90天未还本金
     */
    @Column(name = "non_reloan_overdue61_to90_amount")
    private BigDecimal nonReloanOverdue61To90Amount;

    /**
     * 逾期91-180天未还本金
     */
    @Column(name = "non_reloan_overdue91_to180_amount")
    private BigDecimal nonReloanOverdue91To180Amount;

    /**
     * 逾期180天以上未还本金
     */
    @Column(name = "non_reloan_overdue_over180_amount")
    private BigDecimal nonReloanOverdueOver180Amount;

    /**
     * 信息报告日期
     */
    @Column(name = "non_reloan_state_end_date")
    private String nonReloanStateEndDate;

    /**
     * 近24个月还款状态起始年月
     */
    @Column(name = "non_reloan_begin_month")
    private String nonReloanBeginMonth;

    /**
     * 近24个月还款状态截止年月
     */
    @Column(name = "non_reloan_end_month")
    private String nonReloanEndMonth;

    /**
     * 近24个月还款记录月份
     */
    @Column(name = "non_reloan_latest24_month")
    private String nonReloanLatest24Month;

    /**
     * 近24个月还款还款状态
     */
    @Column(name = "non_reloan_latest24_state")
    private String nonReloanLatest24State;

    /**
     * 最新账户状态
     */
    @Column(name = "non_reloan_recent_state")
    private String nonReloanRecentState;

    /**
     * 贷款结清日期
     */
    @Column(name = "non_reloan_pay_back_date")
    private String nonReloanPayBackDate;

    /**
     * 转出月份
     */
    @Column(name = "non_reloan_turn_out_date")
    private String nonReloanTurnOutDate;

    /**
     * 最新本金余额
     */
    @Column(name = "non_reloan_recent_balance")
    private BigDecimal nonReloanRecentBalance;

    /**
     * 最新还款日期
     */
    @Column(name = "non_reloan_recent_pay_date")
    private String nonReloanRecentPayDate;

    /**
     * 最新还款金额
     */
    @Column(name = "non_reloan_recent_pay_amount")
    private BigDecimal nonReloanRecentPayAmount;

    /**
     * 最新五级分类 
     */
    @Column(name = "non_reloan_recent_class5_state")
    private String nonReloanRecentClass5State;

    /**
     * 最新还款状态
     */
    @Column(name = "non_reloan_recent_payment_state")
    private String nonReloanRecentPaymentState;

    /**
     * 最新信息报告日期
     */
    @Column(name = "non_reloan_recent_state_begin_date")
    private String nonReloanRecentStateBeginDate;

    /**
     * 最近5年内的起始年月 
     */
    @Column(name = "non_reloan_latest5_year_begin_month")
    private String nonReloanLatest5YearBeginMonth;

    /**
     * 最近5年内的截止年月
     */
    @Column(name = "non_reloan_latest5_year_end_month")
    private String nonReloanLatest5YearEndMonth;

    /**
     * 最近5年内的月数
     */
    @Column(name = "non_reloan_latest5_year_months")
    private String nonReloanLatest5YearMonths;

    /**
     * 最近5年内的月份
     */
    @Column(name = "non_reloan_latest5_year_payment_month")
    private String nonReloanLatest5YearPaymentMonth;

    /**
     * 最近5年内的还款状态
     */
    @Column(name = "non_reloan_latest5_year_payment_state")
    private String nonReloanLatest5YearPaymentState;

    /**
     * 最近5年内的逾期（透支）总额
     */
    @Column(name = "non_reloan_latest5_year_overdue_money")
    private String nonReloanLatest5YearOverdueMoney;

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

    public String getNonReloanCreditLimitNo() {
        return nonReloanCreditLimitNo;
    }

    public void setNonReloanCreditLimitNo(String nonReloanCreditLimitNo) {
        this.nonReloanCreditLimitNo = nonReloanCreditLimitNo == null ? null : nonReloanCreditLimitNo.trim();
    }

    public String getNonReloanFinanceType() {
        return nonReloanFinanceType;
    }

    public void setNonReloanFinanceType(String nonReloanFinanceType) {
        this.nonReloanFinanceType = nonReloanFinanceType == null ? null : nonReloanFinanceType.trim();
    }

    public String getNonReloanFinanceOrg() {
        return nonReloanFinanceOrg;
    }

    public void setNonReloanFinanceOrg(String nonReloanFinanceOrg) {
        this.nonReloanFinanceOrg = nonReloanFinanceOrg == null ? null : nonReloanFinanceOrg.trim();
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

    public String getNonReloanAccountType() {
        return nonReloanAccountType;
    }

    public void setNonReloanAccountType(String nonReloanAccountType) {
        this.nonReloanAccountType = nonReloanAccountType == null ? null : nonReloanAccountType.trim();
    }

    public String getNonReloanOpenDate() {
        return nonReloanOpenDate;
    }

    public void setNonReloanOpenDate(String nonReloanOpenDate) {
        this.nonReloanOpenDate = nonReloanOpenDate == null ? null : nonReloanOpenDate.trim();
    }

    public String getNonReloanEndDate() {
        return nonReloanEndDate;
    }

    public void setNonReloanEndDate(String nonReloanEndDate) {
        this.nonReloanEndDate = nonReloanEndDate == null ? null : nonReloanEndDate.trim();
    }

    public BigDecimal getNonReloanBusinessAmount() {
        return nonReloanBusinessAmount;
    }

    public void setNonReloanBusinessAmount(BigDecimal nonReloanBusinessAmount) {
        this.nonReloanBusinessAmount = nonReloanBusinessAmount;
    }

    public String getNonReloanCurrency() {
        return nonReloanCurrency;
    }

    public void setNonReloanCurrency(String nonReloanCurrency) {
        this.nonReloanCurrency = nonReloanCurrency == null ? null : nonReloanCurrency.trim();
    }

    public String getNonReloanLoanbizType() {
        return nonReloanLoanbizType;
    }

    public void setNonReloanLoanbizType(String nonReloanLoanbizType) {
        this.nonReloanLoanbizType = nonReloanLoanbizType == null ? null : nonReloanLoanbizType.trim();
    }

    public String getNonReloanGuaranteeType() {
        return nonReloanGuaranteeType;
    }

    public void setNonReloanGuaranteeType(String nonReloanGuaranteeType) {
        this.nonReloanGuaranteeType = nonReloanGuaranteeType == null ? null : nonReloanGuaranteeType.trim();
    }

    public Double getNonReloanPaymentCyc() {
        return nonReloanPaymentCyc;
    }

    public void setNonReloanPaymentCyc(Double nonReloanPaymentCyc) {
        this.nonReloanPaymentCyc = nonReloanPaymentCyc;
    }

    public String getNonReloanPaymentRating() {
        return nonReloanPaymentRating;
    }

    public void setNonReloanPaymentRating(String nonReloanPaymentRating) {
        this.nonReloanPaymentRating = nonReloanPaymentRating == null ? null : nonReloanPaymentRating.trim();
    }

    public String getNonReloanPaymentType() {
        return nonReloanPaymentType;
    }

    public void setNonReloanPaymentType(String nonReloanPaymentType) {
        this.nonReloanPaymentType = nonReloanPaymentType == null ? null : nonReloanPaymentType.trim();
    }

    public String getNonReloanTogetherType() {
        return nonReloanTogetherType;
    }

    public void setNonReloanTogetherType(String nonReloanTogetherType) {
        this.nonReloanTogetherType = nonReloanTogetherType == null ? null : nonReloanTogetherType.trim();
    }

    public String getNonReloanOpenType() {
        return nonReloanOpenType;
    }

    public void setNonReloanOpenType(String nonReloanOpenType) {
        this.nonReloanOpenType = nonReloanOpenType == null ? null : nonReloanOpenType.trim();
    }

    public String getNonReloanLatestMonth() {
        return nonReloanLatestMonth;
    }

    public void setNonReloanLatestMonth(String nonReloanLatestMonth) {
        this.nonReloanLatestMonth = nonReloanLatestMonth == null ? null : nonReloanLatestMonth.trim();
    }

    public String getNonReloanState() {
        return nonReloanState;
    }

    public void setNonReloanState(String nonReloanState) {
        this.nonReloanState = nonReloanState == null ? null : nonReloanState.trim();
    }

    public String getNonReloanClass5State() {
        return nonReloanClass5State;
    }

    public void setNonReloanClass5State(String nonReloanClass5State) {
        this.nonReloanClass5State = nonReloanClass5State == null ? null : nonReloanClass5State.trim();
    }

    public BigDecimal getNonReloanBalance() {
        return nonReloanBalance;
    }

    public void setNonReloanBalance(BigDecimal nonReloanBalance) {
        this.nonReloanBalance = nonReloanBalance;
    }

    public Double getNonReloanRemainPaymentCyc() {
        return nonReloanRemainPaymentCyc;
    }

    public void setNonReloanRemainPaymentCyc(Double nonReloanRemainPaymentCyc) {
        this.nonReloanRemainPaymentCyc = nonReloanRemainPaymentCyc;
    }

    public String getNonReloanScheduledPaymentDate() {
        return nonReloanScheduledPaymentDate;
    }

    public void setNonReloanScheduledPaymentDate(String nonReloanScheduledPaymentDate) {
        this.nonReloanScheduledPaymentDate = nonReloanScheduledPaymentDate == null ? null : nonReloanScheduledPaymentDate.trim();
    }

    public BigDecimal getNonReloanScheduledPaymentAmount() {
        return nonReloanScheduledPaymentAmount;
    }

    public void setNonReloanScheduledPaymentAmount(BigDecimal nonReloanScheduledPaymentAmount) {
        this.nonReloanScheduledPaymentAmount = nonReloanScheduledPaymentAmount;
    }

    public BigDecimal getNonReloanActualPaymentAmount() {
        return nonReloanActualPaymentAmount;
    }

    public void setNonReloanActualPaymentAmount(BigDecimal nonReloanActualPaymentAmount) {
        this.nonReloanActualPaymentAmount = nonReloanActualPaymentAmount;
    }

    public String getNonReloanLatestPaymentDate() {
        return nonReloanLatestPaymentDate;
    }

    public void setNonReloanLatestPaymentDate(String nonReloanLatestPaymentDate) {
        this.nonReloanLatestPaymentDate = nonReloanLatestPaymentDate == null ? null : nonReloanLatestPaymentDate.trim();
    }

    public Double getNonReloanCurrOverdueCyc() {
        return nonReloanCurrOverdueCyc;
    }

    public void setNonReloanCurrOverdueCyc(Double nonReloanCurrOverdueCyc) {
        this.nonReloanCurrOverdueCyc = nonReloanCurrOverdueCyc;
    }

    public BigDecimal getNonReloanCurrOverdueAmount() {
        return nonReloanCurrOverdueAmount;
    }

    public void setNonReloanCurrOverdueAmount(BigDecimal nonReloanCurrOverdueAmount) {
        this.nonReloanCurrOverdueAmount = nonReloanCurrOverdueAmount;
    }

    public BigDecimal getNonReloanOverdue31To60Amount() {
        return nonReloanOverdue31To60Amount;
    }

    public void setNonReloanOverdue31To60Amount(BigDecimal nonReloanOverdue31To60Amount) {
        this.nonReloanOverdue31To60Amount = nonReloanOverdue31To60Amount;
    }

    public BigDecimal getNonReloanOverdue61To90Amount() {
        return nonReloanOverdue61To90Amount;
    }

    public void setNonReloanOverdue61To90Amount(BigDecimal nonReloanOverdue61To90Amount) {
        this.nonReloanOverdue61To90Amount = nonReloanOverdue61To90Amount;
    }

    public BigDecimal getNonReloanOverdue91To180Amount() {
        return nonReloanOverdue91To180Amount;
    }

    public void setNonReloanOverdue91To180Amount(BigDecimal nonReloanOverdue91To180Amount) {
        this.nonReloanOverdue91To180Amount = nonReloanOverdue91To180Amount;
    }

    public BigDecimal getNonReloanOverdueOver180Amount() {
        return nonReloanOverdueOver180Amount;
    }

    public void setNonReloanOverdueOver180Amount(BigDecimal nonReloanOverdueOver180Amount) {
        this.nonReloanOverdueOver180Amount = nonReloanOverdueOver180Amount;
    }

    public String getNonReloanStateEndDate() {
        return nonReloanStateEndDate;
    }

    public void setNonReloanStateEndDate(String nonReloanStateEndDate) {
        this.nonReloanStateEndDate = nonReloanStateEndDate == null ? null : nonReloanStateEndDate.trim();
    }

    public String getNonReloanBeginMonth() {
        return nonReloanBeginMonth;
    }

    public void setNonReloanBeginMonth(String nonReloanBeginMonth) {
        this.nonReloanBeginMonth = nonReloanBeginMonth == null ? null : nonReloanBeginMonth.trim();
    }

    public String getNonReloanEndMonth() {
        return nonReloanEndMonth;
    }

    public void setNonReloanEndMonth(String nonReloanEndMonth) {
        this.nonReloanEndMonth = nonReloanEndMonth == null ? null : nonReloanEndMonth.trim();
    }

    public String getNonReloanLatest24Month() {
        return nonReloanLatest24Month;
    }

    public void setNonReloanLatest24Month(String nonReloanLatest24Month) {
        this.nonReloanLatest24Month = nonReloanLatest24Month == null ? null : nonReloanLatest24Month.trim();
    }

    public String getNonReloanLatest24State() {
        return nonReloanLatest24State;
    }

    public void setNonReloanLatest24State(String nonReloanLatest24State) {
        this.nonReloanLatest24State = nonReloanLatest24State == null ? null : nonReloanLatest24State.trim();
    }

    public String getNonReloanRecentState() {
        return nonReloanRecentState;
    }

    public void setNonReloanRecentState(String nonReloanRecentState) {
        this.nonReloanRecentState = nonReloanRecentState == null ? null : nonReloanRecentState.trim();
    }

    public String getNonReloanPayBackDate() {
        return nonReloanPayBackDate;
    }

    public void setNonReloanPayBackDate(String nonReloanPayBackDate) {
        this.nonReloanPayBackDate = nonReloanPayBackDate == null ? null : nonReloanPayBackDate.trim();
    }

    public String getNonReloanTurnOutDate() {
        return nonReloanTurnOutDate;
    }

    public void setNonReloanTurnOutDate(String nonReloanTurnOutDate) {
        this.nonReloanTurnOutDate = nonReloanTurnOutDate == null ? null : nonReloanTurnOutDate.trim();
    }

    public BigDecimal getNonReloanRecentBalance() {
        return nonReloanRecentBalance;
    }

    public void setNonReloanRecentBalance(BigDecimal nonReloanRecentBalance) {
        this.nonReloanRecentBalance = nonReloanRecentBalance;
    }

    public String getNonReloanRecentPayDate() {
        return nonReloanRecentPayDate;
    }

    public void setNonReloanRecentPayDate(String nonReloanRecentPayDate) {
        this.nonReloanRecentPayDate = nonReloanRecentPayDate == null ? null : nonReloanRecentPayDate.trim();
    }

    public BigDecimal getNonReloanRecentPayAmount() {
        return nonReloanRecentPayAmount;
    }

    public void setNonReloanRecentPayAmount(BigDecimal nonReloanRecentPayAmount) {
        this.nonReloanRecentPayAmount = nonReloanRecentPayAmount;
    }

    public String getNonReloanRecentClass5State() {
        return nonReloanRecentClass5State;
    }

    public void setNonReloanRecentClass5State(String nonReloanRecentClass5State) {
        this.nonReloanRecentClass5State = nonReloanRecentClass5State == null ? null : nonReloanRecentClass5State.trim();
    }

    public String getNonReloanRecentPaymentState() {
        return nonReloanRecentPaymentState;
    }

    public void setNonReloanRecentPaymentState(String nonReloanRecentPaymentState) {
        this.nonReloanRecentPaymentState = nonReloanRecentPaymentState == null ? null : nonReloanRecentPaymentState.trim();
    }

    public String getNonReloanRecentStateBeginDate() {
        return nonReloanRecentStateBeginDate;
    }

    public void setNonReloanRecentStateBeginDate(String nonReloanRecentStateBeginDate) {
        this.nonReloanRecentStateBeginDate = nonReloanRecentStateBeginDate == null ? null : nonReloanRecentStateBeginDate.trim();
    }

    public String getNonReloanLatest5YearBeginMonth() {
        return nonReloanLatest5YearBeginMonth;
    }

    public void setNonReloanLatest5YearBeginMonth(String nonReloanLatest5YearBeginMonth) {
        this.nonReloanLatest5YearBeginMonth = nonReloanLatest5YearBeginMonth == null ? null : nonReloanLatest5YearBeginMonth.trim();
    }

    public String getNonReloanLatest5YearEndMonth() {
        return nonReloanLatest5YearEndMonth;
    }

    public void setNonReloanLatest5YearEndMonth(String nonReloanLatest5YearEndMonth) {
        this.nonReloanLatest5YearEndMonth = nonReloanLatest5YearEndMonth == null ? null : nonReloanLatest5YearEndMonth.trim();
    }

    public String getNonReloanLatest5YearMonths() {
        return nonReloanLatest5YearMonths;
    }

    public void setNonReloanLatest5YearMonths(String nonReloanLatest5YearMonths) {
        this.nonReloanLatest5YearMonths = nonReloanLatest5YearMonths == null ? null : nonReloanLatest5YearMonths.trim();
    }

    public String getNonReloanLatest5YearPaymentMonth() {
        return nonReloanLatest5YearPaymentMonth;
    }

    public void setNonReloanLatest5YearPaymentMonth(String nonReloanLatest5YearPaymentMonth) {
        this.nonReloanLatest5YearPaymentMonth = nonReloanLatest5YearPaymentMonth == null ? null : nonReloanLatest5YearPaymentMonth.trim();
    }

    public String getNonReloanLatest5YearPaymentState() {
        return nonReloanLatest5YearPaymentState;
    }

    public void setNonReloanLatest5YearPaymentState(String nonReloanLatest5YearPaymentState) {
        this.nonReloanLatest5YearPaymentState = nonReloanLatest5YearPaymentState == null ? null : nonReloanLatest5YearPaymentState.trim();
    }

    public String getNonReloanLatest5YearOverdueMoney() {
        return nonReloanLatest5YearOverdueMoney;
    }

    public void setNonReloanLatest5YearOverdueMoney(String nonReloanLatest5YearOverdueMoney) {
        this.nonReloanLatest5YearOverdueMoney = nonReloanLatest5YearOverdueMoney == null ? null : nonReloanLatest5YearOverdueMoney.trim();
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