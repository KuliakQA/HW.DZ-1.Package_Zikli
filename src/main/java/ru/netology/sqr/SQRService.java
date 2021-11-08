package ru.netology.sqr;

public class SQRService {
    public int sqrt(int down, int up) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int multiply = i * i;
            if (multiply >= down && multiply <= up) {
                counter++;
            }
        }
        return counter;
    }
}