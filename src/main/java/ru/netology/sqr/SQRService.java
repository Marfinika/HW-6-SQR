package ru.netology.sqr;

public class SQRService {
    public int CalcSqr(int Bottom, int Top) {
        int iteration = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= Bottom) {
                if (i * i <= Top) {
                    iteration++;
                }
            }
        }
        return iteration;
    }
}
