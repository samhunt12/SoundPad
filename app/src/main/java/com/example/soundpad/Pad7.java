package com.example.soundpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class Pad7 extends AppCompatActivity {
    private SoundPool soundpool;
    private int f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pad7);
        soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        f1 = soundpool.load(getApplicationContext(), R.raw.f1, 1);
        f2 = soundpool.load(getApplicationContext(), R.raw.f2, 1);
        f3 = soundpool.load(getApplicationContext(), R.raw.f3, 1);
        f4 = soundpool.load(getApplicationContext(), R.raw.f4, 1);
        f5 = soundpool.load(getApplicationContext(), R.raw.f5, 1);
        f6 = soundpool.load(getApplicationContext(), R.raw.f6, 1);
        f7 = soundpool.load(getApplicationContext(), R.raw.f7, 1);
        f8 = soundpool.load(getApplicationContext(), R.raw.f8, 1);
        f9 = soundpool.load(getApplicationContext(), R.raw.f9, 1);
        f10 = soundpool.load(getApplicationContext(), R.raw.f10, 1);
        f11 = soundpool.load(getApplicationContext(), R.raw.f11, 1);
        f12 = soundpool.load(getApplicationContext(), R.raw.f12, 1);
    }

    public void bunyi1(View v) {soundpool.play(f1, 1.0f, 1.0f, 0,0,1);}
    public void bunyi2(View v) {soundpool.play(f2, 1.0f, 1.0f, 0,0,1);}
    public void bunyi3(View v) {soundpool.play(f3, 1.0f, 1.0f, 0,0,1);}
    public void bunyi4(View v) {soundpool.play(f4, 1.0f, 1.0f, 0,0,1);}
    public void bunyi5(View v) {soundpool.play(f5, 1.0f, 1.0f, 0,0,1);}
    public void bunyi6(View v) {soundpool.play(f6, 1.0f, 1.0f, 0,0,1);}
    public void bunyi7(View v) {soundpool.play(f7, 1.0f, 1.0f, 0,0,1);}
    public void bunyi8(View v) {soundpool.play(f8, 1.0f, 1.0f, 0,0,1);}
    public void bunyi9(View v) {soundpool.play(f9, 1.0f, 1.0f, 0,0,1);}
    public void bunyi10(View v) {soundpool.play(f10, 1.0f, 1.0f, 0,0,1);}
    public void bunyi11(View v) {soundpool.play(f11, 1.0f, 1.0f, 0,0,1);}
    public void bunyi12(View v) {soundpool.play(f12, 1.0f, 1.0f, 0,0,1);}

}