package com.vteam.soter.edi.sdk.vo;

import java.util.*;
import com.vteam.soter.edi.sdk.rule.CODELIST;
import com.vteam.soter.edi.sdk.rule.Rule;
import com.vteam.soter.edi.sdk.rule.STATUS;
public class MSG26 extends MSG{
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

    @Rule(status = STATUS.M,format = "N..3",)
    private String Response;
    public void setResponse(String Response){
        this.Response=Response;
    }
    public String getResponse(){
        return this.Response;
    }

    @Rule(status = STATUS.M)
    private Seller Seller;
    public void setSeller(Seller Seller){
        this.Seller=Seller;
    }
    public Seller getSeller(){
        return this.Seller;
    }

    @Rule(status = STATUS.C)
    private RejectedBuyerDetails RejectedBuyerDetails;
    public void setRejectedBuyerDetails(RejectedBuyerDetails RejectedBuyerDetails){
        this.RejectedBuyerDetails=RejectedBuyerDetails;
    }
    public RejectedBuyerDetails getRejectedBuyerDetails(){
        return this.RejectedBuyerDetails;
    }

    @Rule(status = STATUS.M)
    private FactoringCommission FactoringCommission;
    public void setFactoringCommission(FactoringCommission FactoringCommission){
        this.FactoringCommission=FactoringCommission;
    }
    public FactoringCommission getFactoringCommission(){
        return this.FactoringCommission;
    }

    @Rule(status = STATUS.C,format = "AN..350")
    private String MsgText;
    public void setMsgText(String MsgText){
        this.MsgText=MsgText;
    }
    public String getMsgText(){
        return this.MsgText;
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

    @Rule(status = STATUS.C,format = "N..15{0-2^64}")
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
    @Rule(status = STATUS.M,format = "AN7",)
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
    @Rule(status = STATUS.M,format = "AN7",)
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
    @Rule(status = STATUS.M,format = "AN..35")
    private String SellerNr;
    public void setSellerNr(String SellerNr){
        this.SellerNr=SellerNr;
    }
    public String getSellerNr(){
        return this.SellerNr;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String SellerName;
    public void setSellerName(String SellerName){
        this.SellerName=SellerName;
    }
    public String getSellerName(){
        return this.SellerName;
    }

}

public static class RejectedBuyerDetails{
    @Rule(status = STATUS.M,format = "AN..35")
    private String BuyerNr;
    public void setBuyerNr(String BuyerNr){
        this.BuyerNr=BuyerNr;
    }
    public String getBuyerNr(){
        return this.BuyerNr;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String BuyerName;
    public void setBuyerName(String BuyerName){
        this.BuyerName=BuyerName;
    }
    public String getBuyerName(){
        return this.BuyerName;
    }

    @Rule(status = STATUS.M,format = "AN3",)
    private String MainInvCurrency;
    public void setMainInvCurrency(String MainInvCurrency){
        this.MainInvCurrency=MainInvCurrency;
    }
    public String getMainInvCurrency(){
        return this.MainInvCurrency;
    }

}

public static class FactoringCommission{
    @Rule(status = STATUS.C,format = "N3.4{0-100.0000%}")
    private String GrossTurnoverPercCommission;
    public void setGrossTurnoverPercCommission(String GrossTurnoverPercCommission){
        this.GrossTurnoverPercCommission=GrossTurnoverPercCommission;
    }
    public String getGrossTurnoverPercCommission(){
        return this.GrossTurnoverPercCommission;
    }

    @Rule(status = STATUS.C,format = "N14.2{amount}")
    private String PriceDoc;
    public void setPriceDoc(String PriceDoc){
        this.PriceDoc=PriceDoc;
    }
    public String getPriceDoc(){
        return this.PriceDoc;
    }

    @Rule(status = STATUS.C,format = "AN3",)
    private String DocCurrency;
    public void setDocCurrency(String DocCurrency){
        this.DocCurrency=DocCurrency;
    }
    public String getDocCurrency(){
        return this.DocCurrency;
    }

    @Rule(status = STATUS.C,format = "N..3",)
    private String BankChargeIncl;
    public void setBankChargeIncl(String BankChargeIncl){
        this.BankChargeIncl=BankChargeIncl;
    }
    public String getBankChargeIncl(){
        return this.BankChargeIncl;
    }

    @Rule(status = STATUS.C,format = "AN..70")
    private String OtherCharge;
    public void setOtherCharge(String OtherCharge){
        this.OtherCharge=OtherCharge;
    }
    public String getOtherCharge(){
        return this.OtherCharge;
    }

    @Rule(status = STATUS.C,format = "AN3",)
    private String ChargeCurrency;
    public void setChargeCurrency(String ChargeCurrency){
        this.ChargeCurrency=ChargeCurrency;
    }
    public String getChargeCurrency(){
        return this.ChargeCurrency;
    }

}

}

