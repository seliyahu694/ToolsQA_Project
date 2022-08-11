package utilities;

import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ManageDDT extends CommonOps {

    @DataProvider(name = "data-provider-webTables")
    public Object[][] getDataObjectForWebTables() {
        return getDataFromCSV(getData("DDTWebTablesFile"));
    }

    public static List<String> readCSV(String csvFile) {
        List<String> lines = null;
        File file = new File(csvFile);
        try {
            lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static Object[][] getDataFromCSV(String filePath) {
        Object[][] data = null;
        if (filePath.contains("WebTables")) {
            data = new Object[10][6];
            List<String> csvData = readCSV(filePath);
            for (int i = 0; i < csvData.size(); i++) {
                for (int j = 0; j < 6; j++) {
                    data[i][j] = csvData.get(i).split(",")[j];
                }
            }
        } else if (filePath.contains("Buttons")) {
            data = new Object[1][3];
            List<String> csvData = readCSV(filePath);
            for (int i = 0; i < csvData.size(); i++) {
                for (int j = 0; j < 3; j++) {
                    data[i][j] = csvData.get(i).split(",")[j];
                }
            }
        }

        return data;
    }

    @DataProvider(name = "data-provider-buttons")
    public Object[][] getDataObjectForButtons() {
        return getDataFromCSV(getData("DDTButtonsFile"));
    }
}
