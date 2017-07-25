package com.vteam.soter.edi.sdk.vo;

import java.util.*;

import com.vteam.soter.edi.sdk.rule.Rule;
import com.vteam.soter.edi.sdk.rule.STATUS;
public class MSG25 extends MSG{
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

    @Rule(status = STATUS.M)
    private List<BuyerDetails> BuyerDetails;
    public void setBuyerDetails(List<BuyerDetails> BuyerDetails){
        this.BuyerDetails=BuyerDetails;
    }
    public List<BuyerDetails> getBuyerDetails(){
        return this.BuyerDetails;
    }
    public void addBuyerDetails(BuyerDetails BuyerDetails){
        if(null == this.BuyerDetails){
            this.BuyerDetails= new ArrayList<BuyerDetails>();
        }
        this.BuyerDetails.add(BuyerDetails);
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

    @Rule(status = STATUS.M,format = "N..5{0-65535}")
    private String NetPmtTerms;
    public void setNetPmtTerms(String NetPmtTerms){
        this.NetPmtTerms=NetPmtTerms;
    }
    public String getNetPmtTerms(){
        return this.NetPmtTerms;
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

}

public static class BuyerDetails{
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

    @Rule(status = STATUS.M,format = "AN3",codelist = "Currency")
    private String MainInvCurrency;
    public void setMainInvCurrency(String MainInvCurrency){
        this.MainInvCurrency=MainInvCurrency;
    }
    public String getMainInvCurrency(){
        return this.MainInvCurrency;
    }

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

