package Software.Ulpgc.Kata2;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ComputerLoader loader = new TsvFileComputerLoader(new File("data.txt"));
        List<Computer> computers = loader.load();
        Map<String, Integer> chart = new HashMap<>();
        for (Computer computer:computers) {
            String manufacturer = computer.getManufacturer();
            chart.put(manufacturer, chart.getOrDefault(manufacturer, 0)+1);
        }
        for (String key : chart.keySet()) {
            System.out.println(key + " : " + chart.get(key));
        }
    }
}
