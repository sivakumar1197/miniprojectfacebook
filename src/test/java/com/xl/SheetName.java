package com.xl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SheetName {
	static String value;

	static void singledata() throws Exception {

		File f = new File("C:\\Users\\lenovo\\eclipse-workspace\\Facebook\\sheet\\New Microsoft Excel Worksheet.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(); //// hssf(till 2003) and xssf(from 2008)

		Sheet s = w.getSheetAt(0);

		Row r = s.getRow(0);

		Cell c = r.getCell(0);

		CellType ct = c.getCellType();

		if (ct.equals(CellType.STRING)) {
			value = c.getStringCellValue();
		} else if (ct.equals(CellType.NUMERIC)) {
			double nvc = c.getNumericCellValue();
			value = String.valueOf(nvc);
		}

		System.out.println(value);

	}

	static void alldata() throws Exception {
		File f = new File("C:\\Users\\lenovo\\eclipse-workspace\\Facebook\\sheet\\New Microsoft Excel Worksheet.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook();

		Sheet s = w.getSheetAt(0);

		for (int i = 0; i < s.getLastRowNum(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getLastCellNum(); j++) {
				Cell c = r.getCell(j);
				CellType ct = c.getCellType();

				if (ct.equals(CellType.STRING)) {
					value = c.getStringCellValue();
				} else if (ct.equals(CellType.NUMERIC)) {
					double nvc = c.getNumericCellValue();
					value = String.valueOf(nvc);
				}

				System.out.println(value);

			}

		}

	}

	public static void main(String[] args) throws Exception {
		singledata();

	}

}
