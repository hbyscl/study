package org.cheng.study.fci.vo;

import java.util.*;
import org.cheng.study.fci.rule.CODELIST;
import org.cheng.study.fci.rule.Rule;
import org.cheng.study.fci.rule.STATUS;
public class MSG70 extends MSG{
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
    private String VerificationRequestNr;
    public void setVerificationRequestNr(String VerificationRequestNr){
        this.VerificationRequestNr=VerificationRequestNr;
    }
    public String getVerificationRequestNr(){
        return this.VerificationRequestNr;
    }

    @Rule(status = STATUS.M,format = "AN3",codelist = CODELIST.tblCurrency)
    private String VerificationRequestCurrency;
    public void setVerificationRequestCurrency(String VerificationRequestCurrency){
        this.VerificationRequestCurrency=VerificationRequestCurrency;
    }
    public String getVerificationRequestCurrency(){
        return this.VerificationRequestCurrency;
    }

    @Rule(status = STATUS.M,format = "codelist")
    private String VerificationRequestStatus;
    public void setVerificationRequestStatus(String VerificationRequestStatus){
        this.VerificationRequestStatus=VerificationRequestStatus;
    }
    public String getVerificationRequestStatus(){
        return this.VerificationRequestStatus;
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
    private List<VerificationRequestDetails> VerificationRequestDetails;
    public void setVerificationRequestDetails(List<VerificationRequestDetails> VerificationRequestDetails){
        this.VerificationRequestDetails=VerificationRequestDetails;
    }
    public List<VerificationRequestDetails> getVerificationRequestDetails(){
        return this.VerificationRequestDetails;
    }
    public void addVerificationRequestDetails(VerificationRequestDetails VerificationRequestDetails){
        if(null == this.VerificationRequestDetails){
            this.VerificationRequestDetails= new ArrayList<VerificationRequestDetails>();
        }
        this.VerificationRequestDetails.add(VerificationRequestDetails);
    }

    @Rule(status = STATUS.C,format = "AN..3500")
    private String VerificationRequestReasonText;
    public void setVerificationRequestReasonText(String VerificationRequestReasonText){
        this.VerificationRequestReasonText=VerificationRequestReasonText;
    }
    public String getVerificationRequestReasonText(){
        return this.VerificationRequestReasonText;
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

public static class Seller{
    @Rule(status = STATUS.M,format = "AN..35",codelist = CODELIST.tblFSBC:SellerNrList)
    private String SellerNr;
    public void setSellerNr(String SellerNr){
        this.SellerNr=SellerNr;
    }
    public String getSellerNr(){
        return this.SellerNr;
    }

    @Rule(status = STATUS.C,format = "AN..35",codelist = CODELIST.tblFSBC:SellerNameList)
    private String SellerName;
    public void setSellerName(String SellerName){
        this.SellerName=SellerName;
    }
    public String getSellerName(){
        return this.SellerName;
    }

}

public static class Buyer{
    @Rule(status = STATUS.M,format = "AN..35",codelist = CODELIST.tblFSBC:BuyerNrList)
    private String BuyerNr;
    public void setBuyerNr(String BuyerNr){
        this.BuyerNr=BuyerNr;
    }
    public String getBuyerNr(){
        return this.BuyerNr;
    }

    @Rule(status = STATUS.C,format = "AN..35",codelist = CODELIST.tblFSBC:BuyerNameList)
    private String BuyerName;
    public void setBuyerName(String BuyerName){
        this.BuyerName=BuyerName;
    }
    public String getBuyerName(){
        return this.BuyerName;
    }

}

public static class VerificationRequestDetails{
    @Rule(status = STATUS.M,format = "codelist")
    private String DocType;
    public void setDocType(String DocType){
        this.DocType=DocType;
    }
    public String getDocType(){
        return this.DocType;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String DocNr;
    public void setDocNr(String DocNr){
        this.DocNr=DocNr;
    }
    public String getDocNr(){
        return this.DocNr;
    }

    @Rule(status = STATUS.M,format = "")
    private String DocDate;
    public void setDocDate(String DocDate){
        this.DocDate=DocDate;
    }
    public String getDocDate(){
        return this.DocDate;
    }

    @Rule(status = STATUS.M,format = "N..14.4")
    private String DocAmt;
    public void setDocAmt(String DocAmt){
        this.DocAmt=DocAmt;
    }
    public String getDocAmt(){
        return this.DocAmt;
    }

    @Rule(status = STATUS.M,format = "N..14.4")
    private String VerificationRequestAmt;
    public void setVerificationRequestAmt(String VerificationRequestAmt){
        this.VerificationRequestAmt=VerificationRequestAmt;
    }
    public String getVerificationRequestAmt(){
        return this.VerificationRequestAmt;
    }

    @Rule(status = STATUS.M,format = "codelist")
    private String Action;
    public void setAction(String Action){
        this.Action=Action;
    }
    public String getAction(){
        return this.Action;
    }

    @Rule(status = STATUS.C,format = "")
    private String LatestDate;
    public void setLatestDate(String LatestDate){
        this.LatestDate=LatestDate;
    }
    public String getLatestDate(){
        return this.LatestDate;
    }

}

}

