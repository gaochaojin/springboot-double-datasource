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
@Table(name = "src_icr2")
public class SrcIcr2 {
    /**
     * 主键id
     */
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 报告编号
     */
    @Column(name = "report_no")
    private String reportNo;

    /**
     * 报告日期
     */
    @Column(name = "date_of_report")
    private String dateOfReport;

    /**
     * 被查询者姓名
     */
    @Column(name = "name")
    private String name;

    /**
     * 被查询者证件类型
     */
    @Column(name = "id_type")
    private String idType;

    /**
     * 被查询者证件号码
     */
    @Column(name = "id_number")
    private String idNumber;

    /**
     * 查询机构代码
     */
    @Column(name = "enquiry_agency")
    private String enquiryAgency;

    /**
     * 查询原因代码
     */
    @Column(name = "enquiry_reason")
    private String enquiryReason;

    /**
     * 异议标注数目
     */
    @Column(name = "dissent_nums")
    private String dissentNums;

    /**
     * 性别
     */
    @Column(name = "gender")
    private String gender;

    /**
     * 出生日期
     */
    @Column(name = "date_of_birth")
    private String dateOfBirth;

    /**
     * 学历
     */
    @Column(name = "education")
    private String education;

    /**
     * 学位
     */
    @Column(name = "degree")
    private String degree;

    /**
     * 就业状况1
     */
    @Column(name = "employment1_status")
    private String employment1Status;

    /**
     * 电子邮箱
     */
    @Column(name = "e_mail")
    private String eMail;

    /**
     * 通讯地址
     */
    @Column(name = "postal_address")
    private String postalAddress;

    /**
     * 国籍
     */
    @Column(name = "nationality")
    private String nationality;

    /**
     * 户籍地址
     */
    @Column(name = "permanent_address")
    private String permanentAddress;

    /**
     * 所有手机号码
     */
    @Column(name = "all_tel_number")
    private String allTelNumber;

    /**
     * 所有手机信息更新日期
     */
    @Column(name = "all_tel_update_date")
    private String allTelUpdateDate;

    /**
     * 婚姻状况
     */
    @Column(name = "marital_status")
    private String maritalStatus;

    /**
     * 配偶姓名
     */
    @Column(name = "spouse_name")
    private String spouseName;

    /**
     * 配偶证件类型
     */
    @Column(name = "spouse_id_type")
    private String spouseIdType;

    /**
     * 配偶证件号码
     */
    @Column(name = "spouse_id_number")
    private String spouseIdNumber;

    /**
     * 配偶工作单位
     */
    @Column(name = "spouse_employer")
    private String spouseEmployer;

    /**
     * 配偶联系电话
     */
    @Column(name = "spouse_tel_number")
    private String spouseTelNumber;

    /**
     * 居住状况
     */
    @Column(name = "property_ownership")
    private String propertyOwnership;

    /**
     * 居住地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 住宅电话
     */
    @Column(name = "home_tel_number")
    private String homeTelNumber;

    /**
     * 居住信息更新日期
     */
    @Column(name = "address_infor_update_date")
    private String addressInforUpdateDate;

    /**
     * 就业状况2
     */
    @Column(name = "employment2_status")
    private String employment2Status;

    /**
     * 工作单位
     */
    @Column(name = "employer")
    private String employer;

    /**
     * 单位性质
     */
    @Column(name = "employer_property")
    private String employerProperty;

    /**
     * 行业
     */
    @Column(name = "industry")
    private String industry;

    /**
     * 单位地址
     */
    @Column(name = "employer_address")
    private String employerAddress;

    /**
     * 单位电话
     */
    @Column(name = "work_tel_number")
    private String workTelNumber;

    /**
     * 职业
     */
    @Column(name = "occupation")
    private String occupation;

    /**
     * 职务
     */
    @Column(name = "position")
    private String position;

    /**
     * 职称
     */
    @Column(name = "title")
    private String title;

    /**
     * 进入本单位年份
     */
    @Column(name = "year_of_accession")
    private String yearOfAccession;

    /**
     * 职业信息更新日期
     */
    @Column(name = "employer_info_update_date")
    private String employerInfoUpdateDate;

    /**
     * 数字解读
     */
    @Column(name = "credit_score")
    private String creditScore;

    /**
     * 相对位置
     */
    @Column(name = "ranking_credit_score")
    private String rankingCreditScore;

    /**
     * 分数说明条数
     */
    @Column(name = "num_credit_score")
    private String numCreditScore;

    /**
     * 分数说明
     */
    @Column(name = "explain_credit_score")
    private String explainCreditScore;

    /**
     * 个人住房贷款账户数
     */
    @Column(name = "residential_mortgage")
    private String residentialMortgage;

    /**
     * 个人商用房（包括商住两用）贷款账户数
     */
    @Column(name = "commercial_residential_mortgage")
    private String commercialResidentialMortgage;

    /**
     * 其他贷款账户数
     */
    @Column(name = "other_mortgage")
    private String otherMortgage;

    /**
     * 贷记卡账户数
     */
    @Column(name = "credit_card_numbers")
    private String creditCardNumbers;

    /**
     * 准贷记卡账户数
     */
    @Column(name = "semi_credit_card")
    private String semiCreditCard;

    /**
     * 其他账户数
     */
    @Column(name = "other_numbers")
    private String otherNumbers;

    /**
     * 首笔个人住房贷款发放月份
     */
    @Column(name = "month_of_first_residential_mortgage")
    private String monthOfFirstResidentialMortgage;

    /**
     * 首笔个人商用房贷款发放月份
     */
    @Column(name = "month_of_first_commercial_residential_mortgage")
    private String monthOfFirstCommercialResidentialMortgage;

    /**
     * 首笔其他类贷款发放月份
     */
    @Column(name = "month_of_first_other_mortgage")
    private String monthOfFirstOtherMortgage;

    /**
     * 首张贷记卡发卡月份
     */
    @Column(name = "month_of_first_credit_card")
    private String monthOfFirstCreditCard;

    /**
     * 首张准贷记卡发卡月份
     */
    @Column(name = "month_of_first_semi_credit_card")
    private String monthOfFirstSemiCreditCard;

    /**
     * 首笔其他发放月份
     */
    @Column(name = "month_of_first_other")
    private String monthOfFirstOther;

    /**
     * 资产处置信息账户数
     */
    @Column(name = "asset_disposal_cnt")
    private String assetDisposalCnt;

    /**
     * 资产处置信息余额
     */
    @Column(name = "asset_disposal_balance")
    private BigDecimal assetDisposalBalance;

    /**
     * 垫款信息账户数
     */
    @Column(name = "advanced_cnt")
    private String advancedCnt;

    /**
     * 垫款信息余额
     */
    @Column(name = "advanced_balance")
    private BigDecimal advancedBalance;

    /**
     * 呆账信息账户数
     */
    @Column(name = "bad_cnt")
    private String badCnt;

    /**
     * 呆账信息余额
     */
    @Column(name = "bad_balance")
    private BigDecimal badBalance;

    /**
     * 非循环贷逾期账户数
     */
    @Column(name = "non_reloan_num_of_accounts")
    private String nonReloanNumOfAccounts;

    /**
     * 非循环贷逾期月份数
     */
    @Column(name = "non_reloan_num_of_months")
    private String nonReloanNumOfMonths;

