package com.orangehrm.test;

	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ReadExcel {

	    public static void main(String[] args) throws IOException {

	        FileInputStream fis = new FileInputStream("C:\\Users\\amals\\Downloads\\testdata.xlsx");
	        Workbook workbook = new XSSFWorkbook(fis);
	        Sheet sheet = workbook.getSheetAt(0);

	        
	        String username = (sheet.getRow(1).getCell(0)).toString();
	        System.out.println(username);

	        workbook.close();
	        fis.close();
	    }
	

	

	}


