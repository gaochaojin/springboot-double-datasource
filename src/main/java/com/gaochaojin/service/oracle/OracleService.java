package com.gaochaojin.service.oracle;

import com.gaochaojin.dao.mysql.*;
import com.gaochaojin.dao.oracle.*;
import com.gaochaojin.entity.mysql.*;
import com.gaochaojin.entity.oracle.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 13:21 2019/7/4
 */
@Service
public class OracleService {

    @Autowired
    private Icrp2Pa01aDAO icrp2Pa01aDAO;
    @Autowired
    private Icrp2Pa01bDAO icrp2Pa01bDAO;
    @Autowired
    private Icrp2Pa01eDAO icrp2Pa01eDAO;
    @Autowired
    private Icrp2Pb01aDAO icrp2Pb01aDAO;
    @Autowired
    private Icrp2Pb01bhDAO icrp2Pb01bhDAO;
    @Autowired
    private Icrp2Pb02DAO icrp2Pb02DAO;
    @Autowired
    private Icrp2Pc02ahDAO icrp2Pc02ahDAO;
    @Autowired
    private Icrp2Pc02bhDAO icrp2Pc02bhDAO;
    @Autowired
    private Icrp2Pc02cDAO icrp2Pc02cDAO;
    @Autowired
    private Icrp2Pc02dhDAO icrp2Pc02dhDAO;
    @Autowired
    private Icrp2Pc02eDAO icrp2Pc02eDAO;
    @Autowired
    private Icrp2Pc02gDAO icrp2Pc02gDAO;
    @Autowired
    private Icrp2Pc02fDAO icrp2Pc02fDAO;
    @Autowired
    private Icrp2Pc02hDAO icrp2Pc02hDAO;
    @Autowired
    private Icrp2Pc02iDAO icrp2Pc02iDAO;
    @Autowired
    private Icrp2Pc02khDAO icrp2Pc02khDAO;
    @Autowired
    private SrcIcr2AssetDispositionDAO srcIcr2AssetDispositionDAO;
    @Autowired
    private Icrp2Pd01aDAO icrp2Pd01aDAO;
    @Autowired
    private Icrp2Pd01bDAO icrp2Pd01bDAO;
    @Autowired
    private SrcIcr2NonReloanInfoDAO srcIcr2NonReloanInfoDAO;
    @Autowired
    private Icrp2Pd01cDAO icrp2Pd01cDAO;
    @Autowired
    private Icrp2Pd01dDAO icrp2Pd01dDAO;
    @Autowired
    private Icrp2Pd01eDAO icrp2Pd01eDAO;
    @Autowired
    private Icrp2Pd01dhDAO icrp2Pd01dhDAO;
    @Autowired
    private Icrp2Pd01ehDAO icrp2Pd01ehDAO;
    @Autowired
    private SrcIcr2LoanInfoDAO srcIcr2LoanInfoDAO;
    @Autowired
    private SrcIcr2ReloanInfoDAO srcIcr2ReloanInfoDAO;
    @Autowired
    private SrcIcr2LoancardInfoDAO srcIcr2LoancardInfoDAO;
    @Autowired
    private SrcIcr2StdLoancardInfoDAO srcIcr2StdLoancardInfoDAO;
    @Autowired
    private SrcIcr2LargeAmountInstallmentDAO srcIcr2LargeAmountInstallmentDAO;
    @Autowired
    private Icrp2Pd01hhDAO icrp2Pd01hhDAO;
    @Autowired
    private SrcIcr2SpecialTradeDAO srcIcr2SpecialTradeDAO;
    @Autowired
    private Icrp2Pd01fhDAO icrp2Pd01fhDAO;
    @Autowired
    private SrcIcr2CreditInfoDAO srcIcr2CreditInfoDAO;
    @Autowired
    private Icrp2Pd02aDAO icrp2Pd02aDAO;
    @Autowired
    private Icrp2Pd03aDAO icrp2Pd03aDAO;
    @Autowired
    private SrcIcr2GuaranteeDAO srcIcr2GuaranteeDAO;
    @Autowired
    private IcrqReportbaseinfoDAO icrqReportbaseinfoDAO;

