package com.kairos.uploadFiles.Apachipoi;

import com.kairos.uploadFiles.dto.TestCase;
import com.kairos.uploadFiles.dto.TestCaseHeader;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;

public class ApachiPOIDemo {
    public static void main(String[] args) throws IllegalAccessException, FileNotFoundException {
        // Create TestCase instance and set values
        TestCase tc = new TestCase();
        tc.setName("Test");
        tc.setDescription("Test Desc");

        // Create workbook and sheet
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("TestcaseInfo");

        // Create header row
        Row headerRow = sheet.createRow(0);
        Field[] fields = TestCaseHeader.class.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(fields[i].getName());
        }

        // Copy properties from TestCase to TestCaseHeader
        TestCaseHeader dto = new TestCaseHeader();
        try {
            BeanUtils.copyProperties(dto, tc);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print to verify
        System.out.println("TestCase: " + tc);
        System.out.println("TestCaseHeader: " + dto);

        // Create data row
        Row dataRow = sheet.createRow(1);
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            Object value = fields[i].get(dto);
            dataRow.createCell(i).setCellValue(value != null ? value.toString() : "");
        }

        // Resize columns
        for (int i = 0; i < fields.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write to file
        try (FileOutputStream fileOut = new FileOutputStream("src/main/resources/demo.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close workbook
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
