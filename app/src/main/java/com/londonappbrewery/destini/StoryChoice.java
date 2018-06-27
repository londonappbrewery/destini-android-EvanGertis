package com.londonappbrewery.destini;

public class StoryChoice {

    private int mStoryChoiceID;
    private int mAnswerChoiceOneID;
    private int mAnswerChoiceTwoID;

    public StoryChoice(int storyChoiceID, int answerChoiceOneID, int answerChoiceTwoID) {
        mStoryChoiceID = storyChoiceID;
        mAnswerChoiceOneID = answerChoiceOneID;
        mAnswerChoiceTwoID = answerChoiceTwoID;
    }

    public int getStoryChoiceID() {
        return mStoryChoiceID;
    }

    public void setStoryChoiceID(int storyChoiceID) {
        mStoryChoiceID = storyChoiceID;
    }

    public void setAnswerChoiceOneID(int answerChoiceOneID) {
        mAnswerChoiceOneID = answerChoiceOneID;
    }

    public void setAnswerChoiceTwoID(int answerChoiceTwoID) {
        mAnswerChoiceTwoID = answerChoiceTwoID;
    }

    public int getAnswerChoiceOneID() {
        return mAnswerChoiceOneID;
    }

    public int getAnswerChoiceTwoID() {
        return mAnswerChoiceTwoID;
    }
}