    @Transactional
    public String saveSrcIcrInfo(SrcIcr2 srcIcr2) {
        Icrp2Pa01a icrp2Pa01a = new Icrp2Pa01a();
        icrp2Pa01a.setReportno(srcIcr2.getReportNo());
        icrp2Pa01a.setPa01ai01(srcIcr2.getReportNo());
        icrp2Pa01a.setPa01ar01(srcIcr2.getDateOfReport());
        icrp2Pa01aDAO.save(icrp2Pa01a);

        Icrp2Pa01b icrp2Pa01b = new Icrp2Pa01b();
        icrp2Pa01b.setReportno(srcIcr2.getReportNo());
        icrp2Pa01b.setPa01bq01(srcIcr2.getName());
        icrp2Pa01b.setPa01bd01(srcIcr2.getIdType());
        icrp2Pa01b.setPa01bi01(srcIcr2.getIdNumber());
        icrp2Pa01b.setPa01bi02(srcIcr2.getEnquiryAgency());
        icrp2Pa01b.setPa01bd02(srcIcr2.getEnquiryReason());
        icrp2Pa01bDAO.save(icrp2Pa01b);

        Icrp2Pa01e icrp2Pa01e = new Icrp2Pa01e();
        icrp2Pa01e.setReportno(srcIcr2.getReportNo());
        icrp2Pa01e.setPa01es01(srcIcr2.getDissentNums());
        icrp2Pa01eDAO.save(icrp2Pa01e);

        Icrp2Pb01a icrp2Pb01a = new Icrp2Pb01a();
        icrp2Pb01a.setReportno(srcIcr2.getReportNo());
        icrp2Pb01a.setPb01ad01(srcIcr2.getGender());
        icrp2Pb01a.setPb01ar01(srcIcr2.getDateOfBirth());
        icrp2Pb01a.setPb01ad02(srcIcr2.getEducation());
        icrp2Pb01a.setPb01ad03(srcIcr2.getDegree());
        icrp2Pb01a.setPb01ad04(srcIcr2.getEmployment1Status());
        icrp2Pb01a.setPb01aq01(srcIcr2.geteMail());
        icrp2Pb01a.setPb01aq02(srcIcr2.getPostalAddress());
        icrp2Pb01a.setPb01ad05(srcIcr2.getNationality());
        icrp2Pb01a.setPb01aq03(srcIcr2.getPermanentAddress());
        icrp2Pb01aDAO.save(icrp2Pb01a);

        if (!StringUtils.isEmpty(srcIcr2.getAllTelNumber())) {
            String[] tellNumbers = srcIcr2.getAllTelNumber().split("\\|");
            String[] telUpdates = srcIcr2.getAllTelUpdateDate().split("\\|");
            for (int i = 0; i < tellNumbers.length; i++) {
                Icrp2Pb01bh icrp2Pb01bh = new Icrp2Pb01bh();
                icrp2Pb01bh.setReportno(srcIcr2.getReportNo());
                icrp2Pb01bh.setItemno(i + "");
                icrp2Pb01bh.setPb01bq01(tellNumbers[i]);
                icrp2Pb01bh.setPb01br01(telUpdates[i]);
                icrp2Pb01bhDAO.save(icrp2Pb01bh);
            }
        }

        Icrp2Pb02 icrp2Pb02 = new Icrp2Pb02();
        icrp2Pb02.setReportno(srcIcr2.getReportNo());
        icrp2Pb02.setPb020d01(srcIcr2.getMaritalStatus());
        icrp2Pb02.setPb020q01(srcIcr2.getSpouseName());
        icrp2Pb02.setPb020d02(srcIcr2.getSpouseIdType());
        icrp2Pb02.setPb020i01(srcIcr2.getSpouseIdNumber());
        icrp2Pb02.setPb020q02(srcIcr2.getSpouseEmployer());
        icrp2Pb02.setPb020q03(srcIcr2.getSpouseTelNumber());
        icrp2Pb02DAO.save(icrp2Pb02);


        if (!StringUtils.isEmpty(srcIcr2.getResidentialMortgage())) {
            Icrp2Pc02ah icrp2Pc02ah = new Icrp2Pc02ah();
            icrp2Pc02ah.setReportno(srcIcr2.getReportNo());
            icrp2Pc02ah.setPc02ad01("11");
            icrp2Pc02ah.setPc02ad02("1");
            icrp2Pc02ah.setPc02as03(srcIcr2.getResidentialMortgage());
            icrp2Pc02ah.setPc02ar01(srcIcr2.getMonthOfFirstResidentialMortgage());
            icrp2Pc02ah.setItemno("1");
            icrp2Pc02ahDAO.save(icrp2Pc02ah);
        }

        if (!StringUtils.isEmpty(srcIcr2.getCommercialResidentialMortgage())) {
            Icrp2Pc02ah icrp2Pc02ah = new Icrp2Pc02ah();
            icrp2Pc02ah.setReportno(srcIcr2.getReportNo());
            icrp2Pc02ah.setPc02ad01("12");
            icrp2Pc02ah.setPc02ad02("1");
            icrp2Pc02ah.setPc02as03(srcIcr2.getCommercialResidentialMortgage());
            icrp2Pc02ah.setPc02ar01(srcIcr2.getMonthOfFirstCommercialResidentialMortgage());
            icrp2Pc02ah.setItemno("2");
            icrp2Pc02ahDAO.save(icrp2Pc02ah);
        }

        if (!StringUtils.isEmpty(srcIcr2.getOtherMortgage())) {
            Icrp2Pc02ah icrp2Pc02ah = new Icrp2Pc02ah();
            icrp2Pc02ah.setReportno(srcIcr2.getReportNo());
            icrp2Pc02ah.setPc02ad01("19");
            icrp2Pc02ah.setPc02ad02("1");
            icrp2Pc02ah.setPc02as03(srcIcr2.getOtherMortgage());
            icrp2Pc02ah.setPc02ar01(srcIcr2.getMonthOfFirstOtherMortgage());
            icrp2Pc02ah.setItemno("3");
            icrp2Pc02ahDAO.save(icrp2Pc02ah);
        }

        if (!StringUtils.isEmpty(srcIcr2.getCreditCardNumbers())) {
            Icrp2Pc02ah icrp2Pc02ah = new Icrp2Pc02ah();
            icrp2Pc02ah.setReportno(srcIcr2.getReportNo());
            icrp2Pc02ah.setPc02ad01("21");
            icrp2Pc02ah.setPc02ad02("2");
            icrp2Pc02ah.setPc02as03(srcIcr2.getCreditCardNumbers());
            icrp2Pc02ah.setPc02ar01(srcIcr2.getMonthOfFirstCreditCard());
            icrp2Pc02ah.setItemno("4");
            icrp2Pc02ahDAO.save(icrp2Pc02ah);
        }

        if (!StringUtils.isEmpty(srcIcr2.getSemiCreditCard())) {
            Icrp2Pc02ah icrp2Pc02ah = new Icrp2Pc02ah();
            icrp2Pc02ah.setReportno(srcIcr2.getReportNo());
            icrp2Pc02ah.setPc02ad01("22");
            icrp2Pc02ah.setPc02ad02("2");
            icrp2Pc02ah.setPc02as03(srcIcr2.getSemiCreditCard());
            icrp2Pc02ah.setPc02ar01(srcIcr2.getMonthOfFirstSemiCreditCard());
            icrp2Pc02ah.setItemno("5");
            icrp2Pc02ahDAO.save(icrp2Pc02ah);
        }

        if (!StringUtils.isEmpty(srcIcr2.getOtherNumbers())) {
            Icrp2Pc02ah icrp2Pc02ah = new Icrp2Pc02ah();
            icrp2Pc02ah.setReportno(srcIcr2.getReportNo());
            icrp2Pc02ah.setPc02ad01("99");
            icrp2Pc02ah.setPc02ad02("9");
            icrp2Pc02ah.setPc02as03(srcIcr2.getOtherNumbers());
            icrp2Pc02ah.setPc02ar01(srcIcr2.getMonthOfFirstOther());
            icrp2Pc02ah.setItemno("6");
            icrp2Pc02ahDAO.save(icrp2Pc02ah);
        }

        if (!StringUtils.isEmpty(srcIcr2.getAssetDisposalCnt())) {
            Icrp2Pc02bh icrp2Pc02bh = new Icrp2Pc02bh();
            icrp2Pc02bh.setReportno(srcIcr2.getReportNo());
            icrp2Pc02bh.setItemno("1");
            icrp2Pc02bh.setPc02bd01("1");
            icrp2Pc02bh.setPc02bs03(srcIcr2.getAssetDisposalCnt());
            icrp2Pc02bh.setPc02bj02(StringUtils.isEmpty(srcIcr2.getAssetDisposalBalance()) ? null : srcIcr2.getAssetDisposalBalance().intValue() + "");
            icrp2Pc02bhDAO.save(icrp2Pc02bh);
        }

        if (!StringUtils.isEmpty(srcIcr2.getAdvancedCnt())) {
            Icrp2Pc02bh icrp2Pc02bh = new Icrp2Pc02bh();
            icrp2Pc02bh.setReportno(srcIcr2.getReportNo());
            icrp2Pc02bh.setItemno("2");
            icrp2Pc02bh.setPc02bd01("2");
            icrp2Pc02bh.setPc02bs03(srcIcr2.getAdvancedCnt());
            icrp2Pc02bh.setPc02bj02(StringUtils.isEmpty(srcIcr2.getAdvancedBalance()) ? null : srcIcr2.getAdvancedBalance().intValue() + "");
            icrp2Pc02bhDAO.save(icrp2Pc02bh);
        }

        Icrp2Pc02c icrp2Pc02c = new Icrp2Pc02c();
        icrp2Pc02c.setReportno(srcIcr2.getReportNo());
        icrp2Pc02c.setPc02cs01(srcIcr2.getBadCnt());
        icrp2Pc02c.setPc02cj01(StringUtils.isEmpty(srcIcr2.getBadBalance()) ? null : srcIcr2.getBadBalance().intValue() + "");
        icrp2Pc02cDAO.save(icrp2Pc02c);

        if (!StringUtils.isEmpty(srcIcr2.getNonReloanNumOfAccounts())) {
            Icrp2Pc02dh icrp2Pc02dh = new Icrp2Pc02dh();
            icrp2Pc02dh.setReportno(srcIcr2.getReportNo());
            icrp2Pc02dh.setItemno("1");
            icrp2Pc02dh.setPc02dd01("1");
            icrp2Pc02dh.setPc02ds02(srcIcr2.getNonReloanNumOfAccounts());
            icrp2Pc02dh.setPc02ds03(srcIcr2.getNonReloanNumOfMonths());
            icrp2Pc02dh.setPc02dj01(srcIcr2.getNonReloanMonMaxOverdueAmount());
            icrp2Pc02dh.setPc02ds04(srcIcr2.getNonReloanLonOverdueMonths());
            icrp2Pc02dhDAO.save(icrp2Pc02dh);
        }

        if (!StringUtils.isEmpty(srcIcr2.getLoanNumOfAccounts())) {
            Icrp2Pc02dh icrp2Pc02dh = new Icrp2Pc02dh();
            icrp2Pc02dh.setReportno(srcIcr2.getReportNo());
            icrp2Pc02dh.setItemno("2");
            icrp2Pc02dh.setPc02dd01("2");
            icrp2Pc02dh.setPc02ds02(srcIcr2.getLoanNumOfAccounts());
            icrp2Pc02dh.setPc02ds03(srcIcr2.getLoanNumOfMonths());
            icrp2Pc02dh.setPc02dj01(srcIcr2.getLoanMonMaxOverdueAmount());
            icrp2Pc02dh.setPc02ds04(srcIcr2.getLoanLonOverdueMonths());
            icrp2Pc02dhDAO.save(icrp2Pc02dh);
        }

        if (!StringUtils.isEmpty(srcIcr2.getNonReloanNumOfAccounts())) {
            Icrp2Pc02dh icrp2Pc02dh = new Icrp2Pc02dh();
            icrp2Pc02dh.setReportno(srcIcr2.getReportNo());
            icrp2Pc02dh.setItemno("3");
            icrp2Pc02dh.setPc02dd01("3");
            icrp2Pc02dh.setPc02ds02(srcIcr2.getReloanNumOfAccounts());
            icrp2Pc02dh.setPc02ds03(srcIcr2.getReloanNumOfMonths());
            icrp2Pc02dh.setPc02dj01(srcIcr2.getReloanMonMaxOverdueAmount());
            icrp2Pc02dh.setPc02ds04(srcIcr2.getReloanLonOverdueMonths());
            icrp2Pc02dhDAO.save(icrp2Pc02dh);
        }

        if (!StringUtils.isEmpty(srcIcr2.getCcoNumOfAccounts())) {
            Icrp2Pc02dh icrp2Pc02dh = new Icrp2Pc02dh();
            icrp2Pc02dh.setReportno(srcIcr2.getReportNo());
            icrp2Pc02dh.setItemno("4");
            icrp2Pc02dh.setPc02dd01("4");
            icrp2Pc02dh.setPc02ds02(srcIcr2.getCcoNumOfAccounts());
            icrp2Pc02dh.setPc02ds03(srcIcr2.getCcoNumOfMonths());
            icrp2Pc02dh.setPc02dj01(srcIcr2.getCcoMonMaxOverdueAmount());
            icrp2Pc02dh.setPc02ds04(srcIcr2.getCcoLonOverdueMonths());
            icrp2Pc02dhDAO.save(icrp2Pc02dh);
        }

        if (!StringUtils.isEmpty(srcIcr2.getScc60OverdraftNumOfAccounts())) {
            Icrp2Pc02dh icrp2Pc02dh = new Icrp2Pc02dh();
            icrp2Pc02dh.setReportno(srcIcr2.getReportNo());
            icrp2Pc02dh.setItemno("5");
            icrp2Pc02dh.setPc02dd01("5");
            icrp2Pc02dh.setPc02ds02(srcIcr2.getScc60OverdraftNumOfAccounts());
            icrp2Pc02dh.setPc02ds03(srcIcr2.getScc60NumOfMonths());
            icrp2Pc02dh.setPc02dj01(srcIcr2.getScc60MonMaxOverdueAmount());
            icrp2Pc02dh.setPc02ds04(srcIcr2.getScc60LonOverdueMonths());
            icrp2Pc02dhDAO.save(icrp2Pc02dh);
        }

        Icrp2Pc02e icrp2Pc02e = new Icrp2Pc02e();
        icrp2Pc02e.setReportno(srcIcr2.getReportNo());
        icrp2Pc02e.setPc02es01(srcIcr2.getUnonReloanNumOfIssOrgans());
        icrp2Pc02e.setPc02es02(srcIcr2.getUnonReloanNumOfAccounts());
        icrp2Pc02e.setPc02ej01(srcIcr2.getUnonReloanTotCredit());
        icrp2Pc02e.setPc02ej02(srcIcr2.getUnonReloanBalance());
        icrp2Pc02e.setPc02ej03(srcIcr2.getUnonReloan6MonAveRepayAmounts());
        icrp2Pc02eDAO.save(icrp2Pc02e);

        Icrp2Pc02g icrp2Pc02g = new Icrp2Pc02g();
        icrp2Pc02g.setReportno(srcIcr2.getReportNo());
        icrp2Pc02g.setPc02gs01(srcIcr2.getUreloanNumOfIssOrgans());
        icrp2Pc02g.setPc02gs02(srcIcr2.getUreloanNumOfAccounts());
        icrp2Pc02g.setPc02gj01(srcIcr2.getUreloanTotCredit());
        icrp2Pc02g.setPc02gj02(srcIcr2.getUreloanBalance());
        icrp2Pc02g.setPc02gj03(srcIcr2.getUreloan6MonAveRepayAmounts());
        icrp2Pc02gDAO.save(icrp2Pc02g);

        Icrp2Pc02f icrp2Pc02f = new Icrp2Pc02f();
        icrp2Pc02f.setReportno(srcIcr2.getReportNo());
        icrp2Pc02f.setPc02fs01(srcIcr2.getUloanNumOfIssOrgans());
        icrp2Pc02f.setPc02fs02(srcIcr2.getUloanNumOfAccounts());
        icrp2Pc02f.setPc02fj01(srcIcr2.getUloanTotCredit());
        icrp2Pc02f.setPc02fj02(srcIcr2.getUloanBalance());
        icrp2Pc02f.setPc02fj03(srcIcr2.getUloan6MonAveRepayAmounts());
        icrp2Pc02fDAO.save(icrp2Pc02f);

        Icrp2Pc02h icrp2Pc02h = new Icrp2Pc02h();
        icrp2Pc02h.setReportno(srcIcr2.getReportNo());
        icrp2Pc02h.setPc02hs01(srcIcr2.getUccNumOfIssOrgans());
        icrp2Pc02h.setPc02hs02(srcIcr2.getUccNumOfAccounts());
        icrp2Pc02h.setPc02hj01(srcIcr2.getUccTotCredit());
        icrp2Pc02h.setPc02hj02(srcIcr2.getUccSinBankMaxCredit());
        icrp2Pc02h.setPc02hj03(srcIcr2.getUccSinBankMinCredit());
        icrp2Pc02h.setPc02hj04(srcIcr2.getUccConCredit());
        icrp2Pc02h.setPc02hj05(srcIcr2.getUcc6MonAveConAmounts());
        icrp2Pc02hDAO.save(icrp2Pc02h);

        Icrp2Pc02i icrp2Pc02i = new Icrp2Pc02i();
        icrp2Pc02i.setReportno(srcIcr2.getReportNo());
        icrp2Pc02i.setPc02is01(srcIcr2.getUsccNumOfIssOrgans());
        icrp2Pc02i.setPc02is02(srcIcr2.getUsccNumOfAccounts());
        icrp2Pc02i.setPc02ij01(srcIcr2.getUsccTotCredit());
        icrp2Pc02i.setPc02ij02(srcIcr2.getUsccSinBankMaxCredit());
        icrp2Pc02i.setPc02ij03(srcIcr2.getUsccSinBankMinCredit());
        icrp2Pc02i.setPc02ij04(srcIcr2.getUsccOverAmount());
        icrp2Pc02i.setPc02ij05(srcIcr2.getUscc6MonAveOverAmount());
        icrp2Pc02iDAO.save(icrp2Pc02i);

        if (!StringUtils.isEmpty(srcIcr2.getPersonGuaranteeCnt())) {
            Icrp2Pc02kh icrp2Pc02kh = new Icrp2Pc02kh();
            icrp2Pc02kh.setReportno(srcIcr2.getReportNo());
            icrp2Pc02kh.setItemno("1");
            icrp2Pc02kh.setPc02kd01("1");
            icrp2Pc02kh.setPc02kd02("1");
            icrp2Pc02kh.setPc02kj01(StringUtils.isEmpty(srcIcr2.getPersonGuaranteeAmt()) ? null : srcIcr2.getPersonGuaranteeAmt().intValue() + "");
            icrp2Pc02kh.setPc02ks02(srcIcr2.getPersonGuaranteeCnt());
            icrp2Pc02kh.setPc02kj02(StringUtils.isEmpty(srcIcr2.getPersonGuaranteeBalance()) ? null : srcIcr2.getPersonGuaranteeBalance().intValue() + "");
            icrp2Pc02khDAO.save(icrp2Pc02kh);
        }

        if (!StringUtils.isEmpty(srcIcr2.getPersonRepayRelatedCnt())) {
            Icrp2Pc02kh icrp2Pc02kh = new Icrp2Pc02kh();
            icrp2Pc02kh.setReportno(srcIcr2.getReportNo());
            icrp2Pc02kh.setItemno("2");
            icrp2Pc02kh.setPc02kd01("1");
            icrp2Pc02kh.setPc02kd02("9");
            icrp2Pc02kh.setPc02kj01(StringUtils.isEmpty(srcIcr2.getPersonRepayRelatedAmt()) ? null : srcIcr2.getPersonRepayRelatedAmt().intValue() + "");
            icrp2Pc02kh.setPc02ks02(srcIcr2.getPersonRepayRelatedCnt());
            icrp2Pc02kh.setPc02kj02(StringUtils.isEmpty(srcIcr2.getPersonRepayRelatedBalance()) ? null : srcIcr2.getPersonRepayRelatedBalance().intValue() + "");
            icrp2Pc02khDAO.save(icrp2Pc02kh);
        }

        if (!StringUtils.isEmpty(srcIcr2.getEnterpriseGuaranteeCnt())) {
            Icrp2Pc02kh icrp2Pc02kh = new Icrp2Pc02kh();
            icrp2Pc02kh.setReportno(srcIcr2.getReportNo());
            icrp2Pc02kh.setItemno("3");
            icrp2Pc02kh.setPc02kd01("2");
            icrp2Pc02kh.setPc02kd02("1");
            icrp2Pc02kh.setPc02kj01(StringUtils.isEmpty(srcIcr2.getEnterpriseGuaranteeAmt()) ? null : srcIcr2.getEnterpriseGuaranteeAmt().intValue() + "");
            icrp2Pc02kh.setPc02ks02(StringUtils.isEmpty(srcIcr2.getEnterpriseGuaranteeCnt()) ? null : srcIcr2.getEnterpriseGuaranteeCnt());
            icrp2Pc02kh.setPc02kj02(StringUtils.isEmpty(srcIcr2.getEnterpriseGuaranteeBalance()) ? null : srcIcr2.getEnterpriseGuaranteeBalance().intValue() + "");
            icrp2Pc02khDAO.save(icrp2Pc02kh);
        }

        if (!StringUtils.isEmpty(srcIcr2.getEnterpriseRepayRelatedCnt())) {
            Icrp2Pc02kh icrp2Pc02kh = new Icrp2Pc02kh();
            icrp2Pc02kh.setReportno(srcIcr2.getReportNo());
            icrp2Pc02kh.setItemno("4");
            icrp2Pc02kh.setPc02kd01("2");
            icrp2Pc02kh.setPc02kd02("9");
            icrp2Pc02kh.setPc02kj01(srcIcr2.getEnterpriseRepayRelatedAmt().intValue() + "");
            icrp2Pc02kh.setPc02ks02(srcIcr2.getEnterpriseRepayRelatedCnt());
            icrp2Pc02kh.setPc02kj02(StringUtils.isEmpty(srcIcr2.getEnterpriseRepayRelatedBalance()) ? null : srcIcr2.getEnterpriseRepayRelatedBalance().intValue() + "");
            icrp2Pc02khDAO.save(icrp2Pc02kh);
        }


        // 被追偿信息
        int z = 1;
        List<SrcIcr2AssetDisposition> srcIcr2AssetDispositions = srcIcr2AssetDispositionDAO.findBySrcIcId(srcIcr2.getId());
        for (SrcIcr2AssetDisposition srcIcr2AssetDisposition : srcIcr2AssetDispositions) {
            Icrp2Pd01a icrp2Pd01a = new Icrp2Pd01a();
            icrp2Pd01a.setReportno(srcIcr2.getReportNo());
            icrp2Pd01a.setItemno(z+"");
            icrp2Pd01a.setPd01ad02(srcIcr2AssetDisposition.getAssetDisposOrgannameType());
            if ("贵阳银行股份有限公司".equals(srcIcr2AssetDisposition.getAssetDisposOrganname())){
                srcIcr2AssetDisposition.setAssetDisposOrganname("gybank");
            }
            icrp2Pd01a.setPd01ai02(srcIcr2AssetDisposition.getAssetDisposOrganname());
            icrp2Pd01a.setPd01ad01(srcIcr2AssetDisposition.getAssetDisposAccountType());
            icrp2Pd01a.setPd01ad03(srcIcr2AssetDisposition.getAssetDisposLoanbizType());
            icrp2Pd01a.setPd01ar01(srcIcr2AssetDisposition.getAssetDisposGetTime());
            icrp2Pd01aDAO.save(icrp2Pd01a);

            Icrp2Pd01b icrp2Pd01b = new Icrp2Pd01b();
            icrp2Pd01b.setReportno(srcIcr2.getReportNo());
            icrp2Pd01b.setItemno(z+"");
            icrp2Pd01b.setPd01bd01(srcIcr2AssetDisposition.getAssetDisposRecentAccountState());
            icrp2Pd01b.setPd01br01(srcIcr2AssetDisposition.getAssetDisposRecentAccountOverDate());
            icrp2Pd01b.setPd01br03(srcIcr2AssetDisposition.getAssetDisposRecentAccountEndDate());
            icrp2Pd01b.setPd01bj01(StringUtils.isEmpty(srcIcr2AssetDisposition.getAssetDisposRecentBalance()) ? null : srcIcr2AssetDisposition.getAssetDisposRecentBalance().toString());
            icrp2Pd01bDAO.save(icrp2Pd01b);
        }


        // 非循环贷明细表
        List<SrcIcr2NonReloanInfo> srcIcr2NonReloanInfos = srcIcr2NonReloanInfoDAO.findBySrcIcId(srcIcr2.getId());
        for (SrcIcr2NonReloanInfo info : srcIcr2NonReloanInfos) {
            Icrp2Pd01a icrp2Pd01a = new Icrp2Pd01a();
            icrp2Pd01a.setReportno(srcIcr2.getReportNo());
            icrp2Pd01a.setItemno(info.getItemNo());
            icrp2Pd01a.setPd01ai04(info.getNonReloanCreditLimitNo());
            icrp2Pd01a.setPd01ad02(info.getNonReloanFinanceType());
            if ("贵阳银行股份有限公司".equals(info.getNonReloanFinanceOrg())){
                info.setNonReloanFinanceOrg("gybank");
            }
            icrp2Pd01a.setPd01ai02(info.getNonReloanFinanceOrg());
            if (info.getAccount().length() > 5) {
                String account = info.getAccount().substring(0, 1) + info.getAccount().substring(7, 9) + info.getAccount().substring(11, 13);
                info.setAccount(account);
            }
            icrp2Pd01a.setPd01ai01(info.getAccount());
            icrp2Pd01a.setPd01ai03(info.getAccountNote());
            icrp2Pd01a.setPd01ad01(info.getNonReloanAccountType());
            icrp2Pd01a.setPd01ar01(info.getNonReloanOpenDate());
            icrp2Pd01a.setPd01ar02(info.getNonReloanEndDate());
            icrp2Pd01a.setPd01aj01(StringUtils.isEmpty(info.getNonReloanBusinessAmount()) ? null : info.getNonReloanBusinessAmount().intValue() + "");
            icrp2Pd01a.setPd01ad04(info.getNonReloanCurrency());
            icrp2Pd01a.setPd01ad03(info.getNonReloanLoanbizType());
            icrp2Pd01a.setPd01ad07(info.getNonReloanGuaranteeType());
            icrp2Pd01a.setPd01as01(StringUtils.isEmpty(info.getNonReloanPaymentCyc()) ? null : info.getNonReloanPaymentCyc().intValue() + "");
            icrp2Pd01a.setPd01ad06(info.getNonReloanPaymentRating());
            icrp2Pd01a.setPd01ad05(info.getNonReloanPaymentType());
            icrp2Pd01a.setPd01ad09(info.getNonReloanTogetherType());
            icrp2Pd01a.setPd01ad08(info.getNonReloanOpenType());
            icrp2Pd01aDAO.save(icrp2Pd01a);

            Icrp2Pd01c icrp2Pd01c = new Icrp2Pd01c();
            icrp2Pd01c.setReportno(srcIcr2.getReportNo());
            icrp2Pd01c.setItemno(info.getItemNo());
            icrp2Pd01c.setPd01cr01(info.getNonReloanLatestMonth());
            icrp2Pd01c.setPd01cd01(info.getNonReloanState());
            icrp2Pd01c.setPd01cd02(info.getNonReloanClass5State());
            icrp2Pd01c.setPd01cj01(StringUtils.isEmpty(info.getNonReloanBalance()) ? null : info.getNonReloanBalance().intValue() + "");
            icrp2Pd01c.setPd01cs01(StringUtils.isEmpty(info.getNonReloanRemainPaymentCyc()) ? null : info.getNonReloanRemainPaymentCyc().intValue() + "");
            icrp2Pd01c.setPd01cr02(info.getNonReloanScheduledPaymentDate());
            icrp2Pd01c.setPd01cj04(StringUtils.isEmpty(info.getNonReloanScheduledPaymentAmount()) ? null : info.getNonReloanScheduledPaymentAmount().intValue() + "");
            icrp2Pd01c.setPd01cj05(StringUtils.isEmpty(info.getNonReloanActualPaymentAmount()) ? null : info.getNonReloanActualPaymentAmount().intValue() + "");
            icrp2Pd01c.setPd01cr03(info.getNonReloanLatestPaymentDate());
            icrp2Pd01c.setPd01cs02(StringUtils.isEmpty(info.getNonReloanCurrOverdueCyc()) ? null : info.getNonReloanCurrOverdueCyc().intValue() + "");
            icrp2Pd01c.setPd01cj06(StringUtils.isEmpty(info.getNonReloanCurrOverdueAmount()) ? null : info.getNonReloanCurrOverdueAmount().intValue() + "");
            icrp2Pd01c.setPd01cj07(StringUtils.isEmpty(info.getNonReloanOverdue31To60Amount()) ? null : info.getNonReloanOverdue31To60Amount().intValue() + "");
            icrp2Pd01c.setPd01cj08(StringUtils.isEmpty(info.getNonReloanOverdue61To90Amount()) ? null : info.getNonReloanOverdue61To90Amount().intValue() + "");
            icrp2Pd01c.setPd01cj09(StringUtils.isEmpty(info.getNonReloanOverdue91To180Amount()) ? null : info.getNonReloanOverdue91To180Amount().intValue() + "");
            icrp2Pd01c.setPd01cj010(StringUtils.isEmpty(info.getNonReloanOverdueOver180Amount()) ? null : info.getNonReloanOverdueOver180Amount().intValue() + "");
            icrp2Pd01c.setPd01cr04(info.getNonReloanStateEndDate());
            icrp2Pd01cDAO.save(icrp2Pd01c);

            Icrp2Pd01d icrp2Pd01d = new Icrp2Pd01d();
            icrp2Pd01d.setReportno(srcIcr2.getReportNo());
            icrp2Pd01d.setItemno(info.getItemNo());
            icrp2Pd01d.setPd01dr01(info.getNonReloanBeginMonth());
            icrp2Pd01d.setPd01dr02(info.getNonReloanEndMonth());
            icrp2Pd01dDAO.save(icrp2Pd01d);

            Icrp2Pd01e icrp2Pd01e = new Icrp2Pd01e();
            icrp2Pd01e.setReportno(srcIcr2.getReportNo());
            icrp2Pd01e.setItemno(info.getItemNo());
            icrp2Pd01e.setPd01er01(info.getNonReloanLatest5YearBeginMonth());
            icrp2Pd01e.setPd01er02(info.getNonReloanLatest5YearEndMonth());
            icrp2Pd01e.setPd01es01(info.getNonReloanLatest5YearMonths());
            icrp2Pd01eDAO.save(icrp2Pd01e);

            if (!StringUtils.isEmpty(info.getNonReloanLatest24Month())) {
                String[] months = info.getNonReloanLatest24Month().split("\\|");
                String[] states = info.getNonReloanLatest24State().split("\\|");
                for (int i = 0; i < months.length; i++) {
                    Icrp2Pd01dh icrp2Pd01dh = new Icrp2Pd01dh();
                    icrp2Pd01dh.setReportno(srcIcr2.getReportNo());
                    icrp2Pd01dh.setItemno(info.getItemNo());
                    icrp2Pd01dh.setItemno2(i + "");
                    icrp2Pd01dh.setPd01dr03(months[i]);
                    icrp2Pd01dh.setPd01dd01(states[i]);
                    icrp2Pd01dhDAO.save(icrp2Pd01dh);
                }
            }
            if (!StringUtils.isEmpty(info.getNonReloanLatest5YearPaymentMonth())) {
                String[] months = info.getNonReloanLatest5YearPaymentMonth().split("\\|");
                String[] states = info.getNonReloanLatest5YearPaymentState().split("\\|");
                String[] moneys = info.getNonReloanLatest5YearOverdueMoney().split("\\|");
                for (int i = 0; i < months.length; i++) {
                    Icrp2Pd01eh icrp2Pd01eh = new Icrp2Pd01eh();
                    icrp2Pd01eh.setReportno(srcIcr2.getReportNo());
                    icrp2Pd01eh.setItemno(info.getItemNo());
                    icrp2Pd01eh.setItemno2(i + "");
                    icrp2Pd01eh.setPd01er03(months[i]);
                    icrp2Pd01eh.setPd01ed01(states[i]);
                    icrp2Pd01eh.setPd01ej01(moneys[i]);
                    icrp2Pd01ehDAO.save(icrp2Pd01eh);
                }
            }

            Icrp2Pd01b icrp2Pd01b = new Icrp2Pd01b();
            icrp2Pd01b.setReportno(srcIcr2.getReportNo());
            icrp2Pd01b.setItemno(info.getItemNo());
            icrp2Pd01b.setPd01br01(info.getNonReloanPayBackDate());
            icrp2Pd01b.setPd01br04(info.getNonReloanTurnOutDate());
            icrp2Pd01b.setPd01bj01(StringUtils.isEmpty(info.getNonReloanRecentBalance()) ? null : info.getNonReloanRecentBalance().intValue() + "");
            icrp2Pd01b.setPd01br02(info.getNonReloanRecentPayDate());
            icrp2Pd01b.setPd01bj02(StringUtils.isEmpty(info.getNonReloanRecentPayAmount()) ? null : info.getNonReloanRecentPayAmount().intValue() + "");
            icrp2Pd01b.setPd01bd03(info.getNonReloanRecentClass5State());
            icrp2Pd01b.setPd01bd04(info.getNonReloanRecentPaymentState());
            icrp2Pd01b.setPd01br03(info.getNonReloanRecentStateBeginDate());
            icrp2Pd01bDAO.save(icrp2Pd01b);
        }

        // 循环额度下分帐户明细表
        List<SrcIcr2LoanInfo> srcIcr2LoanInfos = srcIcr2LoanInfoDAO.findBySrcIcId(srcIcr2.getId());
        for (SrcIcr2LoanInfo info : srcIcr2LoanInfos) {
            Icrp2Pd01a icrp2Pd01a = new Icrp2Pd01a();
            icrp2Pd01a.setReportno(srcIcr2.getReportNo());
            icrp2Pd01a.setItemno(info.getItemNo());
            icrp2Pd01a.setPd01ai04(info.getLoanCreditLimitNo());
            icrp2Pd01a.setPd01ad02(info.getLoanFinanceType());
            if ("贵阳银行股份有限公司".equals(info.getLoanFinanceOrg())){
                info.setLoanFinanceOrg("gybank");
            }
            icrp2Pd01a.setPd01ai02(info.getLoanFinanceOrg());
            if (info.getAccount().length() > 5) {
                String account = info.getAccount().substring(0, 1) + info.getAccount().substring(7, 9) + info.getAccount().substring(11, 13);
                info.setAccount(account);
            }
            icrp2Pd01a.setPd01ai01(info.getAccount());
            icrp2Pd01a.setPd01ai03(info.getAccountNote());
            icrp2Pd01a.setPd01ad01(info.getLoanAccountType());
            icrp2Pd01a.setPd01ar01(info.getLoanOpenDate());
            icrp2Pd01a.setPd01ar02(info.getLoanEndDate());
            icrp2Pd01a.setPd01aj01(StringUtils.isEmpty(info.getLoanBusinessAmount()) ? null : info.getLoanBusinessAmount().intValue() + "");
            icrp2Pd01a.setPd01ad04(info.getLoanCurrency());
            icrp2Pd01a.setPd01ad03(info.getLoanLoanbizType());
            icrp2Pd01a.setPd01ad07(info.getLoanGuaranteeType());
            icrp2Pd01a.setPd01as01(StringUtils.isEmpty(info.getLoanPaymentCyc()) ? null : info.getLoanPaymentCyc().intValue() + "");
            icrp2Pd01a.setPd01ad06(info.getLoanPaymentRating());
            icrp2Pd01a.setPd01ad05(info.getLoanPaymentType());
            icrp2Pd01a.setPd01ad09(info.getLoanTogetherType());
            icrp2Pd01aDAO.save(icrp2Pd01a);

            Icrp2Pd01c icrp2Pd01c = new Icrp2Pd01c();
            icrp2Pd01c.setReportno(srcIcr2.getReportNo());
            icrp2Pd01c.setItemno(info.getItemNo());
            icrp2Pd01c.setPd01cr01(info.getLoanLatestMonth());
            icrp2Pd01c.setPd01cd01(info.getLoanState());
            icrp2Pd01c.setPd01cd02(info.getLoanClass5State());
            icrp2Pd01c.setPd01cj01(StringUtils.isEmpty(info.getLoanBalance()) ? null : info.getLoanBalance().intValue() + "");
            icrp2Pd01c.setPd01cs01(StringUtils.isEmpty(info.getLoanRemainPaymentCyc()) ? null : info.getLoanRemainPaymentCyc().intValue() + "");
            icrp2Pd01c.setPd01cr02(info.getLoanScheduledPaymentDate());
            icrp2Pd01c.setPd01cj04(StringUtils.isEmpty(info.getLoanScheduledPaymentAmount()) ? null : info.getLoanScheduledPaymentAmount().intValue() + "");
            icrp2Pd01c.setPd01cj05(StringUtils.isEmpty(info.getLoanActualPaymentAmount()) ? null : info.getLoanActualPaymentAmount().intValue() + "");
            icrp2Pd01c.setPd01cr03(info.getLoanLatestPaymentDate());
            icrp2Pd01c.setPd01cs02(StringUtils.isEmpty(info.getLoanCurrOverdueCyc()) ? null : info.getLoanCurrOverdueCyc().intValue() + "");
            icrp2Pd01c.setPd01cj06(StringUtils.isEmpty(info.getLoanCurrOverdueAmount()) ? null : info.getLoanCurrOverdueAmount().intValue() + "");
            icrp2Pd01c.setPd01cj07(StringUtils.isEmpty(info.getLoanOverdue31To60Amount()) ? null : info.getLoanOverdue31To60Amount().intValue() + "");
            icrp2Pd01c.setPd01cj08(StringUtils.isEmpty(info.getLoanOverdue61To90Amount()) ? null : info.getLoanOverdue61To90Amount().intValue() + "");
            icrp2Pd01c.setPd01cj09(StringUtils.isEmpty(info.getLoanOverdue91To180Amount()) ? null : info.getLoanOverdue91To180Amount().intValue() + "");
            icrp2Pd01c.setPd01cj010(StringUtils.isEmpty(info.getLoanOverdueOver180Amount()) ? null : info.getLoanOverdueOver180Amount().intValue() + "");
            icrp2Pd01c.setPd01cr04(info.getLoanStateEndDate());
            icrp2Pd01cDAO.save(icrp2Pd01c);

            Icrp2Pd01d icrp2Pd01d = new Icrp2Pd01d();
            icrp2Pd01d.setReportno(srcIcr2.getReportNo());
            icrp2Pd01d.setItemno(info.getItemNo());
            icrp2Pd01d.setPd01dr01(info.getLoanBeginMonth());
            icrp2Pd01d.setPd01dr02(info.getLoanEndMonth());
            icrp2Pd01dDAO.save(icrp2Pd01d);

            Icrp2Pd01e icrp2Pd01e = new Icrp2Pd01e();
            icrp2Pd01e.setReportno(srcIcr2.getReportNo());
            icrp2Pd01e.setItemno(info.getItemNo());
            icrp2Pd01e.setPd01er01(info.getLoanLatest5YearBeginMonth());
            icrp2Pd01e.setPd01er02(info.getLoanLatest5YearEndMonth());
            icrp2Pd01e.setPd01es01(info.getLoanLatest5YearMonths());
            icrp2Pd01eDAO.save(icrp2Pd01e);

            if (!StringUtils.isEmpty(info.getLoanLatest24Month())) {
                String[] months = info.getLoanLatest24Month().split("\\|");
                String[] states = info.getLoanLatest24State().split("\\|");
                for (int i = 0; i < months.length; i++) {
                    Icrp2Pd01dh icrp2Pd01dh = new Icrp2Pd01dh();
                    icrp2Pd01dh.setReportno(srcIcr2.getReportNo());
                    icrp2Pd01dh.setItemno(info.getItemNo());
                    icrp2Pd01dh.setItemno2(i + "");
                    icrp2Pd01dh.setPd01dr03(months[i]);
                    icrp2Pd01dh.setPd01dd01(states[i]);
                    icrp2Pd01dhDAO.save(icrp2Pd01dh);
                }
            }
            if (!StringUtils.isEmpty(info.getLoanLatest5YearPaymentMonth())) {
                String[] months = info.getLoanLatest5YearPaymentMonth().split("\\|");
                String[] states = info.getLoanLatest5YearPaymentState().split("\\|");
                String[] moneys = info.getLoanLatest5YearOverdueMoney().split("\\|");
                for (int i = 0; i < months.length; i++) {
                    Icrp2Pd01eh icrp2Pd01eh = new Icrp2Pd01eh();
                    icrp2Pd01eh.setReportno(srcIcr2.getReportNo());
                    icrp2Pd01eh.setItemno(info.getItemNo());
                    icrp2Pd01eh.setItemno2(i + "");
                    icrp2Pd01eh.setPd01er03(months[i]);
                    icrp2Pd01eh.setPd01ed01(states[i]);
                    icrp2Pd01eh.setPd01ej01(moneys[i]);
                    icrp2Pd01ehDAO.save(icrp2Pd01eh);
                }
            }

            Icrp2Pd01b icrp2Pd01b = new Icrp2Pd01b();
            icrp2Pd01b.setReportno(srcIcr2.getReportNo());
            icrp2Pd01b.setItemno(info.getItemNo());
            icrp2Pd01b.setPd01br01(info.getLoanPayBackDate());
            icrp2Pd01b.setPd01bd01(info.getLoanRecentState());
            icrp2Pd01b.setPd01bj01(StringUtils.isEmpty(info.getLoanRecentBalance()) ? null : info.getLoanRecentBalance().intValue() + "");
            icrp2Pd01b.setPd01br02(info.getLoanRecentPayDate());
            icrp2Pd01b.setPd01bj02(StringUtils.isEmpty(info.getLoanRecentPayAmount()) ? null : info.getLoanRecentPayAmount().intValue() + "");
            icrp2Pd01b.setPd01bd03(info.getLoanRecentClass5State());
            icrp2Pd01b.setPd01bd04(info.getLoanRecentPaymentState());
            icrp2Pd01b.setPd01br03(info.getLoanRecentStateBeginDate());
            icrp2Pd01bDAO.save(icrp2Pd01b);
        }

        // 循环贷明细记录
        List<SrcIcr2ReloanInfo> srcIcr2ReloanInfos = srcIcr2ReloanInfoDAO.findBySrcIcId(srcIcr2.getId());
        for (SrcIcr2ReloanInfo info : srcIcr2ReloanInfos) {
            Icrp2Pd01a icrp2Pd01a = new Icrp2Pd01a();
            icrp2Pd01a.setReportno(srcIcr2.getReportNo());
            icrp2Pd01a.setItemno(info.getItemNo());
            icrp2Pd01a.setPd01ai04(info.getReloanCreditLimitNo());
            icrp2Pd01a.setPd01ad02(info.getReloanFinanceType());
            if ("贵阳银行股份有限公司".equals(info.getReloanFinanceOrg())){
                info.setReloanFinanceOrg("gybank");
            }
            icrp2Pd01a.setPd01ai02(info.getReloanFinanceOrg());
            if (info.getAccount().length() > 5) {
                String account = info.getAccount().substring(0, 1) + info.getAccount().substring(7, 9) + info.getAccount().substring(11, 13);
                info.setAccount(account);
            }
            icrp2Pd01a.setPd01ai01(info.getAccount());
            icrp2Pd01a.setPd01ai03(info.getAccountNote());
            icrp2Pd01a.setPd01ad01(info.getReloanAccountType());
            icrp2Pd01a.setPd01ar01(info.getReloanOpenDate());
            icrp2Pd01a.setPd01ar02(info.getReloanEndDate());
            icrp2Pd01a.setPd01aj01(StringUtils.isEmpty(info.getReloanCreditLimitAmount()) ? null : info.getReloanCreditLimitAmount().intValue() + "");
            icrp2Pd01a.setPd01ad04(info.getReloanCurrency());
            icrp2Pd01a.setPd01ad03(info.getReloanReloanbizType());
            icrp2Pd01a.setPd01ad07(info.getReloanGuaranteeType());
            icrp2Pd01a.setPd01ad06(info.getReloanPaymentRating());
            icrp2Pd01a.setPd01ad05(info.getReloanPaymentType());
            icrp2Pd01a.setPd01ad09(info.getReloanTogetherType());
            icrp2Pd01aDAO.save(icrp2Pd01a);

            Icrp2Pd01c icrp2Pd01c = new Icrp2Pd01c();
            icrp2Pd01c.setReportno(srcIcr2.getReportNo());
            icrp2Pd01c.setItemno(info.getItemNo());
            icrp2Pd01c.setPd01cr01(info.getReloanLatestMonth());
            icrp2Pd01c.setPd01cd01(info.getReloanState());
            icrp2Pd01c.setPd01cd02(info.getReloanClass5State());
            icrp2Pd01c.setPd01cj01(StringUtils.isEmpty(info.getReloanBalance()) ? null : info.getReloanBalance().intValue() + "");
            icrp2Pd01c.setPd01cs01(StringUtils.isEmpty(info.getReloanRemainPaymentCyc()) ? null : info.getReloanRemainPaymentCyc().intValue() + "");
            icrp2Pd01c.setPd01cr02(info.getReloanScheduledPaymentDate());
            icrp2Pd01c.setPd01cj04(StringUtils.isEmpty(info.getReloanScheduledPaymentAmount()) ? null : info.getReloanScheduledPaymentAmount().intValue() + "");
            icrp2Pd01c.setPd01cj05(StringUtils.isEmpty(info.getReloanActualPaymentAmount()) ? null : info.getReloanActualPaymentAmount().intValue() + "");
            icrp2Pd01c.setPd01cr03(info.getReloanLatestPaymentDate());
            icrp2Pd01c.setPd01cs02(StringUtils.isEmpty(info.getReloanCurrOverdueCyc()) ? null : info.getReloanCurrOverdueCyc().intValue() + "");
            icrp2Pd01c.setPd01cj06(StringUtils.isEmpty(info.getReloanCurrOverdueAmount()) ? null : info.getReloanCurrOverdueAmount().intValue() + "");
            icrp2Pd01c.setPd01cj07(StringUtils.isEmpty(info.getReloanOverdue31To60Amount()) ? null : info.getReloanOverdue31To60Amount().intValue() + "");
            icrp2Pd01c.setPd01cj08(StringUtils.isEmpty(info.getReloanOverdue61To90Amount()) ? null : info.getReloanOverdue61To90Amount().intValue() + "");
            icrp2Pd01c.setPd01cj09(StringUtils.isEmpty(info.getReloanOverdue91To180Amount()) ? null : info.getReloanOverdue91To180Amount().intValue() + "");
            icrp2Pd01c.setPd01cj010(StringUtils.isEmpty(info.getReloanOverdueOver180Amount()) ? null : info.getReloanOverdueOver180Amount().intValue() + "");
            icrp2Pd01c.setPd01cr04(info.getReloanStateEndDate());
            icrp2Pd01cDAO.save(icrp2Pd01c);

            Icrp2Pd01d icrp2Pd01d = new Icrp2Pd01d();
            icrp2Pd01d.setReportno(srcIcr2.getReportNo());
            icrp2Pd01d.setItemno(info.getItemNo());
            icrp2Pd01d.setPd01dr01(info.getReloanBeginMonth());
            icrp2Pd01d.setPd01dr02(info.getReloanEndMonth());
            icrp2Pd01dDAO.save(icrp2Pd01d);

            Icrp2Pd01e icrp2Pd01e = new Icrp2Pd01e();
            icrp2Pd01e.setReportno(srcIcr2.getReportNo());
            icrp2Pd01e.setItemno(info.getItemNo());
            icrp2Pd01e.setPd01er01(info.getReloanLatest5YearBeginMonth());
            icrp2Pd01e.setPd01er02(info.getReloanLatest5YearEndMonth());
            icrp2Pd01e.setPd01es01(info.getReloanLatest5YearMonths());
            icrp2Pd01eDAO.save(icrp2Pd01e);

            if (!StringUtils.isEmpty(info.getReloanLatest24Month())) {
                String[] months = info.getReloanLatest24Month().split("\\|");
                String[] states = info.getReloanLatest24State().split("\\|");
                for (int i = 0; i < months.length; i++) {
                    Icrp2Pd01dh icrp2Pd01dh = new Icrp2Pd01dh();
                    icrp2Pd01dh.setReportno(srcIcr2.getReportNo());
                    icrp2Pd01dh.setItemno(info.getItemNo());
                    icrp2Pd01dh.setItemno2(i + "");
                    icrp2Pd01dh.setPd01dr03(months[i]);
                    icrp2Pd01dh.setPd01dd01(states[i]);
                    icrp2Pd01dhDAO.save(icrp2Pd01dh);
                }
            }
            if (!StringUtils.isEmpty(info.getReloanLatest5YearPaymentMonth())) {
                String[] months = info.getReloanLatest5YearPaymentMonth().split("\\|");
                String[] states = info.getReloanLatest5YearPaymentState().split("\\|");
                String[] moneys = info.getReloanLatest5YearOverdueMoney().split("\\|");
                for (int i = 0; i < months.length; i++) {
                    Icrp2Pd01eh icrp2Pd01eh = new Icrp2Pd01eh();
                    icrp2Pd01eh.setReportno(srcIcr2.getReportNo());
                    icrp2Pd01eh.setItemno(info.getItemNo());
                    icrp2Pd01eh.setItemno2(i + "");
                    icrp2Pd01eh.setPd01er03(months[i]);
                    icrp2Pd01eh.setPd01ed01(states[i]);
                    icrp2Pd01eh.setPd01ej01(moneys[i]);
                    icrp2Pd01ehDAO.save(icrp2Pd01eh);
                }
            }

            Icrp2Pd01b icrp2Pd01b = new Icrp2Pd01b();
            icrp2Pd01b.setReportno(srcIcr2.getReportNo());
            icrp2Pd01b.setItemno(info.getItemNo());
            icrp2Pd01b.setPd01br01(info.getReloanPayBackDate());
            icrp2Pd01b.setPd01bd01(info.getReloanRecentState());
            icrp2Pd01b.setPd01bj01(StringUtils.isEmpty(info.getReloanRecentBalance()) ? null : info.getReloanRecentBalance().intValue() + "");
            icrp2Pd01b.setPd01br02(info.getReloanRecentPayDate());
            icrp2Pd01b.setPd01bj02(StringUtils.isEmpty(info.getReloanRecentPayAmount()) ? null : info.getReloanRecentPayAmount().intValue() + "");
            icrp2Pd01b.setPd01bd03(info.getReloanRecentClass5State());
            icrp2Pd01b.setPd01bd04(info.getReloanRecentPaymentState());
            icrp2Pd01b.setPd01br03(info.getReloanRecentStateBeginDate());
            icrp2Pd01bDAO.save(icrp2Pd01b);
        }

        // 贷记卡明细 srcIcr2LoancardInfoDAO
        List<SrcIcr2LoancardInfo> srcIcr2LoancardInfos = srcIcr2LoancardInfoDAO.findBySrcIcId(srcIcr2.getId());
        for (SrcIcr2LoancardInfo info : srcIcr2LoancardInfos) {
            Icrp2Pd01a icrp2Pd01a = new Icrp2Pd01a();
            icrp2Pd01a.setReportno(srcIcr2.getReportNo());
            icrp2Pd01a.setItemno(info.getItemNo());
            icrp2Pd01a.setPd01ai04(info.getCardCreditLimitNo());
            icrp2Pd01a.setPd01ad02(info.getCardFinanceType());
            if ("贵阳银行股份有限公司".equals(info.getCardFinanceOrg())){
                info.setCardFinanceOrg("gybank");
            }
            icrp2Pd01a.setPd01ai02(info.getCardFinanceOrg());
            if (info.getAccount().length() > 5) {
                String account = info.getAccount().substring(0, 1) + info.getAccount().substring(7, 9) + info.getAccount().substring(11, 13);
                info.setAccount(account);
            }
            icrp2Pd01a.setPd01ai01(info.getAccount());
            icrp2Pd01a.setPd01ai03(info.getAccountNote());
            icrp2Pd01a.setPd01ad01(info.getCardAccountType());
            icrp2Pd01a.setPd01ar01(info.getCardOpenDate());
            icrp2Pd01a.setPd01aj02(StringUtils.isEmpty(info.getCardCreditLimitAmount()) ? null : info.getCardCreditLimitAmount().intValue() + "");
            icrp2Pd01a.setPd01aj03(StringUtils.isEmpty(info.getCardShareCreditLimitAmount()) ? null : info.getCardShareCreditLimitAmount().intValue() + "");
            icrp2Pd01a.setPd01ad04(info.getCardCurrency());
            icrp2Pd01a.setPd01ad03(info.getCardCardbizType());
            icrp2Pd01a.setPd01ad07(info.getCardGuaranteeType());
            icrp2Pd01aDAO.save(icrp2Pd01a);

            Icrp2Pd01c icrp2Pd01c = new Icrp2Pd01c();
            icrp2Pd01c.setReportno(srcIcr2.getReportNo());
            icrp2Pd01c.setItemno(info.getItemNo());
            icrp2Pd01c.setPd01cr01(info.getCardLatestMonth());
            icrp2Pd01c.setPd01cd01(info.getCardState());
            icrp2Pd01c.setPd01cj01(StringUtils.isEmpty(info.getCardBalance()) ? null : info.getCardBalance().intValue() + "");
            icrp2Pd01c.setPd01cj02(StringUtils.isEmpty(info.getCardUsedAmount()) ? null : info.getCardUsedAmount().intValue() + "");
            icrp2Pd01c.setPd01cj03(StringUtils.isEmpty(info.getCardLargeScaleSpecialBalance()) ? null : info.getCardLargeScaleSpecialBalance().intValue() + "");
            icrp2Pd01c.setPd01cs01(StringUtils.isEmpty(info.getCardRemainPaymentCyc()) ? null : info.getCardRemainPaymentCyc().intValue() + "");
            icrp2Pd01c.setPd01cr02(info.getCardScheduledPaymentDate());
            icrp2Pd01c.setPd01cj04(StringUtils.isEmpty(info.getCardScheduledPaymentAmount()) ? null : info.getCardScheduledPaymentAmount().intValue() + "");
            icrp2Pd01c.setPd01cj05(StringUtils.isEmpty(info.getCardActualPaymentAmount()) ? null : info.getCardActualPaymentAmount().intValue() + "");
            icrp2Pd01c.setPd01cr03(info.getCardLatestPaymentDate());
            icrp2Pd01c.setPd01cs02(StringUtils.isEmpty(info.getCardCurrOverdueCyc()) ? null : info.getCardCurrOverdueCyc().intValue() + "");
            icrp2Pd01c.setPd01cj06(StringUtils.isEmpty(info.getCardCurrOverdueAmount()) ? null : info.getCardCurrOverdueAmount().intValue() + "");
            icrp2Pd01c.setPd01cj012(StringUtils.isEmpty(info.getCardLatest6MonthUsedAvgAmount()) ? null : info.getCardLatest6MonthUsedAvgAmount().intValue() + "");
            icrp2Pd01c.setPd01cj014(StringUtils.isEmpty(info.getCardUsedHighestAmount()) ? null : info.getCardUsedHighestAmount().intValue() + "");
            icrp2Pd01c.setPd01cr04(info.getCardStateEndDate());
            icrp2Pd01cDAO.save(icrp2Pd01c);

            Icrp2Pd01d icrp2Pd01d = new Icrp2Pd01d();
            icrp2Pd01d.setReportno(srcIcr2.getReportNo());
            icrp2Pd01d.setItemno(info.getItemNo());
            icrp2Pd01d.setPd01dr01(info.getCardBeginMonth());
            icrp2Pd01d.setPd01dr02(info.getCardEndMonth());
            icrp2Pd01dDAO.save(icrp2Pd01d);

            Icrp2Pd01e icrp2Pd01e = new Icrp2Pd01e();
            icrp2Pd01e.setReportno(srcIcr2.getReportNo());
            icrp2Pd01e.setItemno(info.getItemNo());
            icrp2Pd01e.setPd01er01(info.getCardLatest5YearBeginMonth());
            icrp2Pd01e.setPd01er02(info.getCardLatest5YearEndMonth());
            icrp2Pd01e.setPd01es01(info.getCardLatest5YearMonths());
            icrp2Pd01eDAO.save(icrp2Pd01e);

            if (!StringUtils.isEmpty(info.getCardLatest24Month())) {
                String[] months = info.getCardLatest24Month().split("\\|");
                String[] states = info.getCardLatest24State().split("\\|");
                for (int i = 0; i < months.length; i++) {
                    Icrp2Pd01dh icrp2Pd01dh = new Icrp2Pd01dh();
                    icrp2Pd01dh.setReportno(srcIcr2.getReportNo());
                    icrp2Pd01dh.setItemno(info.getItemNo());
                    icrp2Pd01dh.setItemno2(i + "");
                    icrp2Pd01dh.setPd01dr03(months[i]);
                    icrp2Pd01dh.setPd01dd01(states[i]);
                    icrp2Pd01dhDAO.save(icrp2Pd01dh);
                }
            }
            if (!StringUtils.isEmpty(info.getCardLatest5YearPaymentMonth())) {
                String[] months = info.getCardLatest5YearPaymentMonth().split("\\|");
                String[] states = info.getCardLatest5YearPaymentState().split("\\|");
                String[] moneys = info.getCardLatest5YearOverdueMoney().split("\\|");
                for (int i = 0; i < months.length; i++) {
                    Icrp2Pd01eh icrp2Pd01eh = new Icrp2Pd01eh();
                    icrp2Pd01eh.setReportno(srcIcr2.getReportNo());
                    icrp2Pd01eh.setItemno(info.getItemNo());
                    icrp2Pd01eh.setItemno2(i + "");
                    icrp2Pd01eh.setPd01er03(months[i]);
                    icrp2Pd01eh.setPd01ed01(states[i]);
                    icrp2Pd01eh.setPd01ej01(moneys[i]);
                    icrp2Pd01ehDAO.save(icrp2Pd01eh);
                }
            }

            Icrp2Pd01b icrp2Pd01b = new Icrp2Pd01b();
            icrp2Pd01b.setReportno(srcIcr2.getReportNo());
            icrp2Pd01b.setItemno(info.getItemNo());
            icrp2Pd01b.setPd01br01(info.getCardPayBackDate());
            icrp2Pd01b.setPd01bd01(info.getCardRecentState());
            icrp2Pd01b.setPd01bj01(StringUtils.isEmpty(info.getCardRecentBalance()) ? null : info.getCardRecentBalance().intValue() + "");
            icrp2Pd01b.setPd01br02(info.getCardRecentPayDate());
            icrp2Pd01b.setPd01bj02(StringUtils.isEmpty(info.getCardRecentPayAmount()) ? null : info.getCardRecentPayAmount().intValue() + "");
            icrp2Pd01b.setPd01bd03(info.getCardRecentClass5State());
            icrp2Pd01b.setPd01bd04(info.getCardRecentPaymentState());
            icrp2Pd01b.setPd01br03(info.getCardRecentStateBeginDate());
            icrp2Pd01bDAO.save(icrp2Pd01b);
        }

        // 准贷记卡明细 srcIcr2StdLoancardInfoDAO
        List<SrcIcr2StdLoancardInfo> srcIcr2StdLoancardInfos = srcIcr2StdLoancardInfoDAO.findBySrcIcId(srcIcr2.getId());
        for (SrcIcr2StdLoancardInfo info : srcIcr2StdLoancardInfos) {
            Icrp2Pd01a icrp2Pd01a = new Icrp2Pd01a();
            icrp2Pd01a.setReportno(srcIcr2.getReportNo());
            icrp2Pd01a.setItemno(info.getItemNo());
            icrp2Pd01a.setPd01ai04(info.getQuasiCreditLimitNo());
            icrp2Pd01a.setPd01ad02(info.getQuasiFinanceType());
            if ("贵阳银行股份有限公司".equals(info.getQuasiFinanceOrg())){
                info.setQuasiFinanceOrg("gybank");
            }
            icrp2Pd01a.setPd01ai02(info.getQuasiFinanceOrg());
            if (info.getAccount().length() > 5) {
                String account = info.getAccount().substring(0, 1) + info.getAccount().substring(7, 9) + info.getAccount().substring(11, 13);
                info.setAccount(account);
            }
            icrp2Pd01a.setPd01ai01(info.getAccount());
            icrp2Pd01a.setPd01ai03(info.getAccountNote());
            icrp2Pd01a.setPd01ad01(info.getQuasiAccountType());
            icrp2Pd01a.setPd01ar01(info.getQuasiOpenDate());
            icrp2Pd01a.setPd01aj02(StringUtils.isEmpty(info.getQuasiCreditLimitAmount()) ? null : info.getQuasiCreditLimitAmount().intValue() + "");
            icrp2Pd01a.setPd01aj03(StringUtils.isEmpty(info.getQuasiShareCreditLimitAmount()) ? null : info.getQuasiShareCreditLimitAmount().intValue() + "");
            icrp2Pd01a.setPd01ad04(info.getQuasiCurrency());
            icrp2Pd01a.setPd01ad07(info.getQuasiGuaranteeType());
            icrp2Pd01aDAO.save(icrp2Pd01a);

            Icrp2Pd01c icrp2Pd01c = new Icrp2Pd01c();
            icrp2Pd01c.setReportno(srcIcr2.getReportNo());
            icrp2Pd01c.setItemno(info.getItemNo());
            icrp2Pd01c.setPd01cr01(info.getQuasiLatestMonth());
            icrp2Pd01c.setPd01cd01(info.getQuasiState());
            icrp2Pd01c.setPd01cj01(StringUtils.isEmpty(info.getQuasiBalance()) ? null : info.getQuasiBalance().intValue() + "");
            icrp2Pd01c.setPd01cj02(StringUtils.isEmpty(info.getQuasiUsedAmount()) ? null : info.getQuasiUsedAmount().intValue() + "");
            icrp2Pd01c.setPd01cr02(info.getQuasiScheduledPaymentDate());
            icrp2Pd01c.setPd01cj05(StringUtils.isEmpty(info.getQuasiActualPaymentAmount()) ? null : info.getQuasiActualPaymentAmount().intValue() + "");
            icrp2Pd01c.setPd01cr03(info.getQuasiLatestPaymentDate());
            icrp2Pd01c.setPd01cj011(StringUtils.isEmpty(info.getQuasiOverdueOver180Amount()) ? null : info.getQuasiOverdueOver180Amount().intValue() + "");
            icrp2Pd01c.setPd01cj013(StringUtils.isEmpty(info.getQuasiLatest6MonthUsedAvgAmount()) ? null : info.getQuasiLatest6MonthUsedAvgAmount().intValue() + "");
            icrp2Pd01c.setPd01cj015(StringUtils.isEmpty(info.getQuasiUsedHighestAmount()) ? null : info.getQuasiUsedHighestAmount().intValue() + "");
            icrp2Pd01c.setPd01cr04(info.getQuasiStateEndDate());
            icrp2Pd01cDAO.save(icrp2Pd01c);

            Icrp2Pd01d icrp2Pd01d = new Icrp2Pd01d();
            icrp2Pd01d.setReportno(srcIcr2.getReportNo());
            icrp2Pd01d.setItemno(info.getItemNo());
            icrp2Pd01d.setPd01dr01(info.getQuasiBeginMonth());
            icrp2Pd01d.setPd01dr02(info.getQuasiEndMonth());
            icrp2Pd01dDAO.save(icrp2Pd01d);

            Icrp2Pd01e icrp2Pd01e = new Icrp2Pd01e();
            icrp2Pd01e.setReportno(srcIcr2.getReportNo());
            icrp2Pd01e.setItemno(info.getItemNo());
            icrp2Pd01e.setPd01er01(info.getQuasiLatest5YearBeginMonth());
            icrp2Pd01e.setPd01er02(info.getQuasiLatest5YearEndMonth());
            icrp2Pd01e.setPd01es01(info.getQuasiLatest5YearMonths());
            icrp2Pd01eDAO.save(icrp2Pd01e);

            if (!StringUtils.isEmpty(info.getQuasiLatest24Month())) {
                String[] months = info.getQuasiLatest24Month().split("\\|");
                String[] states = info.getQuasiLatest24State().split("\\|");
                for (int i = 0; i < months.length; i++) {
                    Icrp2Pd01dh icrp2Pd01dh = new Icrp2Pd01dh();
                    icrp2Pd01dh.setReportno(srcIcr2.getReportNo());
                    icrp2Pd01dh.setItemno(info.getItemNo());
                    icrp2Pd01dh.setItemno2(i + "");
                    icrp2Pd01dh.setPd01dr03(months[i]);
                    icrp2Pd01dh.setPd01dd01(states[i]);
                    icrp2Pd01dhDAO.save(icrp2Pd01dh);
                }
            }
            if (!StringUtils.isEmpty(info.getQuasiLatest5YearPaymentMonth())) {
                String[] months = info.getQuasiLatest5YearPaymentMonth().split("\\|");
                String[] states = info.getQuasiLatest5YearPaymentState().split("\\|");
                String[] moneys = info.getQuasiLatest5YearOverdueMoney().split("\\|");
                for (int i = 0; i < months.length; i++) {
                    Icrp2Pd01eh icrp2Pd01eh = new Icrp2Pd01eh();
                    icrp2Pd01eh.setReportno(srcIcr2.getReportNo());
                    icrp2Pd01eh.setItemno(info.getItemNo());
                    icrp2Pd01eh.setItemno2(i + "");
                    icrp2Pd01eh.setPd01er03(months[i]);
                    icrp2Pd01eh.setPd01ed01(states[i]);
                    icrp2Pd01eh.setPd01ej01(moneys[i]);
                    icrp2Pd01ehDAO.save(icrp2Pd01eh);
                }
            }

            Icrp2Pd01b icrp2Pd01b = new Icrp2Pd01b();
            icrp2Pd01b.setReportno(srcIcr2.getReportNo());
            icrp2Pd01b.setItemno(info.getItemNo());
            icrp2Pd01b.setPd01br01(info.getQuasiPayBackDate());
            icrp2Pd01b.setPd01bd01(info.getQuasiRecentState());
            icrp2Pd01b.setPd01bj01(StringUtils.isEmpty(info.getQuasiRecentBalance()) ? null : info.getQuasiRecentBalance().intValue() + "");
            icrp2Pd01b.setPd01br02(info.getQuasiRecentPayDate());
            icrp2Pd01b.setPd01bj02(StringUtils.isEmpty(info.getQuasiRecentPayAmount()) ? null : info.getQuasiRecentPayAmount().intValue() + "");
            icrp2Pd01b.setPd01bd03(info.getQuasiRecentClass5State());
            icrp2Pd01b.setPd01bd04(info.getQuasiRecentPaymentState());
            icrp2Pd01b.setPd01br03(info.getQuasiRecentStateBeginDate());
            icrp2Pd01bDAO.save(icrp2Pd01b);
        }

        // 大额分期
        List<SrcIcr2LargeAmountInstallment> srcIcr2LargeAmountInstallments = srcIcr2LargeAmountInstallmentDAO.findBySrcIcId(srcIcr2.getId());
        int i = 1;
        for (SrcIcr2LargeAmountInstallment info : srcIcr2LargeAmountInstallments) {
            Icrp2Pd01hh icrp2Pd01hh = new Icrp2Pd01hh();
            icrp2Pd01hh.setReportno(srcIcr2.getReportNo());
            icrp2Pd01hh.setItemno(info.getItemNo());
            icrp2Pd01hh.setItemno2(i + "");
            icrp2Pd01hh.setPd01hj01(StringUtils.isEmpty(info.getLargeAmountInstallmentAmount()) ? null : info.getLargeAmountInstallmentAmount().intValue() + "");
            icrp2Pd01hh.setPd01hj02(StringUtils.isEmpty(info.getUsedInstallmentAmount()) ? null : info.getUsedInstallmentAmount().intValue() + "");
            icrp2Pd01hh.setPd01hr01(info.getLargeAmountInstallmentStartDate());
            icrp2Pd01hh.setPd01hr02(info.getLargeAmountInstallmentEndDate());
            icrp2Pd01hhDAO.save(icrp2Pd01hh);
            i++;
        }

        // 特殊交易
        List<SrcIcr2SpecialTrade> srcIcr2SpecialTrades = srcIcr2SpecialTradeDAO.findBySrcIcId(srcIcr2.getId());
        int j = 1;
        for (SrcIcr2SpecialTrade info : srcIcr2SpecialTrades) {
            Icrp2Pd01fh icrp2Pd01fh = new Icrp2Pd01fh();
            icrp2Pd01fh.setReportno(srcIcr2.getReportNo());
            icrp2Pd01fh.setItemno(info.getItemNo());
            icrp2Pd01fh.setItemno2(j + "");
            icrp2Pd01fh.setPd01fd01(info.getSpecialTradeType());
            icrp2Pd01fh.setPd01fr01(info.getSpecialTradeDate());
            icrp2Pd01fh.setPd01fs02(info.getSpecialTradeChengedMonths());
            icrp2Pd01fh.setPd01fj01(StringUtils.isEmpty(info.getSpecialTradeAmount()) ? null : info.getSpecialTradeAmount().intValue() + "");
            icrp2Pd01fh.setPd01fq01(info.getSpecialTradeDetail());
            icrp2Pd01fhDAO.save(icrp2Pd01fh);
        }

        // 授信协议
        List<SrcIcr2CreditInfo> srcIcr2CreditInfos = srcIcr2CreditInfoDAO.findBySrcIcId(srcIcr2.getId());
        int k = 1;
        for (SrcIcr2CreditInfo info : srcIcr2CreditInfos) {
            Icrp2Pd02a icrp2Pd02a = new Icrp2Pd02a();
            icrp2Pd02a.setReportno(srcIcr2.getReportNo());
            icrp2Pd02a.setItemno(info.getItemNo());
            icrp2Pd02a.setPd02ai01(info.getCreditNo());
            icrp2Pd02a.setPd02ad01(info.getFinanceType());
            icrp2Pd02a.setPd02ai02(info.getFinanceOrg());
            icrp2Pd02a.setPd02ai03(info.getCreditNote());
            icrp2Pd02a.setPd02ad02(info.getCreditApplication());
            icrp2Pd02a.setPd02aj01(StringUtils.isEmpty(info.getCreditAmount()) ? null : info.getCreditAmount().intValue() + "");
            icrp2Pd02a.setPd02ad03(info.getCreditCurrency());
            icrp2Pd02a.setPd02ar01(info.getCreditEffectiveDate());
            icrp2Pd02a.setPd02ar02(info.getCreditExpirationDate());
            icrp2Pd02a.setPd02aj04(StringUtils.isEmpty(info.getUsedAmount()) ? null : info.getUsedAmount().intValue() + "");
            icrp2Pd02a.setPd02aj03(StringUtils.isEmpty(info.getCreditLimitAmount()) ? null : info.getCreditLimitAmount().intValue() + "");
            icrp2Pd02a.setPd02ad04(info.getCreditState());
            icrp2Pd02aDAO.save(icrp2Pd02a);
        }

        // 还款责任
        List<SrcIcr2Guarantee> srcIcr2Guarantees = srcIcr2GuaranteeDAO.findBySrcIcId(srcIcr2.getId());
        int m = 1;
        for (SrcIcr2Guarantee info : srcIcr2Guarantees) {
            Icrp2Pd03a icrp2Pd03a = new Icrp2Pd03a();
            icrp2Pd03a.setReportno(srcIcr2.getReportNo());
            icrp2Pd03a.setItemno(info.getItemNo());
            icrp2Pd03a.setPd03ad08(info.getGuaranteeIdentity());
            icrp2Pd03a.setPd03ad01(info.getGuaranteeOrgType());
            icrp2Pd03a.setPd03aq01(info.getGuaranteeOrg());
            icrp2Pd03a.setPd03ad02(info.getGuaranteeBusinessType());
            icrp2Pd03a.setPd03ar01(info.getGuaranteeOpenDate());
            icrp2Pd03a.setPd03ar02(info.getGuaranteeEndDate());
            icrp2Pd03a.setPd03ad03(info.getGuaranteeRelatedPaymentType());
            icrp2Pd03a.setPd03aq02(info.getGuaranteeContractNo());
            icrp2Pd03a.setPd03aj01(StringUtils.isEmpty(info.getGuaranteeAmount()) ? null : info.getGuaranteeAmount().intValue() + "");
            icrp2Pd03a.setPd03ad04(info.getGuaranteeCurrency());
            icrp2Pd03a.setPd03aj02(StringUtils.isEmpty(info.getGuaranteeBalance()) ? null : info.getGuaranteeBalance().intValue() + "");
            icrp2Pd03a.setPd03ad05(info.getGuaranteeClass5State());
            icrp2Pd03a.setPd03ad06(info.getGuaranteeAccountType());
            icrp2Pd03a.setPd03ad07(info.getGuaranteePaymentState());
            icrp2Pd03a.setPd03as01(info.getGuaranteeOverdueMonths());
            icrp2Pd03a.setPd03ar03(info.getGuaranteeStateEndDate());
            icrp2Pd03aDAO.save(icrp2Pd03a);
        }

        IcrqReportbaseinfo icrqReportbaseinfo = new IcrqReportbaseinfo();
        icrqReportbaseinfo.setReportno(srcIcr2.getReportNo());
        icrqReportbaseinfo.setCustomername(srcIcr2.getName());
        icrqReportbaseinfo.setCertno(srcIcr2.getIdNumber());
        icrqReportbaseinfo.setCerttype(srcIcr2.getIdType());
        icrqReportbaseinfo.setReporttime("2019-07-08");
        icrqReportbaseinfo.setQuerytime("2019-07-08");
        icrqReportbaseinfoDAO.save(icrqReportbaseinfo);

        return "数据处理成功。。。";
    }
}
