package com.example.basicphrasesapp;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public void pressToPlay(View view){

        Button buttonPressed = (Button) view;
        String myInput = buttonPressed.getTag().toString();
        int resID=getResources().getIdentifier(myInput, "raw",    this.getPackageName());
        MediaPlayer mp = MediaPlayer.create(this, resID);
        mp.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}