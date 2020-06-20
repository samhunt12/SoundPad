package com.example.soundpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class Pad6 extends AppCompatActivity {
    private SoundPool soundpool;
    private int e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pad6);
        soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        e1 = soundpool.load(getApplicationContext(), R.raw.a1, 1);
        e2 = soundpool.load(getApplicationContext(), R.raw.a2, 1);
        e3 = soundpool.load(getApplicationContext(), R.raw.a3, 1);
        e4 = soundpool.load(getApplicationContext(), R.raw.a4, 1);
        e5 = soundpool.load(getApplicationContext(), R.raw.a5, 1);
        e6 = soundpool.load(getApplicationContext(), R.raw.a6, 1);
        e7 = soundpool.load(getApplicationContext(), R.raw.a7, 1);
        e8 = soundpool.load(getApplicationContext(), R.raw.a8, 1);
        e9 = soundpool.load(getApplicationContext(), R.raw.a9, 1);
        e10 = soundpool.load(getApplicationContext(), R.raw.a10, 1);
        e11 = soundpool.load(getApplicationContext(), R.raw.a11, 1);
        e12 = soundpool.load(getApplicationContext(), R.raw.a12, 1);
    }

    public void bunyi1(View v) {soundpool.play(e1, 1.0f, 1.0f, 0,0,1);}
    public void bunyi2(View v) {soundpool.play(e2, 1.0f, 1.0f, 0,0,1);}
    public void bunyi3(View v) {soundpool.play(e3, 1.0f, 1.0f, 0,0,1);}
    public void bunyi4(View v) {soundpool.play(e4, 1.0f, 1.0f, 0,0,1);}
    public void bunyi5(View v) {soundpool.play(e5, 1.0f, 1.0f, 0,0,1);}
    public void bunyi6(View v) {soundpool.play(e6, 1.0f, 1.0f, 0,0,1);}
    public void bunyi7(View v) {soundpool.play(e7, 1.0f, 1.0f, 0,0,1);}
    public void bunyi8(View v) {soundpool.play(e8, 1.0f, 1.0f, 0,0,1);}
    public void bunyi9(View v) {soundpool.play(e9, 1.0f, 1.0f, 0,0,1);}
    public void bunyi10(View v) {soundpool.play(e10, 1.0f, 1.0f, 0,0,1);}
    public void bunyi11(View v) {soundpool.play(e11, 1.0f, 1.0f, 0,0,1);}
    public void bunyi12(View v) {soundpool.play(e12, 1.0f, 1.0f, 0,0,1);}

}