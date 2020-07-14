package com.jxday.common.utils;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * 〈excel工作类〉
 *
 * @author cty
 * @ClassName ExcelUtil
 * @create 2020-07-14 11:48
 * @Version 1.0.0
 */
public class ExcelUtil {
    public static String getCellValue(Cell cell) {
        String cellValue = "";
        if (cell == null) {
            return cellValue;
        }
        //判断数据的类型
        switch (cell.getCellTypeEnum()) {
            case NUMERIC: //数字
                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                    Date date = cell.getDateCellValue();
                } else {
//                    value = cell.getNumericCellValue();
//                    DecimalFormat df = new DecimalFormat("0");
//                    value = df.format(value);
                    
                    cellValue = realStringValueOfDouble(cell.getNumericCellValue());
                    cellValue = cellValue.trim();
                }
                break;

                
            
            case STRING: //字符串
                cellValue = String.valueOf(cell.getStringCellValue());
                cellValue = cellValue.trim();
                break;
            case BOOLEAN: //Boolean
                cellValue = String.valueOf(cell.getBooleanCellValue());
                cellValue = cellValue.trim();
                break;
            case FORMULA: //公式
                cellValue = String.valueOf(cell.getCellFormula());
                cellValue = cellValue.trim();
                break;
            case BLANK: //空值
                cellValue = "";
                break;
            case ERROR: //故障
                throw new RuntimeException();
            default:
                throw new RuntimeException();
        }
        return cellValue;
    }

    public static String realStringValueOfDouble(Double d) {
        String doubleStr = d.toString();
        boolean b = doubleStr.contains("E");
        int indexOfPoint = doubleStr.indexOf('.');
        if (b) {
            int indexOfE = doubleStr.indexOf('E');
            BigInteger xs = new BigInteger(doubleStr.substring(indexOfPoint + BigInteger.ONE.intValue(), indexOfE));
            int pow = Integer.parseInt(doubleStr.substring(indexOfE + BigInteger.ONE.intValue()));
            int xsLen = xs.toByteArray().length;
            int scale = xsLen - pow > 0 ? xsLen - pow : 0;
            final String format = "%." + scale + "f";
            doubleStr = String.format(format, d);
        } else {
            java.util.regex.Pattern p = Pattern.compile(".0$");
            java.util.regex.Matcher m = p.matcher(doubleStr);
            if (m.find()) {
                doubleStr = doubleStr.replace(".0", "");
            }
        }
        return doubleStr;
    }
}
