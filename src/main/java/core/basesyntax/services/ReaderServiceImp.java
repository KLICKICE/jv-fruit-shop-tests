package core.basesyntax.services;

import core.basesyntax.exceptions.ReadDataFromFileException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderServiceImp implements ReaderService {
    @Override
    public List<String> read(String filePath) {
        List<String> fileData = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            bufferedReader.readLine(); // Пропускаємо заголовок
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileData.add(line);
            }
        } catch (IOException e) {
            throw new ReadDataFromFileException("Can't read file from path: " + filePath, e);
        }
        return fileData;
    }
}
