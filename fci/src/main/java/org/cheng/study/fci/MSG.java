package org.cheng.study.fci;

import org.cheng.study.fci.rule.CODELIST;
import org.cheng.study.fci.rule.FCIRuleHelper;
import org.cheng.study.fci.rule.Rule;
import org.cheng.study.fci.rule.STATUS;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Administrator on 2017/7/21.
 */
public abstract class MSG {
    public String check() {
        return doCheck(this, "");
    }

    private String doCheck(Object obj, String err) {
        if (!"".equals(err)) {
            return err;
        }
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                String name = field.getName();
                Rule rule = field.getAnnotation(Rule.class);
                if (null == rule) {
                    return "属性：" + name + "未找到规则定义";
                }
                Object value = getValue(obj, name);
                STATUS status = rule.status();

                if (null == value || "".equals(value)) {
                    if (status.equals(STATUS.M)) {
                        return "属性：" + name + "不能为空";
                    }
                    return "";
                }

                Class<?> type = field.getType();
                if (type.isAssignableFrom(List.class)) {
                    List listObj = (List) getValue(obj, name);
                    for (Object o : listObj) {
                        String loopErr = doCheck(o, "");
                        if (!"".equals(loopErr)) {
                            return loopErr;
                        }
                    }
                } else if (type.getName().equals("java.lang.String")) {
                    String format = rule.format();
                    if (!FCIRuleHelper.checkFormat(value.toString(), format)) {
                        return "属性：" + name + "与格式" + format + "不匹配";
                    }
                } else {
                    String objErr = doCheck(value, "");
                    if (!"".equals(objErr)) {
                        return objErr;
                    }
                }

                CODELIST codelist = rule.codelist();
                if(!CODELIST.SYS_NONE.equals(codelist)){
                    if (!FCIRuleHelper.checkCodeList(this.getClass(),codelist,value.toString())) {
                        return "属性：" + name +"的CODELIST:"+codelist+"="+value+",与"+this.getClass().getSimpleName()+"中定义的不匹配";
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            return "error:" + e;
        }
        return "";
    }

    private Object getValue(Object bean, String filed) throws Exception {
        String geter = "get" + filed;
        Class<?> clz = bean.getClass();
        Method method = clz.getMethod(geter);
        return method.invoke(bean);
    }

    public static void main(String[] args) {
        MSG09 msg09 = new MSG09();
        MSG09.MsgInfo MsgInfo = new MSG09.MsgInfo();
        MsgInfo.setCreatedBy("vteam001");
        MsgInfo.setDateTime("2009-12-16T10:49:37");
//        MsgInfo.setError("");
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

        IntStream.range(1, 10).forEach(i -> {
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
        System.out.println("check = " + check);
    }
}
