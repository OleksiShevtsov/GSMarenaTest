import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDataProvider {
    @DataProvider(name = "Excel Data")
    public Object[][] excelDataProvider() throws IOException {
        return getExcelData("C:\\Users\\oleksii.shevtsov\\Desktop\\dataUser.xlsx", "Sheet 1");
    }

    private Object[][] getExcelData(String fileName, String sheetName) {
        String[][] data = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            //   XSSFSheet sheet = new XSSFSheet(sheetName);
            XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFRow row = sheet.getRow(0);
            int numOfRows = sheet.getPhysicalNumberOfRows();
            int numOfColumns = row.getLastCellNum();
            Cell cell;
            data = new String[numOfRows - 1][numOfColumns];

            for (int i = 1; i < numOfRows; i++) {
                for (int j = 0; j < numOfColumns; j++) {
                    row = sheet.getRow(i);
                    cell = row.getCell(j);
                    data[i - 1][j] = cell.getStringCellValue();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
