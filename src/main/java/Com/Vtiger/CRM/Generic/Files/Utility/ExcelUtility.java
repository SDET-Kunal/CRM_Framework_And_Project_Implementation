package Com.Vtiger.CRM.Generic.Files.Utility;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtility {
    public String getDataFromExcel(String Sheet, int Row, int Cell) throws IOException {
        FileInputStream Data = new FileInputStream("src/test/resources/Vtiger_Resource/DDT.xlsx");
        Workbook workbook= WorkbookFactory.create(Data);
        Sheet sheet=workbook.getSheet(Sheet);
         Row row= sheet.getRow(Row);
         String cell=row.getCell(Cell).toString();
         workbook.close();

         return cell;
    }

    public void SetDataIntoExcel(String Sheet, int Row, int Cell,String Data) throws IOException {
        FileInputStream Impdata = new FileInputStream("src/test/resources/Vtiger_Resource/DDT.xlsx");
        Workbook workbook= WorkbookFactory.create(Impdata);
        Sheet sheet=workbook.getSheet(Sheet);
        sheet.getRow(Row).createCell(Cell).setCellValue(Data);
        FileOutputStream Expdata=new FileOutputStream("src/test/resources/Vtiger_Resource/DDT.xlsx");
        workbook.write(Expdata);
        workbook.close();
    }
    public  int getRowCount(String Sheet) throws IOException {
        FileInputStream data = new FileInputStream("src/test/resources/Vtiger_Resource/DDT.xlsx");
        Workbook workbook= WorkbookFactory.create(data);
        int sheet=workbook.getSheet(Sheet).getLastRowNum();
        workbook.close();
        return sheet;
    }

    }

