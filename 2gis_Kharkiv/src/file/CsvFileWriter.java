package file;

import site.structure.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class CsvFileWriter {

	//Kharkov region_id=110
	//Dnepropetrovsk region_id=105
	//Donetsk region_id=79
	//Odessa region_id=14

	public static final String SAVE_FILE = "export_poi_Kharkov.csv";
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ";";
	private static final String NEW_LINE_SEPARATOR = "\n";

	//CSV file header
	private static final String FILE_HEADER = "id,name,type";

	public String getPrintRubric() {
		return printRubric;
	}

	public void setPrintRubric(String printRubric) {
		this.printRubric = printRubric;
	}

	private String  printRubric;

	public void writeCsvFile(String rubricId, List<CategoryResultItem> items) {

		FileWriter fileWriterR = null;
		setPrintRubric(rubricId);

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(SAVE_FILE, true);

			//Write the CSV file header
			//fileWriter.append(FILE_HEADER.toString());

			//Add a new line separator after the header
			//fileWriter.append(NEW_LINE_SEPARATOR);

			//Write a new student object list to the CSV file
			for (CategoryResultItem item : items) {

				printId(fileWriter, item.getId());

				CategoryResultItemNameEx name_ex = item.getName_ex();
				if (name_ex != null){
					print(fileWriter, name_ex.getPrimary());
					print(fileWriter, name_ex.getAddition());
					print(fileWriter, name_ex.getLegal_name());
					print(fileWriter, name_ex.getExtension());
					print(fileWriter, name_ex.getDescription());
				}
				CategoryResultItemPoint point = item.getPoint();
				if (point !=null){
					print(fileWriter, Integer.toString((int) (point.getLon()*100000)));//Double.toString(point.getLon()*100000));
					print(fileWriter, Integer.toString((int) (point.getLat()*100000)));
				}

				for (CategoryResultItemAddressComponents components: item.getAddress().getComponents()){
					print(fileWriter, components.getStreet());
					print(fileWriter, components.getNumber());
				}
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

	public void print (FileWriter fileWriter, String value){
		try {
			String printValue = null;
			if (value == null || value.equals("")){
				printValue = "\"\"";
			}else {
				printValue = "\""+value+"\"";
			}
			fileWriter.append(printValue);
			fileWriter.append(COMMA_DELIMITER);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void printId (FileWriter fileWriter, String id){
		if (id!=null && id.length() > 16){
			print(fileWriter, getPrintRubric()+"\";"+ "\""+id.substring(0, 17));
		}else {
			print(fileWriter, getPrintRubric()+"\";"+ "\""+id);
		}
	}

}
