package com.example.soundpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class Pad8 extends AppCompatActivity {
    private SoundPool soundpool;
    private int g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pad8);
        soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        g1 = soundpool.load(getApplicationContext(), R.raw.g1, 1);
        g2 = soundpool.load(getApplicationContext(), R.raw.g2, 1);
        g3 = soundpool.load(getApplicationContext(), R.raw.g3, 1);
        g4 = soundpool.load(getApplicationContext(), R.raw.g4, 1);
        g5 = soundpool.load(getApplicationContext(), R.raw.g5, 1);
        g6 = soundpool.load(getApplicationContext(), R.raw.g6, 1);
        g7 = soundpool.load(getApplicationContext(), R.raw.g7, 1);
        g8 = soundpool.load(getApplicationContext(), R.raw.g8, 1);
        g9 = soundpool.load(getApplicationContext(), R.raw.g9, 1);
        g10 = soundpool.load(getApplicationContext(), R.raw.g10, 1);
        g11 = soundpool.load(getApplicationContext(), R.raw.g11, 1);
        g12 = soundpool.load(getApplicationContext(), R.raw.g12, 1);
    }

    public void bunyi1(View v) {soundpool.play(g1, 1.0f, 1.0f, 0,0,1);}
    public void bunyi2(View v) {soundpool.play(g2, 1.0f, 1.0f, 0,0,1);}
    public void bunyi3(View v) {soundpool.play(g3, 1.0f, 1.0f, 0,0,1);}
    public void bunyi4(View v) {soundpool.play(g4, 1.0f, 1.0f, 0,0,1);}
    public void bunyi5(View v) {soundpool.play(g5, 1.0f, 1.0f, 0,0,1);}
    public void bunyi6(View v) {soundpool.play(g6, 1.0f, 1.0f, 0,0,1);}
    public void bunyi7(View v) {soundpool.play(g7, 1.0f, 1.0f, 0,0,1);}
    public void bunyi8(View v) {soundpool.play(g8, 1.0f, 1.0f, 0,0,1);}
    public void bunyi9(View v) {soundpool.play(g9, 1.0f, 1.0f, 0,0,1);}
    public void bunyi10(View v) {soundpool.play(g10, 1.0f, 1.0f, 0,0,1);}
    public void bunyi11(View v) {soundpool.play(g11, 1.0f, 1.0f, 0,0,1);}
    public void bunyi12(View v) {soundpool.play(g12, 1.0f, 1.0f, 0,0,1);}

}