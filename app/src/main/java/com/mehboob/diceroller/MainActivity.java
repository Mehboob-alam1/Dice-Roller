package com.mehboob.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView diceImage;
    Button btnRoll;
    TextView txtinfo;
    int clicked = 0;

    private static final String TAG="MainActivity";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImage = findViewById(R.id.dice_image);
        btnRoll = findViewById(R.id.btnRoll);
        txtinfo = findViewById(R.id.txtInfo);


            btnRoll.setOnClickListener(view -> {
                clicked=clicked+1;

                if (clicked < 3) {
                    Log.d(TAG, clicked + " clicked");
                    int random = (int) (1 + Math.random() * 6);


                    txtinfo.setText(String.valueOf(random));

                    switch (random) {
                        case 1:
                            diceImage.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            diceImage.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            diceImage.setImageResource(R.drawable.dice3);
                            break;

                        case 4:
                            diceImage.setImageResource(R.drawable.dice4);
                            break;

                        case 5:
                            diceImage.setImageResource(R.drawable.dice5);
                            break;
                        case 6:

                            diceImage.setImageResource(R.drawable.dice6);
                            break;


                        default:
                            Toast.makeText(MainActivity.this, "Wrong move", Toast.LENGTH_SHORT).show();


                    }
                }else{
                    Toast.makeText(this, "Your turn is over", Toast.LENGTH_SHORT).show();
                }
            });

    }
}