package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScoreAnalyzerPathCoverageTest {

    private final ScoreAnalyzer analyzer = new ScoreAnalyzer();

    @Test
    void shouldCoverPathPassThenPass() {
        assertEquals("ALL_PASS", analyzer.analyze(new int[]{9, 6}));
    }

    @Test
    void shouldCoverPathFailThenFail() {
        assertEquals("ALL_FAIL", analyzer.analyze(new int[]{2, 1}));
    }

    @Test
    void shouldCoverPathPassThenFail() {
        assertEquals("MIXED", analyzer.analyze(new int[]{7, 2}));
    }

    @Test
    void shouldCoverPathFailThenPass() {
        assertEquals("MIXED", analyzer.analyze(new int[]{3, 8}));
    }
}