    /**
     * 非循环贷逾期单月最高逾期总额
     */
    @Column(name = "non_reloan_mon_max_overdue_amount")
    private String nonReloanMonMaxOverdueAmount;

    /**
     * 非循环贷逾期最长逾期月数
     */
    @Column(name = "non_reloan_lon_overdue_months")
    private String nonReloanLonOverdueMonths;

    /**
     * 循环贷下分账户贷逾期账户数
     */
    @Column(name = "loan_num_of_accounts")
    private String loanNumOfAccounts;

    /**
     * 循环贷下分账户贷逾期月份数
     */
    @Column(name = "loan_num_of_months")
    private String loanNumOfMonths;

    /**
     * 循环贷下分账户逾期单月最高逾期总额
     */
    @Column(name = "loan_mon_max_overdue_amount")
    private String loanMonMaxOverdueAmount;

    /**
     * 循环贷下分账户逾期最长逾期月数
     */
    @Column(name = "loan_lon_overdue_months")
    private String loanLonOverdueMonths;

    /**
     * 循环贷逾期账户数
     */
    @Column(name = "reloan_num_of_accounts")
    private String reloanNumOfAccounts;

    /**
     * 循环贷逾期月份数
     */
    @Column(name = "reloan_num_of_months")
    private String reloanNumOfMonths;

    /**
     * 循环贷逾期单月最高逾期总额
     */
    @Column(name = "reloan_mon_max_overdue_amount")
    private String reloanMonMaxOverdueAmount;

    /**
     * 循环贷逾期最长逾期月数
     */
    @Column(name = "reloan_lon_overdue_months")
    private String reloanLonOverdueMonths;

    /**
     * 贷记卡逾期账户数
     */
    @Column(name = "cco_num_of_accounts")
    private String ccoNumOfAccounts;

    /**
     * 贷记卡逾期月份数
     */
    @Column(name = "cco_num_of_months")
    private String ccoNumOfMonths;

    /**
     * 贷记卡逾期单月最高逾期总额
     */
    @Column(name = "cco_mon_max_overdue_amount")
    private String ccoMonMaxOverdueAmount;

    /**
     * 贷记卡逾期最长逾期月数
     */
    @Column(name = "cco_lon_overdue_months")
    private String ccoLonOverdueMonths;

    /**
     * 准贷记卡60天以上透支账户数
     */
    @Column(name = "scc60_overdraft_num_of_accounts")
    private String scc60OverdraftNumOfAccounts;

    /**
     * 准贷记卡60天以上透支月份数
     */
    @Column(name = "scc60_num_of_months")
    private String scc60NumOfMonths;

    /**
     * 准贷记卡60天以上透支单月最高透支余额
     */
    @Column(name = "scc60_mon_max_overdue_amount")
    private String scc60MonMaxOverdueAmount;

    /**
     * 准贷记卡60天以上透支最长透支月数
     */
    @Column(name = "scc60_lon_overdue_months")
    private String scc60LonOverdueMonths;

    /**
     * 未结清非循环贷管理机构数
     */
    @Column(name = "unon_reloan_num_of_iss_organs")
    private String unonReloanNumOfIssOrgans;

    /**
     * 未结清非循环贷账户数
     */
    @Column(name = "unon_reloan_num_of_accounts")
    private String unonReloanNumOfAccounts;

    /**
     * 未结清非循环贷授信总额
     */
    @Column(name = "unon_reloan_tot_credit")
    private String unonReloanTotCredit;

    /**
     * 未结清非循环贷余额
     */
    @Column(name = "unon_reloan_balance")
    private String unonReloanBalance;

    /**
     * 未结清非循环贷最近6个月平均应还款
     */
    @Column(name = "unon_reloan6_mon_ave_repay_amounts")
    private String unonReloan6MonAveRepayAmounts;

    /**
     * 未结清循环贷下分账户管理机构数
     */
    @Column(name = "uloan_num_of_iss_organs")
    private String uloanNumOfIssOrgans;

    /**
     * 未结清循环贷下分账户账户数
     */
    @Column(name = "uloan_num_of_accounts")
    private String uloanNumOfAccounts;

    /**
     * 未结清循环贷下分账户授信总额
     */
    @Column(name = "uloan_tot_credit")
    private String uloanTotCredit;

    /**
     * 未结清循环贷下分账户余额
     */
    @Column(name = "uloan_balance")
    private String uloanBalance;

    /**
     * 未结清循环贷下分账户最近6个月平均应还款
     */
    @Column(name = "uloan6_mon_ave_repay_amounts")
    private String uloan6MonAveRepayAmounts;

    /**
     * 未结清循环贷管理机构数
     */
    @Column(name = "ureloan_num_of_iss_organs")
    private String ureloanNumOfIssOrgans;

    /**
     * 未结清循环贷账户数
     */
    @Column(name = "ureloan_num_of_accounts")
    private String ureloanNumOfAccounts;

    /**
     * 未结清循环贷授信总额
     */
    @Column(name = "ureloan_tot_credit")
    private String ureloanTotCredit;

    /**
     * 未结清循环贷余额
     */
    @Column(name = "ureloan_balance")
    private String ureloanBalance;

    /**
     * 未结清循环贷最近6个月平均应还款
     */
    @Column(name = "ureloan6_mon_ave_repay_amounts")
    private String ureloan6MonAveRepayAmounts;

    /**
     * 未销户贷记卡发卡机构数
     */
    @Column(name = "ucc_num_of_iss_organs")
    private String uccNumOfIssOrgans;

    /**
     * 未销户贷记卡账户数
     */
    @Column(name = "ucc_num_of_accounts")
    private String uccNumOfAccounts;

    /**
     * 未销户贷记卡授信总额
     */
    @Column(name = "ucc_tot_credit")
    private String uccTotCredit;

    /**
     * 未销户贷记卡单家行最高授信额
     */
    @Column(name = "ucc_sin_bank_max_credit")
    private String uccSinBankMaxCredit;

    /**
     * 未销户贷记卡单家行最低授信额
     */
    @Column(name = "ucc_sin_bank_min_credit")
    private String uccSinBankMinCredit;

    /**
     * 未销户贷记卡已用额度
     */
    @Column(name = "ucc_con_credit")
    private String uccConCredit;

    /**
     * 未销户贷记卡最近6个月平均使用额度
     */
    @Column(name = "ucc6_mon_ave_con_amounts")
    private String ucc6MonAveConAmounts;

    /**
     * 未销户准贷记卡发卡机构数
     */
    @Column(name = "uscc_num_of_iss_organs")
    private String usccNumOfIssOrgans;

    /**
     * 未销户准贷记卡账户数
     */
    @Column(name = "uscc_num_of_accounts")
    private String usccNumOfAccounts;

    /**
     * 未销户准贷记卡授信总额
     */
    @Column(name = "uscc_tot_credit")
    private String usccTotCredit;

    /**
     * 未销户准贷记卡单家行最高授信额
     */
    @Column(name = "uscc_sin_bank_max_credit")
    private String usccSinBankMaxCredit;

    /**
     * 未销户准贷记卡单家行最低授信额
     */
    @Column(name = "uscc_sin_bank_min_credit")
    private String usccSinBankMinCredit;

