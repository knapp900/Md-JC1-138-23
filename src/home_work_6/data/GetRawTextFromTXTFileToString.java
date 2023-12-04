package home_work_6.data;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

public class GetRawTextFromTXTFileToString implements Supplier<String> {
    private final String PATH_TO_FILE;

    public GetRawTextFromTXTFileToString(String pathToFile) {
        this.PATH_TO_FILE = pathToFile;
    }

    @Override
    public String get() {

        try {
            return getStringFromFile();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Возвращает необработанную строку из файла
     *
     * @return
     * @throws IOException
     */
    private String getStringFromFile() throws IOException {

        StringBuilder builder = new StringBuilder();
        InputStream inputStream = new FileInputStream(PATH_TO_FILE);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

        while (reader.ready()) {


            builder.append(reader.readLine() + "\n");

        }

        return builder.toString();
    }
}
