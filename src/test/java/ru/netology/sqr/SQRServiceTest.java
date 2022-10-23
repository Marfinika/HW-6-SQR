package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.ParameterizedTest;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/squarerange.csv")
    public void squared(int expected, int Bottom, int Top) {
        SQRService service = new SQRService();

       // 3, 200, 300, positive test
       // 5, 200, 300, Negative test
       // 8, 200, 500, positive test
       // 9, 200, 500, Negative test


        int actual = service.CalcSqr(Bottom, Top);

        assertEquals(expected, actual);
    }
}