    /**
     * 未销户准贷记卡透支余额
     */
    @Column(name = "uscc_over_amount")
    private String usccOverAmount;

    /**
     * 未销户准贷记卡最近6个月平均透支余额
     */
    @Column(name = "uscc6_mon_ave_over_amount")
    private String uscc6MonAveOverAmount;

    /**
     * 为他人担保账户数
     */
    @Column(name = "person_guarantee_cnt")
    private String personGuaranteeCnt;

    /**
     * 为他人担保金额
     */
    @Column(name = "person_guarantee_amt")
    private BigDecimal personGuaranteeAmt;

    /**
     * 为他人担保余额
     */
    @Column(name = "person_guarantee_balance")
    private BigDecimal personGuaranteeBalance;

    /**
     * 为他人其他还款账户数
     */
    @Column(name = "person_repay_related_cnt")
    private String personRepayRelatedCnt;

    /**
     * 为他人其他还款金额
     */
    @Column(name = "person_repay_related_amt")
    private BigDecimal personRepayRelatedAmt;

    /**
     * 为他人其他还款余额
     */
    @Column(name = "person_repay_related_balance")
    private BigDecimal personRepayRelatedBalance;

    /**
     * 为企业担保账户数
     */
    @Column(name = "enterprise_guarantee_cnt")
    private String enterpriseGuaranteeCnt;

    /**
     * 为企业担保金额
     */
    @Column(name = "enterprise_guarantee_amt")
    private BigDecimal enterpriseGuaranteeAmt;

    /**
     * 为企业担保余额
     */
    @Column(name = "enterprise_guarantee_balance")
    private BigDecimal enterpriseGuaranteeBalance;

    /**
     * 为企业的其他还款账户数
     */
    @Column(name = "enterprise_repay_related_cnt")
    private String enterpriseRepayRelatedCnt;

    /**
     * 为企业的其他还款金额
     */
    @Column(name = "enterprise_repay_related_amt")
    private BigDecimal enterpriseRepayRelatedAmt;

    /**
     * 为企业的企业其他还款余额
     */
    @Column(name = "enterprise_repay_related_balance")
    private BigDecimal enterpriseRepayRelatedBalance;

    /**
     * 电信业务欠费账户数
     */
    @Column(name = "tele_debt_accounts")
    private String teleDebtAccounts;

    /**
     * 电信业务欠费金额
     */
    @Column(name = "tele_debt_amount")
    private BigDecimal teleDebtAmount;

    /**
     * 欠税信息记录数
     */
    @Column(name = "tax_debt_cnt")
    private String taxDebtCnt;

    /**
     * 民事判决信息记录数
     */
    @Column(name = "judgement_cnt")
    private String judgementCnt;

    /**
     * 强制执行信息记录数
     */
    @Column(name = "enforcement_cnt")
    private String enforcementCnt;

    /**
     * 行政处罚信息记录数
     */
    @Column(name = "adm_pen_cnt")
    private String admPenCnt;

    /**
     * 欠税涉及金额
     */
    @Column(name = "tax_debt_amt")
    private BigDecimal taxDebtAmt;

    /**
     * 民事判决涉及金额
     */
    @Column(name = "judgement_amt")
    private BigDecimal judgementAmt;

    /**
     * 强制执行涉及金额
     */
    @Column(name = "enforcement_amt")
    private BigDecimal enforcementAmt;

    /**
     * 行政处罚涉及金额
     */
    @Column(name = "adm_pen_amt")
    private BigDecimal admPenAmt;

    /**
     * 征信上次查询日期
     */
    @Column(name = "last_query_date")
    private String lastQueryDate;

    /**
     * 征信上一次查询机构机构类型
     */
    @Column(name = "last_query_organ_type")
    private String lastQueryOrganType;

    /**
     * 征信上一次查询机构代码
     */
    @Column(name = "last_query_organ_code")
    private String lastQueryOrganCode;

    /**
     * 征信上一次查询原因
     */
    @Column(name = "last_query_reason")
    private String lastQueryReason;

    /**
     * 最近1个月内的查询机构数贷款审批
     */
    @Column(name = "lomo_loan_approval")
    private String lomoLoanApproval;

    /**
     * 最近1个月内的查询机构数信用卡审批
     */
    @Column(name = "lomo_credit_approval")
    private String lomoCreditApproval;

    /**
     * 最近1个月内的查询次数贷款审批
     */
    @Column(name = "lomn_loan_approval")
    private String lomnLoanApproval;

    /**
     * 最近1个月内的查询次数信用卡审批
     */
    @Column(name = "lomn_credit_approval")
    private String lomnCreditApproval;

    /**
     * 最近1个月内的查询次数本人查询
     */
    @Column(name = "lomn_self")
    private String lomnSelf;

    /**
     * 最近2年内的查询次数贷后管理
     */
    @Column(name = "ltyn_post_loan_management")
    private String ltynPostLoanManagement;

    /**
     * 最近2年内的查询次数担保资格审查
     */
    @Column(name = "ltyn_quali_approval")
    private String ltynQualiApproval;

    /**
     * 最近2年内的查询次数特约商户实名审查
     */
    @Column(name = "ltyn_real_name_approval")
    private String ltynRealNameApproval;

    /**
     * 住房公积金参缴日期
     */
    @Column(name = "hf_payment_date")
    private String hfPaymentDate;

    /**
     * 住房公积金初缴月份
     */
    @Column(name = "hf_initial_payment_month")
    private String hfInitialPaymentMonth;

    /**
     * 住房公积金缴至月份
     */
    @Column(name = "hf_pay_to_month")
    private String hfPayToMonth;

    /**
     * 住房公积金缴费状态
     */
    @Column(name = "hf_payment_status")
    private String hfPaymentStatus;

    /**
     * 住房公积金月缴存额
     */
    @Column(name = "hf_monthly_amount")
    private String hfMonthlyAmount;

    /**
     * 住房公积金缴费单位
     */
    @Column(name = "hf_payment_unit")
    private String hfPaymentUnit;

    /**
     * 住房公积金参缴地
     */
    @Column(name = "hf_place")
    private String hfPlace;

    /**
     * 住房公积金个人缴存比例
     */
    @Column(name = "hf_percent_person")
    private String hfPercentPerson;

    /**
     * 住房公积金单位缴存比例
     */
    @Column(name = "hf_percent_enterprise")
    private String hfPercentEnterprise;

    /**
     * 公积金信息更新日期
     */
    @Column(name = "hf_update_date")
    private String hfUpdateDate;

