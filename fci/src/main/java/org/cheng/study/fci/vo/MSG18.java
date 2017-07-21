package org.cheng.study.fci.vo;

import java.util.*;
import org.cheng.study.fci.rule.CODELIST;
import org.cheng.study.fci.rule.Rule;
import org.cheng.study.fci.rule.STATUS;
public class MSG18 extends MSG{
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

    @Rule(status = STATUS.C,format = "AN..35")
    private String RemitNr;
    public void setRemitNr(String RemitNr){
        this.RemitNr=RemitNr;
    }
    public String getRemitNr(){
        return this.RemitNr;
    }

    @Rule(status = STATUS.M,format = "AN3",codelist = CODELIST.Currency)
    private String RemitCurrency;
    public void setRemitCurrency(String RemitCurrency){
        this.RemitCurrency=RemitCurrency;
    }
    public String getRemitCurrency(){
        return this.RemitCurrency;
    }

    @Rule(status = STATUS.M,format = "YYYY-MM-DD")
    private String RemitDate;
    public void setRemitDate(String RemitDate){
        this.RemitDate=RemitDate;
    }
    public String getRemitDate(){
        return this.RemitDate;
    }

    @Rule(status = STATUS.C,format = "YYYY-MM-DD")
    private String ValueDate;
    public void setValueDate(String ValueDate){
        this.ValueDate=ValueDate;
    }
    public String getValueDate(){
        return this.ValueDate;
    }

    @Rule(status = STATUS.C,format = "N..3",codelist = CODELIST.PaymentMethod)
    private String PmtMethod;
    public void setPmtMethod(String PmtMethod){
        this.PmtMethod=PmtMethod;
    }
    public String getPmtMethod(){
        return this.PmtMethod;
    }

    @Rule(status = STATUS.C,format = "N..3",codelist = CODELIST.PaymentChannel)
    private String PmtChannel;
    public void setPmtChannel(String PmtChannel){
        this.PmtChannel=PmtChannel;
    }
    public String getPmtChannel(){
        return this.PmtChannel;
    }

    @Rule(status = STATUS.C)
    private Seller Seller;
    public void setSeller(Seller Seller){
        this.Seller=Seller;
    }
    public Seller getSeller(){
        return this.Seller;
    }

    @Rule(status = STATUS.C)
    private Beneficiary Beneficiary;
    public void setBeneficiary(Beneficiary Beneficiary){
        this.Beneficiary=Beneficiary;
    }
    public Beneficiary getBeneficiary(){
        return this.Beneficiary;
    }

    @Rule(status = STATUS.M)
    private List<RemitDetails> RemitDetails;
    public void setRemitDetails(List<RemitDetails> RemitDetails){
        this.RemitDetails=RemitDetails;
    }
    public List<RemitDetails> getRemitDetails(){
        return this.RemitDetails;
    }
    public void addRemitDetails(RemitDetails RemitDetails){
        if(null == this.RemitDetails){
            this.RemitDetails= new ArrayList<RemitDetails>();
        }
        this.RemitDetails.add(RemitDetails);
    }

    @Rule(status = STATUS.M)
    private ControlTot ControlTot;
    public void setControlTot(ControlTot ControlTot){
        this.ControlTot=ControlTot;
    }
    public ControlTot getControlTot(){
        return this.ControlTot;
    }

    @Rule(status = STATUS.C,format = "AN..3500")
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
    @Rule(status = STATUS.C,format = "AN..35",codelist = CODELIST.FSBC)
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

public static class Beneficiary{
    @Rule(status = STATUS.C,format = "AN..35")
    private String BeneficiaryNr;
    public void setBeneficiaryNr(String BeneficiaryNr){
        this.BeneficiaryNr=BeneficiaryNr;
    }
    public String getBeneficiaryNr(){
        return this.BeneficiaryNr;
    }

    @Rule(status = STATUS.C,format = "AN..35")
    private String BeneficiaryName;
    public void setBeneficiaryName(String BeneficiaryName){
        this.BeneficiaryName=BeneficiaryName;
    }
    public String getBeneficiaryName(){
        return this.BeneficiaryName;
    }

}

public static class RemitDetails{
    @Rule(status = STATUS.M,format = "AN..35")
    private String MsgNrRef;
    public void setMsgNrRef(String MsgNrRef){
        this.MsgNrRef=MsgNrRef;
    }
    public String getMsgNrRef(){
        return this.MsgNrRef;
    }

    @Rule(status = STATUS.M,format = "YYYY-MM-DD")
    private String MsgDateRef;
    public void setMsgDateRef(String MsgDateRef){
        this.MsgDateRef=MsgDateRef;
    }
    public String getMsgDateRef(){
        return this.MsgDateRef;
    }

    @Rule(status = STATUS.M,format = "N14.2{(negative) amount}")
    private String PmtAmt;
    public void setPmtAmt(String PmtAmt){
        this.PmtAmt=PmtAmt;
    }
    public String getPmtAmt(){
        return this.PmtAmt;
    }

    @Rule(status = STATUS.C,format = "N14.2{amount}")
    private String BankChargeAmt;
    public void setBankChargeAmt(String BankChargeAmt){
        this.BankChargeAmt=BankChargeAmt;
    }
    public String getBankChargeAmt(){
        return this.BankChargeAmt;
    }

}

public static class ControlTot{
    @Rule(status = STATUS.M,format = "N14.2{amount}")
    private String TotAmtRemitted;
    public void setTotAmtRemitted(String TotAmtRemitted){
        this.TotAmtRemitted=TotAmtRemitted;
    }
    public String getTotAmtRemitted(){
        return this.TotAmtRemitted;
    }

}

}

