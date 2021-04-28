package com.example.makeitrain;

import android.icu.text.NumberFormat;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private Button makeItRain;
    private TextView money_value;

    private int moneyCounter = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeItRain = findViewById(R.id.MakeItRain);
        money_value = findViewById(R.id.MoneyValue);


        makeItRain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                NumberFormat numberFormat = NumberFormat.getCurrencyInstance();


                moneyCounter +=1000;
                money_value.setText(String.valueOf(numberFormat.format(moneyCounter)));
                Log.d("MainActivity", "onClick:Make it rain " + moneyCounter);
                if (moneyCounter>20000)
                    money_value.setText("You got rich BABYYYYYY");

            }


        });

    }

    public void showInfo(View view) {
        Toast.makeText(MainActivity.this, R.string.app_info, Toast.LENGTH_SHORT )
                .show();



    }

}