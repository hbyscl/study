package com.vteam.soter.edi.sdk.vo;

import java.util.*;
import com.vteam.soter.edi.sdk.rule.CODELIST;
import com.vteam.soter.edi.sdk.rule.Rule;
import com.vteam.soter.edi.sdk.rule.STATUS;
public class MSG74 extends MSG{
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
    private String VerificationNr;
    public void setVerificationNr(String VerificationNr){
        this.VerificationNr=VerificationNr;
    }
    public String getVerificationNr(){
        return this.VerificationNr;
    }

    @Rule(status = STATUS.M,format = "AN3",)
    private String VerificationCurrency;
    public void setVerificationCurrency(String VerificationCurrency){
        this.VerificationCurrency=VerificationCurrency;
    }
    public String getVerificationCurrency(){
        return this.VerificationCurrency;
    }

    @Rule(status = STATUS.C,format = "")
    private String VerificationDate;
    public void setVerificationDate(String VerificationDate){
        this.VerificationDate=VerificationDate;
    }
    public String getVerificationDate(){
        return this.VerificationDate;
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
    private List<VerificationDetails> VerificationDetails;
    public void setVerificationDetails(List<VerificationDetails> VerificationDetails){
        this.VerificationDetails=VerificationDetails;
    }
    public List<VerificationDetails> getVerificationDetails(){
        return this.VerificationDetails;
    }
    public void addVerificationDetails(VerificationDetails VerificationDetails){
        if(null == this.VerificationDetails){
            this.VerificationDetails= new ArrayList<VerificationDetails>();
        }
        this.VerificationDetails.add(VerificationDetails);
    }

    @Rule(status = STATUS.C,format = "AN..3500")
    private String VerificationReasonText;
    public void setVerificationReasonText(String VerificationReasonText){
        this.VerificationReasonText=VerificationReasonText;
    }
    public String getVerificationReasonText(){
        return this.VerificationReasonText;
    }

public static class MsgInfo{
    @Rule(status = STATUS.M,format = "AN7",)
    private String SenderCode;
    public void setSenderCode(String SenderCode){
        this.SenderCode=SenderCode;
    }
    public String getSenderCode(){
        return this.SenderCode;
    }

    @Rule(status = STATUS.M,format = "AN7",)
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

    @Rule(status = STATUS.C,format = "N..3{0..255}",)
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
    @Rule(status = STATUS.M,format = "AN7",)
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
    @Rule(status = STATUS.M,format = "AN..35",)
    private String SellerNr;
    public void setSellerNr(String SellerNr){
        this.SellerNr=SellerNr;
    }
    public String getSellerNr(){
        return this.SellerNr;
    }

    @Rule(status = STATUS.C,format = "AN..35",)
    private String SellerName;
    public void setSellerName(String SellerName){
        this.SellerName=SellerName;
    }
    public String getSellerName(){
        return this.SellerName;
    }

}

public static class Buyer{
    @Rule(status = STATUS.M,format = "AN..35",)
    private String BuyerNr;
    public void setBuyerNr(String BuyerNr){
        this.BuyerNr=BuyerNr;
    }
    public String getBuyerNr(){
        return this.BuyerNr;
    }

    @Rule(status = STATUS.C,format = "AN..35",)
    private String BuyerName;
    public void setBuyerName(String BuyerName){
        this.BuyerName=BuyerName;
    }
    public String getBuyerName(){
        return this.BuyerName;
    }

}

public static class VerificationDetails{
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

    @Rule(status = STATUS.C,format = "N..14.4")
    private String DocAmt;
    public void setDocAmt(String DocAmt){
        this.DocAmt=DocAmt;
    }
    public String getDocAmt(){
        return this.DocAmt;
    }

    @Rule(status = STATUS.M,format = "N..14.4")
    private String VerificationAmt;
    public void setVerificationAmt(String VerificationAmt){
        this.VerificationAmt=VerificationAmt;
    }
    public String getVerificationAmt(){
        return this.VerificationAmt;
    }

    @Rule(status = STATUS.M,format = "codelist")
    private String VerificationReason;
    public void setVerificationReason(String VerificationReason){
        this.VerificationReason=VerificationReason;
    }
    public String getVerificationReason(){
        return this.VerificationReason;
    }

    @Rule(status = STATUS.M,format = "codelist")
    private String VerificationStatus;
    public void setVerificationStatus(String VerificationStatus){
        this.VerificationStatus=VerificationStatus;
    }
    public String getVerificationStatus(){
        return this.VerificationStatus;
    }

    @Rule(status = STATUS.C,format = "AN..35")
    private String NotifyingParty;
    public void setNotifyingParty(String NotifyingParty){
        this.NotifyingParty=NotifyingParty;
    }
    public String getNotifyingParty(){
        return this.NotifyingParty;
    }

}

}

