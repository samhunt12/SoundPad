package com.example.soundpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class Pad4 extends AppCompatActivity {
    private SoundPool soundpool;
    private int c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pad4);
        soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        c1 = soundpool.load(getApplicationContext(), R.raw.c1,1);
        c2 = soundpool.load(getApplicationContext(), R.raw.c2,1);
        c3 = soundpool.load(getApplicationContext(), R.raw.c3,1);
        c4 = soundpool.load(getApplicationContext(), R.raw.c4,1);
        c5 = soundpool.load(getApplicationContext(), R.raw.c5,1);
        c6 = soundpool.load(getApplicationContext(), R.raw.c6,1);
        c7 = soundpool.load(getApplicationContext(), R.raw.c8,1);
        c8 = soundpool.load(getApplicationContext(), R.raw.c8,1);
        c9 = soundpool.load(getApplicationContext(), R.raw.c9,1);
        c10 = soundpool.load(getApplicationContext(), R.raw.c10,1);
        c11 = soundpool.load(getApplicationContext(), R.raw.c11,1);
        c12 = soundpool.load(getApplicationContext(), R.raw.c12,1);
    }

    public void bunyi1(View v) {soundpool.play(c1, 1.0f, 1.0f, 0,0,1);}
    public void bunyi2(View v) {soundpool.play(c2, 1.0f, 1.0f, 0,0,1);}
    public void bunyi3(View v) {soundpool.play(c3, 1.0f, 1.0f, 0,0,1);}
    public void bunyi4(View v) {soundpool.play(c4, 1.0f, 1.0f, 0,0,1);}
    public void bunyi5(View v) {soundpool.play(c5, 1.0f, 1.0f, 0,0,1);}
    public void bunyi6(View v) {soundpool.play(c6, 1.0f, 1.0f, 0,0,1);}
    public void bunyi7(View v) {soundpool.play(c7, 1.0f, 1.0f, 0,0,1);}
    public void bunyi8(View v) {soundpool.play(c8, 1.0f, 1.0f, 0,0,1);}
    public void bunyi9(View v) {soundpool.play(c9, 1.0f, 1.0f, 0,0,1);}
    public void bunyi10(View v) {soundpool.play(c10, 1.0f, 1.0f, 0,0,1);}
    public void bunyi11(View v) {soundpool.play(c11, 1.0f, 1.0f, 0,0,1);}
    public void bunyi12(View v) {soundpool.play(c12, 1.0f, 1.0f, 0,0,1);}

}