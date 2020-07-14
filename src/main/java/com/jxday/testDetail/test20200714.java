package com.jxday.testDetail;

import com.jxday.common.utils.ExcelUtil;
import lombok.SneakyThrows;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.assertj.core.util.Strings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * 〈读取本地excel文件〉
 *
 * @author cty
 * @ClassName test20200714
 * @create 2020-07-14 11:30
 * @Version 1.0.0
 */
public class test20200714 {

    private static final java.text.DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd HH:mm");

    @SneakyThrows
    public static void main(String[] args) throws IOException {
        String filePath ="/Users/cty/工作文件/khy-model (1).xlsx";

        FileInputStream stream = new FileInputStream(filePath);

        XSSFWorkbook wookbook = new XSSFWorkbook(stream);

        XSSFSheet sheetAt = wookbook.getSheetAt(0);

        XSSFRow row = sheetAt.getRow(2);

        XSSFCell cell = row.getCell(0);

//        ExcelUtil.getCellValue(cell);

        Date date = cell.getDateCellValue();

        System.out.println(Objects.isNull(cell));
        System.out.println(Objects.isNull(cell.getDateCellValue()));

        boolean b = DateUtil.isCellDateFormatted(cell);

        System.out.println(b);


//        String ret = DATE_FORMAT.format(cell.getDateCellValue());


//        System.out.println(ret);
        String param = "";
        param = null;
        if (!Strings.isNullOrEmpty(param) && param.contains("<script")) {
            throw new IllegalArgumentException("非法字符");
        }

    }

    public static int getDateInSec(Date date) {
        return date == null ? 0 : Long.valueOf(date.getTime() / 1000L).intValue();
    }

    public static Date checkAndParseDate(String dateStr) throws Exception {
        return doParseDate(dateStr, true);
    }

    private static Date doParseDate(String dateStr, boolean check) throws Exception {
        if (Strings.isNullOrEmpty(dateStr)) {
            return null;
        } else {
            DateFormat format = DateFormat.FORMAT_DATE;
            if (dateStr.length() == DateFormat.FORMAT_DATE_ONLY.getString().length()) {
                format = DateFormat.FORMAT_DATE_ONLY;
            } else if (dateStr.length() == DateFormat.FORMAT_DATE_HOUR.getString().length()) {
                format = DateFormat.FORMAT_DATE_HOUR;
            } else if (dateStr.length() == DateFormat.FORMAT_DATE_HOUR_MINUTE.getString().length()) {
                format = DateFormat.FORMAT_DATE_HOUR_MINUTE;
            }

            return doParseDate(dateStr, format, check);
        }
    }

    private static Date doParseDate(String dateStr, DateFormat format, boolean check) throws Exception {
        if (dateStr != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(format.dateStr);
            if (check) {
                sdf.setLenient(false);
            }

            return sdf.parse(dateStr);
        } else {
            return null;
        }
    }

    public static enum DateFormat {
        FORMAT_DATE("yyyy-MM-dd HH:mm:ss"),
        FORMAT_DATE_MONTH("yyyy-MM"),
        FORMAT_DATE_ONLY("yyyy-MM-dd"),
        FORMAT_DATE_HOUR("yyyy-MM-dd HH"),
        FORMAT_DATE_HOUR_MINUTE("yyyy-MM-dd HH:mm");

        private String dateStr;

        private DateFormat(String dateStr) {
            this.dateStr = dateStr;
        }

        public String getString() {
            return this.dateStr;
        }
    }
}
