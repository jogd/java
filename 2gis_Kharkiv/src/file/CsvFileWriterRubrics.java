package file;

import site.structure.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by EkaterinaK on 15.09.2015.
 */
public class CsvFileWriterRubrics {

    //Kharkov region_id=110
    //Dnepropetrovsk region_id=105
    //Donetsk region_id=79
    //Odessa region_id=14

        public static final String SAVE_FILE = "export_poi_category_Kharkov.csv";
        //Delimiter used in CSV file
        private static final String COMMA_DELIMITER = ";";
        private static final String NEW_LINE_SEPARATOR = "\n";

        //CSV file header
        //private static final String FILE_HEADER = "id,name,type";

        public void writeCsvFileRubrics(List<Item> items) {

            FileWriter fileWriterRubrics = null;

            try {
                fileWriterRubrics = new FileWriter(SAVE_FILE, true);

                //Write the CSV file header
                //fileWriter.append(FILE_HEADER.toString());

                //Add a new line separator after the header
                //fileWriter.append(NEW_LINE_SEPARATOR);

                //Write a new student object list to the CSV file
                for (Item item : items) {
                    //printId(fileWriter, item.getId());

                    for (Rubric rubrics: item.getRubrics()){
                        print(fileWriterRubrics, item.getId());
                        print(fileWriterRubrics, item.getName());
                        print(fileWriterRubrics, rubrics.getId());
                        print(fileWriterRubrics, rubrics.getName());
                        fileWriterRubrics.append(NEW_LINE_SEPARATOR);
                    }
                }

                System.out.println("CSV file was created successfully !!!");

            } catch (Exception e) {
                System.out.println("Error in CsvFileWriter !!!");
                e.printStackTrace();
            } finally {

                try {
                    fileWriterRubrics.flush();
                    fileWriterRubrics.close();
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
                print(fileWriter, id.substring(0, 17));
            }else {
                print(fileWriter, id);
            }
        }

    }


