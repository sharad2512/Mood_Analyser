package com.bridgelab.moodanalyser;

public class MoodAnalyser {
    String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {
        try {
            if (message.contains("Sad")) {
                return "SAD";
            }
        } catch (NullPointerException ex) {
            return "HAPPY";
        }
        return "HAPPY";
    }
    public String analyseMood() {
        return analyseMood(this.message);
    }
}
