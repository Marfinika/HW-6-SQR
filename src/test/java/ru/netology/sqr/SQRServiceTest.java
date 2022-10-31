package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/squarerange.csv")
    public void squared(int expected, int Bottom, int Top) {
        SQRService service = new SQRService();


        int actual = service.CalcSqr(Bottom, Top);

        assertEquals(expected, actual);
    }
}
