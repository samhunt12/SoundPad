package com.example.soundpad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView pad1Card;
    private CardView pad2Card;
    private CardView pad3Card;
    private CardView pad4Card;
    private CardView pad5Card;
    private CardView pad6Card;
    private CardView pad7Card;
    private CardView pad8Card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Deklarasi card
        pad1Card = (CardView) findViewById(R.id.pad1_card);
        pad2Card = (CardView) findViewById(R.id.pad2_card);
        pad3Card = (CardView) findViewById(R.id.pad3_card);
        pad4Card = (CardView) findViewById(R.id.pad4_card);
        pad5Card = (CardView) findViewById(R.id.pad5_card);
        pad6Card = (CardView) findViewById(R.id.pad6_card);
        pad7Card = (CardView) findViewById(R.id.pad7_card);
        pad8Card = (CardView) findViewById(R.id.pad8_card);

        // Click Listener untuk setiap card
        pad1Card.setOnClickListener(this);
        pad2Card.setOnClickListener(this);
        pad3Card.setOnClickListener(this);
        pad4Card.setOnClickListener(this);
        pad5Card.setOnClickListener(this);
        pad6Card.setOnClickListener(this);
        pad7Card.setOnClickListener(this);
        pad8Card.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.pad1_card : i = new Intent(this, Pad1.class); startActivity(i); break;
            case R.id.pad2_card : i = new Intent(this, Pad2.class); startActivity(i); break;
            case R.id.pad3_card : i = new Intent(this, Pad3.class); startActivity(i); break;
            case R.id.pad4_card : i = new Intent(this, Pad4.class); startActivity(i); break;
            case R.id.pad5_card : i = new Intent(this, Pad5.class); startActivity(i); break;
            case R.id.pad6_card : i = new Intent(this, Pad6.class); startActivity(i); break;
            case R.id.pad7_card : i = new Intent(this, Pad7.class); startActivity(i); break;
            case R.id.pad8_card : i = new Intent(this, Pad8.class); startActivity(i); break;
            default: break;
        }
    }

}