package task8;

import org.apache.poi.xssf.usermodel.*;
import java.io.*;

public class ApacheReadCode {

	public static void main(String[] args) throws IOException {

		String filePath = "./dataFile/fileName.xlsx";

		FileInputStream inputStream = new FileInputStream(filePath);

		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getLastRowNum();
		int colm = sheet.getRow(0).getLastCellNum();

		for (int r = 0; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);

			for (int c = 0; c < colm; c++) {
				XSSFCell cell = row.getCell(c);

				switch (cell.getCellType()) {
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t");
					break;
				case STRING:
					System.out.print(cell.getStringCellValue() + "\t");
					break;

				}
			}

			System.out.println();
		}

		workbook.close();

	}

}
