package org.cheng.study.fci.vo;

import java.util.*;
import org.cheng.study.fci.rule.CODELIST;
import org.cheng.study.fci.rule.Rule;
import org.cheng.study.fci.rule.STATUS;
public class MSG59 extends MSG{
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
    private String POBatchNumber;
    public void setPOBatchNumber(String POBatchNumber){
        this.POBatchNumber=POBatchNumber;
    }
    public String getPOBatchNumber(){
        return this.POBatchNumber;
    }

    @Rule(status = STATUS.M,format = "")
    private String POBatchDate;
    public void setPOBatchDate(String POBatchDate){
        this.POBatchDate=POBatchDate;
    }
    public String getPOBatchDate(){
        return this.POBatchDate;
    }

    @Rule(status = STATUS.M,format = "AN3",codelist = CODELIST.tblCurrency)
    private String POBatchCurrency;
    public void setPOBatchCurrency(String POBatchCurrency){
        this.POBatchCurrency=POBatchCurrency;
    }
    public String getPOBatchCurrency(){
        return this.POBatchCurrency;
    }

    @Rule(status = STATUS.M,format = "N..14.4")
    private String POTotalAmount;
    public void setPOTotalAmount(String POTotalAmount){
        this.POTotalAmount=POTotalAmount;
    }
    public String getPOTotalAmount(){
        return this.POTotalAmount;
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
    private List<PODetails> PODetails;
    public void setPODetails(List<PODetails> PODetails){
        this.PODetails=PODetails;
    }
    public List<PODetails> getPODetails(){
        return this.PODetails;
    }
    public void addPODetails(PODetails PODetails){
        if(null == this.PODetails){
            this.PODetails= new ArrayList<PODetails>();
        }
        this.PODetails.add(PODetails);
    }

    @Rule(status = STATUS.M)
    private ControlTot ControlTot;
    public void setControlTot(ControlTot ControlTot){
        this.ControlTot=ControlTot;
    }
    public ControlTot getControlTot(){
        return this.ControlTot;
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

public static class PODetails{
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

    @Rule(status = STATUS.M,format = "")
    private String LatestShipmentDate;
    public void setLatestShipmentDate(String LatestShipmentDate){
        this.LatestShipmentDate=LatestShipmentDate;
    }
    public String getLatestShipmentDate(){
        return this.LatestShipmentDate;
    }

    @Rule(status = STATUS.C,format = "codelist")
    private String OrderAcknowledgementToIF;
    public void setOrderAcknowledgementToIF(String OrderAcknowledgementToIF){
        this.OrderAcknowledgementToIF=OrderAcknowledgementToIF;
    }
    public String getOrderAcknowledgementToIF(){
        return this.OrderAcknowledgementToIF;
    }

}

public static class ControlTot{
    @Rule(status = STATUS.M,format = "N..5{0..65535}")
    private String TotNrPOs;
    public void setTotNrPOs(String TotNrPOs){
        this.TotNrPOs=TotNrPOs;
    }
    public String getTotNrPOs(){
        return this.TotNrPOs;
    }

}

}

