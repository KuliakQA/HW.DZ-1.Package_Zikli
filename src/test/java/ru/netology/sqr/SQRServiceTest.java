package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void sqrt() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.sqrt(200, 300);

        assertEquals(expected, actual);

    }
}