package task8;

import org.apache.poi.xssf.usermodel.*;
import java.io.*;

public class ApacheWriteCode {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook(); // creating workbook

		XSSFSheet sheet = workbook.createSheet("Sheet1"); // creating sheet

		Object sheetData[][] = { { "Name", "Age", "Email" }, { "John Doe", "30", "john@test.com" },
				{ "Jane Doe", "28", "john@test.com" }, { "Bob Smith", "35", "jacky@example.com" },
				{ "Swapnil", "37", "swapnil@example.com" }

		};

		int rows = sheetData.length;
		int colm = sheetData[0].length;

		for (int r = 0; r < rows; r++) {

			XSSFRow row = sheet.createRow(r);

			for (int c = 0; c < colm; c++) {

				XSSFCell cell = row.createCell(c);

				Object value = sheetData[r][c];

				if (value instanceof String) {
					cell.setCellValue((String) value);
				}
				if (value instanceof Integer) {
					cell.setCellValue((Integer) value);
				}
			}

		}

		String filePath = "./dataFile/fileName.xlsx";

		FileOutputStream outstream = new FileOutputStream(filePath);

		workbook.write(outstream);
		outstream.close();

		workbook.close();

	}

}
