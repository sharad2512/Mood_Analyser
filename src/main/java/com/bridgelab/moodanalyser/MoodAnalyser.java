package com.bridgelab.moodanalyser;

public class MoodAnalyser {
    String message;

    public MoodAnalyser() {

    }
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        }
        return "HAPPY";
    }
}
