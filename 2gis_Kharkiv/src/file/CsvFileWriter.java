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
				fileWriter.append(item.getName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(item.getType());
				fileWriter.append(NEW_LINE_SEPARATOR);
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
