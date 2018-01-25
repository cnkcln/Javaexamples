import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.*;
import java.util.*;
import java.sql.*;
public class xlsToOracle {

	public static void main(String[] args) throws Exception{                
        /* Create Connection objects */
        Class.forName ("oracle.jdbc.OracleDriver"); 
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:1521:XE", "system", "osi");
        PreparedStatement sql_statement = null;
        String jdbc_insert_sql = "INSERT INTO XLS_POI"
                        + "(KEYWORD, TOTAL_COUNT) VALUES"
                        + "(?,?)";
        sql_statement = conn.prepareStatement(jdbc_insert_sql);
        /* We should now load excel objects and loop through the worksheet data */
        FileInputStream input_document = new FileInputStream(new File("C://Users//lchengannagari.OSIUS//Desktop/xls_to_oracle.xlsx"));
        /* Load workbook */
        HSSFWorkbook my_xls_workbook = new HSSFWorkbook(input_document);
        /* Load worksheet */
        HSSFSheet my_worksheet = my_xls_workbook.getSheetAt(0);
        // we loop through and insert data
        Iterator<Row> rowIterator = my_worksheet.iterator(); 
        while(rowIterator.hasNext()) {
                Row row = rowIterator.next(); 
                Iterator<Cell> cellIterator = row.cellIterator();
                        while(cellIterator.hasNext()) {
                                Cell cell = cellIterator.next();
                                switch(cell.getCellType()) { 
                                case Cell.CELL_TYPE_STRING: //handle string columns
                                        sql_statement.setString(1, cell.getStringCellValue());                                                                                     
                                        break;
                                case Cell.CELL_TYPE_NUMERIC: //handle double data
                                        sql_statement.setDouble(2,cell.getNumericCellValue() );
                                        break;
                                }
                               
                        }
        //we can execute the statement before reading the next row
        sql_statement.executeUpdate();
        }
        /* Close input stream */
        input_document.close();
        /* Close prepared statement */
        sql_statement.close();
        /* COMMIT transaction */
        conn.commit();
        /* Close connection */
        conn.close();
}

}
