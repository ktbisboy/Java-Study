package com.orgiraffers.d_activity.lesson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    void testProcessNumbersValidInput() {
        Application application = new Application();
        String input = "10, 20, 30, 40";
        String value = application.processNumbers(input);

        String result = "합계: 100, 평균: 25, 짝수 개수: 4, 홀수 개수: 0";
        Assertions.assertEquals(result, value);
    }

    @Test
    void testProcessNumbersInputEmpty() {
        Application application = new Application();
        String input = "";
        String value = application.processNumbers(input);

        String result = "입력 없음";
        Assertions.assertEquals(result, value);
    }
}