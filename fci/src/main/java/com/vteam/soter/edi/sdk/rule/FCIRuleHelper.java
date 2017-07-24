package com.vteam.soter.edi.sdk.rule;

import com.vteam.soter.edi.sdk.vo.MSG;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 2017/7/21.
 */
public class FCIRuleHelper {

    private static final String NUMBER_REGEX = "[0-9]\\d*";

    private static final String AN_ANY = "AN..";
    private static final String AN_MUST = "AN";
    private static final String AMOUNT = "{amount}";
    private static final String NEGATIVE_AMOUNT = "{(negative)amount}";
    private static final String NUMBER = "N..";
    private static final String DATE = "YYYY-MM-DD";
    private static final String DATETIME = "YYYY-MM-DDTHH:MM:SS";


    public static boolean checkFormat(String value, String format){
        // 位数以内的任意字符 AN..35
        if(null == format || "".equals(format)){
            return true;
        }
        else if (format.startsWith(AN_ANY)) {
            int length = Integer.valueOf(format.replace(AN_ANY, ""));
            return value.length() <= length;
        }
        // 位数定长字符 AN7
        else if (format.startsWith(AN_MUST)) {
            int length = Integer.valueOf(format.replace(AN_MUST, ""));
            return value.length() == length;
        }
        // 金额数据，小数点左边不超过M位，小数点右边不超过N位 N14.2{amount}
        else if (format.startsWith("N") && format.endsWith(AMOUNT)) {
            if (!value.matches(NUMBER_REGEX)) {
                return false;
            }
            String[] numberStyle = format.substring(1, format.length() - AMOUNT.length()).
                    split("\\.");
            int leftLength = Integer.valueOf(numberStyle[0]);
            int rightLength = Integer.valueOf(numberStyle[1]);
            if (!value.contains(".")) {
                return value.length() <= leftLength;
            }
            String[] values = value.split("\\.");
            return values[0].length() <= leftLength &&
                    values[1].length() <= rightLength;
        }
        // 负金额数据，小数点左边不超过M位，小数点右边不超过N位 N14.2{(negative)amount}
        else if (format.startsWith("N") && format.endsWith(NEGATIVE_AMOUNT)) {
            if (!value.startsWith("-")) {
                return false;
            }
            value = value.substring(1);
            if (!value.matches(NUMBER_REGEX)) {
                return false;
            }

            String[] numberStyle = format.substring(1, format.length() - NEGATIVE_AMOUNT.length()).
                    split("\\.");
            int leftLength = Integer.valueOf(numberStyle[0]);
            int rightLength = Integer.valueOf(numberStyle[1]);
            if (!value.contains(".")) {
                return value.length() <= leftLength;
            }
            String[] values = value.split("\\.");
            return values[0].length() <= leftLength &&
                    values[1].length() <= rightLength;
        }
        // 指定长度数字 N..3{0-999}
        else if (format.startsWith(NUMBER)) {
            if (!value.matches(NUMBER_REGEX)) {
                return false;
            }
            format = format.substring(3);
            if (format.contains("{")) {
                String[] interval = format.substring(format.indexOf("{")+1, format.indexOf("}")).split("-");
                long min = Long.valueOf(interval[0]);
                long max = Long.valueOf(interval[1]);
                long lValue = Long.valueOf(value);
                return min <= lValue && lValue <= max;
            }
            return value.length() <= Integer.valueOf(format);
        }
        // 指定长度小数 N3.4{0-100.0000}
        else if (format.startsWith("N") && format.contains(".") && format.contains("-")) {
            if (!value.matches("[1-9]\\d*.\\d*|0.\\d*[1-9]\\d*")) {
                return false;
            }
            float fValue = Float.valueOf(value);
            String[] numberStyle = format.substring(1, format.length() - format.indexOf("{")).
                    split("\\.");
            int leftLength = Integer.valueOf(numberStyle[0]);
            int rightLength = Integer.valueOf(numberStyle[1]);

            String[] interval = format.substring(format.indexOf("{"), format.indexOf("}")).split("-");

            float min = Float.valueOf(interval[0]);
            float max = Float.valueOf(interval[1]);

            if (!value.contains(".")) {
                return value.length() <= leftLength && fValue >= min && fValue <= max;
            }

            String[] values = value.split("\\.");

            return values[0].length() <= leftLength &&
                    values[1].length() <= rightLength &&
                    fValue >= min &&
                    fValue <= max;
        }
        // 指定日期格式 YYYY-MM-DD
        else if(format.equals(DATE)){
            if(value.length() != DATE.length()){
                return false;
            }
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                dateFormat.parse(value);
                return true;
            } catch (ParseException e) {
                return false;
            }
        }
        // 指定日期时间格式 YYYY-MM-DDTHH:MM:SS
        else if(format.equals(DATETIME)){
            if(value.length() != DATETIME.length()){
                return false;
            }
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                dateFormat.parse(value.replace("T"," "));
                return true;
            } catch (ParseException e) {
                return false;
            }
        }

        return false;
    }

    public static boolean checkCodeList(Class<? extends MSG> clz, CODELIST codelist, String value){
        // TODO: 2017/7/21 整合CodeList
        return false;
    }

    public static void main(String[] args) throws Exception {
        String aaa = "YYYY-MM-DDTHH:MM:SS";
        boolean b = checkFormat("2009-12-16T10:19:37", aaa);
        System.out.println("b = " + b);
    }
}
