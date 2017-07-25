package com.vteam.soter.edi.sdk.vo;

import java.util.*;

import com.vteam.soter.edi.sdk.rule.Rule;
import com.vteam.soter.edi.sdk.rule.STATUS;
public class MSG02 extends MSG{
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

    @Rule(status = STATUS.C)
    private BankDetailsBuyer BankDetailsBuyer;
    public void setBankDetailsBuyer(BankDetailsBuyer BankDetailsBuyer){
        this.BankDetailsBuyer=BankDetailsBuyer;
    }
    public BankDetailsBuyer getBankDetailsBuyer(){
        return this.BankDetailsBuyer;
    }

    @Rule(status = STATUS.M)
    private PrelCreditAssessDetails PrelCreditAssessDetails;
    public void setPrelCreditAssessDetails(PrelCreditAssessDetails PrelCreditAssessDetails){
        this.PrelCreditAssessDetails=PrelCreditAssessDetails;
    }
    public PrelCreditAssessDetails getPrelCreditAssessDetails(){
        return this.PrelCreditAssessDetails;
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

public static class Buyer{
    @Rule(status = STATUS.C,format = "AN..35")
    private String BuyerCompanyRegNr;
    public void setBuyerCompanyRegNr(String BuyerCompanyRegNr){
        this.BuyerCompanyRegNr=BuyerCompanyRegNr;
    }
    public String getBuyerCompanyRegNr(){
        return this.BuyerCompanyRegNr;
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

    @Rule(status = STATUS.M,format = "AN2",codelist = "Country")
    private String Country;
    public void setCountry(String Country){
        this.Country=Country;
    }
    public String getCountry(){
        return this.Country;
    }

    @Rule(status = STATUS.M,format = "N..3",codelist = "DirectContactAllowed")
    private String DirectContact;
    public void setDirectContact(String DirectContact){
        this.DirectContact=DirectContact;
    }
    public String getDirectContact(){
        return this.DirectContact;
    }

    @Rule(status = STATUS.C,format = "AN..35")
    private String ContactName;
    public void setContactName(String ContactName){
        this.ContactName=ContactName;
    }
    public String getContactName(){
        return this.ContactName;
    }

    @Rule(status = STATUS.C,format = "AN..25")
    private String Telephone;
    public void setTelephone(String Telephone){
        this.Telephone=Telephone;
    }
    public String getTelephone(){
        return this.Telephone;
    }

    @Rule(status = STATUS.C,format = "AN..25")
    private String Fax;
    public void setFax(String Fax){
        this.Fax=Fax;
    }
    public String getFax(){
        return this.Fax;
    }

    @Rule(status = STATUS.C,format = "AN..70")
    private String Email;
    public void setEmail(String Email){
        this.Email=Email;
    }
    public String getEmail(){
        return this.Email;
    }

}

public static class BankDetailsBuyer{
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

public static class PrelCreditAssessDetails{
    @Rule(status = STATUS.M,format = "N14.2{amount}")
    private String AmtCreditAssessReq;
    public void setAmtCreditAssessReq(String AmtCreditAssessReq){
        this.AmtCreditAssessReq=AmtCreditAssessReq;
    }
    public String getAmtCreditAssessReq(){
        return this.AmtCreditAssessReq;
    }

    @Rule(status = STATUS.M,format = "AN3",codelist = "Currency")
    private String Currency;
    public void setCurrency(String Currency){
        this.Currency=Currency;
    }
    public String getCurrency(){
        return this.Currency;
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

}

}

