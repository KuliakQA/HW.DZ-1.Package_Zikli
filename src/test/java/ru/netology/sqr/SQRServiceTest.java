package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldNumberRootsCountSuitableData() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.sqrt(200, 300);

        assertEquals(expected, actual);

    }

    @Test
    void shouldNumberRoots0CountDownUpSmall() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.sqrt(10, 99);

        assertEquals(expected, actual);

    }

    @Test
    void shouldRoots0DownAndUp0() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.sqrt(0, 0);

        assertEquals(expected, actual);

    }

    @Test
    void shouldNumberRoots0CountSameDownUp() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.sqrt(500, 500);

        assertEquals(expected, actual);

    }

    @Test
    void shouldNumberRootsCountBigUp() {
        SQRService service = new SQRService();

        int expected = 45;
        int actual = service.sqrt(100, 3000);

        assertEquals(expected, actual);

    }

    @Test
    void shouldNumberRoots0CountDownMoreUp() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.sqrt(3000, 100);

        assertEquals(expected, actual);

    }

    @Test
    void shouldNumberRoots0CountUp0() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.sqrt(200, 0);

        assertEquals(expected, actual);

    }
}