package com.vteam.soter.edi.sdk;

import com.alibaba.fastjson.JSON;
import com.vteam.soter.edi.sdk.rule.EdiRuleHelper;
import com.vteam.soter.edi.sdk.vo.MSG;
import com.vteam.soter.edi.sdk.vo.MSG01;
import com.vteam.soter.edi.sdk.vo.MSG09;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

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
    public void check() {
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

        for (int i = 0; i < 2; i++) {
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
        }

        String check = msg09.check();
        Assert.assertEquals(check, "");
        msg = msg09;
    }

    @Test
    public void test() throws Exception {
        Assert.assertNotNull(msg);
        xml = MSGFactory.buildXML(msg);
        System.out.println(xml);
        createdMsg = MSGFactory.buildMSG(MSG09.class, xml);
        System.out.println(createdMsg);
        xml = MSGFactory.buildXML(msg);
        System.out.println(xml);
    }

    @Test
    public void testMSG09XML() throws Exception {
        String xml = "<MSG01 xmlns=\"urn:schemas-edifactoring-com:MSG01\">\n" +
                "\t<MsgInfo>\n" +
                "\t\t<SenderCode>CN00509</SenderCode>\n" +
                "\t\t<ReceiverCode>CN00500</ReceiverCode>\n" +
                "\t\t<CreatedBy>kpmg01</CreatedBy><SequenceNr>133388</SequenceNr><DateTime>2006-02-17T07:13:31</DateTime><Status>4</Status></MsgInfo>\n" +
                "\t<EF>\n" +
                "\t\t<FactorCode>CN00509</FactorCode>\n" +
                "\t\t<FactorName>China Everbright Bank Test</FactorName></EF>\n" +
                "\t<IF>\n" +
                "\t\t<FactorCode>CN00500</FactorCode>\n" +
                "\t\t<FactorName>China Everbright Bank</FactorName></IF>\n" +
                "\t<MsgDate>2006-02-17</MsgDate>\n" +
                "\t<MsgFunction>2</MsgFunction>\n" +
                "\t<Seller>\n" +
                "\t\t<SellerNr>EDITest2</SellerNr>\n" +
                "\t\t<SellerName>EDITest2</SellerName>\n" +
                "\t\t<Street>X</Street>\n" +
                "\t\t<City>X</City>\n" +
                "\t\t<Postcode>X</Postcode>\n" +
                "\t\t<Country>CN</Country></Seller>\n" +
                "\t<SellerDetails>\n" +
                "\t\t<BusinessProduct>X</BusinessProduct>\n" +
                "\t\t<NetPmtTerms>0</NetPmtTerms>\n" +
                "\t\t<InvCurrency1>CNY</InvCurrency1>\n" +
                "\t\t<ChargeBackPerc>0</ChargeBackPerc>\n" +
                "\t\t<ChargeBackAmt>0</ChargeBackAmt>\n" +
                "\t\t<ChargeBackCurrency>CNY</ChargeBackCurrency>\n" +
                "\t\t<ExpTotSellerTurnover>X</ExpTotSellerTurnover>\n" +
                "\t\t<ExpNrBuyers>0</ExpNrBuyers>\n" +
                "\t\t<ExpNrInvoices>0</ExpNrInvoices>\n" +
                "\t\t<ExpTurnover>X</ExpTurnover>\n" +
                "\t\t<ExpOtherTurnover>X</ExpOtherTurnover>\n" +
                "\t\t<OtherFactors>X</OtherFactors>\n" +
                "\t\t<ServiceRequired>1</ServiceRequired></SellerDetails>\n" +
                "\t<BankDetailsSeller/></MSG01>";
        MSG01 msg01 = MSGFactory.buildMSG(MSG01.class, xml);
//        xml = MSGFactory.buildXML(msg);
//        System.out.println(xml);
    }

    @Test
    public void testBuildMsgVO() throws Exception {
//        File xmlPath = new File("E:\\project\\study\\fci\\src\\main\\resources\\xml");
//        Stream.of(xmlPath.listFiles((dir, name) -> name.endsWith(".xml"))).forEach(
//                f -> {
//                    try {
//                        MSGFactory.buildJavaVo(f, "E:\\project\\study\\fci\\src\\main\\java\\com\\vteam\\soter\\edi\\sdk\\vo");
//                    } catch (EDIParseException e) {
//                        e.printStackTrace();
//                    }
//                }
//        );
    }

    @Test
    public void testRule() throws Exception{
        EdiRuleHelper.checkFormat("12.11","N3.4{0-100.0000}");
    }

}
