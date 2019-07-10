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
@Table(name = "src_icr2_reloan_info")
public class SrcIcr2ReloanInfo {
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
    @Column(name = "reloan_credit_limit_no")
    private String reloanCreditLimitNo;

    /**
     * 管理机构类型
     */
    @Column(name = "reloan_finance_type")
    private String reloanFinanceType;

    /**
     * 管理机构代码
     */
    @Column(name = "reloan_finance_org")
    private String reloanFinanceOrg;

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
    @Column(name = "reloan_account_type")
    private String reloanAccountType;

    /**
     * 首次放款日期
     */
    @Column(name = "reloan_open_date")
    private String reloanOpenDate;

    /**
     * 到期日期
     */
    @Column(name = "reloan_end_date")
    private String reloanEndDate;

    /**
     * 账户授信额度
     */
    @Column(name = "reloan_credit_limit_amount")
    private BigDecimal reloanCreditLimitAmount;

    /**
     * 币种
     */
    @Column(name = "reloan_currency")
    private String reloanCurrency;

    /**
     * 业务种类
     */
    @Column(name = "reloan_reloanbiz_type")
    private String reloanReloanbizType;

    /**
     * 担保方式
     */
    @Column(name = "reloan_guarantee_type")
    private String reloanGuaranteeType;

    /**
     * 还款频率
     */
    @Column(name = "reloan_payment_rating")
    private String reloanPaymentRating;

    /**
     * 还款方式
     */
    @Column(name = "reloan_payment_type")
    private String reloanPaymentType;

    /**
     * 共同借款标志
     */
    @Column(name = "reloan_together_type")
    private String reloanTogetherType;

    /**
     * 最近一次月份
     */
    @Column(name = "reloan_latest_month")
    private String reloanLatestMonth;

    /**
     * 账户状态
     */
    @Column(name = "reloan_state")
    private String reloanState;

    /**
     * 五级分类
     */
    @Column(name = "reloan_class5_state")
    private String reloanClass5State;

    /**
     * 余额
     */
    @Column(name = "reloan_balance")
    private BigDecimal reloanBalance;

    /**
     * 剩余还款期数
     */
    @Column(name = "reloan_remain_payment_cyc")
    private Double reloanRemainPaymentCyc;

    /**
     * 本应还款日
     */
    @Column(name = "reloan_scheduled_payment_date")
    private String reloanScheduledPaymentDate;

    /**
     * 本月应还款
     */
    @Column(name = "reloan_scheduled_payment_amount")
    private BigDecimal reloanScheduledPaymentAmount;

    /**
     * 本月实还款
     */
    @Column(name = "reloan_actual_payment_amount")
    private BigDecimal reloanActualPaymentAmount;

    /**
     * 最近一次还款日期
     */
    @Column(name = "reloan_latest_payment_date")
    private String reloanLatestPaymentDate;

    /**
     * 当前逾期期数
     */
    @Column(name = "reloan_curr_overdue_cyc")
    private Double reloanCurrOverdueCyc;

    /**
     * 当前逾期总额
     */
    @Column(name = "reloan_curr_overdue_amount")
    private BigDecimal reloanCurrOverdueAmount;

    /**
     * 逾期31-60天未还本金
     */
    @Column(name = "reloan_overdue31_to60_amount")
    private BigDecimal reloanOverdue31To60Amount;

    /**
     * 逾期61-90天未还本金
     */
    @Column(name = "reloan_overdue61_to90_amount")
    private BigDecimal reloanOverdue61To90Amount;

    /**
     * 逾期91-180天未还本金
     */
    @Column(name = "reloan_overdue91_to180_amount")
    private BigDecimal reloanOverdue91To180Amount;

    /**
     * 逾期180天以上未还本金
     */
    @Column(name = "reloan_overdue_over180_amount")
    private BigDecimal reloanOverdueOver180Amount;

    /**
     * 信息报告日期
     */
    @Column(name = "reloan_state_end_date")
    private String reloanStateEndDate;

