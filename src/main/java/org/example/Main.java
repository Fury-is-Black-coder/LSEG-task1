package org.example;
import com.aspose.cells.Workbook;
import it.grabz.grabzit.GrabzItClient;
import it.grabz.grabzit.GrabzItFile;
import it.grabz.grabzit.enums.TableFormat;
import it.grabz.grabzit.parameters.TableOptions;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.File;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws java.io.UnsupportedEncodingException, Exception, IOException {
        System.out.println("Zapisywanie Tablicy HTML");
        GrabzItClient grabzItClient = new GrabzItClient("ZDM1NjU2MzE2MmExNDhhZmEyODJmMThhMzVhZGVkOWY=", "cD9+egg/Pz8/MxAbIT8nP1ZLKV0dJD0iTj9LPz8/Ij8=");
        String url = "https://www.ote-cr.cz/en/statistics/electricity-imbalances?version=0&date=2022-11-20";
        String url_latest = "https://www.ote-cr.cz/en/statistics/electricity-imbalances";
        String utl_test ="https://www.tesla.com";
//        String filepath = "D:\\IntelliJ IDEA Projects\\LSEG-task1\\result.csv";

        try {
            File myObj = new File("result.csv");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }

        grabzItClient.URLToTable(url_latest);
        grabzItClient.SaveTo("result.csv");

        Workbook workbook = new Workbook("result.csv");
        workbook.save("result.html");






    }
}

