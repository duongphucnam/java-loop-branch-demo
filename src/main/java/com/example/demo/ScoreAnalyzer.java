package com.example.demo;

public class ScoreAnalyzer {

    /**
     * Chương trình có:
     * - vòng lặp: for
     * - rẽ nhánh: if/else if/else
     *
     * Quy ước:
     * - điểm >= 5 là pass
     * - tất cả pass -> ALL_PASS
     * - tất cả fail -> ALL_FAIL
     * - còn lại -> MIXED
     */
    public String analyze(int[] scores) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("scores must not be null or empty");
        }

        int passCount = 0;
        int failCount = 0;

        for (int score : scores) {
            if (score >= 5) {
                passCount++;
            } else {
                failCount++;
            }
        }

        if (passCount == scores.length) {
            return "ALL_PASS";
        } else if (failCount == scores.length) {
            return "ALL_FAIL";
        } else {
            return "MIXED";
        }
    }

    public static void main(String[] args) {
        ScoreAnalyzer analyzer = new ScoreAnalyzer();

        System.out.println(analyzer.analyze(new int[]{8, 6, 5}));
        System.out.println(analyzer.analyze(new int[]{1, 2, 4}));
        System.out.println(analyzer.analyze(new int[]{8, 3, 7}));
    }
}