    /**
     * 近24个月还款状态起始年月
     */
    @Column(name = "reloan_begin_month")
    private String reloanBeginMonth;

    /**
     * 近24个月还款状态截止年月
     */
    @Column(name = "reloan_end_month")
    private String reloanEndMonth;

    /**
     * 近24个月还款记录月份
     */
    @Column(name = "reloan_latest24_month")
    private String reloanLatest24Month;

    /**
     * 近24个月还款还款状态
     */
    @Column(name = "reloan_latest24_state")
    private String reloanLatest24State;

    /**
     * 最新账户状态
     */
    @Column(name = "reloan_recent_state")
    private String reloanRecentState;

    /**
     * 贷款结清日期
     */
    @Column(name = "reloan_pay_back_date")
    private String reloanPayBackDate;

    /**
     * 最新本金余额
     */
    @Column(name = "reloan_recent_balance")
    private BigDecimal reloanRecentBalance;

    /**
     * 最新还款日期
     */
    @Column(name = "reloan_recent_pay_date")
    private String reloanRecentPayDate;

    /**
     * 最新还款金额
     */
    @Column(name = "reloan_recent_pay_amount")
    private BigDecimal reloanRecentPayAmount;

    /**
     * 最新五级分类 
     */
    @Column(name = "reloan_recent_class5_state")
    private String reloanRecentClass5State;

    /**
     * 最新还款状态
     */
    @Column(name = "reloan_recent_payment_state")
    private String reloanRecentPaymentState;

    /**
     * 最新信息报告日期
     */
    @Column(name = "reloan_recent_state_begin_date")
    private String reloanRecentStateBeginDate;

    /**
     * 最近5年内的起始年月 
     */
    @Column(name = "reloan_latest5_year_begin_month")
    private String reloanLatest5YearBeginMonth;

    /**
     * 最近5年内的截止年月
     */
    @Column(name = "reloan_latest5_year_end_month")
    private String reloanLatest5YearEndMonth;

    /**
     * 最近5年内的月数
     */
    @Column(name = "reloan_latest5_year_months")
    private String reloanLatest5YearMonths;

    /**
     * 最近5年内的月份
     */
    @Column(name = "reloan_latest5_year_payment_month")
    private String reloanLatest5YearPaymentMonth;

    /**
     * 最近5年内的还款状态
     */
    @Column(name = "reloan_latest5_year_payment_state")
    private String reloanLatest5YearPaymentState;

    /**
     * 最近5年内的逾期（透支）总额
     */
    @Column(name = "reloan_latest5_year_overdue_money")
    private String reloanLatest5YearOverdueMoney;

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

    public String getReloanCreditLimitNo() {
        return reloanCreditLimitNo;
    }

    public void setReloanCreditLimitNo(String reloanCreditLimitNo) {
        this.reloanCreditLimitNo = reloanCreditLimitNo == null ? null : reloanCreditLimitNo.trim();
    }

    public String getReloanFinanceType() {
        return reloanFinanceType;
    }

    public void setReloanFinanceType(String reloanFinanceType) {
        this.reloanFinanceType = reloanFinanceType == null ? null : reloanFinanceType.trim();
    }

    public String getReloanFinanceOrg() {
        return reloanFinanceOrg;
    }

