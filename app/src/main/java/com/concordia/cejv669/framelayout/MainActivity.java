package com.concordia.cejv669.framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView i = findViewById(R.id.imageView);


        i.setImageResource(R.drawable.logo);


        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView i2 = findViewById(R.id.imageView);

                i2.setImageResource(R.drawable.robot);

            }
        });

        Button b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView i = findViewById(R.id.imageView);

                i.setImageResource(R.drawable.logo);
            }
        });
    }
}
