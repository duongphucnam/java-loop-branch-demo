package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScoreAnalyzerStatementCoverageTest {

    @Test
    void testAllPass() {
        int[] scores = {80, 90, 100};
        String result = ScoreAnalyzer.analyze(scores);
        assertEquals("ALL_PASS", result);
    }

    @Test
    void testAllFail() {
        int[] scores = {20, 30, 40};
        String result = ScoreAnalyzer.analyze(scores);
        assertEquals("ALL_FAIL", result);
    }

    @Test
    void testMixed() {
        int[] scores = {80, 20, 90};
        String result = ScoreAnalyzer.analyze(scores);
        assertEquals("MIXED", result);
    }
}