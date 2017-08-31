package com.vteam.soter.edi.sdk.rule;

import com.vteam.soter.edi.sdk.vo.MSG;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2017/7/21.
 */
public class EdiRuleHelper {

    private static final String NUMBER_REGEX = "[0-9]\\d*";

    private static final String AN_ANY = "AN..";
    private static final String AN_MUST = "AN";
    private static final String AMOUNT = "{amount}";
    private static final String NEGATIVE_AMOUNT = "{(negative) amount}";
    private static final String NUMBER = "N..";
    private static final String DATE = "YYYY-MM-DD";
    private static final String DATETIME = "YYYY-MM-DDTHH:MM:SS";

    private static final String CODE_LIST_DEFINE = "11,PaymentType,1,2\n" +
            "11,DocumentPaid,1,2,3,4,5,8\n" +
            "12,PaymentType,1,2\n" +
            "12,DocumentPaid,1,2,5,8\n" +
            "13,DocumentPaid,1,2,5\n" +
            "14,DocumentType,1,2,3,4,5\n" +
            "14,ActionTaken,1,2,3,4,5,6,7,8\n" +
            "14,DisputeReason,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23\n" +
            "15,InstructionStatus,1,2\n" +
            "15,DisputeStatus,1,2,3\n" +
            "15,DocumentType,1,2,3,4,5\n" +
            "15,ActionTaken,1,2,3,4,5,6,7,8\n" +
            "15,DisputeReason,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23\n" +
            "16,DocumentType,1,2,5\n" +
            "16,MessageType,1,2\n" +
            "16,DisputeReason,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23\n" +
            "17,DocumentType,4,6,7\n" +
            "17,PaymentMethod,3,4\n" +
            "17,MessageType,3,4\n" +
            "18,PaymentChannel,1,2,3,4\n" +
            "18,PaymentMethod,5,6,7,8\n" +
            "1,MessageFunction,1,2\n" +
            "1,ServiceRequired,1,2,3,4\n" +
            "2,MessageFunction,3,4\n" +
            "2,DirectContactAllowed,1,2\n" +
            "3,Reason,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,99\n" +
            "4,BankChargesIncluded,1,2\n" +
            "5,MessageFunction,4,5,6,7\n" +
            "5,DirectContactAllowed,1,2\n" +
            "6,Response,1,2,3,4,5,6\n" +
            "6,MessageFunction,7,8\n" +
            "6,Reason,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,99\n" +
            "7,Request,5,6,7,8,9,10\n" +
            "7,MessageFunction,3,4\n" +
            "8,Response,1,2,3,4,5,6,7,8,9\n" +
            "8,Reason,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,99\n" +
            "9,PaymentConditions,1,2,3,4,5,6,99\n" +
            "9,DocumentType,1,2\n" +
            "20,MessageFunction,7,9\n" +
            "10,PaymentConditions,1,2,3,4,5,6,99\n" +
            "10,MessageFunction,9,10\n" +
            "10,DocumentType,1,2";

    private static final Set<String> Currency = new HashSet<String>(
            Arrays.asList(new String[]{"AED", "ARP", "AUD", "BGL", "BRL", "CAD", "CHF", "CLP", "CNY", "CRC", "CZK", "CUP", "CYP", "DKK", "EEK", "EUR", "GBP", "HKD", "HUF", "IDR", "ILS", "INR", "ISK", "JPY", "KRW", "MAD", "MXP", "MYR", "NOK", "NZD", "PAB", "PLZ", "ROL", "RUR", "SEK", "SGD", "SIT", "SKK", "THB", "TND", "TRL", "TWD", "USD", "ZAR"})
    );

