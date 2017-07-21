package org.cheng.study.fci.vo;

import java.util.*;
import org.cheng.study.fci.rule.CODELIST;
import org.cheng.study.fci.rule.Rule;
import org.cheng.study.fci.rule.STATUS;
public class MSG27 extends MSG{
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

    @Rule(status = STATUS.M,format = "")
    private String MsgDate;
    public void setMsgDate(String MsgDate){
        this.MsgDate=MsgDate;
    }
    public String getMsgDate(){
        return this.MsgDate;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String InvCreditNoteNr;
    public void setInvCreditNoteNr(String InvCreditNoteNr){
        this.InvCreditNoteNr=InvCreditNoteNr;
    }
    public String getInvCreditNoteNr(){
        return this.InvCreditNoteNr;
    }

    @Rule(status = STATUS.M,format = "")
    private String InvCreditNoteDate;
    public void setInvCreditNoteDate(String InvCreditNoteDate){
        this.InvCreditNoteDate=InvCreditNoteDate;
    }
    public String getInvCreditNoteDate(){
        return this.InvCreditNoteDate;
    }

    @Rule(status = STATUS.C,format = "codelist")
    private String PmtMethod;
    public void setPmtMethod(String PmtMethod){
        this.PmtMethod=PmtMethod;
    }
    public String getPmtMethod(){
        return this.PmtMethod;
    }

    @Rule(status = STATUS.C,format = "AN..70")
    private String InvInstructions;
    public void setInvInstructions(String InvInstructions){
        this.InvInstructions=InvInstructions;
    }
    public String getInvInstructions(){
        return this.InvInstructions;
    }

    @Rule(status = STATUS.C,format = "AN..35")
    private String VatrNrExportFactor;
    public void setVatrNrExportFactor(String VatrNrExportFactor){
        this.VatrNrExportFactor=VatrNrExportFactor;
    }
    public String getVatrNrExportFactor(){
        return this.VatrNrExportFactor;
    }

    @Rule(status = STATUS.C,format = "AN..35")
    private String VatrNrImportFactor;
    public void setVatrNrImportFactor(String VatrNrImportFactor){
        this.VatrNrImportFactor=VatrNrImportFactor;
    }
    public String getVatrNrImportFactor(){
        return this.VatrNrImportFactor;
    }

    @Rule(status = STATUS.M)
    private List<CommissionStatementDetails> CommissionStatementDetails;
    public void setCommissionStatementDetails(List<CommissionStatementDetails> CommissionStatementDetails){
        this.CommissionStatementDetails=CommissionStatementDetails;
    }
    public List<CommissionStatementDetails> getCommissionStatementDetails(){
        return this.CommissionStatementDetails;
    }
    public void addCommissionStatementDetails(CommissionStatementDetails CommissionStatementDetails){
        if(null == this.CommissionStatementDetails){
            this.CommissionStatementDetails= new ArrayList<CommissionStatementDetails>();
        }
        this.CommissionStatementDetails.add(CommissionStatementDetails);
    }

    @Rule(status = STATUS.M,format = "AN3",codelist = CODELIST.tblCurrency)
    private String InvCreditNoteCurrency;
    public void setInvCreditNoteCurrency(String InvCreditNoteCurrency){
        this.InvCreditNoteCurrency=InvCreditNoteCurrency;
    }
    public String getInvCreditNoteCurrency(){
        return this.InvCreditNoteCurrency;
    }

    @Rule(status = STATUS.M,format = "N..14.4")
    private String InvCreditNoteAmt;
    public void setInvCreditNoteAmt(String InvCreditNoteAmt){
        this.InvCreditNoteAmt=InvCreditNoteAmt;
    }
    public String getInvCreditNoteAmt(){
        return this.InvCreditNoteAmt;
    }

    @Rule(status = STATUS.M,format = "AN..7000")
    private String MsgText;
    public void setMsgText(String MsgText){
        this.MsgText=MsgText;
    }
    public String getMsgText(){
        return this.MsgText;
    }

public static class MsgInfo{
    @Rule(status = STATUS.M,format = "AN7",codelist = CODELIST.tblFactor)
    private String SenderCode;
    public void setSenderCode(String SenderCode){
        this.SenderCode=SenderCode;
    }
    public String getSenderCode(){
        return this.SenderCode;
    }

    @Rule(status = STATUS.M,format = "AN7",codelist = CODELIST.tblFactor)
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

    @Rule(status = STATUS.C,format = "N..15{0..2^64}")
    private String SequenceNr;
    public void setSequenceNr(String SequenceNr){
        this.SequenceNr=SequenceNr;
    }
    public String getSequenceNr(){
        return this.SequenceNr;
    }

    @Rule(status = STATUS.C,format = "YYYY-MM-DDTHH:MM:SS")
    private String DateTime;
    public void setDateTime(String DateTime){
        this.DateTime=DateTime;
    }
    public String getDateTime(){
        return this.DateTime;
    }

    @Rule(status = STATUS.C,format = "N..3{0..255}",codelist = CODELIST.refMessageStatus)
    private String Status;
    public void setStatus(String Status){
        this.Status=Status;
    }
    public String getStatus(){
        return this.Status;
    }

    @Rule(status = STATUS.C,format = "AN")
    private String Error;
    public void setError(String Error){
        this.Error=Error;
    }
    public String getError(){
        return this.Error;
    }

}

public static class EF{
    @Rule(status = STATUS.M,format = "AN7",codelist = CODELIST.tblFactor)
    private String FactorCode;
    public void setFactorCode(String FactorCode){
        this.FactorCode=FactorCode;
    }
    public String getFactorCode(){
        return this.FactorCode;
    }

    @Rule(status = STATUS.C,format = "AN..35")
    private String FactorName;
    public void setFactorName(String FactorName){
        this.FactorName=FactorName;
    }
    public String getFactorName(){
        return this.FactorName;
    }

}

public static class IF{
    @Rule(status = STATUS.M,format = "")
    private String FactorCode;
    public void setFactorCode(String FactorCode){
        this.FactorCode=FactorCode;
    }
    public String getFactorCode(){
        return this.FactorCode;
    }

    @Rule(status = STATUS.C,format = "")
    private String FactorName;
    public void setFactorName(String FactorName){
        this.FactorName=FactorName;
    }
    public String getFactorName(){
        return this.FactorName;
    }

}

public static class CommissionStatementDetails{
    @Rule(status = STATUS.C,format = "AN..35")
    private String SellerNr;
    public void setSellerNr(String SellerNr){
        this.SellerNr=SellerNr;
    }
    public String getSellerNr(){
        return this.SellerNr;
    }

    @Rule(status = STATUS.C,format = "AN..35")
    private String SellerName;
    public void setSellerName(String SellerName){
        this.SellerName=SellerName;
    }
    public String getSellerName(){
        return this.SellerName;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String InvBatchNr;
    public void setInvBatchNr(String InvBatchNr){
        this.InvBatchNr=InvBatchNr;
    }
    public String getInvBatchNr(){
        return this.InvBatchNr;
    }

    @Rule(status = STATUS.M,format = "")
    private String InvBatchDate;
    public void setInvBatchDate(String InvBatchDate){
        this.InvBatchDate=InvBatchDate;
    }
    public String getInvBatchDate(){
        return this.InvBatchDate;
    }

    @Rule(status = STATUS.C,format = "N..5{0..65535}")
    private String NrOfItems;
    public void setNrOfItems(String NrOfItems){
        this.NrOfItems=NrOfItems;
    }
    public String getNrOfItems(){
        return this.NrOfItems;
    }

    @Rule(status = STATUS.C,format = "N..14.4")
    private String BatchValueAmt;
    public void setBatchValueAmt(String BatchValueAmt){
        this.BatchValueAmt=BatchValueAmt;
    }
    public String getBatchValueAmt(){
        return this.BatchValueAmt;
    }

    @Rule(status = STATUS.C,format = "N..14.4")
    private String HandlingFee;
    public void setHandlingFee(String HandlingFee){
        this.HandlingFee=HandlingFee;
    }
    public String getHandlingFee(){
        return this.HandlingFee;
    }

    @Rule(status = STATUS.C,format = "AN3",codelist = CODELIST.tblCurrency)
    private String HandlingFeeCurr;
    public void setHandlingFeeCurr(String HandlingFeeCurr){
        this.HandlingFeeCurr=HandlingFeeCurr;
    }
    public String getHandlingFeeCurr(){
        return this.HandlingFeeCurr;
    }

    @Rule(status = STATUS.C,format = "N..14.4")
    private String HandlingFeeExchToInv;
    public void setHandlingFeeExchToInv(String HandlingFeeExchToInv){
        this.HandlingFeeExchToInv=HandlingFeeExchToInv;
    }
    public String getHandlingFeeExchToInv(){
        return this.HandlingFeeExchToInv;
    }

    @Rule(status = STATUS.C,format = "N..14.4")
    private String HandlingCharge;
    public void setHandlingCharge(String HandlingCharge){
        this.HandlingCharge=HandlingCharge;
    }
    public String getHandlingCharge(){
        return this.HandlingCharge;
    }

    @Rule(status = STATUS.C,format = "N..14.4")
    private String HandlingComm;
    public void setHandlingComm(String HandlingComm){
        this.HandlingComm=HandlingComm;
    }
    public String getHandlingComm(){
        return this.HandlingComm;
    }

    @Rule(status = STATUS.C,format = "N..14.4")
    private String CreditCharge;
    public void setCreditCharge(String CreditCharge){
        this.CreditCharge=CreditCharge;
    }
    public String getCreditCharge(){
        return this.CreditCharge;
    }

    @Rule(status = STATUS.C,format = "N..14.4")
    private String CreditComm;
    public void setCreditComm(String CreditComm){
        this.CreditComm=CreditComm;
    }
    public String getCreditComm(){
        return this.CreditComm;
    }

    @Rule(status = STATUS.C,format = "AN..70")
    private String CommDetails;
    public void setCommDetails(String CommDetails){
        this.CommDetails=CommDetails;
    }
    public String getCommDetails(){
        return this.CommDetails;
    }

    @Rule(status = STATUS.M,format = "N..14.4")
    private String TotalComm;
    public void setTotalComm(String TotalComm){
        this.TotalComm=TotalComm;
    }
    public String getTotalComm(){
        return this.TotalComm;
    }

}

}

