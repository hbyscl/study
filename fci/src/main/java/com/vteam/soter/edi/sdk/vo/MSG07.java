package com.vteam.soter.edi.sdk.vo;

import java.util.*;

import com.vteam.soter.edi.sdk.rule.Rule;
import com.vteam.soter.edi.sdk.rule.STATUS;
public class MSG07 extends MSG{
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
    private String RequestDate;
    public void setRequestDate(String RequestDate){
        this.RequestDate=RequestDate;
    }
    public String getRequestDate(){
        return this.RequestDate;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String RequestNr;
    public void setRequestNr(String RequestNr){
        this.RequestNr=RequestNr;
    }
    public String getRequestNr(){
        return this.RequestNr;
    }

    @Rule(status = STATUS.M,format = "N..3",codelist = "MessageFunction")
    private String MsgFunction;
    public void setMsgFunction(String MsgFunction){
        this.MsgFunction=MsgFunction;
    }
    public String getMsgFunction(){
        return this.MsgFunction;
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
    private CurrentCreditCoverDetails CurrentCreditCoverDetails;
    public void setCurrentCreditCoverDetails(CurrentCreditCoverDetails CurrentCreditCoverDetails){
        this.CurrentCreditCoverDetails=CurrentCreditCoverDetails;
    }
    public CurrentCreditCoverDetails getCurrentCreditCoverDetails(){
        return this.CurrentCreditCoverDetails;
    }

    @Rule(status = STATUS.M)
    private NewCreditCoverDetails NewCreditCoverDetails;
    public void setNewCreditCoverDetails(NewCreditCoverDetails NewCreditCoverDetails){
        this.NewCreditCoverDetails=NewCreditCoverDetails;
    }
    public NewCreditCoverDetails getNewCreditCoverDetails(){
        return this.NewCreditCoverDetails;
    }

    @Rule(status = STATUS.C)
    private OwnRiskNewCreditCover OwnRiskNewCreditCover;
    public void setOwnRiskNewCreditCover(OwnRiskNewCreditCover OwnRiskNewCreditCover){
        this.OwnRiskNewCreditCover=OwnRiskNewCreditCover;
    }
    public OwnRiskNewCreditCover getOwnRiskNewCreditCover(){
        return this.OwnRiskNewCreditCover;
    }

    @Rule(status = STATUS.C,format = "AN..1400")
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

public static class Buyer{
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

}

public static class CurrentCreditCoverDetails{
    @Rule(status = STATUS.M,format = "N14.2{amount}")
    private String CurrentCreditCoverAmt;
    public void setCurrentCreditCoverAmt(String CurrentCreditCoverAmt){
        this.CurrentCreditCoverAmt=CurrentCreditCoverAmt;
    }
    public String getCurrentCreditCoverAmt(){
        return this.CurrentCreditCoverAmt;
    }

    @Rule(status = STATUS.M,format = "AN3",codelist = "Currency")
    private String Currency;
    public void setCurrency(String Currency){
        this.Currency=Currency;
    }
    public String getCurrency(){
        return this.Currency;
    }

    @Rule(status = STATUS.C,format = "YYYY-MM-DD")
    private String CurrentExpiryDate;
    public void setCurrentExpiryDate(String CurrentExpiryDate){
        this.CurrentExpiryDate=CurrentExpiryDate;
    }
    public String getCurrentExpiryDate(){
        return this.CurrentExpiryDate;
    }

}

public static class NewCreditCoverDetails{
    @Rule(status = STATUS.M,format = "N..3",codelist = "Request")
    private String Request;
    public void setRequest(String Request){
        this.Request=Request;
    }
    public String getRequest(){
        return this.Request;
    }

    @Rule(status = STATUS.M,format = "N14.2{amount}")
    private String NewCreditCoverAmt;
    public void setNewCreditCoverAmt(String NewCreditCoverAmt){
        this.NewCreditCoverAmt=NewCreditCoverAmt;
    }
    public String getNewCreditCoverAmt(){
        return this.NewCreditCoverAmt;
    }

    @Rule(status = STATUS.C,format = "YYYY-MM-DD")
    private String NewExpiryDate;
    public void setNewExpiryDate(String NewExpiryDate){
        this.NewExpiryDate=NewExpiryDate;
    }
    public String getNewExpiryDate(){
        return this.NewExpiryDate;
    }

    @Rule(status = STATUS.C,format = "YYYY-MM-DD")
    private String ValidFrom;
    public void setValidFrom(String ValidFrom){
        this.ValidFrom=ValidFrom;
    }
    public String getValidFrom(){
        return this.ValidFrom;
    }

    @Rule(status = STATUS.C,format = "N..3{0-999}")
    private String LongCreditPeriodDays;
    public void setLongCreditPeriodDays(String LongCreditPeriodDays){
        this.LongCreditPeriodDays=LongCreditPeriodDays;
    }
    public String getLongCreditPeriodDays(){
        return this.LongCreditPeriodDays;
    }

}

public static class OwnRiskNewCreditCover{
    @Rule(status = STATUS.C,format = "N14.2{amount}")
    private String OwnRiskAmt;
    public void setOwnRiskAmt(String OwnRiskAmt){
        this.OwnRiskAmt=OwnRiskAmt;
    }
    public String getOwnRiskAmt(){
        return this.OwnRiskAmt;
    }

    @Rule(status = STATUS.C,format = "N3.4{0-100.0000}")
    private String OwnRiskPerc;
    public void setOwnRiskPerc(String OwnRiskPerc){
        this.OwnRiskPerc=OwnRiskPerc;
    }
    public String getOwnRiskPerc(){
        return this.OwnRiskPerc;
    }

}

}

