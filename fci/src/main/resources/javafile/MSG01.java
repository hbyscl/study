package com.vteam.soter.edi.sdk.vo;

import java.util.*;
import com.vteam.soter.edi.sdk.rule.CODELIST;
import com.vteam.soter.edi.sdk.rule.Rule;
import com.vteam.soter.edi.sdk.rule.STATUS;
public class MSG01 extends MSG{
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
    private String MsgFunction;
    public void setMsgFunction(String MsgFunction){
        this.MsgFunction=MsgFunction;
    }
    public String getMsgFunction(){
        return this.MsgFunction;
    }

    @Rule(status = STATUS.C,format = "YYYY-MM-DD")
    private String FactAgreemSigned;
    public void setFactAgreemSigned(String FactAgreemSigned){
        this.FactAgreemSigned=FactAgreemSigned;
    }
    public String getFactAgreemSigned(){
        return this.FactAgreemSigned;
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
    private SellerDetails SellerDetails;
    public void setSellerDetails(SellerDetails SellerDetails){
        this.SellerDetails=SellerDetails;
    }
    public SellerDetails getSellerDetails(){
        return this.SellerDetails;
    }

    @Rule(status = STATUS.C)
    private BankDetailsSeller BankDetailsSeller;
    public void setBankDetailsSeller(BankDetailsSeller BankDetailsSeller){
        this.BankDetailsSeller=BankDetailsSeller;
    }
    public BankDetailsSeller getBankDetailsSeller(){
        return this.BankDetailsSeller;
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
    @Rule(status = STATUS.C,format = "AN..35")
    private String SellerCompanyRegNr;
    public void setSellerCompanyRegNr(String SellerCompanyRegNr){
        this.SellerCompanyRegNr=SellerCompanyRegNr;
    }
    public String getSellerCompanyRegNr(){
        return this.SellerCompanyRegNr;
    }

    @Rule(status = STATUS.C,format = "AN..35")
    private String ResponseAgency;
    public void setResponseAgency(String ResponseAgency){
        this.ResponseAgency=ResponseAgency;
    }
    public String getResponseAgency(){
        return this.ResponseAgency;
    }

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

    @Rule(status = STATUS.C,format = "AN..35")
    private String NameCont;
    public void setNameCont(String NameCont){
        this.NameCont=NameCont;
    }
    public String getNameCont(){
        return this.NameCont;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String Street;
    public void setStreet(String Street){
        this.Street=Street;
    }
    public String getStreet(){
        return this.Street;
    }

    @Rule(status = STATUS.M,format = "AN..35")
    private String City;
    public void setCity(String City){
        this.City=City;
    }
    public String getCity(){
        return this.City;
    }

    @Rule(status = STATUS.C,format = "AN..9")
    private String State;
    public void setState(String State){
        this.State=State;
    }
    public String getState(){
        return this.State;
    }

    @Rule(status = STATUS.M,format = "AN..9")
    private String Postcode;
    public void setPostcode(String Postcode){
        this.Postcode=Postcode;
    }
    public String getPostcode(){
        return this.Postcode;
    }

    @Rule(status = STATUS.M,format = "AN2",)
    private String Country;
    public void setCountry(String Country){
        this.Country=Country;
    }
    public String getCountry(){
        return this.Country;
    }

}

public static class SellerDetails{
    @Rule(status = STATUS.M,format = "AN..70")
    private String BusinessProduct;
    public void setBusinessProduct(String BusinessProduct){
        this.BusinessProduct=BusinessProduct;
    }
    public String getBusinessProduct(){
        return this.BusinessProduct;
    }

    @Rule(status = STATUS.M,format = "N..3{0-999}")
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

    @Rule(status = STATUS.C,format = "N..3{0-999}")
    private String GracePeriod;
    public void setGracePeriod(String GracePeriod){
        this.GracePeriod=GracePeriod;
    }
    public String getGracePeriod(){
        return this.GracePeriod;
    }

    @Rule(status = STATUS.M,format = "AN3",)
    private String InvCurrency1;
    public void setInvCurrency1(String InvCurrency1){
        this.InvCurrency1=InvCurrency1;
    }
    public String getInvCurrency1(){
        return this.InvCurrency1;
    }

    @Rule(status = STATUS.C,format = "AN3",)
    private String InvCurrency2;
    public void setInvCurrency2(String InvCurrency2){
        this.InvCurrency2=InvCurrency2;
    }
    public String getInvCurrency2(){
        return this.InvCurrency2;
    }

    @Rule(status = STATUS.C,format = "AN3",)
    private String InvCurrency3;
    public void setInvCurrency3(String InvCurrency3){
        this.InvCurrency3=InvCurrency3;
    }
    public String getInvCurrency3(){
        return this.InvCurrency3;
    }

    @Rule(status = STATUS.C,format = "AN3",)
    private String InvCurrency4;
    public void setInvCurrency4(String InvCurrency4){
        this.InvCurrency4=InvCurrency4;
    }
    public String getInvCurrency4(){
        return this.InvCurrency4;
    }

    @Rule(status = STATUS.C,format = "AN3",)
    private String InvCurrency5;
    public void setInvCurrency5(String InvCurrency5){
        this.InvCurrency5=InvCurrency5;
    }
    public String getInvCurrency5(){
        return this.InvCurrency5;
    }

    @Rule(status = STATUS.M,format = "N3.4{0-100.0000}")
    private String ChargeBackPerc;
    public void setChargeBackPerc(String ChargeBackPerc){
        this.ChargeBackPerc=ChargeBackPerc;
    }
    public String getChargeBackPerc(){
        return this.ChargeBackPerc;
    }

    @Rule(status = STATUS.M,format = "N14.2{amount}")
    private String ChargeBackAmt;
    public void setChargeBackAmt(String ChargeBackAmt){
        this.ChargeBackAmt=ChargeBackAmt;
    }
    public String getChargeBackAmt(){
        return this.ChargeBackAmt;
    }

    @Rule(status = STATUS.M,format = "AN3",)
    private String ChargeBackCurrency;
    public void setChargeBackCurrency(String ChargeBackCurrency){
        this.ChargeBackCurrency=ChargeBackCurrency;
    }
    public String getChargeBackCurrency(){
        return this.ChargeBackCurrency;
    }

    @Rule(status = STATUS.M,format = "AN..70")
    private String ExpTotSellerTurnover;
    public void setExpTotSellerTurnover(String ExpTotSellerTurnover){
        this.ExpTotSellerTurnover=ExpTotSellerTurnover;
    }
    public String getExpTotSellerTurnover(){
        return this.ExpTotSellerTurnover;
    }

    @Rule(status = STATUS.M,format = "N..5{0-65535}")
    private String ExpNrBuyers;
    public void setExpNrBuyers(String ExpNrBuyers){
        this.ExpNrBuyers=ExpNrBuyers;
    }
    public String getExpNrBuyers(){
        return this.ExpNrBuyers;
    }

    @Rule(status = STATUS.M,format = "N..5{0-65535}")
    private String ExpNrInvoices;
    public void setExpNrInvoices(String ExpNrInvoices){
        this.ExpNrInvoices=ExpNrInvoices;
    }
    public String getExpNrInvoices(){
        return this.ExpNrInvoices;
    }

    @Rule(status = STATUS.C,format = "N..5{0-65535}")
    private String ExpNrCreditNotes;
    public void setExpNrCreditNotes(String ExpNrCreditNotes){
        this.ExpNrCreditNotes=ExpNrCreditNotes;
    }
    public String getExpNrCreditNotes(){
        return this.ExpNrCreditNotes;
    }

    @Rule(status = STATUS.M,format = "AN..70")
    private String ExpTurnover;
    public void setExpTurnover(String ExpTurnover){
        this.ExpTurnover=ExpTurnover;
    }
    public String getExpTurnover(){
        return this.ExpTurnover;
    }

    @Rule(status = STATUS.M,format = "AN..70")
    private String ExpOtherTurnover;
    public void setExpOtherTurnover(String ExpOtherTurnover){
        this.ExpOtherTurnover=ExpOtherTurnover;
    }
    public String getExpOtherTurnover(){
        return this.ExpOtherTurnover;
    }

    @Rule(status = STATUS.M,format = "AN..70")
    private String OtherFactors;
    public void setOtherFactors(String OtherFactors){
        this.OtherFactors=OtherFactors;
    }
    public String getOtherFactors(){
        return this.OtherFactors;
    }

    @Rule(status = STATUS.M,format = "N..3",)
    private String ServiceRequired;
    public void setServiceRequired(String ServiceRequired){
        this.ServiceRequired=ServiceRequired;
    }
    public String getServiceRequired(){
        return this.ServiceRequired;
    }

    @Rule(status = STATUS.C,format = "AN..70")
    private String NormDeliveryTerms;
    public void setNormDeliveryTerms(String NormDeliveryTerms){
        this.NormDeliveryTerms=NormDeliveryTerms;
    }
    public String getNormDeliveryTerms(){
        return this.NormDeliveryTerms;
    }

}

public static class BankDetailsSeller{
    @Rule(status = STATUS.C,format = "AN..35")
    private String AccountNr;
    public void setAccountNr(String AccountNr){
        this.AccountNr=AccountNr;
    }
    public String getAccountNr(){
        return this.AccountNr;
    }

    @Rule(status = STATUS.C,format = "AN..70")
    private String BankName;
    public void setBankName(String BankName){
        this.BankName=BankName;
    }
    public String getBankName(){
        return this.BankName;
    }

    @Rule(status = STATUS.C,format = "AN..70")
    private String BranchName;
    public void setBranchName(String BranchName){
        this.BranchName=BranchName;
    }
    public String getBranchName(){
        return this.BranchName;
    }

}

}

