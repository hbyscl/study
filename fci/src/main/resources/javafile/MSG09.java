package com.vteam.soter.edi.sdk.vo;

import java.util.*;
import com.vteam.soter.edi.sdk.rule.CODELIST;
import com.vteam.soter.edi.sdk.rule.Rule;
import com.vteam.soter.edi.sdk.rule.STATUS;
public class MSG09 extends MSG{
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
    private String InvBatchNr;
    public void setInvBatchNr(String InvBatchNr){
        this.InvBatchNr=InvBatchNr;
    }
    public String getInvBatchNr(){
        return this.InvBatchNr;
    }

    @Rule(status = STATUS.M,format = "YYYY-MM-DD")
    private String InvBatchDate;
    public void setInvBatchDate(String InvBatchDate){
        this.InvBatchDate=InvBatchDate;
    }
    public String getInvBatchDate(){
        return this.InvBatchDate;
    }

    @Rule(status = STATUS.M,format = "AN3",)
    private String InvBatchCurrency;
    public void setInvBatchCurrency(String InvBatchCurrency){
        this.InvBatchCurrency=InvBatchCurrency;
    }
    public String getInvBatchCurrency(){
        return this.InvBatchCurrency;
    }

    @Rule(status = STATUS.M,format = "N14.2{amount}")
    private String TotAmtInvoices;
    public void setTotAmtInvoices(String TotAmtInvoices){
        this.TotAmtInvoices=TotAmtInvoices;
    }
    public String getTotAmtInvoices(){
        return this.TotAmtInvoices;
    }

    @Rule(status = STATUS.M,format = "N14.2{amount}")
    private String TotAmtCreditNotes;
    public void setTotAmtCreditNotes(String TotAmtCreditNotes){
        this.TotAmtCreditNotes=TotAmtCreditNotes;
    }
    public String getTotAmtCreditNotes(){
        return this.TotAmtCreditNotes;
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
    private List<InvCreditNoteDetails> InvCreditNoteDetails;
    public void setInvCreditNoteDetails(List<InvCreditNoteDetails> InvCreditNoteDetails){
        this.InvCreditNoteDetails=InvCreditNoteDetails;
    }
    public List<InvCreditNoteDetails> getInvCreditNoteDetails(){
        return this.InvCreditNoteDetails;
    }
    public void addInvCreditNoteDetails(InvCreditNoteDetails InvCreditNoteDetails){
        if(null == this.InvCreditNoteDetails){
            this.InvCreditNoteDetails= new ArrayList<InvCreditNoteDetails>();
        }
        this.InvCreditNoteDetails.add(InvCreditNoteDetails);
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
    @Rule(status = STATUS.M,format = "AN..35",)
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

public static class InvCreditNoteDetails{
    @Rule(status = STATUS.M,format = "AN..35",)
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

    @Rule(status = STATUS.M,format = "N..3",)
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

    @Rule(status = STATUS.M,format = "YYYY-MM-DD")
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

    @Rule(status = STATUS.M,format = "YYYY-MM-DD")
    private String DocDueDate;
    public void setDocDueDate(String DocDueDate){
        this.DocDueDate=DocDueDate;
    }
    public String getDocDueDate(){
        return this.DocDueDate;
    }

    @Rule(status = STATUS.C,format = "YYYY-MM-DD")
    private String DocValueDate;
    public void setDocValueDate(String DocValueDate){
        this.DocValueDate=DocValueDate;
    }
    public String getDocValueDate(){
        return this.DocValueDate;
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

    @Rule(status = STATUS.C,format = "N..3",)
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

    @Rule(status = STATUS.C,format = "AN..35")
    private String InvRefNr;
    public void setInvRefNr(String InvRefNr){
        this.InvRefNr=InvRefNr;
    }
    public String getInvRefNr(){
        return this.InvRefNr;
    }

}

public static class ControlTot{
    @Rule(status = STATUS.M,format = "N..3{0-999}")
    private String TotNrInvoices;
    public void setTotNrInvoices(String TotNrInvoices){
        this.TotNrInvoices=TotNrInvoices;
    }
    public String getTotNrInvoices(){
        return this.TotNrInvoices;
    }

    @Rule(status = STATUS.M,format = "N..3{0-999}")
    private String TotNrCreditNotes;
    public void setTotNrCreditNotes(String TotNrCreditNotes){
        this.TotNrCreditNotes=TotNrCreditNotes;
    }
    public String getTotNrCreditNotes(){
        return this.TotNrCreditNotes;
    }

}

}

