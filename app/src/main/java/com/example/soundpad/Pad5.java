package com.example.soundpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class Pad5 extends AppCompatActivity {
    private SoundPool soundpool;
    private int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pad5);
        soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        d1 = soundpool.load(getApplicationContext(), R.raw.d1, 1);
        d2 = soundpool.load(getApplicationContext(), R.raw.d2, 1);
        d3 = soundpool.load(getApplicationContext(), R.raw.d3, 1);
        d4 = soundpool.load(getApplicationContext(), R.raw.d4, 1);
        d5 = soundpool.load(getApplicationContext(), R.raw.d5, 1);
        d6 = soundpool.load(getApplicationContext(), R.raw.d6, 1);
        d7 = soundpool.load(getApplicationContext(), R.raw.d7, 1);
        d8 = soundpool.load(getApplicationContext(), R.raw.d8, 1);
        d9 = soundpool.load(getApplicationContext(), R.raw.d9, 1);
        d10 = soundpool.load(getApplicationContext(), R.raw.d10, 1);
        d11 = soundpool.load(getApplicationContext(), R.raw.d11, 1);
        d12 = soundpool.load(getApplicationContext(), R.raw.d12, 1);
    }

    public void bunyi1(View v) {soundpool.play(d1, 1.0f, 1.0f, 0,0,1);}
    public void bunyi2(View v) {soundpool.play(d2, 1.0f, 1.0f, 0,0,1);}
    public void bunyi3(View v) {soundpool.play(d3, 1.0f, 1.0f, 0,0,1);}
    public void bunyi4(View v) {soundpool.play(d4, 1.0f, 1.0f, 0,0,1);}
    public void bunyi5(View v) {soundpool.play(d5, 1.0f, 1.0f, 0,0,1);}
    public void bunyi6(View v) {soundpool.play(d6, 1.0f, 1.0f, 0,0,1);}
    public void bunyi7(View v) {soundpool.play(d7, 1.0f, 1.0f, 0,0,1);}
    public void bunyi8(View v) {soundpool.play(d8, 1.0f, 1.0f, 0,0,1);}
    public void bunyi9(View v) {soundpool.play(d9, 1.0f, 1.0f, 0,0,1);}
    public void bunyi10(View v) {soundpool.play(d10, 1.0f, 1.0f, 0,0,1);}
    public void bunyi11(View v) {soundpool.play(d11, 1.0f, 1.0f, 0,0,1);}
    public void bunyi12(View v) {soundpool.play(d12, 1.0f, 1.0f, 0,0,1);}

}