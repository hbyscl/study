package com.vteam.soter.edi.sdk.vo;

import java.util.*;

import com.vteam.soter.edi.sdk.rule.Rule;
import com.vteam.soter.edi.sdk.rule.STATUS;
public class MSG56 extends MSG{
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
    private String RequestDat;
    public void setRequestDat(String RequestDat){
        this.RequestDat=RequestDat;
    }
    public String getRequestDat(){
        return this.RequestDat;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String RequestNr;
    public void setRequestNr(String RequestNr){
        this.RequestNr=RequestNr;
    }
    public String getRequestNr(){
        return this.RequestNr;
    }

    @Rule(status = STATUS.M,format = "codelist")
    private String MsgFunction;
    public void setMsgFunction(String MsgFunction){
        this.MsgFunction=MsgFunction;
    }
    public String getMsgFunction(){
        return this.MsgFunction;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String OrigReqNr;
    public void setOrigReqNr(String OrigReqNr){
        this.OrigReqNr=OrigReqNr;
    }
    public String getOrigReqNr(){
        return this.OrigReqNr;
    }

    @Rule(status = STATUS.M,format = "")
    private String OrigReqDat;
    public void setOrigReqDat(String OrigReqDat){
        this.OrigReqDat=OrigReqDat;
    }
    public String getOrigReqDat(){
        return this.OrigReqDat;
    }

    @Rule(status = STATUS.M,format = "AN3",codelist = "tblCurrency")
    private String Currency;
    public void setCurrency(String Currency){
        this.Currency=Currency;
    }
    public String getCurrency(){
        return this.Currency;
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
    private PreShipmentCreditCoverDetails PreShipmentCreditCoverDetails;
    public void setPreShipmentCreditCoverDetails(PreShipmentCreditCoverDetails PreShipmentCreditCoverDetails){
        this.PreShipmentCreditCoverDetails=PreShipmentCreditCoverDetails;
    }
    public PreShipmentCreditCoverDetails getPreShipmentCreditCoverDetails(){
        return this.PreShipmentCreditCoverDetails;
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
    @Rule(status = STATUS.M,format = "AN7",codelist = "tblFactor")
    private String SenderCode;
    public void setSenderCode(String SenderCode){
        this.SenderCode=SenderCode;
    }
    public String getSenderCode(){
        return this.SenderCode;
    }

    @Rule(status = STATUS.M,format = "AN7",codelist = "tblFactor")
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

    @Rule(status = STATUS.C,format = "N..3{0..255}",codelist = "refMessageStatus")
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
    @Rule(status = STATUS.M,format = "AN7",codelist = "tblFactor")
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
    @Rule(status = STATUS.M,format = "AN..35",codelist = "tblFSBC:SellerNrList")
    private String SellerNr;
    public void setSellerNr(String SellerNr){
        this.SellerNr=SellerNr;
    }
    public String getSellerNr(){
        return this.SellerNr;
    }

    @Rule(status = STATUS.C,format = "AN..35",codelist = "tblFSBC:SellerNameList")
    private String SellerName;
    public void setSellerName(String SellerName){
        this.SellerName=SellerName;
    }
    public String getSellerName(){
        return this.SellerName;
    }

}

public static class Buyer{
    @Rule(status = STATUS.M,format = "AN..35",codelist = "tblFSBC:BuyerNrList")
    private String BuyerNr;
    public void setBuyerNr(String BuyerNr){
        this.BuyerNr=BuyerNr;
    }
    public String getBuyerNr(){
        return this.BuyerNr;
    }

    @Rule(status = STATUS.C,format = "AN..35",codelist = "tblFSBC:BuyerNameList")
    private String BuyerName;
    public void setBuyerName(String BuyerName){
        this.BuyerName=BuyerName;
    }
    public String getBuyerName(){
        return this.BuyerName;
    }

}

public static class PreShipmentCreditCoverDetails{
    @Rule(status = STATUS.M,format = "N..14.4")
    private String CurrentCreditCoverAmt;
    public void setCurrentCreditCoverAmt(String CurrentCreditCoverAmt){
        this.CurrentCreditCoverAmt=CurrentCreditCoverAmt;
    }
    public String getCurrentCreditCoverAmt(){
        return this.CurrentCreditCoverAmt;
    }

    @Rule(status = STATUS.M,format = "N..14.4")
    private String CreditCoverAmt;
    public void setCreditCoverAmt(String CreditCoverAmt){
        this.CreditCoverAmt=CreditCoverAmt;
    }
    public String getCreditCoverAmt(){
        return this.CreditCoverAmt;
    }

    @Rule(status = STATUS.M,format = "")
    private String PreShipmentCreditCoverExpiryDate;
    public void setPreShipmentCreditCoverExpiryDate(String PreShipmentCreditCoverExpiryDate){
        this.PreShipmentCreditCoverExpiryDate=PreShipmentCreditCoverExpiryDate;
    }
    public String getPreShipmentCreditCoverExpiryDate(){
        return this.PreShipmentCreditCoverExpiryDate;
    }

    @Rule(status = STATUS.C,format = "")
    private String ValidFrom;
    public void setValidFrom(String ValidFrom){
        this.ValidFrom=ValidFrom;
    }
    public String getValidFrom(){
        return this.ValidFrom;
    }

    @Rule(status = STATUS.C,format = "N..5{0..65535}")
    private String LongProductionPeriodDays;
    public void setLongProductionPeriodDays(String LongProductionPeriodDays){
        this.LongProductionPeriodDays=LongProductionPeriodDays;
    }
    public String getLongProductionPeriodDays(){
        return this.LongProductionPeriodDays;
    }

    @Rule(status = STATUS.M,format = "codelist")
    private String Response;
    public void setResponse(String Response){
        this.Response=Response;
    }
    public String getResponse(){
        return this.Response;
    }

    @Rule(status = STATUS.C,format = "codelist")
    private String Reason;
    public void setReason(String Reason){
        this.Reason=Reason;
    }
    public String getReason(){
        return this.Reason;
    }

    @Rule(status = STATUS.M,format = "codelist")
    private String CancellationRiskIncluded;
    public void setCancellationRiskIncluded(String CancellationRiskIncluded){
        this.CancellationRiskIncluded=CancellationRiskIncluded;
    }
    public String getCancellationRiskIncluded(){
        return this.CancellationRiskIncluded;
    }

    @Rule(status = STATUS.M,format = "codelist")
    private String PurchaseOrderVerification;
    public void setPurchaseOrderVerification(String PurchaseOrderVerification){
        this.PurchaseOrderVerification=PurchaseOrderVerification;
    }
    public String getPurchaseOrderVerification(){
        return this.PurchaseOrderVerification;
    }

    @Rule(status = STATUS.M,format = "codelist")
    private String CreditCoverLossSharing;
    public void setCreditCoverLossSharing(String CreditCoverLossSharing){
        this.CreditCoverLossSharing=CreditCoverLossSharing;
    }
    public String getCreditCoverLossSharing(){
        return this.CreditCoverLossSharing;
    }

}

public static class OwnRiskNewCreditCover{
    @Rule(status = STATUS.C,format = "AN..35")
    private String CalculatedLoss;
    public void setCalculatedLoss(String CalculatedLoss){
        this.CalculatedLoss=CalculatedLoss;
    }
    public String getCalculatedLoss(){
        return this.CalculatedLoss;
    }

    @Rule(status = STATUS.C,format = "N..14.4")
    private String FirstLossAmount;
    public void setFirstLossAmount(String FirstLossAmount){
        this.FirstLossAmount=FirstLossAmount;
    }
    public String getFirstLossAmount(){
        return this.FirstLossAmount;
    }

    @Rule(status = STATUS.C,format = "N..14.4")
    private String OwnRiskPercentage;
    public void setOwnRiskPercentage(String OwnRiskPercentage){
        this.OwnRiskPercentage=OwnRiskPercentage;
    }
    public String getOwnRiskPercentage(){
        return this.OwnRiskPercentage;
    }

}

}

