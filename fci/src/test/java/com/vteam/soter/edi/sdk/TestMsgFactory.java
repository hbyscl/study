package com.vteam.soter.edi.sdk;

import com.vteam.soter.edi.sdk.exception.EDIParseException;
import com.vteam.soter.edi.sdk.vo.MSG;
import com.vteam.soter.edi.sdk.vo.MSG09;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

import java.io.File;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2017/7/24.
 */
@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMsgFactory {

    private MSG msg;

    private String xml;

    private MSG createdMsg;

    @Test
    public void check(){
        MSG09 msg09 = new MSG09();
        MSG09.MsgInfo MsgInfo = new MSG09.MsgInfo();
        MsgInfo.setCreatedBy("vteam001");
        MsgInfo.setDateTime("2009-12-16T10:49:37");
        MsgInfo.setError("");
        MsgInfo.setReceiverCode("CN01200");
        MsgInfo.setSenderCode("CN01209");
        MsgInfo.setSequenceNr("437402");
        MsgInfo.setStatus("4");
        msg09.setMsgInfo(MsgInfo);

        MSG09.EF EF = new MSG09.EF();
        EF.setFactorCode("CN01209");
        EF.setFactorName("CN01209");
        msg09.setEF(EF);

        MSG09.IF IF = new MSG09.IF();
        IF.setFactorCode("CN01209");
        IF.setFactorName("CN01209");
        msg09.setIF(IF);

        MSG09.ControlTot ControlTot = new MSG09.ControlTot();
        ControlTot.setTotNrCreditNotes("0");
        ControlTot.setTotNrInvoices("2");
        msg09.setControlTot(ControlTot);

        MSG09.Seller Seller = new MSG09.Seller();
        Seller.setSellerName("edi test eng seller02");
        Seller.setSellerNr("CNSEL02");
        msg09.setSeller(Seller);

        String InvBatchNr = "inv-20101224-01";
        msg09.setInvBatchNr(InvBatchNr);
        String InvBatchDate = "2009-11-06";
        msg09.setInvBatchDate(InvBatchDate);
        String InvBatchCurrency = "USD";
        msg09.setInvBatchCurrency(InvBatchCurrency);
        String TotAmtInvoices = "3000";
        msg09.setTotAmtInvoices(TotAmtInvoices);
        String TotAmtCreditNotes = "0";
        msg09.setTotAmtCreditNotes(TotAmtCreditNotes);
        String MsgText = "MsgText-------adsf";
        msg09.setMsgText(MsgText);

        IntStream.range(1, 3).forEach(i -> {
            MSG09.InvCreditNoteDetails InvCreditNoteDetails = new MSG09.InvCreditNoteDetails();
            InvCreditNoteDetails.setBuyerName("nt test seller02 abcdefghlijk abc" + i);
            InvCreditNoteDetails.setBuyerNr("CNBUY0" + i);
            InvCreditNoteDetails.setDiscount1Days("");
            InvCreditNoteDetails.setDiscount1Perc("");
            InvCreditNoteDetails.setDiscount2Days("");
            InvCreditNoteDetails.setDiscount2Perc("");
            InvCreditNoteDetails.setDocAmt("1000");
            InvCreditNoteDetails.setDocDate("2009-11-06");
            InvCreditNoteDetails.setDocDueDate("2009-11-16");
            InvCreditNoteDetails.setDocNr("inv-20110110-001");
            InvCreditNoteDetails.setDocType("1");
            InvCreditNoteDetails.setDocValueDate("");
            InvCreditNoteDetails.setInvRefNr("");
            InvCreditNoteDetails.setNetPmtTerms("");
            InvCreditNoteDetails.setOrderNrRef("Order Number Reference_vic");
            InvCreditNoteDetails.setPmtCondition("1");
            msg09.addInvCreditNoteDetails(InvCreditNoteDetails);
        });


        String check = msg09.check();
        Assert.assertEquals(check,"");
        msg = msg09;
    }

    @Test
    public void test() throws Exception{
        Assert.assertNotNull(msg);
        xml = MSGFactory.toXML(msg);
        System.out.println(xml);
        createdMsg = MSGFactory.createMsg(MSG09.class,xml);
        System.out.println(createdMsg);
        xml = MSGFactory.toXML(msg);
        System.out.println(xml);
    }

    @Test
    public void testMSG09XML() throws Exception{
        String xml = "<MSG09 xmlns=\"urn:schemas-edifactoring-com:MSG09\">\n" +
                "<MsgInfo>\n" +
                "<SenderCode>CN01209</SenderCode>\n" +
                "<ReceiverCode>CN01200</ReceiverCode>\n" +
                "<CreatedBy>vteam001</CreatedBy>\n" +
                "<SequenceNr>437402</SequenceNr>\n" +
                "<DateTime>2009-12-16T10:49:37</DateTime>\n" +
                "<Status>4</Status>\n" +
                "</MsgInfo>\n" +
                "<EF>\n" +
                "<FactorCode>CN01209</FactorCode>\n" +
                "<FactorName>CN01209</FactorName>\n" +
                "</EF>\n" +
                "<IF>\n" +
                "<FactorCode>CN01200</FactorCode>\n" +
                "<FactorName>China Merchants Bank</FactorName>\n" +
                "</IF>\n" +
                "<InvBatchNr>inv-20101224-01</InvBatchNr>\n" +
                "<InvBatchDate>2009-11-06</InvBatchDate>\n" +
                "<InvBatchCurrency>USD</InvBatchCurrency>\n" +
                "<TotAmtInvoices>3000</TotAmtInvoices>\n" +
                "<TotAmtCreditNotes>0</TotAmtCreditNotes>\n" +
                "<Seller>\n" +
                "<SellerNr>CNSEL02</SellerNr>\n" +
                "<SellerName>edi test eng seller02</SellerName>\n" +
                "</Seller>\n" +
                "<InvCreditNoteDetails>\n" +
                "<BuyerNr>CNBUY02</BuyerNr>\n" +
                "<BuyerName>nt test seller02 abcdefghlijk abc</BuyerName>\n" +
                "<DocType>1</DocType>\n" +
                "<DocNr>inv-20110110-001</DocNr>\n" +
                "<DocDate>2009-11-06</DocDate>\n" +
                "<DocAmt>1000</DocAmt>\n" +
                "<DocDueDate>2009-11-16</DocDueDate>\n" +
                "<PmtCondition>1</PmtCondition>\n" +
                "<OrderNrRef>Order Number Reference_vic</OrderNrRef>\n" +
                "</InvCreditNoteDetails>\n" +
                "<InvCreditNoteDetails>\n" +
                "<BuyerNr>CNBUY02</BuyerNr>\n" +
                "<BuyerName>nt test seller02 abcdefghlijk abc</BuyerName>\n" +
                "<DocType>1</DocType>\n" +
                "<DocNr>inv-20110110-002</DocNr>\n" +
                "<DocDate>2009-11-06</DocDate>\n" +
                "<DocAmt>2000</DocAmt>\n" +
                "<DocDueDate>2009-11-16</DocDueDate>\n" +
                "<PmtCondition>1</PmtCondition>\n" +
                "<OrderNrRef>Order Number Reference_vic</OrderNrRef>\n" +
                "</InvCreditNoteDetails>\n" +
                "<ControlTot>\n" +
                "<TotNrInvoices>2</TotNrInvoices>\n" +
                "<TotNrCreditNotes>0</TotNrCreditNotes>\n" +
                "</ControlTot>\n" +
                "</MSG09>";
        createdMsg = MSGFactory.createMsg(MSG09.class,xml);
        xml = MSGFactory.toXML(msg);
        System.out.println(xml);
    }

    @Test
    public void testBuildMsgVO() throws Exception{
        File xmlPath = new File("E:\\project\\study\\fci\\src\\main\\resources\\xml");
        Stream.of(xmlPath.listFiles((dir, name) -> name.endsWith(".xml"))).forEach(
                f -> {
                    try {
                        MSGFactory.generatorJavaVo(f, "E:\\project\\study\\fci\\src\\main\\java\\com\\vteam\\soter\\edi\\sdk\\vo");
                    } catch (EDIParseException e) {
                        e.printStackTrace();
                    }
                }
        );
    }

}
