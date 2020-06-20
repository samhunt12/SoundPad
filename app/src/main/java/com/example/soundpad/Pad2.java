package com.example.soundpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class Pad2 extends AppCompatActivity {
    private SoundPool soundpool;
    private int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pad2);
        soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        a1 = soundpool.load(getApplicationContext(), R.raw.a1, 1);
        a2 = soundpool.load(getApplicationContext(), R.raw.a2, 1);
        a3 = soundpool.load(getApplicationContext(), R.raw.a3, 1);
        a4 = soundpool.load(getApplicationContext(), R.raw.a4, 1);
        a5 = soundpool.load(getApplicationContext(), R.raw.a5, 1);
        a6 = soundpool.load(getApplicationContext(), R.raw.a6, 1);
        a7 = soundpool.load(getApplicationContext(), R.raw.a7, 1);
        a8 = soundpool.load(getApplicationContext(), R.raw.a8, 1);
        a9 = soundpool.load(getApplicationContext(), R.raw.a9, 1);
        a10 = soundpool.load(getApplicationContext(), R.raw.a10, 1);
        a11 = soundpool.load(getApplicationContext(), R.raw.a11, 1);
        a12 = soundpool.load(getApplicationContext(), R.raw.a12, 1);
    }

    public void bunyi1(View v) {soundpool.play(a1, 1.0f, 1.0f, 0,0,1);}
    public void bunyi2(View v) {soundpool.play(a2, 1.0f, 1.0f, 0,0,1);}
    public void bunyi3(View v) {soundpool.play(a3, 1.0f, 1.0f, 0,0,1);}
    public void bunyi4(View v) {soundpool.play(a4, 1.0f, 1.0f, 0,0,1);}
    public void bunyi5(View v) {soundpool.play(a5, 1.0f, 1.0f, 0,0,1);}
    public void bunyi6(View v) {soundpool.play(a6, 1.0f, 1.0f, 0,0,1);}
    public void bunyi7(View v) {soundpool.play(a7, 1.0f, 1.0f, 0,0,1);}
    public void bunyi8(View v) {soundpool.play(a8, 1.0f, 1.0f, 0,0,1);}
    public void bunyi9(View v) {soundpool.play(a9, 1.0f, 1.0f, 0,0,1);}
    public void bunyi10(View v) {soundpool.play(a10, 1.0f, 1.0f, 0,0,1);}
    public void bunyi11(View v) {soundpool.play(a11, 1.0f, 1.0f, 0,0,1);}
    public void bunyi12(View v) {soundpool.play(a12, 1.0f, 1.0f, 0,0,1);}

}