    public void setReloanFinanceOrg(String reloanFinanceOrg) {
        this.reloanFinanceOrg = reloanFinanceOrg == null ? null : reloanFinanceOrg.trim();
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

    public String getReloanAccountType() {
        return reloanAccountType;
    }

    public void setReloanAccountType(String reloanAccountType) {
        this.reloanAccountType = reloanAccountType == null ? null : reloanAccountType.trim();
    }

    public String getReloanOpenDate() {
        return reloanOpenDate;
    }

    public void setReloanOpenDate(String reloanOpenDate) {
        this.reloanOpenDate = reloanOpenDate == null ? null : reloanOpenDate.trim();
    }

    public String getReloanEndDate() {
        return reloanEndDate;
    }

    public void setReloanEndDate(String reloanEndDate) {
        this.reloanEndDate = reloanEndDate == null ? null : reloanEndDate.trim();
    }

    public BigDecimal getReloanCreditLimitAmount() {
        return reloanCreditLimitAmount;
    }

    public void setReloanCreditLimitAmount(BigDecimal reloanCreditLimitAmount) {
        this.reloanCreditLimitAmount = reloanCreditLimitAmount;
    }

    public String getReloanCurrency() {
        return reloanCurrency;
    }

    public void setReloanCurrency(String reloanCurrency) {
        this.reloanCurrency = reloanCurrency == null ? null : reloanCurrency.trim();
    }

    public String getReloanReloanbizType() {
        return reloanReloanbizType;
    }

    public void setReloanReloanbizType(String reloanReloanbizType) {
        this.reloanReloanbizType = reloanReloanbizType == null ? null : reloanReloanbizType.trim();
    }

    public String getReloanGuaranteeType() {
        return reloanGuaranteeType;
    }

    public void setReloanGuaranteeType(String reloanGuaranteeType) {
        this.reloanGuaranteeType = reloanGuaranteeType == null ? null : reloanGuaranteeType.trim();
    }

    public String getReloanPaymentRating() {
        return reloanPaymentRating;
    }

    public void setReloanPaymentRating(String reloanPaymentRating) {
        this.reloanPaymentRating = reloanPaymentRating == null ? null : reloanPaymentRating.trim();
    }

    public String getReloanPaymentType() {
        return reloanPaymentType;
    }

    public void setReloanPaymentType(String reloanPaymentType) {
        this.reloanPaymentType = reloanPaymentType == null ? null : reloanPaymentType.trim();
    }

    public String getReloanTogetherType() {
        return reloanTogetherType;
    }

    public void setReloanTogetherType(String reloanTogetherType) {
        this.reloanTogetherType = reloanTogetherType == null ? null : reloanTogetherType.trim();
    }

    public String getReloanLatestMonth() {
        return reloanLatestMonth;
    }

    public void setReloanLatestMonth(String reloanLatestMonth) {
        this.reloanLatestMonth = reloanLatestMonth == null ? null : reloanLatestMonth.trim();
    }

    public String getReloanState() {
        return reloanState;
    }

    public void setReloanState(String reloanState) {
        this.reloanState = reloanState == null ? null : reloanState.trim();
    }

    public String getReloanClass5State() {
        return reloanClass5State;
    }

    public void setReloanClass5State(String reloanClass5State) {
        this.reloanClass5State = reloanClass5State == null ? null : reloanClass5State.trim();
    }

    public BigDecimal getReloanBalance() {
        return reloanBalance;
    }

    public void setReloanBalance(BigDecimal reloanBalance) {
        this.reloanBalance = reloanBalance;
    }

    public Double getReloanRemainPaymentCyc() {
        return reloanRemainPaymentCyc;
    }

    public void setReloanRemainPaymentCyc(Double reloanRemainPaymentCyc) {
        this.reloanRemainPaymentCyc = reloanRemainPaymentCyc;
    }

    public String getReloanScheduledPaymentDate() {
        return reloanScheduledPaymentDate;
    }

    public void setReloanScheduledPaymentDate(String reloanScheduledPaymentDate) {
        this.reloanScheduledPaymentDate = reloanScheduledPaymentDate == null ? null : reloanScheduledPaymentDate.trim();
    }

    public BigDecimal getReloanScheduledPaymentAmount() {
        return reloanScheduledPaymentAmount;
    }

    public void setReloanScheduledPaymentAmount(BigDecimal reloanScheduledPaymentAmount) {
        this.reloanScheduledPaymentAmount = reloanScheduledPaymentAmount;
    }

    public BigDecimal getReloanActualPaymentAmount() {
        return reloanActualPaymentAmount;
    }

    public void setReloanActualPaymentAmount(BigDecimal reloanActualPaymentAmount) {
        this.reloanActualPaymentAmount = reloanActualPaymentAmount;
    }

    public String getReloanLatestPaymentDate() {
        return reloanLatestPaymentDate;
    }

    public void setReloanLatestPaymentDate(String reloanLatestPaymentDate) {
        this.reloanLatestPaymentDate = reloanLatestPaymentDate == null ? null : reloanLatestPaymentDate.trim();
    }

    public Double getReloanCurrOverdueCyc() {
        return reloanCurrOverdueCyc;
    }

    public void setReloanCurrOverdueCyc(Double reloanCurrOverdueCyc) {
        this.reloanCurrOverdueCyc = reloanCurrOverdueCyc;
    }

    public BigDecimal getReloanCurrOverdueAmount() {
        return reloanCurrOverdueAmount;
    }

    public void setReloanCurrOverdueAmount(BigDecimal reloanCurrOverdueAmount) {
        this.reloanCurrOverdueAmount = reloanCurrOverdueAmount;
    }

    public BigDecimal getReloanOverdue31To60Amount() {
        return reloanOverdue31To60Amount;
    }

    public void setReloanOverdue31To60Amount(BigDecimal reloanOverdue31To60Amount) {
        this.reloanOverdue31To60Amount = reloanOverdue31To60Amount;
    }

    public BigDecimal getReloanOverdue61To90Amount() {
        return reloanOverdue61To90Amount;
    }

    public void setReloanOverdue61To90Amount(BigDecimal reloanOverdue61To90Amount) {
        this.reloanOverdue61To90Amount = reloanOverdue61To90Amount;
    }

    public BigDecimal getReloanOverdue91To180Amount() {
        return reloanOverdue91To180Amount;
    }

    public void setReloanOverdue91To180Amount(BigDecimal reloanOverdue91To180Amount) {
        this.reloanOverdue91To180Amount = reloanOverdue91To180Amount;
    }

    public BigDecimal getReloanOverdueOver180Amount() {
        return reloanOverdueOver180Amount;
    }

    public void setReloanOverdueOver180Amount(BigDecimal reloanOverdueOver180Amount) {
        this.reloanOverdueOver180Amount = reloanOverdueOver180Amount;
    }

    public String getReloanStateEndDate() {
        return reloanStateEndDate;
    }

    public void setReloanStateEndDate(String reloanStateEndDate) {
        this.reloanStateEndDate = reloanStateEndDate == null ? null : reloanStateEndDate.trim();
    }

    public String getReloanBeginMonth() {
        return reloanBeginMonth;
    }

    public void setReloanBeginMonth(String reloanBeginMonth) {
        this.reloanBeginMonth = reloanBeginMonth == null ? null : reloanBeginMonth.trim();
    }

    public String getReloanEndMonth() {
        return reloanEndMonth;
    }

    public void setReloanEndMonth(String reloanEndMonth) {
        this.reloanEndMonth = reloanEndMonth == null ? null : reloanEndMonth.trim();
    }

    public String getReloanLatest24Month() {
        return reloanLatest24Month;
    }

    public void setReloanLatest24Month(String reloanLatest24Month) {
        this.reloanLatest24Month = reloanLatest24Month == null ? null : reloanLatest24Month.trim();
    }

    public String getReloanLatest24State() {
        return reloanLatest24State;
    }

    public void setReloanLatest24State(String reloanLatest24State) {
        this.reloanLatest24State = reloanLatest24State == null ? null : reloanLatest24State.trim();
    }

    public String getReloanRecentState() {
        return reloanRecentState;
    }

    public void setReloanRecentState(String reloanRecentState) {
        this.reloanRecentState = reloanRecentState == null ? null : reloanRecentState.trim();
    }

    public String getReloanPayBackDate() {
        return reloanPayBackDate;
    }

    public void setReloanPayBackDate(String reloanPayBackDate) {
        this.reloanPayBackDate = reloanPayBackDate == null ? null : reloanPayBackDate.trim();
    }

    public BigDecimal getReloanRecentBalance() {
        return reloanRecentBalance;
    }

    public void setReloanRecentBalance(BigDecimal reloanRecentBalance) {
        this.reloanRecentBalance = reloanRecentBalance;
    }

    public String getReloanRecentPayDate() {
        return reloanRecentPayDate;
    }

    public void setReloanRecentPayDate(String reloanRecentPayDate) {
        this.reloanRecentPayDate = reloanRecentPayDate == null ? null : reloanRecentPayDate.trim();
    }

    public BigDecimal getReloanRecentPayAmount() {
        return reloanRecentPayAmount;
    }

    public void setReloanRecentPayAmount(BigDecimal reloanRecentPayAmount) {
        this.reloanRecentPayAmount = reloanRecentPayAmount;
    }

    public String getReloanRecentClass5State() {
        return reloanRecentClass5State;
    }

    public void setReloanRecentClass5State(String reloanRecentClass5State) {
        this.reloanRecentClass5State = reloanRecentClass5State == null ? null : reloanRecentClass5State.trim();
    }

    public String getReloanRecentPaymentState() {
        return reloanRecentPaymentState;
    }

    public void setReloanRecentPaymentState(String reloanRecentPaymentState) {
        this.reloanRecentPaymentState = reloanRecentPaymentState == null ? null : reloanRecentPaymentState.trim();
    }

    public String getReloanRecentStateBeginDate() {
        return reloanRecentStateBeginDate;
    }

    public void setReloanRecentStateBeginDate(String reloanRecentStateBeginDate) {
        this.reloanRecentStateBeginDate = reloanRecentStateBeginDate == null ? null : reloanRecentStateBeginDate.trim();
    }

    public String getReloanLatest5YearBeginMonth() {
        return reloanLatest5YearBeginMonth;
    }

    public void setReloanLatest5YearBeginMonth(String reloanLatest5YearBeginMonth) {
        this.reloanLatest5YearBeginMonth = reloanLatest5YearBeginMonth == null ? null : reloanLatest5YearBeginMonth.trim();
    }

    public String getReloanLatest5YearEndMonth() {
        return reloanLatest5YearEndMonth;
    }

    public void setReloanLatest5YearEndMonth(String reloanLatest5YearEndMonth) {
        this.reloanLatest5YearEndMonth = reloanLatest5YearEndMonth == null ? null : reloanLatest5YearEndMonth.trim();
    }

    public String getReloanLatest5YearMonths() {
        return reloanLatest5YearMonths;
    }

    public void setReloanLatest5YearMonths(String reloanLatest5YearMonths) {
        this.reloanLatest5YearMonths = reloanLatest5YearMonths == null ? null : reloanLatest5YearMonths.trim();
    }

    public String getReloanLatest5YearPaymentMonth() {
        return reloanLatest5YearPaymentMonth;
    }

    public void setReloanLatest5YearPaymentMonth(String reloanLatest5YearPaymentMonth) {
        this.reloanLatest5YearPaymentMonth = reloanLatest5YearPaymentMonth == null ? null : reloanLatest5YearPaymentMonth.trim();
    }

    public String getReloanLatest5YearPaymentState() {
        return reloanLatest5YearPaymentState;
    }

    public void setReloanLatest5YearPaymentState(String reloanLatest5YearPaymentState) {
        this.reloanLatest5YearPaymentState = reloanLatest5YearPaymentState == null ? null : reloanLatest5YearPaymentState.trim();
    }

    public String getReloanLatest5YearOverdueMoney() {
        return reloanLatest5YearOverdueMoney;
    }

    public void setReloanLatest5YearOverdueMoney(String reloanLatest5YearOverdueMoney) {
        this.reloanLatest5YearOverdueMoney = reloanLatest5YearOverdueMoney == null ? null : reloanLatest5YearOverdueMoney.trim();
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