package file;

import site.structure.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by EkaterinaK on 15.09.2015.
 */
public class CsvFileWriterRubrics {

        public static final String SAVE_FILE = "export_poi_category.csv";
        //Delimiter used in CSV file
        private static final String COMMA_DELIMITER = ",";
        private static final String NEW_LINE_SEPARATOR = "\n";

        //CSV file header
        //private static final String FILE_HEADER = "id,name,type";

        public String getPrintRubric() {
            return printRubric;
        }

        public void setPrintRubric(String printRubric) {
            this.printRubric = printRubric;
        }

        private String  printRubric;

        public void writeCsvFile(String rubricId, List<Item> items) {

            FileWriter fileWriter = null;
            setPrintRubric(rubricId);

            try {
                fileWriter = new FileWriter(SAVE_FILE, true);

                //Write the CSV file header
                //fileWriter.append(FILE_HEADER.toString());

                //Add a new line separator after the header
                //fileWriter.append(NEW_LINE_SEPARATOR);

                //Write a new student object list to the CSV file
                for (Item item : items) {
                    //printId(fileWriter, item.getId());
                    print(fileWriter, item.getId());
                    print(fileWriter, item.getName());

                    for (Rubric rubrics: item.getRubrics()){
                        print(fileWriter, rubrics.getId());
                        print(fileWriter, rubrics.getName());
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
                    printValue = " \"\"";
                }else {
                    printValue = " \""+value+"\"";
                }
                fileWriter.append(printValue);
                fileWriter.append(COMMA_DELIMITER);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printId (FileWriter fileWriter, String id){
            if (id!=null && id.length() > 16){
                print(fileWriter, getPrintRubric()+"\", "+ "\""+id.substring(0, 17));
            }else {
                print(fileWriter, getPrintRubric()+"\", "+ "\""+id);
            }
        }

    }


