package com.orgiraffers.d_activity.mission;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    void testProcessNumbers() {
        int[] input = {1, 3, 5, 8};
        Application application = new Application();
        String value = application.processNumbers(input);

        /*
        * 1: "Monday", 2: "Tuesday", 3: "Wednesday", 4: "Thursday", 5: "Friday", 6: "Saturday", 7: "Sunday"
        * 1~7 이외의 숫자는 "Unknown"으로 처리한다.
        * */
        String result = "Monday, Wednesday, Friday, Unknown";
        Assertions.assertEquals(result, value);
    }
}