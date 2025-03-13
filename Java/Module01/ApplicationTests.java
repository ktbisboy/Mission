package com.ohgiraffers.f_activity.mission;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTests {
    @Test
    public void calculate() {
        String result = Application.caculate("Java is Fun");

        // 단어1: X, 단어2: Y, 단어3: Z, 총 길이: SUM
        // 단어1: 4, 단어2: 2, 단어3: 3, 총 길이: 9
        Assertions.assertEquals("단어1: 4, 단어2: 2, 단어3: 3, 총 길이: 9", result);
    }

    @Test
    void calculateNoSpaces() {
        String result = Application.caculate("Apples are delicious");

        // 단어1: X, 단어2: Y, 단어3: Z, 총 길이: SUM
        // 단어1: 4, 단어2: 2, 단어3: 3, 총 길이: 9
        Assertions.assertTrue(result.contains("단어1: 6"));
        Assertions.assertTrue(result.contains("단어2: 3"));
        Assertions.assertTrue(result.contains("단어3: 9"));
        Assertions.assertTrue(result.contains("총 길이: 18"));
    }
}