    /**
     * 文件路径
     */
    @Column(name = "sop_file_path")
    private String sopFilePath;

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

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo == null ? null : reportNo.trim();
    }

    public String getDateOfReport() {
        return dateOfReport;
    }

    public void setDateOfReport(String dateOfReport) {
        this.dateOfReport = dateOfReport == null ? null : dateOfReport.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getEnquiryAgency() {
        return enquiryAgency;
    }

    public void setEnquiryAgency(String enquiryAgency) {
        this.enquiryAgency = enquiryAgency == null ? null : enquiryAgency.trim();
    }

    public String getEnquiryReason() {
        return enquiryReason;
    }

    public void setEnquiryReason(String enquiryReason) {
        this.enquiryReason = enquiryReason == null ? null : enquiryReason.trim();
    }

    public String getDissentNums() {
        return dissentNums;
    }

    public void setDissentNums(String dissentNums) {
        this.dissentNums = dissentNums == null ? null : dissentNums.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth == null ? null : dateOfBirth.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getEmployment1Status() {
        return employment1Status;
    }

    public void setEmployment1Status(String employment1Status) {
        this.employment1Status = employment1Status == null ? null : employment1Status.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress == null ? null : postalAddress.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress == null ? null : permanentAddress.trim();
    }

    public String getAllTelNumber() {
        return allTelNumber;
    }

    public void setAllTelNumber(String allTelNumber) {
        this.allTelNumber = allTelNumber == null ? null : allTelNumber.trim();
    }

    public String getAllTelUpdateDate() {
        return allTelUpdateDate;
    }

    public void setAllTelUpdateDate(String allTelUpdateDate) {
        this.allTelUpdateDate = allTelUpdateDate == null ? null : allTelUpdateDate.trim();
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus == null ? null : maritalStatus.trim();
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName == null ? null : spouseName.trim();
    }

    public String getSpouseIdType() {
        return spouseIdType;
    }

    public void setSpouseIdType(String spouseIdType) {
        this.spouseIdType = spouseIdType == null ? null : spouseIdType.trim();
    }

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }

    public void setSpouseIdNumber(String spouseIdNumber) {
        this.spouseIdNumber = spouseIdNumber == null ? null : spouseIdNumber.trim();
    }

    public String getSpouseEmployer() {
        return spouseEmployer;
    }

    public void setSpouseEmployer(String spouseEmployer) {
        this.spouseEmployer = spouseEmployer == null ? null : spouseEmployer.trim();
    }

    public String getSpouseTelNumber() {
        return spouseTelNumber;
    }

    public void setSpouseTelNumber(String spouseTelNumber) {
        this.spouseTelNumber = spouseTelNumber == null ? null : spouseTelNumber.trim();
    }

    public String getPropertyOwnership() {
        return propertyOwnership;
    }

    public void setPropertyOwnership(String propertyOwnership) {
        this.propertyOwnership = propertyOwnership == null ? null : propertyOwnership.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getHomeTelNumber() {
        return homeTelNumber;
    }

    public void setHomeTelNumber(String homeTelNumber) {
        this.homeTelNumber = homeTelNumber == null ? null : homeTelNumber.trim();
    }

    public String getAddressInforUpdateDate() {
        return addressInforUpdateDate;
    }

    public void setAddressInforUpdateDate(String addressInforUpdateDate) {
        this.addressInforUpdateDate = addressInforUpdateDate == null ? null : addressInforUpdateDate.trim();
    }

    public String getEmployment2Status() {
        return employment2Status;
    }

    public void setEmployment2Status(String employment2Status) {
        this.employment2Status = employment2Status == null ? null : employment2Status.trim();
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer == null ? null : employer.trim();
    }

    public String getEmployerProperty() {
        return employerProperty;
    }

    public void setEmployerProperty(String employerProperty) {
        this.employerProperty = employerProperty == null ? null : employerProperty.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getEmployerAddress() {
        return employerAddress;
    }

    public void setEmployerAddress(String employerAddress) {
        this.employerAddress = employerAddress == null ? null : employerAddress.trim();
    }

    public String getWorkTelNumber() {
        return workTelNumber;
    }

    public void setWorkTelNumber(String workTelNumber) {
        this.workTelNumber = workTelNumber == null ? null : workTelNumber.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getYearOfAccession() {
        return yearOfAccession;
    }

    public void setYearOfAccession(String yearOfAccession) {
        this.yearOfAccession = yearOfAccession == null ? null : yearOfAccession.trim();
    }

    public String getEmployerInfoUpdateDate() {
        return employerInfoUpdateDate;
    }

    public void setEmployerInfoUpdateDate(String employerInfoUpdateDate) {
        this.employerInfoUpdateDate = employerInfoUpdateDate == null ? null : employerInfoUpdateDate.trim();
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore == null ? null : creditScore.trim();
    }

    public String getRankingCreditScore() {
        return rankingCreditScore;
    }

    public void setRankingCreditScore(String rankingCreditScore) {
        this.rankingCreditScore = rankingCreditScore == null ? null : rankingCreditScore.trim();
    }

    public String getNumCreditScore() {
        return numCreditScore;
    }

    public void setNumCreditScore(String numCreditScore) {
        this.numCreditScore = numCreditScore == null ? null : numCreditScore.trim();
    }

    public String getExplainCreditScore() {
        return explainCreditScore;
    }

    public void setExplainCreditScore(String explainCreditScore) {
        this.explainCreditScore = explainCreditScore == null ? null : explainCreditScore.trim();
    }

    public String getResidentialMortgage() {
        return residentialMortgage;
    }

    public void setResidentialMortgage(String residentialMortgage) {
        this.residentialMortgage = residentialMortgage == null ? null : residentialMortgage.trim();
    }

    public String getCommercialResidentialMortgage() {
        return commercialResidentialMortgage;
    }

    public void setCommercialResidentialMortgage(String commercialResidentialMortgage) {
        this.commercialResidentialMortgage = commercialResidentialMortgage == null ? null : commercialResidentialMortgage.trim();
    }

    public String getOtherMortgage() {
        return otherMortgage;
    }

    public void setOtherMortgage(String otherMortgage) {
        this.otherMortgage = otherMortgage == null ? null : otherMortgage.trim();
    }

    public String getCreditCardNumbers() {
        return creditCardNumbers;
    }

    public void setCreditCardNumbers(String creditCardNumbers) {
        this.creditCardNumbers = creditCardNumbers == null ? null : creditCardNumbers.trim();
    }

    public String getSemiCreditCard() {
        return semiCreditCard;
    }

    public void setSemiCreditCard(String semiCreditCard) {
        this.semiCreditCard = semiCreditCard == null ? null : semiCreditCard.trim();
    }

    public String getOtherNumbers() {
        return otherNumbers;
    }

    public void setOtherNumbers(String otherNumbers) {
        this.otherNumbers = otherNumbers == null ? null : otherNumbers.trim();
    }

    public String getMonthOfFirstResidentialMortgage() {
        return monthOfFirstResidentialMortgage;
    }

    public void setMonthOfFirstResidentialMortgage(String monthOfFirstResidentialMortgage) {
        this.monthOfFirstResidentialMortgage = monthOfFirstResidentialMortgage == null ? null : monthOfFirstResidentialMortgage.trim();
    }

    public String getMonthOfFirstCommercialResidentialMortgage() {
        return monthOfFirstCommercialResidentialMortgage;
    }

    public void setMonthOfFirstCommercialResidentialMortgage(String monthOfFirstCommercialResidentialMortgage) {
        this.monthOfFirstCommercialResidentialMortgage = monthOfFirstCommercialResidentialMortgage == null ? null : monthOfFirstCommercialResidentialMortgage.trim();
    }

    public String getMonthOfFirstOtherMortgage() {
        return monthOfFirstOtherMortgage;
    }

    public void setMonthOfFirstOtherMortgage(String monthOfFirstOtherMortgage) {
        this.monthOfFirstOtherMortgage = monthOfFirstOtherMortgage == null ? null : monthOfFirstOtherMortgage.trim();
    }

    public String getMonthOfFirstCreditCard() {
        return monthOfFirstCreditCard;
    }

    public void setMonthOfFirstCreditCard(String monthOfFirstCreditCard) {
        this.monthOfFirstCreditCard = monthOfFirstCreditCard == null ? null : monthOfFirstCreditCard.trim();
    }

    public String getMonthOfFirstSemiCreditCard() {
        return monthOfFirstSemiCreditCard;
    }

    public void setMonthOfFirstSemiCreditCard(String monthOfFirstSemiCreditCard) {
        this.monthOfFirstSemiCreditCard = monthOfFirstSemiCreditCard == null ? null : monthOfFirstSemiCreditCard.trim();
    }

    public String getMonthOfFirstOther() {
        return monthOfFirstOther;
    }

    public void setMonthOfFirstOther(String monthOfFirstOther) {
        this.monthOfFirstOther = monthOfFirstOther == null ? null : monthOfFirstOther.trim();
    }

    public String getAssetDisposalCnt() {
        return assetDisposalCnt;
    }

    public void setAssetDisposalCnt(String assetDisposalCnt) {
        this.assetDisposalCnt = assetDisposalCnt == null ? null : assetDisposalCnt.trim();
    }

    public BigDecimal getAssetDisposalBalance() {
        return assetDisposalBalance;
    }

    public void setAssetDisposalBalance(BigDecimal assetDisposalBalance) {
        this.assetDisposalBalance = assetDisposalBalance;
    }

    public String getAdvancedCnt() {
        return advancedCnt;
    }

    public void setAdvancedCnt(String advancedCnt) {
        this.advancedCnt = advancedCnt == null ? null : advancedCnt.trim();
    }

    public BigDecimal getAdvancedBalance() {
        return advancedBalance;
    }

    public void setAdvancedBalance(BigDecimal advancedBalance) {
        this.advancedBalance = advancedBalance;
    }

    public String getBadCnt() {
        return badCnt;
    }

    public void setBadCnt(String badCnt) {
        this.badCnt = badCnt == null ? null : badCnt.trim();
    }

    public BigDecimal getBadBalance() {
        return badBalance;
    }

    public void setBadBalance(BigDecimal badBalance) {
        this.badBalance = badBalance;
    }

    public String getNonReloanNumOfAccounts() {
        return nonReloanNumOfAccounts;
    }

    public void setNonReloanNumOfAccounts(String nonReloanNumOfAccounts) {
        this.nonReloanNumOfAccounts = nonReloanNumOfAccounts == null ? null : nonReloanNumOfAccounts.trim();
    }

    public String getNonReloanNumOfMonths() {
        return nonReloanNumOfMonths;
    }

    public void setNonReloanNumOfMonths(String nonReloanNumOfMonths) {
        this.nonReloanNumOfMonths = nonReloanNumOfMonths == null ? null : nonReloanNumOfMonths.trim();
    }

    public String getNonReloanMonMaxOverdueAmount() {
        return nonReloanMonMaxOverdueAmount;
    }

    public void setNonReloanMonMaxOverdueAmount(String nonReloanMonMaxOverdueAmount) {
        this.nonReloanMonMaxOverdueAmount = nonReloanMonMaxOverdueAmount == null ? null : nonReloanMonMaxOverdueAmount.trim();
    }

    public String getNonReloanLonOverdueMonths() {
        return nonReloanLonOverdueMonths;
    }

    public void setNonReloanLonOverdueMonths(String nonReloanLonOverdueMonths) {
        this.nonReloanLonOverdueMonths = nonReloanLonOverdueMonths == null ? null : nonReloanLonOverdueMonths.trim();
    }

    public String getLoanNumOfAccounts() {
        return loanNumOfAccounts;
    }

    public void setLoanNumOfAccounts(String loanNumOfAccounts) {
        this.loanNumOfAccounts = loanNumOfAccounts == null ? null : loanNumOfAccounts.trim();
    }

    public String getLoanNumOfMonths() {
        return loanNumOfMonths;
    }

    public void setLoanNumOfMonths(String loanNumOfMonths) {
        this.loanNumOfMonths = loanNumOfMonths == null ? null : loanNumOfMonths.trim();
    }

    public String getLoanMonMaxOverdueAmount() {
        return loanMonMaxOverdueAmount;
    }

    public void setLoanMonMaxOverdueAmount(String loanMonMaxOverdueAmount) {
        this.loanMonMaxOverdueAmount = loanMonMaxOverdueAmount == null ? null : loanMonMaxOverdueAmount.trim();
    }

    public String getLoanLonOverdueMonths() {
        return loanLonOverdueMonths;
    }

    public void setLoanLonOverdueMonths(String loanLonOverdueMonths) {
        this.loanLonOverdueMonths = loanLonOverdueMonths == null ? null : loanLonOverdueMonths.trim();
    }

    public String getReloanNumOfAccounts() {
        return reloanNumOfAccounts;
    }

    public void setReloanNumOfAccounts(String reloanNumOfAccounts) {
        this.reloanNumOfAccounts = reloanNumOfAccounts == null ? null : reloanNumOfAccounts.trim();
    }

    public String getReloanNumOfMonths() {
        return reloanNumOfMonths;
    }

    public void setReloanNumOfMonths(String reloanNumOfMonths) {
        this.reloanNumOfMonths = reloanNumOfMonths == null ? null : reloanNumOfMonths.trim();
    }

    public String getReloanMonMaxOverdueAmount() {
        return reloanMonMaxOverdueAmount;
    }

    public void setReloanMonMaxOverdueAmount(String reloanMonMaxOverdueAmount) {
        this.reloanMonMaxOverdueAmount = reloanMonMaxOverdueAmount == null ? null : reloanMonMaxOverdueAmount.trim();
    }

    public String getReloanLonOverdueMonths() {
        return reloanLonOverdueMonths;
    }

    public void setReloanLonOverdueMonths(String reloanLonOverdueMonths) {
        this.reloanLonOverdueMonths = reloanLonOverdueMonths == null ? null : reloanLonOverdueMonths.trim();
    }

    public String getCcoNumOfAccounts() {
        return ccoNumOfAccounts;
    }

    public void setCcoNumOfAccounts(String ccoNumOfAccounts) {
        this.ccoNumOfAccounts = ccoNumOfAccounts == null ? null : ccoNumOfAccounts.trim();
    }

    public String getCcoNumOfMonths() {
        return ccoNumOfMonths;
    }

    public void setCcoNumOfMonths(String ccoNumOfMonths) {
        this.ccoNumOfMonths = ccoNumOfMonths == null ? null : ccoNumOfMonths.trim();
    }

    public String getCcoMonMaxOverdueAmount() {
        return ccoMonMaxOverdueAmount;
    }

    public void setCcoMonMaxOverdueAmount(String ccoMonMaxOverdueAmount) {
        this.ccoMonMaxOverdueAmount = ccoMonMaxOverdueAmount == null ? null : ccoMonMaxOverdueAmount.trim();
    }

    public String getCcoLonOverdueMonths() {
        return ccoLonOverdueMonths;
    }

    public void setCcoLonOverdueMonths(String ccoLonOverdueMonths) {
        this.ccoLonOverdueMonths = ccoLonOverdueMonths == null ? null : ccoLonOverdueMonths.trim();
    }

    public String getScc60OverdraftNumOfAccounts() {
        return scc60OverdraftNumOfAccounts;
    }

    public void setScc60OverdraftNumOfAccounts(String scc60OverdraftNumOfAccounts) {
        this.scc60OverdraftNumOfAccounts = scc60OverdraftNumOfAccounts == null ? null : scc60OverdraftNumOfAccounts.trim();
    }

    public String getScc60NumOfMonths() {
        return scc60NumOfMonths;
    }

    public void setScc60NumOfMonths(String scc60NumOfMonths) {
        this.scc60NumOfMonths = scc60NumOfMonths == null ? null : scc60NumOfMonths.trim();
    }

    public String getScc60MonMaxOverdueAmount() {
        return scc60MonMaxOverdueAmount;
    }

    public void setScc60MonMaxOverdueAmount(String scc60MonMaxOverdueAmount) {
        this.scc60MonMaxOverdueAmount = scc60MonMaxOverdueAmount == null ? null : scc60MonMaxOverdueAmount.trim();
    }

    public String getScc60LonOverdueMonths() {
        return scc60LonOverdueMonths;
    }

    public void setScc60LonOverdueMonths(String scc60LonOverdueMonths) {
        this.scc60LonOverdueMonths = scc60LonOverdueMonths == null ? null : scc60LonOverdueMonths.trim();
    }

    public String getUnonReloanNumOfIssOrgans() {
        return unonReloanNumOfIssOrgans;
    }

    public void setUnonReloanNumOfIssOrgans(String unonReloanNumOfIssOrgans) {
        this.unonReloanNumOfIssOrgans = unonReloanNumOfIssOrgans == null ? null : unonReloanNumOfIssOrgans.trim();
    }

    public String getUnonReloanNumOfAccounts() {
        return unonReloanNumOfAccounts;
    }

    public void setUnonReloanNumOfAccounts(String unonReloanNumOfAccounts) {
        this.unonReloanNumOfAccounts = unonReloanNumOfAccounts == null ? null : unonReloanNumOfAccounts.trim();
    }

    public String getUnonReloanTotCredit() {
        return unonReloanTotCredit;
    }

    public void setUnonReloanTotCredit(String unonReloanTotCredit) {
        this.unonReloanTotCredit = unonReloanTotCredit == null ? null : unonReloanTotCredit.trim();
    }

    public String getUnonReloanBalance() {
        return unonReloanBalance;
    }

    public void setUnonReloanBalance(String unonReloanBalance) {
        this.unonReloanBalance = unonReloanBalance == null ? null : unonReloanBalance.trim();
    }

    public String getUnonReloan6MonAveRepayAmounts() {
        return unonReloan6MonAveRepayAmounts;
    }

    public void setUnonReloan6MonAveRepayAmounts(String unonReloan6MonAveRepayAmounts) {
        this.unonReloan6MonAveRepayAmounts = unonReloan6MonAveRepayAmounts == null ? null : unonReloan6MonAveRepayAmounts.trim();
    }

    public String getUloanNumOfIssOrgans() {
        return uloanNumOfIssOrgans;
    }

    public void setUloanNumOfIssOrgans(String uloanNumOfIssOrgans) {
        this.uloanNumOfIssOrgans = uloanNumOfIssOrgans == null ? null : uloanNumOfIssOrgans.trim();
    }

    public String getUloanNumOfAccounts() {
        return uloanNumOfAccounts;
    }

    public void setUloanNumOfAccounts(String uloanNumOfAccounts) {
        this.uloanNumOfAccounts = uloanNumOfAccounts == null ? null : uloanNumOfAccounts.trim();
    }

    public String getUloanTotCredit() {
        return uloanTotCredit;
    }

    public void setUloanTotCredit(String uloanTotCredit) {
        this.uloanTotCredit = uloanTotCredit == null ? null : uloanTotCredit.trim();
    }

    public String getUloanBalance() {
        return uloanBalance;
    }

    public void setUloanBalance(String uloanBalance) {
        this.uloanBalance = uloanBalance == null ? null : uloanBalance.trim();
    }

    public String getUloan6MonAveRepayAmounts() {
        return uloan6MonAveRepayAmounts;
    }

    public void setUloan6MonAveRepayAmounts(String uloan6MonAveRepayAmounts) {
        this.uloan6MonAveRepayAmounts = uloan6MonAveRepayAmounts == null ? null : uloan6MonAveRepayAmounts.trim();
    }

    public String getUreloanNumOfIssOrgans() {
        return ureloanNumOfIssOrgans;
    }

    public void setUreloanNumOfIssOrgans(String ureloanNumOfIssOrgans) {
        this.ureloanNumOfIssOrgans = ureloanNumOfIssOrgans == null ? null : ureloanNumOfIssOrgans.trim();
    }

    public String getUreloanNumOfAccounts() {
        return ureloanNumOfAccounts;
    }

    public void setUreloanNumOfAccounts(String ureloanNumOfAccounts) {
        this.ureloanNumOfAccounts = ureloanNumOfAccounts == null ? null : ureloanNumOfAccounts.trim();
    }

    public String getUreloanTotCredit() {
        return ureloanTotCredit;
    }

    public void setUreloanTotCredit(String ureloanTotCredit) {
        this.ureloanTotCredit = ureloanTotCredit == null ? null : ureloanTotCredit.trim();
    }

    public String getUreloanBalance() {
        return ureloanBalance;
    }

    public void setUreloanBalance(String ureloanBalance) {
        this.ureloanBalance = ureloanBalance == null ? null : ureloanBalance.trim();
    }

    public String getUreloan6MonAveRepayAmounts() {
        return ureloan6MonAveRepayAmounts;
    }

    public void setUreloan6MonAveRepayAmounts(String ureloan6MonAveRepayAmounts) {
        this.ureloan6MonAveRepayAmounts = ureloan6MonAveRepayAmounts == null ? null : ureloan6MonAveRepayAmounts.trim();
    }

    public String getUccNumOfIssOrgans() {
        return uccNumOfIssOrgans;
    }

    public void setUccNumOfIssOrgans(String uccNumOfIssOrgans) {
        this.uccNumOfIssOrgans = uccNumOfIssOrgans == null ? null : uccNumOfIssOrgans.trim();
    }

    public String getUccNumOfAccounts() {
        return uccNumOfAccounts;
    }

    public void setUccNumOfAccounts(String uccNumOfAccounts) {
        this.uccNumOfAccounts = uccNumOfAccounts == null ? null : uccNumOfAccounts.trim();
    }

    public String getUccTotCredit() {
        return uccTotCredit;
    }

    public void setUccTotCredit(String uccTotCredit) {
        this.uccTotCredit = uccTotCredit == null ? null : uccTotCredit.trim();
    }

    public String getUccSinBankMaxCredit() {
        return uccSinBankMaxCredit;
    }

    public void setUccSinBankMaxCredit(String uccSinBankMaxCredit) {
        this.uccSinBankMaxCredit = uccSinBankMaxCredit == null ? null : uccSinBankMaxCredit.trim();
    }

    public String getUccSinBankMinCredit() {
        return uccSinBankMinCredit;
    }

    public void setUccSinBankMinCredit(String uccSinBankMinCredit) {
        this.uccSinBankMinCredit = uccSinBankMinCredit == null ? null : uccSinBankMinCredit.trim();
    }

    public String getUccConCredit() {
        return uccConCredit;
    }

    public void setUccConCredit(String uccConCredit) {
        this.uccConCredit = uccConCredit == null ? null : uccConCredit.trim();
    }

    public String getUcc6MonAveConAmounts() {
        return ucc6MonAveConAmounts;
    }

    public void setUcc6MonAveConAmounts(String ucc6MonAveConAmounts) {
        this.ucc6MonAveConAmounts = ucc6MonAveConAmounts == null ? null : ucc6MonAveConAmounts.trim();
    }

    public String getUsccNumOfIssOrgans() {
        return usccNumOfIssOrgans;
    }

    public void setUsccNumOfIssOrgans(String usccNumOfIssOrgans) {
        this.usccNumOfIssOrgans = usccNumOfIssOrgans == null ? null : usccNumOfIssOrgans.trim();
    }

    public String getUsccNumOfAccounts() {
        return usccNumOfAccounts;
    }

    public void setUsccNumOfAccounts(String usccNumOfAccounts) {
        this.usccNumOfAccounts = usccNumOfAccounts == null ? null : usccNumOfAccounts.trim();
    }

    public String getUsccTotCredit() {
        return usccTotCredit;
    }

    public void setUsccTotCredit(String usccTotCredit) {
        this.usccTotCredit = usccTotCredit == null ? null : usccTotCredit.trim();
    }

    public String getUsccSinBankMaxCredit() {
        return usccSinBankMaxCredit;
    }

    public void setUsccSinBankMaxCredit(String usccSinBankMaxCredit) {
        this.usccSinBankMaxCredit = usccSinBankMaxCredit == null ? null : usccSinBankMaxCredit.trim();
    }

    public String getUsccSinBankMinCredit() {
        return usccSinBankMinCredit;
    }

    public void setUsccSinBankMinCredit(String usccSinBankMinCredit) {
        this.usccSinBankMinCredit = usccSinBankMinCredit == null ? null : usccSinBankMinCredit.trim();
    }

    public String getUsccOverAmount() {
        return usccOverAmount;
    }

    public void setUsccOverAmount(String usccOverAmount) {
        this.usccOverAmount = usccOverAmount == null ? null : usccOverAmount.trim();
    }

    public String getUscc6MonAveOverAmount() {
        return uscc6MonAveOverAmount;
    }

    public void setUscc6MonAveOverAmount(String uscc6MonAveOverAmount) {
        this.uscc6MonAveOverAmount = uscc6MonAveOverAmount == null ? null : uscc6MonAveOverAmount.trim();
    }

    public String getPersonGuaranteeCnt() {
        return personGuaranteeCnt;
    }

    public void setPersonGuaranteeCnt(String personGuaranteeCnt) {
        this.personGuaranteeCnt = personGuaranteeCnt == null ? null : personGuaranteeCnt.trim();
    }

    public BigDecimal getPersonGuaranteeAmt() {
        return personGuaranteeAmt;
    }

    public void setPersonGuaranteeAmt(BigDecimal personGuaranteeAmt) {
        this.personGuaranteeAmt = personGuaranteeAmt;
    }

    public BigDecimal getPersonGuaranteeBalance() {
        return personGuaranteeBalance;
    }

    public void setPersonGuaranteeBalance(BigDecimal personGuaranteeBalance) {
        this.personGuaranteeBalance = personGuaranteeBalance;
    }

    public String getPersonRepayRelatedCnt() {
        return personRepayRelatedCnt;
    }

    public void setPersonRepayRelatedCnt(String personRepayRelatedCnt) {
        this.personRepayRelatedCnt = personRepayRelatedCnt == null ? null : personRepayRelatedCnt.trim();
    }

    public BigDecimal getPersonRepayRelatedAmt() {
        return personRepayRelatedAmt;
    }

    public void setPersonRepayRelatedAmt(BigDecimal personRepayRelatedAmt) {
        this.personRepayRelatedAmt = personRepayRelatedAmt;
    }

    public BigDecimal getPersonRepayRelatedBalance() {
        return personRepayRelatedBalance;
    }

    public void setPersonRepayRelatedBalance(BigDecimal personRepayRelatedBalance) {
        this.personRepayRelatedBalance = personRepayRelatedBalance;
    }

    public String getEnterpriseGuaranteeCnt() {
        return enterpriseGuaranteeCnt;
    }

    public void setEnterpriseGuaranteeCnt(String enterpriseGuaranteeCnt) {
        this.enterpriseGuaranteeCnt = enterpriseGuaranteeCnt == null ? null : enterpriseGuaranteeCnt.trim();
    }

    public BigDecimal getEnterpriseGuaranteeAmt() {
        return enterpriseGuaranteeAmt;
    }

    public void setEnterpriseGuaranteeAmt(BigDecimal enterpriseGuaranteeAmt) {
        this.enterpriseGuaranteeAmt = enterpriseGuaranteeAmt;
    }

    public BigDecimal getEnterpriseGuaranteeBalance() {
        return enterpriseGuaranteeBalance;
    }

    public void setEnterpriseGuaranteeBalance(BigDecimal enterpriseGuaranteeBalance) {
        this.enterpriseGuaranteeBalance = enterpriseGuaranteeBalance;
    }

    public String getEnterpriseRepayRelatedCnt() {
        return enterpriseRepayRelatedCnt;
    }

    public void setEnterpriseRepayRelatedCnt(String enterpriseRepayRelatedCnt) {
        this.enterpriseRepayRelatedCnt = enterpriseRepayRelatedCnt == null ? null : enterpriseRepayRelatedCnt.trim();
    }

    public BigDecimal getEnterpriseRepayRelatedAmt() {
        return enterpriseRepayRelatedAmt;
    }

    public void setEnterpriseRepayRelatedAmt(BigDecimal enterpriseRepayRelatedAmt) {
        this.enterpriseRepayRelatedAmt = enterpriseRepayRelatedAmt;
    }

    public BigDecimal getEnterpriseRepayRelatedBalance() {
        return enterpriseRepayRelatedBalance;
    }

    public void setEnterpriseRepayRelatedBalance(BigDecimal enterpriseRepayRelatedBalance) {
        this.enterpriseRepayRelatedBalance = enterpriseRepayRelatedBalance;
    }

    public String getTeleDebtAccounts() {
        return teleDebtAccounts;
    }

    public void setTeleDebtAccounts(String teleDebtAccounts) {
        this.teleDebtAccounts = teleDebtAccounts == null ? null : teleDebtAccounts.trim();
    }

    public BigDecimal getTeleDebtAmount() {
        return teleDebtAmount;
    }

    public void setTeleDebtAmount(BigDecimal teleDebtAmount) {
        this.teleDebtAmount = teleDebtAmount;
    }

    public String getTaxDebtCnt() {
        return taxDebtCnt;
    }

    public void setTaxDebtCnt(String taxDebtCnt) {
        this.taxDebtCnt = taxDebtCnt == null ? null : taxDebtCnt.trim();
    }

    public String getJudgementCnt() {
        return judgementCnt;
    }

    public void setJudgementCnt(String judgementCnt) {
        this.judgementCnt = judgementCnt == null ? null : judgementCnt.trim();
    }

    public String getEnforcementCnt() {
        return enforcementCnt;
    }

    public void setEnforcementCnt(String enforcementCnt) {
        this.enforcementCnt = enforcementCnt == null ? null : enforcementCnt.trim();
    }

    public String getAdmPenCnt() {
        return admPenCnt;
    }

    public void setAdmPenCnt(String admPenCnt) {
        this.admPenCnt = admPenCnt == null ? null : admPenCnt.trim();
    }

    public BigDecimal getTaxDebtAmt() {
        return taxDebtAmt;
    }

    public void setTaxDebtAmt(BigDecimal taxDebtAmt) {
        this.taxDebtAmt = taxDebtAmt;
    }

    public BigDecimal getJudgementAmt() {
        return judgementAmt;
    }

    public void setJudgementAmt(BigDecimal judgementAmt) {
        this.judgementAmt = judgementAmt;
    }

    public BigDecimal getEnforcementAmt() {
        return enforcementAmt;
    }

    public void setEnforcementAmt(BigDecimal enforcementAmt) {
        this.enforcementAmt = enforcementAmt;
    }

    public BigDecimal getAdmPenAmt() {
        return admPenAmt;
    }

    public void setAdmPenAmt(BigDecimal admPenAmt) {
        this.admPenAmt = admPenAmt;
    }

    public String getLastQueryDate() {
        return lastQueryDate;
    }

    public void setLastQueryDate(String lastQueryDate) {
        this.lastQueryDate = lastQueryDate == null ? null : lastQueryDate.trim();
    }

    public String getLastQueryOrganType() {
        return lastQueryOrganType;
    }

    public void setLastQueryOrganType(String lastQueryOrganType) {
        this.lastQueryOrganType = lastQueryOrganType == null ? null : lastQueryOrganType.trim();
    }

    public String getLastQueryOrganCode() {
        return lastQueryOrganCode;
    }

    public void setLastQueryOrganCode(String lastQueryOrganCode) {
        this.lastQueryOrganCode = lastQueryOrganCode == null ? null : lastQueryOrganCode.trim();
    }

    public String getLastQueryReason() {
        return lastQueryReason;
    }

    public void setLastQueryReason(String lastQueryReason) {
        this.lastQueryReason = lastQueryReason == null ? null : lastQueryReason.trim();
    }

    public String getLomoLoanApproval() {
        return lomoLoanApproval;
    }

    public void setLomoLoanApproval(String lomoLoanApproval) {
        this.lomoLoanApproval = lomoLoanApproval == null ? null : lomoLoanApproval.trim();
    }

    public String getLomoCreditApproval() {
        return lomoCreditApproval;
    }

    public void setLomoCreditApproval(String lomoCreditApproval) {
        this.lomoCreditApproval = lomoCreditApproval == null ? null : lomoCreditApproval.trim();
    }

    public String getLomnLoanApproval() {
        return lomnLoanApproval;
    }

    public void setLomnLoanApproval(String lomnLoanApproval) {
        this.lomnLoanApproval = lomnLoanApproval == null ? null : lomnLoanApproval.trim();
    }

    public String getLomnCreditApproval() {
        return lomnCreditApproval;
    }

    public void setLomnCreditApproval(String lomnCreditApproval) {
        this.lomnCreditApproval = lomnCreditApproval == null ? null : lomnCreditApproval.trim();
    }

    public String getLomnSelf() {
        return lomnSelf;
    }

    public void setLomnSelf(String lomnSelf) {
        this.lomnSelf = lomnSelf == null ? null : lomnSelf.trim();
    }

    public String getLtynPostLoanManagement() {
        return ltynPostLoanManagement;
    }

    public void setLtynPostLoanManagement(String ltynPostLoanManagement) {
        this.ltynPostLoanManagement = ltynPostLoanManagement == null ? null : ltynPostLoanManagement.trim();
    }

    public String getLtynQualiApproval() {
        return ltynQualiApproval;
    }

    public void setLtynQualiApproval(String ltynQualiApproval) {
        this.ltynQualiApproval = ltynQualiApproval == null ? null : ltynQualiApproval.trim();
    }

    public String getLtynRealNameApproval() {
        return ltynRealNameApproval;
    }

    public void setLtynRealNameApproval(String ltynRealNameApproval) {
        this.ltynRealNameApproval = ltynRealNameApproval == null ? null : ltynRealNameApproval.trim();
    }

    public String getHfPaymentDate() {
        return hfPaymentDate;
    }

    public void setHfPaymentDate(String hfPaymentDate) {
        this.hfPaymentDate = hfPaymentDate == null ? null : hfPaymentDate.trim();
    }

    public String getHfInitialPaymentMonth() {
        return hfInitialPaymentMonth;
    }

    public void setHfInitialPaymentMonth(String hfInitialPaymentMonth) {
        this.hfInitialPaymentMonth = hfInitialPaymentMonth == null ? null : hfInitialPaymentMonth.trim();
    }

    public String getHfPayToMonth() {
        return hfPayToMonth;
    }

    public void setHfPayToMonth(String hfPayToMonth) {
        this.hfPayToMonth = hfPayToMonth == null ? null : hfPayToMonth.trim();
    }

    public String getHfPaymentStatus() {
        return hfPaymentStatus;
    }

    public void setHfPaymentStatus(String hfPaymentStatus) {
        this.hfPaymentStatus = hfPaymentStatus == null ? null : hfPaymentStatus.trim();
    }

    public String getHfMonthlyAmount() {
        return hfMonthlyAmount;
    }

    public void setHfMonthlyAmount(String hfMonthlyAmount) {
        this.hfMonthlyAmount = hfMonthlyAmount == null ? null : hfMonthlyAmount.trim();
    }

    public String getHfPaymentUnit() {
        return hfPaymentUnit;
    }

    public void setHfPaymentUnit(String hfPaymentUnit) {
        this.hfPaymentUnit = hfPaymentUnit == null ? null : hfPaymentUnit.trim();
    }

    public String getHfPlace() {
        return hfPlace;
    }

    public void setHfPlace(String hfPlace) {
        this.hfPlace = hfPlace == null ? null : hfPlace.trim();
    }

    public String getHfPercentPerson() {
        return hfPercentPerson;
    }

    public void setHfPercentPerson(String hfPercentPerson) {
        this.hfPercentPerson = hfPercentPerson == null ? null : hfPercentPerson.trim();
    }

    public String getHfPercentEnterprise() {
        return hfPercentEnterprise;
    }

    public void setHfPercentEnterprise(String hfPercentEnterprise) {
        this.hfPercentEnterprise = hfPercentEnterprise == null ? null : hfPercentEnterprise.trim();
    }

    public String getHfUpdateDate() {
        return hfUpdateDate;
    }

    public void setHfUpdateDate(String hfUpdateDate) {
        this.hfUpdateDate = hfUpdateDate == null ? null : hfUpdateDate.trim();
    }

    public String getSopFilePath() {
        return sopFilePath;
    }

    public void setSopFilePath(String sopFilePath) {
        this.sopFilePath = sopFilePath == null ? null : sopFilePath.trim();
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