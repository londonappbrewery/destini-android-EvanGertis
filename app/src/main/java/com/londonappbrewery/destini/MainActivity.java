package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mTopButton;
    Button mBottomButton;
    boolean choice1 = false;
    boolean choice2 = false;
    TextView mStoryText;
    Integer mIndex = 0;


    private StoryChoice[] mChoiceBank = new StoryChoice[]{
            new StoryChoice(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new StoryChoice(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
            new StoryChoice(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new StoryChoice(R.string.T6_End, R.string.T6_End, R.string.T6_End),
            new StoryChoice(R.string.T5_End, R.string.T5_End, R.string.T5_End),
            new StoryChoice(R.string.T4_End, R.string.T4_End, R.string.T4_End)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);
        mStoryText = (TextView) findViewById(R.id.storyTextView);

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice1 = true;
                choice2 = false;
                updateSelection(choice1, choice2);
            }
        });

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice1 = false;
                choice2 = true;
                updateSelection(choice1, choice2);
            }
        });


    }

    private void updateSelection(boolean choice1, boolean choice2){

        switch(mIndex){
            case 0:
                if(choice1){
                    mIndex = 1;
                    mTopButton.setText(mChoiceBank[mIndex].getAnswerChoiceOneID());
                    mBottomButton.setText(mChoiceBank[mIndex].getAnswerChoiceTwoID());
                    mStoryText.setText(mChoiceBank[mIndex].getStoryChoiceID());
                }
                else{
                    mIndex = 2;
                    mTopButton.setText(mChoiceBank[mIndex].getAnswerChoiceOneID());
                    mBottomButton.setText(mChoiceBank[mIndex].getAnswerChoiceTwoID());
                    mStoryText.setText(mChoiceBank[mIndex].getStoryChoiceID());
                }
                break;
            case 1:
                if(choice1){
                    mIndex =3;
                    mTopButton.setText("Play Again?");
                    mBottomButton.setText("Quit?");
                    mStoryText.setText(mChoiceBank[mIndex].getStoryChoiceID());
                }
                else{
                    mIndex = 4;
                    mTopButton.setText("Play Again");
                    mBottomButton.setText("Quit?");
                    mStoryText.setText(mChoiceBank[mIndex].getStoryChoiceID());
                }
                break;
            case 2:
                if(choice1){
                    mIndex = 1;
                    mTopButton.setText(mChoiceBank[mIndex].getAnswerChoiceOneID());
                    mBottomButton.setText(mChoiceBank[mIndex].getAnswerChoiceTwoID());
                    mStoryText.setText(mChoiceBank[mIndex].getStoryChoiceID());
                }
                else{
                    mIndex =5;
                    mTopButton.setText("Play Again?");
                    mBottomButton.setText("Quit?");
                    mStoryText.setText(mChoiceBank[mIndex].getStoryChoiceID());
                }
                break;
            case 3:
                if(choice1){
                    mIndex = 0;
                    mTopButton.setText(mChoiceBank[mIndex].getAnswerChoiceOneID());
                    mBottomButton.setText(mChoiceBank[mIndex].getAnswerChoiceTwoID());
                    mStoryText.setText(mChoiceBank[mIndex].getStoryChoiceID());
                }
                else{
                    finish();
                }
            case 4:
                if(choice1){
                    mIndex = 0;
                    mTopButton.setText(mChoiceBank[mIndex].getAnswerChoiceOneID());
                    mBottomButton.setText(mChoiceBank[mIndex].getAnswerChoiceTwoID());
                    mStoryText.setText(mChoiceBank[mIndex].getStoryChoiceID());
                }
                else{
                    finish();
                }
            case 5:
                if(choice1){
                    mIndex = 0;
                    mTopButton.setText(mChoiceBank[mIndex].getAnswerChoiceOneID());
                    mBottomButton.setText(mChoiceBank[mIndex].getAnswerChoiceTwoID());
                    mStoryText.setText(mChoiceBank[mIndex].getStoryChoiceID());
                }
                else{
                    finish();
                }


        }
    }
}
