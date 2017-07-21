package org.cheng.study.fci.vo;

import java.util.*;
import org.cheng.study.fci.rule.CODELIST;
import org.cheng.study.fci.rule.Rule;
import org.cheng.study.fci.rule.STATUS;
public class MSG10 extends MSG{
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

    @Rule(status = STATUS.M,format = "N..3",codelist = CODELIST.MessageFunction)
    private String MsgFunction;
    public void setMsgFunction(String MsgFunction){
        this.MsgFunction=MsgFunction;
    }
    public String getMsgFunction(){
        return this.MsgFunction;
    }

    @Rule(status = STATUS.M,format = "N..3",codelist = CODELIST.DocumentType)
    private String DocType;
    public void setDocType(String DocType){
        this.DocType=DocType;
    }
    public String getDocType(){
        return this.DocType;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String OrigDocNr;
    public void setOrigDocNr(String OrigDocNr){
        this.OrigDocNr=OrigDocNr;
    }
    public String getOrigDocNr(){
        return this.OrigDocNr;
    }

    @Rule(status = STATUS.M,format = "YYYY-MM-DD")
    private String OrigDocDate;
    public void setOrigDocDate(String OrigDocDate){
        this.OrigDocDate=OrigDocDate;
    }
    public String getOrigDocDate(){
        return this.OrigDocDate;
    }

    @Rule(status = STATUS.M,format = "AN3",codelist = CODELIST.Currency)
    private String OrigDocCurrency;
    public void setOrigDocCurrency(String OrigDocCurrency){
        this.OrigDocCurrency=OrigDocCurrency;
    }
    public String getOrigDocCurrency(){
        return this.OrigDocCurrency;
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

    @Rule(status = STATUS.C)
    private AdjustDetails AdjustDetails;
    public void setAdjustDetails(AdjustDetails AdjustDetails){
        this.AdjustDetails=AdjustDetails;
    }
    public AdjustDetails getAdjustDetails(){
        return this.AdjustDetails;
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

public static class AdjustDetails{
    @Rule(status = STATUS.C,format = "YYYY-MM-DD")
    private String InvValueDate;
    public void setInvValueDate(String InvValueDate){
        this.InvValueDate=InvValueDate;
    }
    public String getInvValueDate(){
        return this.InvValueDate;
    }

    @Rule(status = STATUS.C,format = "YYYY-MM-DD")
    private String InvDueDate;
    public void setInvDueDate(String InvDueDate){
        this.InvDueDate=InvDueDate;
    }
    public String getInvDueDate(){
        return this.InvDueDate;
    }

    @Rule(status = STATUS.C,format = "N..3{0-999}")
    private String NetPmtTerms;
    public void setNetPmtTerms(String NetPmtTerms){
        this.NetPmtTerms=NetPmtTerms;
    }
    public String getNetPmtTerms(){
        return this.NetPmtTerms;
    }

    @Rule(status = STATUS.C,format = "N..3{0-999}")
    private String Discount1Days;
    public void setDiscount1Days(String Discount1Days){
        this.Discount1Days=Discount1Days;
    }
    public String getDiscount1Days(){
        return this.Discount1Days;
    }

    @Rule(status = STATUS.C,format = "N3.4{0-100.0000}")
    private String Discount1Perc;
    public void setDiscount1Perc(String Discount1Perc){
        this.Discount1Perc=Discount1Perc;
    }
    public String getDiscount1Perc(){
        return this.Discount1Perc;
    }

    @Rule(status = STATUS.C,format = "N..3{0-999}")
    private String Discount2Days;
    public void setDiscount2Days(String Discount2Days){
        this.Discount2Days=Discount2Days;
    }
    public String getDiscount2Days(){
        return this.Discount2Days;
    }

    @Rule(status = STATUS.C,format = "N3.4{0-100.0000}")
    private String Discount2Perc;
    public void setDiscount2Perc(String Discount2Perc){
        this.Discount2Perc=Discount2Perc;
    }
    public String getDiscount2Perc(){
        return this.Discount2Perc;
    }

    @Rule(status = STATUS.C,format = "N..3",codelist = CODELIST.PaymentConditions)
    private String PmtCondition;
    public void setPmtCondition(String PmtCondition){
        this.PmtCondition=PmtCondition;
    }
    public String getPmtCondition(){
        return this.PmtCondition;
    }

    @Rule(status = STATUS.C,format = "AN..35")
    private String OrderNrRef;
    public void setOrderNrRef(String OrderNrRef){
        this.OrderNrRef=OrderNrRef;
    }
    public String getOrderNrRef(){
        return this.OrderNrRef;
    }

}

}

