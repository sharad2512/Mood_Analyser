package com.bridgelabz.moodanalyser;

import com.bridgelab.moodanalyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserTest {

    @Test
    public void givenMessage_whenSad_shouldReturnSadMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I Am In Sad Mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_whenSad_shouldReturnHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I Am In Happy Mood");
        Assert.assertEquals("HAPPY", mood);
    }
}
