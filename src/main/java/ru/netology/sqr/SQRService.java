package ru.netology.sqr;

public class SQRService {
    public int sqrt(int down, int up) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= down && i * i <= up) {
                counter++;
            }
        }
        return counter;
    }
}