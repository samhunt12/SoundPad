package com.example.soundpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class Pad3 extends AppCompatActivity {
    private SoundPool soundpool;
    private int b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pad3);
        soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        b1 = soundpool.load(getApplicationContext(), R.raw.b1,1);
        b2 = soundpool.load(getApplicationContext(), R.raw.b2,1);
        b3 = soundpool.load(getApplicationContext(), R.raw.b3,1);
        b4 = soundpool.load(getApplicationContext(), R.raw.b4,1);
        b5 = soundpool.load(getApplicationContext(), R.raw.b5,1);
        b6 = soundpool.load(getApplicationContext(), R.raw.b6,1);
        b7 = soundpool.load(getApplicationContext(), R.raw.b7,1);
        b8 = soundpool.load(getApplicationContext(), R.raw.b8,1);
        b9 = soundpool.load(getApplicationContext(), R.raw.b9,1);
        b10 = soundpool.load(getApplicationContext(), R.raw.b10,1);
        b11 = soundpool.load(getApplicationContext(), R.raw.b11,1);
        b12 = soundpool.load(getApplicationContext(), R.raw.b12,1);
    }

    public void bunyi1(View v) {soundpool.play(b1, 1.0f, 1.0f, 0,0,1);}
    public void bunyi2(View v) {soundpool.play(b2, 1.0f, 1.0f, 0,0,1);}
    public void bunyi3(View v) {soundpool.play(b3, 1.0f, 1.0f, 0,0,1);}
    public void bunyi4(View v) {soundpool.play(b4, 1.0f, 1.0f, 0,0,1);}
    public void bunyi5(View v) {soundpool.play(b5, 1.0f, 1.0f, 0,0,1);}
    public void bunyi6(View v) {soundpool.play(b6, 1.0f, 1.0f, 0,0,1);}
    public void bunyi7(View v) {soundpool.play(b7, 1.0f, 1.0f, 0,0,1);}
    public void bunyi8(View v) {soundpool.play(b8, 1.0f, 1.0f, 0,0,1);}
    public void bunyi9(View v) {soundpool.play(b9, 1.0f, 1.0f, 0,0,1);}
    public void bunyi10(View v) {soundpool.play(b10, 1.0f, 1.0f, 0,0,1);}
    public void bunyi11(View v) {soundpool.play(b11, 1.0f, 1.0f, 0,0,1);}
    public void bunyi12(View v) {soundpool.play(b12, 1.0f, 1.0f, 0,0,1);}

}