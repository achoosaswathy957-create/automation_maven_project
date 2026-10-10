package com.orangehrm.test;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Testcases {

    @Test
    public void readExcelData() throws IOException {
        String excelPath = "C:\\Users\\amals\\Downloads\\testdata.xlsx";

        FileInputStream fis = new FileInputStream(excelPath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

        String username = sheet.getRow(1).getCell(0).getStringCellValue();
        String password = sheet.getRow(1).getCell(1).getStringCellValue();

        System.out.println("Excel Username: " + username);
        System.out.println("Excel Password: " + password);

        workbook.close();
        fis.close();
    }
}