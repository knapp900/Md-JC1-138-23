package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task_4_4_Test {

    @Test
    @DisplayName("4.4 Перевести байты в килобайты")
    public void byteToKilobyteTest_1() {

        Assertions.assertEquals(Task_4_4.byteToKilobyte(1024), 1);

    }

    @Test
    @DisplayName("4.4 Перевести килобайты в байты")
    public void kilobyteToByteTest_1() {

        Assertions.assertEquals(Task_4_4.kilobyteToByte(1), 1024);

    }

    @Test
    @DisplayName("4.4 Перевести байты в килобайты или наоборот")
    public void convertorTest_1() {

        Assertions.assertEquals(Task_4_4.convertor(100_000, 'b'), 100_000.0 + " байт ровняется " + 97.65625 + " килобайт");
        Assertions.assertEquals(Task_4_4.convertor(97.65625, 'k'), 97.65625 + " килобайт ровняется " + 100_000.0 + " байт");

    }

}
