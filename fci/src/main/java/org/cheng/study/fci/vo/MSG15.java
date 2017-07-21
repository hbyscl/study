package org.cheng.study.fci.vo;

import java.util.*;
import org.cheng.study.fci.rule.CODELIST;
import org.cheng.study.fci.rule.Rule;
import org.cheng.study.fci.rule.STATUS;
public class MSG15 extends MSG{
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

    @Rule(status = STATUS.M,format = "YYYY-MM-DD")
    private String MsgDate;
    public void setMsgDate(String MsgDate){
        this.MsgDate=MsgDate;
    }
    public String getMsgDate(){
        return this.MsgDate;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String DisputeNr;
    public void setDisputeNr(String DisputeNr){
        this.DisputeNr=DisputeNr;
    }
    public String getDisputeNr(){
        return this.DisputeNr;
    }

    @Rule(status = STATUS.M,format = "YYYY-MM-DD")
    private String DateOriginDispute;
    public void setDateOriginDispute(String DateOriginDispute){
        this.DateOriginDispute=DateOriginDispute;
    }
    public String getDateOriginDispute(){
        return this.DateOriginDispute;
    }

    @Rule(status = STATUS.M,format = "AN3",codelist = CODELIST.Currency)
    private String DisputeCurrency;
    public void setDisputeCurrency(String DisputeCurrency){
        this.DisputeCurrency=DisputeCurrency;
    }
    public String getDisputeCurrency(){
        return this.DisputeCurrency;
    }

    @Rule(status = STATUS.M,format = "N..3",codelist = CODELIST.DisputeStatus)
    private String DisputeStatus;
    public void setDisputeStatus(String DisputeStatus){
        this.DisputeStatus=DisputeStatus;
    }
    public String getDisputeStatus(){
        return this.DisputeStatus;
    }

    @Rule(status = STATUS.C,format = "YYYY-MM-DD")
    private String DateSettlementDispute;
    public void setDateSettlementDispute(String DateSettlementDispute){
        this.DateSettlementDispute=DateSettlementDispute;
    }
    public String getDateSettlementDispute(){
        return this.DateSettlementDispute;
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
    private Buyer Buyer;
    public void setBuyer(Buyer Buyer){
        this.Buyer=Buyer;
    }
    public Buyer getBuyer(){
        return this.Buyer;
    }

    @Rule(status = STATUS.M)
    private List<DisputeDetails> DisputeDetails;
    public void setDisputeDetails(List<DisputeDetails> DisputeDetails){
        this.DisputeDetails=DisputeDetails;
    }
    public List<DisputeDetails> getDisputeDetails(){
        return this.DisputeDetails;
    }
    public void addDisputeDetails(DisputeDetails DisputeDetails){
        if(null == this.DisputeDetails){
            this.DisputeDetails= new ArrayList<DisputeDetails>();
        }
        this.DisputeDetails.add(DisputeDetails);
    }

    @Rule(status = STATUS.C,format = "AN..3500")
    private String DisputeReasonText;
    public void setDisputeReasonText(String DisputeReasonText){
        this.DisputeReasonText=DisputeReasonText;
    }
    public String getDisputeReasonText(){
        return this.DisputeReasonText;
    }

    @Rule(status = STATUS.C,format = "AN..3500")
    private String ActionText;
    public void setActionText(String ActionText){
        this.ActionText=ActionText;
    }
    public String getActionText(){
        return this.ActionText;
    }

public static class MsgInfo{
    @Rule(status = STATUS.M,format = "AN7",codelist = CODELIST.Factor)
    private String SenderCode;
    public void setSenderCode(String SenderCode){
        this.SenderCode=SenderCode;
    }
    public String getSenderCode(){
        return this.SenderCode;
    }

    @Rule(status = STATUS.M,format = "AN7",codelist = CODELIST.Factor)
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
    @Rule(status = STATUS.M,format = "AN7",codelist = CODELIST.Factor)
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
    @Rule(status = STATUS.M,format = "AN7",codelist = CODELIST.Factor)
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
    @Rule(status = STATUS.M,format = "AN..35",codelist = CODELIST.FSBC)
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

public static class Buyer{
    @Rule(status = STATUS.M,format = "AN..35",codelist = CODELIST.FSBC)
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

}

public static class DisputeDetails{
    @Rule(status = STATUS.M,format = "N..3",codelist = CODELIST.DocumentType)
    private String DocType;
    public void setDocType(String DocType){
        this.DocType=DocType;
    }
    public String getDocType(){
        return this.DocType;
    }

    @Rule(status = STATUS.C,format = "AN..35")
    private String DocNr;
    public void setDocNr(String DocNr){
        this.DocNr=DocNr;
    }
    public String getDocNr(){
        return this.DocNr;
    }

    @Rule(status = STATUS.C,format = "YYYY-MM-DD")
    private String DocDate;
    public void setDocDate(String DocDate){
        this.DocDate=DocDate;
    }
    public String getDocDate(){
        return this.DocDate;
    }

    @Rule(status = STATUS.C,format = "N14.2{amount}")
    private String DocAmt;
    public void setDocAmt(String DocAmt){
        this.DocAmt=DocAmt;
    }
    public String getDocAmt(){
        return this.DocAmt;
    }

    @Rule(status = STATUS.M,format = "N14.2{amount}")
    private String DisputeAmt;
    public void setDisputeAmt(String DisputeAmt){
        this.DisputeAmt=DisputeAmt;
    }
    public String getDisputeAmt(){
        return this.DisputeAmt;
    }

    @Rule(status = STATUS.M,format = "N..3",codelist = CODELIST.DisputeReason)
    private String DisputeReason;
    public void setDisputeReason(String DisputeReason){
        this.DisputeReason=DisputeReason;
    }
    public String getDisputeReason(){
        return this.DisputeReason;
    }

    @Rule(status = STATUS.C,format = "N..3",codelist = CODELIST.InstructionStatus)
    private String InstructionStatus;
    public void setInstructionStatus(String InstructionStatus){
        this.InstructionStatus=InstructionStatus;
    }
    public String getInstructionStatus(){
        return this.InstructionStatus;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String NotifyingParty;
    public void setNotifyingParty(String NotifyingParty){
        this.NotifyingParty=NotifyingParty;
    }
    public String getNotifyingParty(){
        return this.NotifyingParty;
    }

    @Rule(status = STATUS.C,format = "N..3",codelist = CODELIST.ActionTaken)
    private String Action;
    public void setAction(String Action){
        this.Action=Action;
    }
    public String getAction(){
        return this.Action;
    }

}

}

