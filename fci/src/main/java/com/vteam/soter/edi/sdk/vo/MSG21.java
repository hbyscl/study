package com.vteam.soter.edi.sdk.vo;

import java.util.*;

import com.vteam.soter.edi.sdk.rule.Rule;
import com.vteam.soter.edi.sdk.rule.STATUS;
public class MSG21 extends MSG{
    @Rule(status = STATUS.M)
    private MsgInfo MsgInfo;
    public void setMsgInfo(MsgInfo MsgInfo){
        this.MsgInfo=MsgInfo;
    }
    public MsgInfo getMsgInfo(){
        return this.MsgInfo;
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
    private Sender Sender;
    public void setSender(Sender Sender){
        this.Sender=Sender;
    }
    public Sender getSender(){
        return this.Sender;
    }

    @Rule(status = STATUS.M)
    private Recipient Recipient;
    public void setRecipient(Recipient Recipient){
        this.Recipient=Recipient;
    }
    public Recipient getRecipient(){
        return this.Recipient;
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
    private Buyer Buyer;
    public void setBuyer(Buyer Buyer){
        this.Buyer=Buyer;
    }
    public Buyer getBuyer(){
        return this.Buyer;
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

public static class Sender{
    @Rule(status = STATUS.M,format = "AN..7",codelist = "Factor")
    private String MemberNr;
    public void setMemberNr(String MemberNr){
        this.MemberNr=MemberNr;
    }
    public String getMemberNr(){
        return this.MemberNr;
    }

    @Rule(status = STATUS.C,format = "AN..35")
    private String MemberName;
    public void setMemberName(String MemberName){
        this.MemberName=MemberName;
    }
    public String getMemberName(){
        return this.MemberName;
    }

    @Rule(status = STATUS.M,format = "AN..35")
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

    @Rule(status = STATUS.C,format = "AN..70")
    private String Email;
    public void setEmail(String Email){
        this.Email=Email;
    }
    public String getEmail(){
        return this.Email;
    }

}

public static class Recipient{
    @Rule(status = STATUS.M,format = "AN..7",codelist = "Factor")
    private String MemberNr;
    public void setMemberNr(String MemberNr){
        this.MemberNr=MemberNr;
    }
    public String getMemberNr(){
        return this.MemberNr;
    }

    @Rule(status = STATUS.C,format = "AN..35")
    private String MemberName;
    public void setMemberName(String MemberName){
        this.MemberName=MemberName;
    }
    public String getMemberName(){
        return this.MemberName;
    }

    @Rule(status = STATUS.M,format = "AN..35")
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

    @Rule(status = STATUS.C,format = "AN..70")
    private String Email;
    public void setEmail(String Email){
        this.Email=Email;
    }
    public String getEmail(){
        return this.Email;
    }

}

public static class Seller{
    @Rule(status = STATUS.C,format = "AN..35")
    private String SellerNr;
    public void setSellerNr(String SellerNr){
        this.SellerNr=SellerNr;
    }
    public String getSellerNr(){
        return this.SellerNr;
    }

    @Rule(status = STATUS.C,format = "AN..35")
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
    private String BuyerNr;
    public void setBuyerNr(String BuyerNr){
        this.BuyerNr=BuyerNr;
    }
    public String getBuyerNr(){
        return this.BuyerNr;
    }

    @Rule(status = STATUS.C,format = "AN..35")
    private String BuyerName;
    public void setBuyerName(String BuyerName){
        this.BuyerName=BuyerName;
    }
    public String getBuyerName(){
        return this.BuyerName;
    }

}

}