    private static final Set<String> Country = new HashSet<String>(
            Arrays.asList(new String[]{"AE", "AD", "AR", "AT", "AU", "BE", "BG", "BO", "BR", "CA", "CH", "CL", "CN", "CO", "CR", "CU", "CY", "CZ", "DE", "DK", "EC", "EE", "ES", "FI", "FR", "GB", "GR", "GT", "HK", "HN", "HR", "HU", "ID", "IE", "IL", "IN", "IS", "IT", "JP", "KR", "LI", "LK", "LT", "LU", "LV", "MA", "MC", "MO", "MT", "MX", "MY", "NI", "NL", "NO", "NZ", "OM", "PA", "PE", "PH", "PL", "PR", "PT", "PY", "RO", "RU", "SE", "SG", "SI", "SK", "SM", "SV", "TH", "TN", "TR", "TW", "UA", "US", "UY", "VA", "VE", "ZA"})
    );

    private static Map<String, Set<String>> codeListDefine;


    public static boolean checkFormat(String value, String format) {
        // 位数以内的任意字符 AN..35
        if (null == format || "".equals(format)) {
            return true;
        } else if (format.startsWith(AN_ANY)) {
            int length = Integer.valueOf(format.replace(AN_ANY, ""));
            return value.length() <= length;
        }
        // 位数定长字符 AN7
        else if (format.startsWith(AN_MUST)) {
            int length = Integer.valueOf(format.replace(AN_MUST, ""));
            return value.length() == length;
        }
        // 金额数据，小数点左边不超过M位，小数点右边不超过N位 N14.2{amount}
        else if (format.startsWith("N") && (format.endsWith(AMOUNT)
                || format.endsWith(NEGATIVE_AMOUNT))) {
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
                String[] interval = format.substring(format.indexOf("{") + 1, format.indexOf("}")).split("-");
                long min = Long.valueOf(interval[0]);
                long max = Long.valueOf(interval[1]);
                long lValue = Long.valueOf(value);
                return min <= lValue && lValue <= max;
            }
            return value.length() <= Integer.valueOf(format);
        }
        // 指定长度小数 N3.4{0-100.0000}
        else if (format.startsWith("N") && format.contains(".") && format.contains("-")) {
            float fValue = Float.valueOf(value);
            String[] numberStyle = format.substring(1, format.indexOf("{")).
                    split("\\.");
            int leftLength = Integer.valueOf(numberStyle[0]);
            int rightLength = Integer.valueOf(numberStyle[1]);

            String[] interval = format.substring(format.indexOf("{") + 1, format.indexOf("}")).split("-");

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
        else if (format.equals(DATE)) {
            if (value.length() != DATE.length()) {
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
        else if (format.equals(DATETIME)) {
            if (value.length() != DATETIME.length()) {
                return false;
            }
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                dateFormat.parse(value.replace("T", " "));
                return true;
            } catch (ParseException e) {
                return false;
            }
        }
        System.out.println("format = " + format);
        return false;
    }

    public static boolean checkCodeList(Class<? extends MSG> clz, String codelist, String value) {
        if ("Currency".equals(codelist)) {
            return Currency.contains(value);
        } else if ("Country".equals(codelist)) {
            return Country.contains(value);
        } else {
            String msg = clz.getSimpleName().replaceAll("MSG", "").replaceFirst("^0+", "");
            Map<String, Set<String>> define = getCodeListDefine();
            Set<String> list = define.get(getDefineKey(msg, codelist));
            return null == list || list.isEmpty() || list.contains(value);
        }

    }

    private static Map<String, Set<String>> getCodeListDefine() {
        if (null == codeListDefine) {
            codeListDefine = new HashMap<String, Set<String>>();
            String[] arr = CODE_LIST_DEFINE.split("\n");
            for (String s : arr) {
                String[] str = s.split(",");
                int length = str.length;
                String msg = str[0];
                String code = str[1];
                Set<String> define = new HashSet<String>();
                define.addAll(Arrays.asList(str).subList(2, length));
                codeListDefine.put(getDefineKey(msg, code), define);
            }
        }
        return codeListDefine;
    }

    private static String getDefineKey(String msg, String code) {
        return msg + "-" + code;
    }

}
