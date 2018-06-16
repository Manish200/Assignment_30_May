package com.example.dell.assignment_30_may;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer=mediaPlayer.create(this,R.raw.camila_cabello_havana_song);

        Toast toast= Toast.makeText(getApplicationContext(),
                " On Create ", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

         b1 = findViewById(R.id.start);
        b1.setOnClickListener(this);
         b2 = (Button)findViewById(R.id.stop);
        b2.setOnClickListener(this);
         b3 = (Button)findViewById(R.id.resume);
        b3.setOnClickListener(this);
         b4 = (Button)findViewById(R.id.pause);
        b4.setOnClickListener(this);
         b5 = (Button)findViewById(R.id.restart);
        b5.setOnClickListener(this);
         b6 = (Button)findViewById(R.id.destroy);
        b6.setOnClickListener(this);

    }
    int length;
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.start :
                Toast toast= Toast.makeText(getApplicationContext(),
                        " Music Start the activity ", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                mediaPlayer.stop();
                mediaPlayer.start();
                break;
            case R.id.stop :
                 toast= Toast.makeText(getApplicationContext(),
                        " Music stop the activity ", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                mediaPlayer.pause();
                length=mediaPlayer.getCurrentPosition();
                break;
            case R.id.resume :
                toast= Toast.makeText(getApplicationContext(),
                        " Music Resume the activity ", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                mediaPlayer.seekTo(length);
                mediaPlayer.start();
                break;
            case R.id.pause :
                toast= Toast.makeText(getApplicationContext(),
                        " Music Pause the activity ", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                mediaPlayer.pause();
                length=mediaPlayer.getCurrentPosition();
                break;
            case R.id.restart :
                toast= Toast.makeText(getApplicationContext(),
                        " Music Restart the activity ", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                mediaPlayer.seekTo(length);
                mediaPlayer.start();
                break;
            case R.id.destroy :
                toast= Toast.makeText(getApplicationContext(),
                        " Music destroy the activity ", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                mediaPlayer.stop();
                finish();
                break;
                default: break;
        }
    }
}
