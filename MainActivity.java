package com.ericchiu.a11yas201905241453;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> inputToList = new ArrayList<>();
    ArrayList<Integer> listFrom8RandomNosTo11 = new ArrayList<>();
    boolean timerRunning;
    boolean startPlay = true;
    Button button1; boolean button1Pressed = false;
    Button button2; boolean button2Pressed = false;
    Button button3; boolean button3Pressed = false;
    Button button4; boolean button4Pressed = false;
    Button button5; boolean button5Pressed = false;
    Button button6; boolean button6Pressed = false;
    Button button7; boolean button7Pressed = false;
    Button button8; boolean button8Pressed = false;
    Button button9; boolean button9Pressed = false;
    Button button10; boolean button10Pressed = false;
    Button button11; boolean button11Pressed = false;
    Button buttonPlay;
    Button pauseButton;
    Button resetButton;
    CountDownTimer countDownTimer;
    EditText correctScore;
    EditText wrongScore;
    int correctScore1;
    int newListFrom8RandomNosTo11 = 0;
    int score1;
    int wrongScore1;
    SeekBar timerSeekBar;
    TextView score;
    TextView textView;
    TextView timer;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        buttonPlay = findViewById(R.id.buttonPlay);
        correctScore = findViewById(R.id.correctScore);
        pauseButton = findViewById(R.id.pauseButton);
        resetButton = findViewById(R.id.resetButton);
        score = findViewById(R.id.score);
        textView = findViewById(R.id.textView);
        timer = findViewById(R.id.timer);
        timerSeekBar = findViewById(R.id.timerSeekBar);
        wrongScore = findViewById(R.id.wrongScore);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(startPlay) {
                    toastClickPlayToStart();
                    return;
                }
                if(button1Pressed) {
                    button1.setBackgroundColor(Color.parseColor("#ffff4444"));
                    inputToList.remove(new Integer(1));
                    button1Pressed = false;
                } else if(inputToList.size() > 2) {
                    toastExceed3();
                } else {
                    button1.setBackgroundColor(Color.LTGRAY);
                    inputToList.add(1);
                    button1Pressed = true;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(startPlay) {
                    toastClickPlayToStart();
                    return;
                }
                if(button2Pressed) {
                    button2.setBackgroundColor(Color.parseColor("#ffaa66cc"));
                    inputToList.remove(new Integer(2));
                    button2Pressed = false;
                } else if(inputToList.size() > 2) {
                    toastExceed3();
                } else {
                    button2.setBackgroundColor(Color.LTGRAY);
                    inputToList.add(2);
                    button2Pressed = true;
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(startPlay) {
                    toastClickPlayToStart();
                    return;
                }
                if(button3Pressed) {
                    button3.setBackgroundColor(Color.parseColor("#ff0099cc"));
                    inputToList.remove(new Integer(3));
                    button3Pressed = false;
                } else if(inputToList.size() > 2) {
                    toastExceed3();
                } else {
                    button3.setBackgroundColor(Color.LTGRAY);
                    inputToList.add(3);
                    button3Pressed = true;
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(startPlay) {
                    toastClickPlayToStart();
                    return;
                }
                if(button4Pressed) {
                    button4.setBackgroundColor(Color.parseColor("#ff99cc00"));
                    inputToList.remove(new Integer(4));
                    button4Pressed = false;
                } else if(inputToList.size() > 2) {
                    toastExceed3();
                } else {
                    button4.setBackgroundColor(Color.LTGRAY);
                    inputToList.add(4);
                    button4Pressed = true;
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(startPlay) {
                    toastClickPlayToStart();
                    return;
                }
                if(button5Pressed) {
                    button5.setBackgroundColor(Color.parseColor("#ff99cc00"));
                    inputToList.remove(new Integer(5));
                    button5Pressed = false;
                } else if(inputToList.size() > 2) {
                    toastExceed3();
                } else {
                    button5.setBackgroundColor(Color.LTGRAY);
                    inputToList.add(5);
                    button5Pressed = true;
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(startPlay) {
                    toastClickPlayToStart();
                    return;
                }
                if(button6Pressed) {
                    button6.setBackgroundColor(Color.parseColor("#ffff4444"));
                    inputToList.remove(new Integer(6));
                    button6Pressed = false;
                } else if(inputToList.size() > 2) {
                    toastExceed3();
                } else {
                    button6.setBackgroundColor(Color.LTGRAY);
                    inputToList.add(6);
                    button6Pressed = true;
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(startPlay) {
                    toastClickPlayToStart();
                    return;
                }
                if(button7Pressed) {
                    button7.setBackgroundColor(Color.parseColor("#ffaa66cc"));
                    inputToList.remove(new Integer(7));
                    button7Pressed = false;
                } else if(inputToList.size() > 2) {
                    toastExceed3();
                } else {
                    button7.setBackgroundColor(Color.LTGRAY);
                    inputToList.add(7);
                    button7Pressed = true;
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(startPlay) {
                    toastClickPlayToStart();
                    return;
                }
                if(button8Pressed) {
                    button8.setBackgroundColor(Color.parseColor("#ff0099cc"));
                    inputToList.remove(new Integer(8));
                    button8Pressed = false;
                } else if(inputToList.size() > 2) {
                    toastExceed3();
                } else {
                    button8.setBackgroundColor(Color.LTGRAY);
                    inputToList.add(8);
                    button8Pressed = true;
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(startPlay) {
                    toastClickPlayToStart();
                    return;
                }
                if(button9Pressed) {
                    button9.setBackgroundColor(Color.parseColor("#ff0099cc"));
                    inputToList.remove(new Integer(9));
                    button9Pressed = false;
                } else if(inputToList.size() > 2) {
                    toastExceed3();
                } else {
                    button9.setBackgroundColor(Color.LTGRAY);
                    inputToList.add(9);
                    button9Pressed = true;
                }
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(startPlay) {
                    toastClickPlayToStart();
                    return;
                }
                if(button10Pressed) {
                    button10.setBackgroundColor(Color.parseColor("#ff99cc00"));
                    inputToList.remove(new Integer(10));
                    button10Pressed = false;
                } else if(inputToList.size() > 2) {
                    toastExceed3();
                } else {
                    button10.setBackgroundColor(Color.LTGRAY);
                    inputToList.add(10);
                    button10Pressed = true;
                }
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(startPlay) {
                    toastClickPlayToStart();
                    return;
                }
                if(button11Pressed) {
                    button11.setBackgroundColor(Color.parseColor("#ffff4444"));
                    inputToList.remove(new Integer(11));
                    button11Pressed = false;
                } else if(inputToList.size() > 2) {
                    toastExceed3();
                } else {
                    button11.setBackgroundColor(Color.LTGRAY);
                    inputToList.add(11);
                    button11Pressed = true;
                }
            }
        });
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startPlay) {
                    try {
                        correctScore1 = Integer.valueOf(correctScore.getText().toString());
                        wrongScore1 = Integer.valueOf(wrongScore.getText().toString());
                        if(correctScore1 > 100 || correctScore1 < 1) throw new NullPointerException();
                        if(wrongScore1 < -100 || wrongScore1 > 0) throw new NullPointerException();
                    } catch (Exception e) {
                        toastWrongScorerange();
                        return;
                    }
                    if(timer.getText().toString().isEmpty()) {
                        toastToSetTimer();
                        return;
                    }
                    correctScore.setEnabled(false);
                    wrongScore.setEnabled(false);
                    timerSeekBar.setEnabled(false);
                    listFrom8RandomNosTo11 = formAndShow8Numbers();
                    inputToList = new ArrayList<>();
                    resetNumberButtonColourAndToNotPressed();
                    startPlay = false;
                    pauseButton.setVisibility(View.VISIBLE);
                    resetButton.setVisibility(View.VISIBLE);
                    startTimer();
                } else {
                    play();
                    listFrom8RandomNosTo11 = formAndShow8Numbers();
                }
            }
        });
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startPlay) {
                    toastClickPlayToStart();
                    return;
                }
                pauseTimer();
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pauseButton.setVisibility(View.INVISIBLE);
                timer.setVisibility(View.INVISIBLE);
                resetButton.setVisibility(View.INVISIBLE);
                score.setVisibility(View.INVISIBLE);
                correctScore.setEnabled(true);
                wrongScore.setEnabled(true);
                timerSeekBar.setEnabled(true);
                reset();
            }
        });
        timerSeekBar.setMax(99);
        timerSeekBar.setProgress(1);
        timerSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int min = 0;
                int timerNumber;
                if(i < min) {
                    timerNumber = min;
                } else {
                    timerNumber = i;
                }
                int minutes = timerNumber;
                int seconds = 0;
                String timerStr =
                        String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
                timer.setText(timerStr);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                pauseButton.setVisibility(View.VISIBLE);
                timer.setVisibility(View.VISIBLE);
                resetButton.setVisibility(View.VISIBLE);
                score.setVisibility(View.VISIBLE);
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    ArrayList<Integer> formAndShow8Numbers() {
        ArrayList<Integer> listFrom8RandomNosTo11 = getRandomNonRepeatingIntegers(8, 1, 11);
        textView = findViewById(R.id.textView);
        textView.setText(listFrom8RandomNosTo11.toString().replace(",", " ")
                .replace("[", "").replace("]", ""));
        return listFrom8RandomNosTo11;
    }
    ArrayList<Integer> getRandomNonRepeatingIntegers(int size, int min,
                                                     int max) {
        ArrayList<Integer> Eightnumbers = new ArrayList<Integer>();
        while (Eightnumbers.size() < size) {
            int random = new Random().nextInt((max - min) + 1) + min;
            if (!Eightnumbers.contains(random)) {
                Eightnumbers.add(random);
            }
        }
        return Eightnumbers;
    }
    void resetNumberButtonColourAndToNotPressed() {
        button1.setBackgroundColor(Color.parseColor("#ffff4444"));
        button2.setBackgroundColor(Color.parseColor("#ffaa66cc"));
        button3.setBackgroundColor(Color.parseColor("#ff0099cc"));
        button4.setBackgroundColor(Color.parseColor("#ff99cc00"));
        button5.setBackgroundColor(Color.parseColor("#ff99cc00"));
        button6.setBackgroundColor(Color.parseColor("#ffff4444"));
        button7.setBackgroundColor(Color.parseColor("#ffaa66cc"));
        button8.setBackgroundColor(Color.parseColor("#ff0099cc"));
        button9.setBackgroundColor(Color.parseColor("#ff0099cc"));
        button10.setBackgroundColor(Color.parseColor("#ff99cc00"));
        button11.setBackgroundColor(Color.parseColor("#ffff4444"));
        button1Pressed = false; button2Pressed = false; button3Pressed = false; button4Pressed = false;
        button5Pressed = false; button6Pressed = false; button7Pressed = false; button8Pressed = false;
        button9Pressed = false; button10Pressed = false; button11Pressed = false;
    }
    void play() {
        if(newListFrom8RandomNosTo11 == 0) {
            playOneTime(listFrom8RandomNosTo11);
            score.setText(String.valueOf(score1));
            inputToList = new ArrayList<>();
            resetNumberButtonColourAndToNotPressed();
        } else {
            Toast toast = Toast.makeText(this,
                    " Time's up! ", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            View view = toast.getView();
            view.setBackgroundColor(Color.BLUE);
            toast.show();
        }
    }
    void playOneTime(List<Integer> listFrom8RandomNosTo11) {
        ArrayList<Integer> listFrom1To11 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        ArrayList<Integer> list8RandomNos = new ArrayList<>(listFrom8RandomNosTo11);
        listFrom8RandomNosTo11.addAll(inputToList);
        Collections.sort(listFrom8RandomNosTo11);
        if(listFrom1To11.equals(listFrom8RandomNosTo11)) {
            score1 = score1 + correctScore1;
            Toast toast = Toast.makeText(this,
                    " CORRECT! ", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            View view = toast.getView();
            TextView text = view.findViewById(android.R.id.message);
            view.setBackgroundColor(Color.YELLOW);
            text.setTextColor(Color.BLUE);
            toast.show();
        }
        else {
            listFrom1To11.removeAll(list8RandomNos);
            score1 = score1 + wrongScore1;
            Toast toast = Toast.makeText(this,
                    " You are not correct!\n Correct answer is: " +
                            listFrom1To11.toString().replace(",", " ").
                                    replace("[", "").replace("]", "") + " ",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }
    void pauseTimer() {
        newListFrom8RandomNosTo11 = -1;
        if(timerRunning) {
            countDownTimer.cancel();
            timerRunning = false;
            resetNumberButtonColourAndToNotPressed();
            textView.setText("");
            newListFrom8RandomNosTo11 = 0;
            startPlay = true;
            pauseButton.setVisibility(View.INVISIBLE);
        }
    }
    void reset() {
        score1 = 0;
        score.setText("");
        correctScore1 = 1;
        correctScore.setText("1");
        wrongScore1 = -1;
        wrongScore.setText("0");
        startPlay = true;
        newListFrom8RandomNosTo11 = 0;
        textView.setText("");
        inputToList = new ArrayList<>();
        resetNumberButtonColourAndToNotPressed();
        timerSeekBar.setProgress(0);
        countDownTimer.cancel();
        timer.setText("");
        inputToList = new ArrayList<>();
        resetNumberButtonColourAndToNotPressed();
    }
    void runTimer(final String timerStr) {
        String[] strArray = timerStr.split(":");
        long milliSeconds = Long.valueOf(strArray[0])*60000 + Long.valueOf(strArray[1])*1000;
        countDownTimer = new CountDownTimer(milliSeconds, 1000) {
            public void onTick(long millisecondsUntilDone) {
                int minutes = (int)Math.floor(millisecondsUntilDone / 60000);
                int seconds = (int)(millisecondsUntilDone/1000) % 60;
                String timerStr1 =
                        String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
                timer.setText(timerStr1);
            }
            public void onFinish() {
                newListFrom8RandomNosTo11 = -1;
                timerRunning = false;
            }
        }.start();
        timerRunning = true;
    }
    void startTimer() {
        String timerStr = timer.getText().toString();
        runTimer(timerStr);
    }
    void toastClickPlayToStart() {
        Toast toast = Toast.makeText(this,
                " Click PLAY to start or\n click RESET to reset the game ", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        View view = toast.getView();
        view.setBackgroundColor(Color.BLUE);
        toast.show();
    }
    void toastExceed3() {
        Toast toast =
                Toast.makeText(this ," Three numbers only! ", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    void toastWrongScorerange() {
        Toast toast = Toast.makeText(this,
                " Score should be in whole numbers\n Correct: 1 to 100, Wrong: 0 to -100 ",
                Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    void toastToSetTimer() {
        Toast toast = Toast.makeText(this,
                " Please set timer by moving the bar above. ", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        View view = toast.getView();
        view.setBackgroundColor(Color.BLUE);
        toast.show();
    }
}
