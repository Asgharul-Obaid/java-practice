package sahil;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
	
	 public static void main(String[] args) {
		
		 try {
			 
			 Class.forName("com.mysql.jdbc.Driver");
			 
		        // Registering drivers using Driver Manager
		        // Step 3: Establish. a connection
		        Connection connection = DriverManager.getConnection(
		            "jdbc:mysql://localhost:3306/sahil", "root",
		            "root");
		 
		        // Step 4: Process the statement
		        // Getting data from the table details
		        Statement statement = connection.createStatement();
		        ResultSet resultSet = statement.executeQuery(
		            "select * from details");
		 
		        // Step 5: Execute a query
		        // Create a workbook
		        XSSFWorkbook workbook = new XSSFWorkbook();
		 
		        // Create a spreadsheet inside a workbook
		        XSSFSheet spreadsheet1
		            = workbook.createSheet("student db");
		        XSSFRow row = spreadsheet1.createRow(1);
		        XSSFCell cell;
		 
		        // Step 6: Process the results
		        cell = row.createCell(1);
		        cell.setCellValue("RollNo");
		 
		        cell = row.createCell(2);
		        cell.setCellValue("Name");
		 
		        // i=2 as we will start writing from the
		        // 2'nd row
		        int i = 2;
		 
		        while (resultSet.next()) {
		            row = spreadsheet1.createRow(i);
		            cell = row.createCell(1);
		            cell.setCellValue(resultSet.getInt("RollNo"));
		 
		            cell = row.createCell(2);
		            cell.setCellValue(resultSet.getString("Name"));
		 
		            i++;
		        }
		 
		        // Local directory on computer
		        FileOutputStream output = new FileOutputStream(new File(
		            "C:\\Users\\hp\\Downloads\\sahil.xlsx"));
		 
		        // write
		        workbook.write(output);
		 
		        // Step 7: Close the connection
		        output.close();
		 
		        // Display message for successful compilation of
		        // program
		        System.out.println(
		            "exceldatabase.xlsx written successfully");
			 
		 }catch (Exception e) {
			System.out.println(e);
		}
		 
	}

}
