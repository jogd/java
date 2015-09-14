package file;

import site.structure.CategoryResultItem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by yevgeniyk on 09.09.15.
 */
public class CsvFileWriter {

	public static final String SAVE_FILE = "export_poi.csv";
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	//CSV file header
	private static final String FILE_HEADER = "id,name,type";

	public static void writeCsvFile(List<CategoryResultItem> items) {

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(SAVE_FILE);

			//Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);

			//Write a new student object list to the CSV file
			for (CategoryResultItem item : items) {
				fileWriter.append(String.valueOf(item.getId()));
				fileWriter.append(COMMA_DELIMITER);
				
				for (CategoryResultItemNameEx name_ex : item.getNameEx()){
					fileWriter.append(name_ex.primary);
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(name_ex.addition);
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(name_ex.legal_name);
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(name_ex.extension);
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(name_ex.description);
					fileWriter.append(COMMA_DELIMITER);
				}
				for (CategoryResultItemPoint point : item.getPoint()){
					fileWriter.append(point.lon);
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(point.lat);
					fileWriter.append(COMMA_DELIMITER);	
				}
				
				for (CategoryResultItemAddress address : item.getAddress()){
					for (CategoryResultItemAddressComponents components: item.getAddress.Сomponents()){
					fileWriter.append(components.street);
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(components.number);
					fileWriter.append(COMMA_DELIMITER);	
					}	
				}
					
				}
				

  
			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}

		}
	}

}
