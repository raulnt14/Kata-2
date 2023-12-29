package Software.Ulpgc.Kata2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TsvFileComputerLoader implements ComputerLoader{
    private final File file;

    public TsvFileComputerLoader(File file) {
        this.file = file;
    }

    public List<Computer> load() {
        try {
            return load(new FileReader(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Computer> load(FileReader reader) throws IOException {
        return load(new BufferedReader(reader));
    }

    private List<Computer> load(BufferedReader reader) throws IOException {
        reader.skip(1);
        List<Computer> computers = new ArrayList<>();
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                return computers;
            }
            computers.add(toComputer(line));
        }
    }

    private Computer toComputer(String line) {
        return toComputer(line.split("\t"));
    }

    private Computer toComputer(String[] fields) {
        return new Computer(
                fields[0],
                fields[1],
                fields[2],
                fields[3],
                fields[4],
                fields[5],
                fields[6],
                fields[7],
                fields[8],
                fields[9],
                fields[10],
                fields[11],
                fields[12]
        );
    }
}
