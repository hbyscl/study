package org.cheng.study.fci.vo;

import java.util.*;
import org.cheng.study.fci.rule.CODELIST;
import org.cheng.study.fci.rule.Rule;
import org.cheng.study.fci.rule.STATUS;
public class MSG16 extends MSG{
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

    @Rule(status = STATUS.M,format = "N..3",codelist = CODELIST.MessageType)
    private String MsgType;
    public void setMsgType(String MsgType){
        this.MsgType=MsgType;
    }
    public String getMsgType(){
        return this.MsgType;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String MsgNr;
    public void setMsgNr(String MsgNr){
        this.MsgNr=MsgNr;
    }
    public String getMsgNr(){
        return this.MsgNr;
    }

    @Rule(status = STATUS.M,format = "AN3",codelist = CODELIST.Currency)
    private String DocCurrency;
    public void setDocCurrency(String DocCurrency){
        this.DocCurrency=DocCurrency;
    }
    public String getDocCurrency(){
        return this.DocCurrency;
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
    private List<ChargeBackReassDetails> ChargeBackReassDetails;
    public void setChargeBackReassDetails(List<ChargeBackReassDetails> ChargeBackReassDetails){
        this.ChargeBackReassDetails=ChargeBackReassDetails;
    }
    public List<ChargeBackReassDetails> getChargeBackReassDetails(){
        return this.ChargeBackReassDetails;
    }
    public void addChargeBackReassDetails(ChargeBackReassDetails ChargeBackReassDetails){
        if(null == this.ChargeBackReassDetails){
            this.ChargeBackReassDetails= new ArrayList<ChargeBackReassDetails>();
        }
        this.ChargeBackReassDetails.add(ChargeBackReassDetails);
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

public static class ChargeBackReassDetails{
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

    @Rule(status = STATUS.M,format = "N..3",codelist = CODELIST.DocumentType)
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

    @Rule(status = STATUS.C,format = "YYYY-MM-DD")
    private String DocDate;
    public void setDocDate(String DocDate){
        this.DocDate=DocDate;
    }
    public String getDocDate(){
        return this.DocDate;
    }

    @Rule(status = STATUS.M,format = "N14.2{amount}")
    private String DocAmt;
    public void setDocAmt(String DocAmt){
        this.DocAmt=DocAmt;
    }
    public String getDocAmt(){
        return this.DocAmt;
    }

    @Rule(status = STATUS.M,format = "N14.2{amount}")
    private String ChargeBackReassAmt;
    public void setChargeBackReassAmt(String ChargeBackReassAmt){
        this.ChargeBackReassAmt=ChargeBackReassAmt;
    }
    public String getChargeBackReassAmt(){
        return this.ChargeBackReassAmt;
    }

    @Rule(status = STATUS.M,format = "N..3",codelist = CODELIST.DisputeReason)
    private String ChargeBackReassReason;
    public void setChargeBackReassReason(String ChargeBackReassReason){
        this.ChargeBackReassReason=ChargeBackReassReason;
    }
    public String getChargeBackReassReason(){
        return this.ChargeBackReassReason;
    }

}

public static class ControlTot{
    @Rule(status = STATUS.M,format = "N14.2{(negative) amount}")
    private String TotAmt;
    public void setTotAmt(String TotAmt){
        this.TotAmt=TotAmt;
    }
    public String getTotAmt(){
        return this.TotAmt;
    }

}

}

