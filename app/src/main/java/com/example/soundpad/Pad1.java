package com.example.soundpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class Pad1 extends AppCompatActivity {
    private SoundPool soundpool;
    private int s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pad1);
        soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        s1 = soundpool.load(getApplicationContext(), R.raw.s1, 1);
        s2 = soundpool.load(getApplicationContext(), R.raw.s2, 1);
        s3 = soundpool.load(getApplicationContext(), R.raw.s3, 1);
        s4 = soundpool.load(getApplicationContext(), R.raw.s4, 1);
        s5 = soundpool.load(getApplicationContext(), R.raw.s5, 1);
        s6 = soundpool.load(getApplicationContext(), R.raw.s6, 1);
        s7 = soundpool.load(getApplicationContext(), R.raw.s7, 1);
        s8 = soundpool.load(getApplicationContext(), R.raw.s8, 1);
        s9 = soundpool.load(getApplicationContext(), R.raw.s9, 1);
        s10 = soundpool.load(getApplicationContext(), R.raw.s10, 1);
        s11 = soundpool.load(getApplicationContext(), R.raw.s11, 1);
        s12 = soundpool.load(getApplicationContext(), R.raw.s12, 1);
    }

    public void bunyi1(View v) {soundpool.play(s1, 1.0f, 1.0f, 0,0,1);}
    public void bunyi2(View v) {soundpool.play(s2, 1.0f, 1.0f, 0,0,1);}
    public void bunyi3(View v) {soundpool.play(s3, 1.0f, 1.0f, 0,0,1);}
    public void bunyi4(View v) {soundpool.play(s4, 1.0f, 1.0f, 0,0,1);}
    public void bunyi5(View v) {soundpool.play(s5, 1.0f, 1.0f, 0,0,1);}
    public void bunyi6(View v) {soundpool.play(s6, 1.0f, 1.0f, 0,0,1);}
    public void bunyi7(View v) {soundpool.play(s7, 1.0f, 1.0f, 0,0,1);}
    public void bunyi8(View v) {soundpool.play(s8, 1.0f, 1.0f, 0,0,1);}
    public void bunyi9(View v) {soundpool.play(s9, 1.0f, 1.0f, 0,0,1);}
    public void bunyi10(View v) {soundpool.play(s10, 1.0f, 1.0f, 0,0,1);}
    public void bunyi11(View v) {soundpool.play(s11, 1.0f, 1.0f, 0,0,1);}
    public void bunyi12(View v) {soundpool.play(s12, 1.0f, 1.0f, 0,0,1);}

}