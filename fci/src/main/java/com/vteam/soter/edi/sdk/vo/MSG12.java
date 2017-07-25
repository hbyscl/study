package com.vteam.soter.edi.sdk.vo;

import java.util.*;

import com.vteam.soter.edi.sdk.rule.Rule;
import com.vteam.soter.edi.sdk.rule.STATUS;
public class MSG12 extends MSG{
    @Rule(status = STATUS.M)
    private MsgInfo MsgInfo;
    public void setMsgInfo(MsgInfo MsgInfo){
        this.MsgInfo=MsgInfo;
    }
    public MsgInfo getMsgInfo(){
        return this.MsgInfo;
    }

    @Rule(status = STATUS.M)
    private EF EF;
    public void setEF(EF EF){
        this.EF=EF;
    }
    public EF getEF(){
        return this.EF;
    }

    @Rule(status = STATUS.M)
    private IF IF;
    public void setIF(IF IF){
        this.IF=IF;
    }
    public IF getIF(){
        return this.IF;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String PmtBatchNr;
    public void setPmtBatchNr(String PmtBatchNr){
        this.PmtBatchNr=PmtBatchNr;
    }
    public String getPmtBatchNr(){
        return this.PmtBatchNr;
    }

    @Rule(status = STATUS.M,format = "YYYY-MM-DD")
    private String PmtBatchDate;
    public void setPmtBatchDate(String PmtBatchDate){
        this.PmtBatchDate=PmtBatchDate;
    }
    public String getPmtBatchDate(){
        return this.PmtBatchDate;
    }

    @Rule(status = STATUS.M,format = "AN3",codelist = "Currency")
    private String PmtBatchCurrency;
    public void setPmtBatchCurrency(String PmtBatchCurrency){
        this.PmtBatchCurrency=PmtBatchCurrency;
    }
    public String getPmtBatchCurrency(){
        return this.PmtBatchCurrency;
    }

    @Rule(status = STATUS.M)
    private Seller Seller;
    public void setSeller(Seller Seller){
        this.Seller=Seller;
    }
    public Seller getSeller(){
        return this.Seller;
    }

    @Rule(status = STATUS.M)
    private List<PmtDetails> PmtDetails;
    public void setPmtDetails(List<PmtDetails> PmtDetails){
        this.PmtDetails=PmtDetails;
    }
    public List<PmtDetails> getPmtDetails(){
        return this.PmtDetails;
    }
    public void addPmtDetails(PmtDetails PmtDetails){
        if(null == this.PmtDetails){
            this.PmtDetails= new ArrayList<PmtDetails>();
        }
        this.PmtDetails.add(PmtDetails);
    }

    @Rule(status = STATUS.M)
    private ControlTot ControlTot;
    public void setControlTot(ControlTot ControlTot){
        this.ControlTot=ControlTot;
    }
    public ControlTot getControlTot(){
        return this.ControlTot;
    }

    @Rule(status = STATUS.C,format = "AN..700")
    private String MsgText;
    public void setMsgText(String MsgText){
        this.MsgText=MsgText;
    }
    public String getMsgText(){
        return this.MsgText;
    }

public static class MsgInfo{
    @Rule(status = STATUS.M,format = "AN7",codelist = "Factor")
    private String SenderCode;
    public void setSenderCode(String SenderCode){
        this.SenderCode=SenderCode;
    }
    public String getSenderCode(){
        return this.SenderCode;
    }

    @Rule(status = STATUS.M,format = "AN7",codelist = "Factor")
    private String ReceiverCode;
    public void setReceiverCode(String ReceiverCode){
        this.ReceiverCode=ReceiverCode;
    }
    public String getReceiverCode(){
        return this.ReceiverCode;
    }

    @Rule(status = STATUS.M,format = "AN..16")
    private String CreatedBy;
    public void setCreatedBy(String CreatedBy){
        this.CreatedBy=CreatedBy;
    }
    public String getCreatedBy(){
        return this.CreatedBy;
    }

    @Rule(status = STATUS.M,format = "N..10",noInput = true)
    private String SequenceNr;
    public void setSequenceNr(String SequenceNr){
        this.SequenceNr=SequenceNr;
    }
    public String getSequenceNr(){
        return this.SequenceNr;
    }

    @Rule(status = STATUS.C,format = "YYYY-MM-DDTHH:MM:SS",noInput = true)
    private String DateTime;
    public void setDateTime(String DateTime){
        this.DateTime=DateTime;
    }
    public String getDateTime(){
        return this.DateTime;
    }

    @Rule(status = STATUS.M,format = "N..2",noInput = true)
    private String Status;
    public void setStatus(String Status){
        this.Status=Status;
    }
    public String getStatus(){
        return this.Status;
    }

    @Rule(status = STATUS.C,format = "AN",noInput = true)
    private String Error;
    public void setError(String Error){
        this.Error=Error;
    }
    public String getError(){
        return this.Error;
    }

}

public static class EF{
    @Rule(status = STATUS.M,format = "AN7",codelist = "Factor")
    private String FactorCode;
    public void setFactorCode(String FactorCode){
        this.FactorCode=FactorCode;
    }
    public String getFactorCode(){
        return this.FactorCode;
    }

    @Rule(status = STATUS.C,format = "AN..35",noInput = true)
    private String FactorName;
    public void setFactorName(String FactorName){
        this.FactorName=FactorName;
    }
    public String getFactorName(){
        return this.FactorName;
    }

}

public static class IF{
    @Rule(status = STATUS.M,format = "AN7",codelist = "Factor")
    private String FactorCode;
    public void setFactorCode(String FactorCode){
        this.FactorCode=FactorCode;
    }
    public String getFactorCode(){
        return this.FactorCode;
    }

    @Rule(status = STATUS.C,format = "AN..35",noInput = true)
    private String FactorName;
    public void setFactorName(String FactorName){
        this.FactorName=FactorName;
    }
    public String getFactorName(){
        return this.FactorName;
    }

}

public static class Seller{
    @Rule(status = STATUS.M,format = "AN..35",codelist = "FSBC")
    private String SellerNr;
    public void setSellerNr(String SellerNr){
        this.SellerNr=SellerNr;
    }
    public String getSellerNr(){
        return this.SellerNr;
    }

    @Rule(status = STATUS.C,format = "AN..35",noInput = true)
    private String SellerName;
    public void setSellerName(String SellerName){
        this.SellerName=SellerName;
    }
    public String getSellerName(){
        return this.SellerName;
    }

}

public static class PmtDetails{
    @Rule(status = STATUS.M,format = "AN..35",codelist = "FSBC")
    private String BuyerNr;
    public void setBuyerNr(String BuyerNr){
        this.BuyerNr=BuyerNr;
    }
    public String getBuyerNr(){
        return this.BuyerNr;
    }

    @Rule(status = STATUS.C,format = "AN..35",noInput = true)
    private String BuyerName;
    public void setBuyerName(String BuyerName){
        this.BuyerName=BuyerName;
    }
    public String getBuyerName(){
        return this.BuyerName;
    }

    @Rule(status = STATUS.M,format = "N..3",codelist = "DocumentPaid")
    private String DocPaid;
    public void setDocPaid(String DocPaid){
        this.DocPaid=DocPaid;
    }
    public String getDocPaid(){
        return this.DocPaid;
    }

    @Rule(status = STATUS.C,format = "AN..35")
    private String InvCreditNoteNr;
    public void setInvCreditNoteNr(String InvCreditNoteNr){
        this.InvCreditNoteNr=InvCreditNoteNr;
    }
    public String getInvCreditNoteNr(){
        return this.InvCreditNoteNr;
    }

    @Rule(status = STATUS.C,format = "YYYY-MM-DD")
    private String InvCreditNoteDate;
    public void setInvCreditNoteDate(String InvCreditNoteDate){
        this.InvCreditNoteDate=InvCreditNoteDate;
    }
    public String getInvCreditNoteDate(){
        return this.InvCreditNoteDate;
    }

    @Rule(status = STATUS.C,format = "N14.2{amount}")
    private String InvCreditNoteAmt;
    public void setInvCreditNoteAmt(String InvCreditNoteAmt){
        this.InvCreditNoteAmt=InvCreditNoteAmt;
    }
    public String getInvCreditNoteAmt(){
        return this.InvCreditNoteAmt;
    }

    @Rule(status = STATUS.M,format = "N14.2{amount}")
    private String PmtAmt;
    public void setPmtAmt(String PmtAmt){
        this.PmtAmt=PmtAmt;
    }
    public String getPmtAmt(){
        return this.PmtAmt;
    }

    @Rule(status = STATUS.M,format = "N14.2{amount}")
    private String BankChargeAmt;
    public void setBankChargeAmt(String BankChargeAmt){
        this.BankChargeAmt=BankChargeAmt;
    }
    public String getBankChargeAmt(){
        return this.BankChargeAmt;
    }

    @Rule(status = STATUS.C,format = "N14.2{amount}")
    private String DeducAmt;
    public void setDeducAmt(String DeducAmt){
        this.DeducAmt=DeducAmt;
    }
    public String getDeducAmt(){
        return this.DeducAmt;
    }

    @Rule(status = STATUS.M,format = "N..3",codelist = "PaymentType")
    private String PmtType;
    public void setPmtType(String PmtType){
        this.PmtType=PmtType;
    }
    public String getPmtType(){
        return this.PmtType;
    }

    @Rule(status = STATUS.C,format = "YYYY-MM-DD")
    private String PmtDate;
    public void setPmtDate(String PmtDate){
        this.PmtDate=PmtDate;
    }
    public String getPmtDate(){
        return this.PmtDate;
    }

    @Rule(status = STATUS.C,format = "YYYY-MM-DD")
    private String PmtValueDate;
    public void setPmtValueDate(String PmtValueDate){
        this.PmtValueDate=PmtValueDate;
    }
    public String getPmtValueDate(){
        return this.PmtValueDate;
    }

}

public static class ControlTot{
    @Rule(status = STATUS.M,format = "N14.2{(negative) amount}")
    private String TotAmtPaid;
    public void setTotAmtPaid(String TotAmtPaid){
        this.TotAmtPaid=TotAmtPaid;
    }
    public String getTotAmtPaid(){
        return this.TotAmtPaid;
    }

    @Rule(status = STATUS.M,format = "N14.2{(negative) amount}")
    private String TotAmtBankChargeDeduc;
    public void setTotAmtBankChargeDeduc(String TotAmtBankChargeDeduc){
        this.TotAmtBankChargeDeduc=TotAmtBankChargeDeduc;
    }
    public String getTotAmtBankChargeDeduc(){
        return this.TotAmtBankChargeDeduc;
    }

    @Rule(status = STATUS.M,format = "N14.2{(negative) amount}")
    private String TotAmtCleared;
    public void setTotAmtCleared(String TotAmtCleared){
        this.TotAmtCleared=TotAmtCleared;
    }
    public String getTotAmtCleared(){
        return this.TotAmtCleared;
    }

}

}

